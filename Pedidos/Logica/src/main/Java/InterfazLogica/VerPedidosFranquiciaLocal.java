package InterfazLogica;

import modelos.Pedido;

import javax.ejb.Local;
import java.util.List;

@Local
public interface VerPedidosFranquiciaLocal {
    List<Pedido> execute(String idFranquicia);
}
