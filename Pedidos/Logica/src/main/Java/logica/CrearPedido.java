package logica;

import IRepositorioPedidos.IRepositorioPedidos;
import InterfazLogica.CrearPedidoLocal;
import com.pedidos.Conectores.ServiciosExternosPedidosLocal.IServicioExternoNotificacionesLocal;
import com.pedidos.Conectores.ServiciosExternosPedidosLocal.IServicioExternoPagosLocal;
import modelos.Pedido;
import modelos.ProductoPedido;
import utils.CreadorMensajes;
import utils.TipoTarjeta;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class CrearPedido implements CrearPedidoLocal {
    private @EJB
    IRepositorioPedidos repository;

    private @EJB
    IServicioExternoPagosLocal servicioExternoPagosLocal;

    private @EJB
    IServicioExternoNotificacionesLocal servicioExternoNotificacionesLocal;

    public CrearPedido(){
        //this.repository = repository;
    }

    @Override
    public Pedido execute(Pedido pedido){
        pedido.setTotalPrecio(calcularPrecioPedido(pedido.getProductoPedidos()));

        //Se realiza el pago del pedido
        if(!servicioExternoPagosLocal.realizarPago(pedido.getCardNumber(),pedido.getExpDate(),
                pedido.getSecCode(),pedido.getNombreCliente(),pedido.getPayments()
                , TipoTarjeta.execute(pedido.getCardNumber()))){
            return null;
        }

        //Se envia la confirmación del pedido en base de datos
        servicioExternoNotificacionesLocal.enviarCorreo(pedido.getCorreoCliente(),"Pedido confirmado!",
                CreadorMensajes.crearHtmlConfirmacion(pedido.getNombreCliente(), pedido.getTotalPrecio())
                );

        //Se guarda el pedido en base de datos
        repository.addPedido(pedido);
        return pedido;
    }

    private double calcularPrecioPedido(List<ProductoPedido> productosPedidos){
        double total = 0;

        for(ProductoPedido p : productosPedidos){
            total += p.calcularPrecioProducto();
        }

        return  total;
    }

}
