package casosDeUso;

import java.util.List;

import javax.ejb.Local;

import model.Franquicia;

@Local
public interface ObtenerFranquiciasDisponiblesLocal {
	public List<Franquicia> execute();
}
