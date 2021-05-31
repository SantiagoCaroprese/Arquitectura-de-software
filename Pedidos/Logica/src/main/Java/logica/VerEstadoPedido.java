package logica;

import IRepositorioPedidos.IRepositorioPedidos;
import utils.EncontrarPedido;

import javax.ejb.LocalBean;

@LocalBean
public class VerEstadoPedido {
    private IRepositorioPedidos repositorioPedidos;
    private EncontrarPedido encontrarPedido;

    public VerEstadoPedido(IRepositorioPedidos repositorioPedidos) {
        this.repositorioPedidos = repositorioPedidos;
        encontrarPedido = new EncontrarPedido(repositorioPedidos);
    }

    public String execute(String idPedido){
        return encontrarPedido.execute(idPedido).getEstado();
    }
}
