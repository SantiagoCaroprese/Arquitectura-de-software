package logica;

import IRepositorioPedidos.IRepositorioPedidos;
import InterfazLogica.ActualizarEstadoPedidoLocal;
import modelos.Pedido;
import utils.EncontrarPedido;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
public class ActualizarEstadoPedido implements ActualizarEstadoPedidoLocal {
    private @EJB
    IRepositorioPedidos repository;


    private EncontrarPedido encontrarPedido;

    public ActualizarEstadoPedido() {
        //this.repository = repository;
        //this.encontrarPedido = new EncontrarPedido(repository);
    }

    @Override
    public Pedido execute(String idPedido, String estado){
        encontrarPedido = new EncontrarPedido(repository);
        Pedido pedido = encontrarPedido.execute(idPedido);
        pedido.setEstado(estado);
        return repository.update(pedido);
    }


}
