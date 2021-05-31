package repositorioIngredientes;

import java.util.List;

import javax.ejb.Local;

import model.Ingrediente;

@Local
public interface RepositorioIngredientes {
	public List<Ingrediente> obtenerComplementos();
}
