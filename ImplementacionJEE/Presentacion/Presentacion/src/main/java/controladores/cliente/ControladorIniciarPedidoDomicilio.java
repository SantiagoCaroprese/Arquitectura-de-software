package controladores.cliente;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import entidadesCatalogo.Producto;
import entidadesPresentacion.Departamento;
import modelos.catalogo.ObtenerCatalogoFranquiciaBean;
import modelos.catalogo.ObtenerProductosCatalogoBean;

@ManagedBean
@ViewScoped
public class ControladorIniciarPedidoDomicilio {
	
	private String departamento;
	private String ciudad;
	private String observaciones;
	private String direccion;
	private ArrayList<Producto> productosFranquicia=null;

	public ControladorIniciarPedidoDomicilio() {
	}
	
	public String verCatalogo() {
		if(productosFranquicia==null) {
			ObtenerCatalogoFranquiciaBean bean= new ObtenerCatalogoFranquiciaBean();
			productosFranquicia= bean.obtenerCatalogoFranquicia();
		}
		if(productosFranquicia==null || productosFranquicia.isEmpty()) {
			return "false";
		}
		return "true";
	}
	
	
	
	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public String crearPedidoDomicilio() {
		return "true";
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

		
	
}
