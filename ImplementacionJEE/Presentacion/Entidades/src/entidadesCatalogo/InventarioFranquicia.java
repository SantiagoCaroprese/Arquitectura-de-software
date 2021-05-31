package entidadesCatalogo;

import java.io.Serializable;


/**
 * The persistent class for the InventarioFranquicia database table.
 * 
 */
public class InventarioFranquicia implements Serializable {
	private static final long serialVersionUID = 1L;

	private InventarioFranquiciaPK id;

	private int existencias;

	//uni-directional many-to-one association to Ingrediente
	private Ingrediente ingrediente;

	public InventarioFranquicia() {
	}

	public InventarioFranquiciaPK getId() {
		return this.id;
	}

	public void setId(InventarioFranquiciaPK id) {
		this.id = id;
	}

	public int getExistencias() {
		return this.existencias;
	}

	public void setExistencias(int existencias) {
		this.existencias = existencias;
	}

	public Ingrediente getIngrediente() {
		return this.ingrediente;
	}

	public void setIngrediente(Ingrediente ingrediente) {
		this.ingrediente = ingrediente;
	}

}