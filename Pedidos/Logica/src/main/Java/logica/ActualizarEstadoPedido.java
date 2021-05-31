package logica;

import IRepositorioPedidos.IRepositorioPedidos;
import modelos.Pedido;
import utils.EncontrarPedido;

import javax.ejb.LocalBean;

@LocalBean
public class ActualizarEstadoPedido {
    private IRepositorioPedidos repository;
    private EncontrarPedido encontrarPedido;

    public ActualizarEstadoPedido(IRepositorioPedidos repository) {
        this.repository = repository;
        this.encontrarPedido = new EncontrarPedido(repository);
    }

    public Pedido execute(String idPedido, String estado){
        Pedido pedido = encontrarPedido.execute(idPedido);
        pedido.setEstado(estado);
        return repository.update(pedido);
    }


}
