package repositorioFranquicias;

import java.util.List;

import javax.ejb.Local;

import model.Franquicia;

@Local
public interface RepositorioFranquicias {
	public List<Franquicia> obtenerFranquiciasDisponibles();
}
