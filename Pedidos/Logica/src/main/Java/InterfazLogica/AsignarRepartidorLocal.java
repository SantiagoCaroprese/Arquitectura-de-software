package InterfazLogica;

import javax.ejb.Local;

@Local
public interface AsignarRepartidorLocal {
    boolean execute(String idPedido, String idRepartidor);
}
