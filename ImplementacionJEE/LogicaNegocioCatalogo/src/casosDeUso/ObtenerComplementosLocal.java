package casosDeUso;

import java.util.List;

import javax.ejb.Local;

import model.Ingrediente;


@Local
public interface ObtenerComplementosLocal {
	public List<Ingrediente> execute();
}
