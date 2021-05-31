package casosDeUso;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import fachadaLocal.FachadaAccesoDatosLocal;
import model.Ingrediente;

/**
 * Session Bean implementation class ObtenerComplementos
 */
@Stateless
public class ObtenerComplementos implements ObtenerComplementosLocal {

	private @EJB FachadaAccesoDatosLocal fachadaAccesoDatos;
	
    public ObtenerComplementos() {
    }

	@Override
	public List<Ingrediente> execute() {
		return fachadaAccesoDatos.obtenerComplementos();
	}

}
