package logica.utils;


import IRepositorioPedidos.IRepositorioPedidos;
import modelos.Pedido;

import javax.ejb.Local;

@Local
public class EncontrarPedido {

    IRepositorioPedidos repositorioPedidos;

    public EncontrarPedido(){}

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
