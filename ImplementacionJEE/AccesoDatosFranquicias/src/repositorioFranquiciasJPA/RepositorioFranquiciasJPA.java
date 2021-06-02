package repositorioFranquiciasJPA;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import model.Franquicia;
import repositorioFranquicias.RepositorioFranquicias;

/**
 * Session Bean implementation class RepositorioFranquiciasJPA
 */
@Stateless
public class RepositorioFranquiciasJPA implements RepositorioFranquicias {

	private EntityManager entityManager;
	
    public RepositorioFranquiciasJPA() {
    	entityManager = Persistence.createEntityManagerFactory("FranquiciasAccesoDatos").createEntityManager();
    }

	@Override
	public List<Franquicia> obtenerFranquiciasDisponibles() {
		return (List<Franquicia>) entityManager.createQuery("SELECT f FROM Franquicia f WHERE f.estado = 'disponible'").getResultList();
	}

}
