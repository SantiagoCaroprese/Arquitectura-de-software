package casosDeUso;

import java.util.List;

import javax.ejb.Local;

import model.Producto;

@Local
public interface ObtenerCatalogoLocal {
	public List<Producto> execute();
}
