package logica;

import IRepositorioPedidos.IRepositorioPedidos;
import modelos.Pedido;
import utils.EncontrarPedido;

import javax.ejb.LocalBean;

@LocalBean
public class AsignarRepartidor {
    private  IRepositorioPedidos repositorioPedidos;
    private EncontrarPedido encontrarPedido;

    public AsignarRepartidor(IRepositorioPedidos repositorioPedidos) {
        this.repositorioPedidos = repositorioPedidos;
        encontrarPedido = new EncontrarPedido(repositorioPedidos);
    }

    public boolean execute(String idPedido, String idRepartidor){
        Pedido pedido = encontrarPedido.execute(idPedido);
        pedido.setIdRepartidor(idRepartidor);
        repositorioPedidos.update(pedido);
        return true;
    }
}
