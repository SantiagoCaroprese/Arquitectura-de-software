package logica;

import IRepositorioPedidos.IRepositorioPedidos;
import modelos.Pedido;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.LocalBean;
import java.util.List;

@Local
public class VerPedidosFranquicia {
    private @EJB
    IRepositorioPedidos repositorioPedidos;

    public VerPedidosFranquicia(IRepositorioPedidos repositorioPedidos) {
        this.repositorioPedidos = repositorioPedidos;
    }

    public List<Pedido> execute(String idFranquicia){
        return repositorioPedidos.findPedidosFranquicia(idFranquicia);
    }
}
