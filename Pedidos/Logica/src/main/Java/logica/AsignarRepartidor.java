package logica;

import IRepositorioPedidos.IRepositorioPedidos;
import InterfazLogica.AsignarRepartidorLocal;
import modelos.Pedido;
import utils.EncontrarPedido;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
public class AsignarRepartidor implements AsignarRepartidorLocal {
    private @EJB
    IRepositorioPedidos repositorioPedidos;

    private EncontrarPedido encontrarPedido;

    public AsignarRepartidor() {
        //this.repositorioPedidos = repositorioPedidos;
        //encontrarPedido = new EncontrarPedido(repositorioPedidos);
    }

    @Override
    public boolean execute(String idPedido, String idRepartidor){
        encontrarPedido = new EncontrarPedido(repositorioPedidos);
        Pedido pedido = encontrarPedido.execute(idPedido);
        pedido.setIdRepartidor(idRepartidor);
        repositorioPedidos.update(pedido);
        return true;
    }
}
