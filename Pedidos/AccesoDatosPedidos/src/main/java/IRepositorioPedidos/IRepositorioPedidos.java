package IRepositorioPedidos;

import modelos.Pedido;

import javax.ejb.Local;
import java.util.List;

@Local
public interface IRepositorioPedidos {
    public Pedido addPedido(Pedido pedido);
    public Pedido delete(Pedido pedido);
    public Pedido update(Pedido pedido);
    public Pedido find(String idPedido);
    public List<Pedido> findPedidosFranquicia(String idFranquicia);
}
