package casosDeUso;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import fachadaLocal.FachadaAccesoDatosLocal;
import model.Ingrediente;
import model.InventarioFranquicia;
import model.Producto;

/**
 * Session Bean implementation class ObtenerCatalogoFranquicia
 */
@Stateless
public class ObtenerCatalogoFranquicia implements ObtenerCatalogoFranquiciaLocal {

    private @EJB FachadaAccesoDatosLocal fachadaAccesoDatos;
    
    public ObtenerCatalogoFranquicia() {
    }

	@Override
	public List<Producto> execute(int idFranquicia) {
		List<Producto> catalogo = fachadaAccesoDatos.obtenerCatalogo();
		List<Producto> catalogoDisponible = new ArrayList();
		for(Producto producto : catalogo) {
			boolean disponible = true;
			for(Ingrediente ingrediente : producto.getIngredientes()) {
				if(fachadaAccesoDatos.obtenerExistencias(idFranquicia, ingrediente.getId()) < 50) {
					disponible = false;
					break;
				}
			}
			if(disponible) {
				catalogoDisponible.add(producto);
			}
		}
		return catalogoDisponible;
	}

}
