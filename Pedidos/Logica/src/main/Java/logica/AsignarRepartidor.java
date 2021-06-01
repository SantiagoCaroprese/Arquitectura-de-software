package logica;

import IRepositorioPedidos.IRepositorioPedidos;
import modelos.Pedido;
import utils.EncontrarPedido;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.LocalBean;

@Local
public class AsignarRepartidor {
    private @EJB
    IRepositorioPedidos repositorioPedidos;
    private @EJB
    EncontrarPedido encontrarPedido;

    public AsignarRepartidor() {
        //this.repositorioPedidos = repositorioPedidos;
        //encontrarPedido = new EncontrarPedido(repositorioPedidos);
    }

    public boolean execute(String idPedido, String idRepartidor){
        Pedido pedido = encontrarPedido.execute(idPedido);
        pedido.setIdRepartidor(idRepartidor);
        repositorioPedidos.update(pedido);
        return true;
    }
}
