package casosDeUso;

import java.util.List;

import javax.ejb.Local;

import model.Producto;

@Local
public interface ObtenerCatalogoFranquiciaLocal {

	public List<Producto> execute(int idFranquicia);
	
}
