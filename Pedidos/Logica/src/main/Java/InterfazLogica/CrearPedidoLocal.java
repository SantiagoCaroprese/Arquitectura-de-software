package InterfazLogica;

import modelos.Pedido;
import modelos.ProductoPedido;

import javax.ejb.Local;
import java.util.List;

@Local
public interface CrearPedidoLocal {
    Pedido execute(Pedido pedido);
}
