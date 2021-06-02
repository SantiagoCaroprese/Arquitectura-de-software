package casosDeUso;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import fachadaLocal.FachadaAccesoDatosLocal;
import model.Ingrediente;
import model.Producto;

/**
 * Session Bean implementation class ObtenerCatalogo
 */
@Stateless
public class ObtenerCatalogo implements ObtenerCatalogoLocal {

	private @EJB FachadaAccesoDatosLocal fachadaAccesoDatos;
    
    public ObtenerCatalogo() {
    }

	@Override
	public List<Producto> execute() {
		return fachadaAccesoDatos.obtenerCatalogo();
	}

}
