package IRepositorioPedidos;

import modelos.Pedido;

import java.util.List;

public interface IRepositorioPedidos {
    public Pedido addPedido(Pedido pedido);
    public Pedido delete(Pedido pedido);
    public Pedido update(Pedido pedido);
    public Pedido find(String idPedido);
    public List<Pedido> findPedidosFranquicia(String idFranquicia);
}
