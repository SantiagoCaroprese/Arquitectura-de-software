package logica;

import IRepositorioPedidos.IRepositorioPedidos;
import InterfazLogica.VerPedidosFranquiciaLocal;
import modelos.Pedido;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class VerPedidosFranquicia implements VerPedidosFranquiciaLocal   {
    private @EJB
    IRepositorioPedidos repositorioPedidos;

    public VerPedidosFranquicia() {
        //this.repositorioPedidos = repositorioPedidos;
    }

    @Override
    public List<Pedido> execute(String idFranquicia){
        return repositorioPedidos.findPedidosFranquicia(idFranquicia);
    }
}
