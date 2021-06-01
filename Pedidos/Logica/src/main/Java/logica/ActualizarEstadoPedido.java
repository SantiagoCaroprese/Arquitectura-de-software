package logica;

import IRepositorioPedidos.IRepositorioPedidos;
import modelos.Pedido;
import utils.EncontrarPedido;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.LocalBean;

@Local
public class ActualizarEstadoPedido {
    private @EJB
    IRepositorioPedidos repository;

    private @EJB
    EncontrarPedido encontrarPedido;

    public ActualizarEstadoPedido() {
        //this.repository = repository;
        //this.encontrarPedido = new EncontrarPedido(repository);
    }

    public Pedido execute(String idPedido, String estado){
        Pedido pedido = encontrarPedido.execute(idPedido);
        pedido.setEstado(estado);
        return repository.update(pedido);
    }


}
