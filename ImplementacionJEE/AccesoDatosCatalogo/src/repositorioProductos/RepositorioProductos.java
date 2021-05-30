package repositorioProductos;

import java.util.List;

import javax.ejb.Local;

import model.Producto;

@Local
public interface RepositorioProductos {
	public List<Producto> obtenerTodos();
}
