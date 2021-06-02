package InterfazLogica;

import modelos.Pedido;

import javax.ejb.Local;

@Local
public interface ActualizarEstadoPedidoLocal {
    Pedido execute(String idPedido, String estado);
}
