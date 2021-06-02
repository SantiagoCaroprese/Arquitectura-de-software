package controladores.cliente;

import java.math.BigDecimal;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.servlet.http.HttpSession;

import entidadesCatalogo.Ingrediente;
import entidadesCatalogo.Producto;
import entidadesPedidos.IngredientePedido;
import entidadesPedidos.Pedido;

@ManagedBean
@ViewScoped
public class ControladorCatalogoFranquicia {
	
	public ControladorCatalogoFranquicia() {
	}
	
	public ArrayList<Producto> productosFranquicia() {
		try {
			FacesContext context = FacesContext.getCurrentInstance();
			HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
			Pedido pedido=(Pedido) session.getAttribute("pedido");
			ArrayList<Producto> productos=getProductosFranquicia(pedido.getIdFranquicia(),session);
			return productos;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	private ArrayList<Producto> getProductosFranquicia(String idFranquicia, HttpSession session){
		ArrayList<Producto> productos=new ArrayList<>();
		ArrayList<Producto> productos2=new ArrayList<>();
		try {
			productos=(ArrayList<Producto>) session.getAttribute("productosFranquicia");
		}catch(NullPointerException e) {
			
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		if(productos==null) {
			//Obtener productos por bean
			Producto pr=new Producto();
			pr.setDescripcion("yummi");
			pr.setId(0);
			pr.setImagen("resource/Sand1.png");
			ArrayList<Ingrediente> ings= new ArrayList<>();
			Ingrediente ing=new Ingrediente();
			ing.setId(0);
			ing.setNombre("Gommibayas");
			ing.setPrecioAdicion(new BigDecimal(10000));
			ing.setTipo("Magico");
			ings.add(ing);
			pr.setIngredientes(ings);
			pr.setNombre("El Poderoso");
			pr.setTipo("Magico");
			productos2.add(pr);
			session.setAttribute("productosFranquicia", productos2);
			return productos2;
		}
		return productos;
		
	}
}
