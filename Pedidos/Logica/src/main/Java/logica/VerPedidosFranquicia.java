package logica;

import IRepositorioPedidos.IRepositorioPedidos;
import modelos.Pedido;

import javax.ejb.LocalBean;
import java.util.List;

@LocalBean
public class VerPedidosFranquicia {
    private IRepositorioPedidos repositorioPedidos;

    public VerPedidosFranquicia(IRepositorioPedidos repositorioPedidos) {
        this.repositorioPedidos = repositorioPedidos;
    }

    public List<Pedido> execute(String idFranquicia){
        return repositorioPedidos.findPedidosFranquicia(idFranquicia);
    }
}
