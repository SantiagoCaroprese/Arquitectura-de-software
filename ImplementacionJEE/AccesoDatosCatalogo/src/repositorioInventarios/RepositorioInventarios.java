package repositorioInventarios;

import javax.ejb.Local;

@Local
public interface RepositorioInventarios {
	public int obtenerExistencias(int idFranquicia, int idProducto);
}
