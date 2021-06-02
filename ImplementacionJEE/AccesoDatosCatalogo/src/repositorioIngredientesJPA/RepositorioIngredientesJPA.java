package repositorioIngredientesJPA;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;

import model.Ingrediente;
import repositorioIngredientes.RepositorioIngredientes;

/**
 * Session Bean implementation class RepositorioIngredientesJPA
 */
@Stateless
public class RepositorioIngredientesJPA implements RepositorioIngredientes {
	
	private EntityManager entityManager;
	
    public RepositorioIngredientesJPA() {
    	entityManager = Persistence.createEntityManagerFactory("CatalogoAccesoDatos").createEntityManager();
    }

	@Override
	public List<Ingrediente> obtenerComplementos() {
		return (List<Ingrediente>) entityManager.createQuery("SELECT i FROM Ingrediente i WHERE i.tipo = 'complemento'").getResultList();
				
	}

}
