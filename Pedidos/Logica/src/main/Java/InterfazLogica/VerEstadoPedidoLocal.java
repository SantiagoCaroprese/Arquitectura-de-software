package InterfazLogica;

import javax.ejb.Local;

@Local
public interface VerEstadoPedidoLocal {
    String execute(String idPedido);
}
