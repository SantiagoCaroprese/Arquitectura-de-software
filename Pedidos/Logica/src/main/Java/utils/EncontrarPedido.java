package utils;


import IRepositorioPedidos.IRepositorioPedidos;
import modelos.Pedido;

public class EncontrarPedido {
    private IRepositorioPedidos repositorioPedidos;

    public EncontrarPedido(IRepositorioPedidos repositorioPedidos) {
        this.repositorioPedidos = repositorioPedidos;
    }

    public Pedido execute(String id){
        Pedido p = repositorioPedidos.find(id);
        if(p == null){
            //TO DO
            //Lanzar excepcion
        }
        return p;
    }
}
