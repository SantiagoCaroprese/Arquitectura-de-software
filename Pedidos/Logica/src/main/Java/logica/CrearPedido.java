package logica;

import IRepositorioPedidos.IRepositorioPedidos;
import modelos.Pedido;
import modelos.ProductoPedido;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.LocalBean;
import java.util.List;

@Local
public class CrearPedido {
    private @EJB
    IRepositorioPedidos repository;

    public CrearPedido(){
        //this.repository = repository;
    }

    public Pedido execute(Pedido pedido, List<ProductoPedido> productosPedidos){
        pedido.setTotalPrecio(calcularPrecioPedido(productosPedidos));
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
