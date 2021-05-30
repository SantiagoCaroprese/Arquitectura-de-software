package fachadaLocal;

import java.util.List;

import javax.ejb.Local;

import model.Producto;

@Local
public interface FachadaAccesoDatosLocal {
	public List<Producto> obtenerCatalogo();
	public int obtenerExistencias(int idFranquicia, int idIngrediente);
}
