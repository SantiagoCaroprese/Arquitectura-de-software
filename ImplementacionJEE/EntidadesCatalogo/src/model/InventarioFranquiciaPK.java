package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the InventarioFranquicia database table.
 * 
 */
@Embeddable
public class InventarioFranquiciaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_franquicia")
	private int idFranquicia;

	@Column(name="id_ingrediente", insertable=false, updatable=false)
	private int idIngrediente;

	public InventarioFranquiciaPK() {
	}
	public int getIdFranquicia() {
		return this.idFranquicia;
	}
	public void setIdFranquicia(int idFranquicia) {
		this.idFranquicia = idFranquicia;
	}
	public int getIdIngrediente() {
		return this.idIngrediente;
	}
	public void setIdIngrediente(int idIngrediente) {
		this.idIngrediente = idIngrediente;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof InventarioFranquiciaPK)) {
			return false;
		}
		InventarioFranquiciaPK castOther = (InventarioFranquiciaPK)other;
		return 
			(this.idFranquicia == castOther.idFranquicia)
			&& (this.idIngrediente == castOther.idIngrediente);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idFranquicia;
		hash = hash * prime + this.idIngrediente;
		
		return hash;
	}
}