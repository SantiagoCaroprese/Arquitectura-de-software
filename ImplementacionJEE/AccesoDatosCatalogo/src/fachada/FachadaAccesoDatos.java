package fachada;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import fachadaLocal.FachadaAccesoDatosLocal;
import model.Producto;
import repositorioInventarios.RepositorioInventarios;
import repositorioProductos.RepositorioProductos;

/**
 * Session Bean implementation class FachadaAccesoDatos
 */
@Stateless
public class FachadaAccesoDatos implements FachadaAccesoDatosLocal {
	
	private @EJB RepositorioProductos repositorioProductos;
	private @EJB RepositorioInventarios repositorioInventarios;
    
	public FachadaAccesoDatos() {
    }

	@Override
	public List<Producto> obtenerCatalogo() {
		return repositorioProductos.obtenerTodos();
	}

	@Override
	public int obtenerExistencias(int idFranquicia, int idIngrediente) {
		return repositorioInventarios.obtenerExistencias(idFranquicia, idIngrediente);
	}

	
}
