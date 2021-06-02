package logica;

import IRepositorioPedidos.IRepositorioPedidos;
import InterfazLogica.VerEstadoPedidoLocal;
import utils.EncontrarPedido;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
public class VerEstadoPedido implements VerEstadoPedidoLocal {
    private @EJB
    IRepositorioPedidos repositorioPedidos;

    private EncontrarPedido encontrarPedido;

    public VerEstadoPedido() {
        //this.repositorioPedidos = repositorioPedidos;
        //encontrarPedido = new EncontrarPedido(repositorioPedidos);
    }

    @Override
    public String execute(String idPedido){
        encontrarPedido = new EncontrarPedido(repositorioPedidos);
        return encontrarPedido.execute(idPedido).getEstado();
    }
}
