package entidadesCatalogo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the Producto database table.
 * 
 */
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private String descripcion;

	private String nombre;

	private BigDecimal precio;

	private String tipo;
	
	private String imagen;

	//uni-directional many-to-many association to Ingrediente
	private List<Ingrediente> ingredientes;

	public Producto() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecio() {
		return this.precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Ingrediente> getIngredientes() {
		return this.ingredientes;
	}

	public void setIngredientes(List<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	

}