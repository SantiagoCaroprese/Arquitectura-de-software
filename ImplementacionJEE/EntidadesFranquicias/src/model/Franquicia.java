package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the FRANQUICIA database table.
 * 
 */
@Entity
@Table(name="FRANQUICIA")
@NamedQuery(name="Franquicia.findAll", query="SELECT f FROM Franquicia f")
public class Franquicia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String ciudad;

	private String departamento;

	private String direccion;

	private String estado;

	private String nombre;

	public Franquicia() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}