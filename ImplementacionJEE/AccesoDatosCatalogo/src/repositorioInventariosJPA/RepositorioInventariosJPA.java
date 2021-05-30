package repositorioInventariosJPA;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import model.InventarioFranquicia;
import model.InventarioFranquiciaPK;
import repositorioInventarios.RepositorioInventarios;

/**
 * Session Bean implementation class RepositorioInventariosJPA
 */
@Stateless
public class RepositorioInventariosJPA implements RepositorioInventarios {

    private EntityManager entityManager;
    
    public RepositorioInventariosJPA() {
    	entityManager = Persistence.createEntityManagerFactory("CatalogoAccesoDatos").createEntityManager();
    }

	@Override
	public int obtenerExistencias(int idFranquicia, int idIngrediente) {
		InventarioFranquicia inventarioFranquicia = this.obtenerInventarioFranquicia(idFranquicia, idIngrediente);
		if(inventarioFranquicia == null) {
			return 0;
		}
		return inventarioFranquicia.getExistencias();
	}
	
	private InventarioFranquicia obtenerInventarioFranquicia(int idFranquicia, int idIngrediente) {
		InventarioFranquiciaPK llavePrimaria = new InventarioFranquiciaPK();
		llavePrimaria.setIdFranquicia(idFranquicia);
		llavePrimaria.setIdIngrediente(idIngrediente);
		return entityManager.find(InventarioFranquicia.class, llavePrimaria);
	}

}
