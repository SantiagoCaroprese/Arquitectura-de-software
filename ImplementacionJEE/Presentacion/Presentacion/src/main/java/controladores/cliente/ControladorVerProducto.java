package controladores.cliente;

import java.math.BigDecimal;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.servlet.http.HttpSession;

import entidadesCatalogo.Ingrediente;
import entidadesCatalogo.Producto;
import entidadesPedidos.Pedido;

@ManagedBean
@ViewScoped
public class ControladorVerProducto {
	
	private Producto producto=null;
	private ArrayList<Ingrediente> adicionales;

	public ControladorVerProducto() {
	}
	
	@SuppressWarnings("unchecked")
	public String verProducto(String idProducto) {
		try {
			FacesContext context = FacesContext.getCurrentInstance();
			HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
			ArrayList<Producto> productos=(ArrayList<Producto>) session.getAttribute("productosFranquicia");
			for (Producto producto : productos) {
				if(producto.getId()==Integer.valueOf(idProducto)) {
					this.producto=producto;
					break;
				}
			}
			if(producto==null) {
				return "false";
			}
			session.setAttribute("productoSeleccionado", this.producto);
			cargarAdicionales(session);
			return "true";
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		return "false";
	}

	@SuppressWarnings("unchecked")
	private void cargarAdicionales(HttpSession session) {
		try {
			ArrayList<Ingrediente> adicionales=(ArrayList<Ingrediente>) session.getAttribute("adicionales");
			this.adicionales=adicionales;
		}catch(NullPointerException e) {
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		ArrayList<Producto> adicionales2=new ArrayList<>();
		ArrayList<Ingrediente> ings= new ArrayList<>();
		if(adicionales==null){
		 	//llamar Bean
			Ingrediente ing=new Ingrediente();
			ing.setId(0);
			ing.setNombre("El Poderosoito");
			ing.setPrecioAdicion(new BigDecimal(2000));
			ing.setTipo("...pero Sabroso");
			ings.add(ing);
			
			Ingrediente ing2=new Ingrediente();
			ing2.setId(0);
			ing2.setNombre("Papas");
			ing2.setPrecioAdicion(new BigDecimal(2000));
			ing2.setTipo("aburrido");
			ings.add(ing2);
			
			session.setAttribute("adicionales", ings);
		}
		this.adicionales=ings;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public ArrayList<Ingrediente> getAdicionales() {
		return adicionales;
	}

	public void setAdicionales(ArrayList<Ingrediente> adicionales) {
		this.adicionales = adicionales;
	}
	
}
