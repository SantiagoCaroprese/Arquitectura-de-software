package controladores.cliente;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import entidadesCatalogo.Producto;
import modelos.catalogo.ObtenerProductosCatalogoBean;

@ManagedBean
@ViewScoped
public class ControladorObtenerProductosCatalogo {
	
	private ArrayList<Producto> productos;

	public ControladorObtenerProductosCatalogo() {
	}
	
	public String verCatalogo() {
		ObtenerProductosCatalogoBean bean= new ObtenerProductosCatalogoBean();
		productos= bean.obtenerCatalogo();
		if(productos==null || productos.isEmpty()) {
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
	
	
}
