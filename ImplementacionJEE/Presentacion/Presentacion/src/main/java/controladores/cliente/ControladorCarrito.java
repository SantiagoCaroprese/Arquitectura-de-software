package controladores.cliente;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.servlet.http.HttpSession;

import entidadesCatalogo.Ingrediente;
import entidadesCatalogo.Producto;
import entidadesPedidos.IngredientePedido;
import entidadesPedidos.Pedido;
import entidadesPedidos.ProductoPedido;

@ManagedBean
@ViewScoped
public class ControladorCarrito {
	 private Map<Integer, Boolean> checked = new HashMap<Integer, Boolean>();
	 private Pedido carrito=null;
	 
	 public ControladorCarrito() {
		 this.carrito=cargarPedido();
	 }

	private Pedido cargarPedido() {
		FacesContext context = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
		if(session==null) {
			return null;
		}
		return (Pedido) session.getAttribute("pedido");
	}
	
	public String agregarProducto(){
		if(this.carrito==null) {
			return "false";
		}
		Producto producto=obtenerProducto();
		if(producto==null) {
			return "false";
		}
		ProductoPedido productoPedido=convertirProducto(producto);
		if(productoPedido==null) {
			return "false";
		}
		this.carrito.getProductoPedidos().add(productoPedido);
		this.carrito.setTotalPrecio(this.carrito.getTotalPrecio()+productoPedido.calcularPrecioProducto());
		FacesContext context = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
		if(session==null) {
			return "false";
		}
		session.setAttribute("pedido", carrito);
		return "true";
	}
	
	public String eliminarProducto(String idProducto) {
		if(carrito==null) {
			return "false";
		}
		ProductoPedido pp=null;
		for (ProductoPedido producto : this.carrito.getProductoPedidos()) {
			if(producto.getId().equals(idProducto)) {
				pp=producto;
				break;
			}
		}
		if(pp==null) {
			return "false";
		}
		this.carrito.getProductoPedidos().remove(pp);
		this.carrito.setTotalPrecio(this.carrito.getTotalPrecio()-pp.calcularPrecioProducto());
		return "true"; 
	}

	private ProductoPedido convertirProducto(Producto producto) {
		ProductoPedido pedido=new ProductoPedido(Integer.toString(producto.getId()), producto.getNombre(), producto.getPrecio().intValue(), new ArrayList<>());
		for (Ingrediente ingrediente: producto.getIngredientes()) {
			IngredientePedido ip=new IngredientePedido(Integer.toString(ingrediente.getId()), ingrediente.getNombre(), ingrediente.getPrecioAdicion().intValue(), 1);
			pedido.getIngredientes().add(ip);
		}
		return pedido;
	}

	private Producto obtenerProducto() {
		FacesContext context = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
		Producto producto=(Producto) session.getAttribute("productoSeleccionado");
		return producto;
	}

	public Pedido getCarrito() {
		return carrito;
	}

	public void setCarrito(Pedido carrito) {
		this.carrito = carrito;
	}
	
	
}
