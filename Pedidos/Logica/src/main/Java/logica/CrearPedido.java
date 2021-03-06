package logica;

import IRepositorioPedidos.IRepositorioPedidos;
import InterfazLogica.CrearPedidoLocal;
import com.pedidos.Conectores.ServiciosExternosPedidosLocal.IServicioExternoNotificacionesLocal;
import com.pedidos.Conectores.ServiciosExternosPedidosLocal.IServicioExternoPagosLocal;
import logica.utils.CreadorMensajes;
import logica.utils.TipoTarjeta;
import modelos.IngredientePedido;
import modelos.Pedido;
import modelos.ProductoPedido;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;


/**
 * Session Bean implementation class CrearPedidoLocal
 */
@Stateless
@Local(CrearPedidoLocal.class)
public class CrearPedido implements CrearPedidoLocal {
    private @EJB IRepositorioPedidos repository;

    private @EJB IServicioExternoPagosLocal servicioExternoPagosLocal;

    private @EJB IServicioExternoNotificacionesLocal servicioExternoNotificacionesLocal;

    public CrearPedido(){}

    @Override
    public Pedido execute(Pedido pedido){
        pedido.setFechaHoraInicio(Timestamp.valueOf(LocalDateTime.now()));
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
        String todo = "";
        for(ProductoPedido p : pedido.getProductoPedidos()){
            todo = todo + p.getNombre() + p.getId() + p.getPrecioBase() + "I: ";
            for(IngredientePedido i : p.getIngredientes()){
                todo = todo + i.getNombre() + i.getId() + i.getPrecio() + i.getCantidad();
            }
            todo = " | ";
        }
        pedido.setProductoSerializado(todo);
        try{
            repository.addPedido(pedido);
        }catch (Exception e){
            System.out.println("Ha ocurrido un problema almacenando el pedido");
            return null;
        }

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
