package entidadesCatalogo;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 * The persistent class for the Ingrediente database table.
 * 
 */
public class Ingrediente implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private String nombre;

	private BigDecimal precioAdicion;

	private String tipo;

	public Ingrediente() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecioAdicion() {
		return this.precioAdicion;
	}

	public void setPrecioAdicion(BigDecimal precioAdicion) {
		this.precioAdicion = precioAdicion;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}