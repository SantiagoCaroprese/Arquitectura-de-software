package fachada;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import fachadaLocal.FachadaAccesoDatosLocal;
import model.Ingrediente;
import model.Producto;
import repositorioIngredientes.RepositorioIngredientes;
import repositorioInventarios.RepositorioInventarios;
import repositorioProductos.RepositorioProductos;

/**
 * Session Bean implementation class FachadaAccesoDatos
 */
@Stateless
public class FachadaAccesoDatos implements FachadaAccesoDatosLocal {
	
	private @EJB RepositorioProductos repositorioProductos;
	private @EJB RepositorioInventarios repositorioInventarios;
	private @EJB RepositorioIngredientes repositorioIngredientes;
    
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

	@Override
	public List<Ingrediente> obtenerComplementos() {
		return repositorioIngredientes.obtenerComplementos();
	}

	
}
