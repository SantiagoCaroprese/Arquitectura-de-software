package logica;

import IRepositorioPedidos.IRepositorioPedidos;
import utils.EncontrarPedido;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.LocalBean;

@Local
public class VerEstadoPedido {
    private @EJB
    IRepositorioPedidos repositorioPedidos;
    private @EJB
    EncontrarPedido encontrarPedido;

    public VerEstadoPedido() {
        //this.repositorioPedidos = repositorioPedidos;
        //encontrarPedido = new EncontrarPedido(repositorioPedidos);
    }

    public String execute(String idPedido){
        return encontrarPedido.execute(idPedido).getEstado();
    }
}
