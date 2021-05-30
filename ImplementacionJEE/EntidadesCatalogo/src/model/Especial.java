package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import static javax.persistence.AccessType.FIELD;
import org.eclipse.persistence.annotations.JoinFetch;
import static org.eclipse.persistence.annotations.JoinFetchType.INNER;
import static org.eclipse.persistence.annotations.JoinFetchType.OUTER;
import static javax.persistence.FetchType.EAGER;
import static javax.persistence.FetchType.LAZY;


/**
 * The persistent class for the Especial database table.
 * 
 */
@Entity
@NamedQuery(name="Especial.findAll", query="SELECT e FROM Especial e")
public class Especial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_limite")
	private Date fechaLimite;

	private String nombre;

	private BigDecimal precio;

	//uni-directional many-to-many association to Producto
	@ManyToMany
	@JoinColumn(name="id")
	@JoinTable(name = "EspecialProducto", joinColumns = @JoinColumn(name = "id_especial", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "id_producto", referencedColumnName = "id"))
	private List<Producto> productos;

	public Especial() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFechaLimite() {
		return this.fechaLimite;
	}

	public void setFechaLimite(Date fechaLimite) {
		this.fechaLimite = fechaLimite;
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

	public List<Producto> getProductos() {
		return this.productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

}