package repositorioProductosJPA;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Producto;
import repositorioProductos.RepositorioProductos;

/**
 * Session Bean implementation class RepositorioProductosJPA
 */
@Stateless
public class RepositorioProductosJPA implements RepositorioProductos {

    private EntityManager entityManager;
    
    public RepositorioProductosJPA() {
        entityManager = Persistence.createEntityManagerFactory("CatalogoAccesoDatos").createEntityManager();
    }

	@Override
	public List<Producto> obtenerTodos() {
		Query query = entityManager.createQuery("SELECT p FROM Producto p");
		return (List<Producto>) query.getResultList();
	}

}
