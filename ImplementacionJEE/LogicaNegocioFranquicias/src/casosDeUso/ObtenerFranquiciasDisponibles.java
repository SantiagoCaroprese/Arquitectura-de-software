package casosDeUso;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import model.Franquicia;
import repositorioFranquicias.RepositorioFranquicias;

/**
 * Session Bean implementation class ObtenerFranquiciasDisponibles
 */
@Stateless
public class ObtenerFranquiciasDisponibles implements ObtenerFranquiciasDisponiblesLocal {

	private @EJB RepositorioFranquicias repositorioFranquicias;

    public ObtenerFranquiciasDisponibles() {
    }

	@Override
	public List<Franquicia> execute() {
		return (List<Franquicia>) repositorioFranquicias.obtenerFranquiciasDisponibles();
	}

}
