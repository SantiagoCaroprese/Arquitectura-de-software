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
import modelos.catalogo.ObtenerCatalogoFranquiciaBean;

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
	
	@SuppressWarnings("unchecked")
	private ArrayList<Producto> getProductosFranquicia(String idFranquicia, HttpSession session){
		ArrayList<Producto> productos=new ArrayList<>();
		try {
			productos=(ArrayList<Producto>) session.getAttribute("productosFranquicia");
			if(session.getAttribute("inicio").equals(1)) {
				session.setAttribute("inicio", "0");
			}else {
				productos=null;
			}
		}catch(NullPointerException e) {
			
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		if(productos==null || productos.isEmpty()) {
			//Obtener productos por bean
			ObtenerCatalogoFranquiciaBean bean=new ObtenerCatalogoFranquiciaBean();
			ArrayList<Producto> productos2=new ArrayList<>();
			productos2=bean.obtenerCatalogoFranquicia(idFranquicia);
			if(productos2==null || productos2.isEmpty()) {
				productos2=new ArrayList<>();
				Producto pr=new Producto();
				pr.setDescripcion("yummi");
				pr.setId(0);
				pr.setImagen("resource/Sand2.png");
				ArrayList<Ingrediente> ings= new ArrayList<>();
				Ingrediente ing=new Ingrediente();
				ing.setId(0);
				ing.setNombre("Gommibayas");
				ing.setPrecioAdicion(new BigDecimal(5000));
				ing.setTipo("Magico");
				ings.add(ing);
				pr.setPrecio(new BigDecimal(15000));
				pr.setIngredientes(ings);
				pr.setNombre("El Poderoso");
				pr.setTipo("Magico");
				productos2.add(pr);
				
				Producto pr2=new Producto();
				pr2.setDescripcion("yami");
				pr2.setId(1);
				pr2.setImagen("resource/Sand2.png");
				ArrayList<Ingrediente> ings2= new ArrayList<>();
				Ingrediente ing2=new Ingrediente();
				ing2.setId(2);
				ing2.setNombre("Miel");
				ing2.setPrecioAdicion(new BigDecimal(2000));
				ing2.setTipo("Dulce");
				ings2.add(ing2);
				pr2.setPrecio(new BigDecimal(12000));
				pr2.setIngredientes(ings2);
				pr2.setNombre("Viscososos");
				pr2.setTipo("Magico");
				productos2.add(pr2);
			}
			session.setAttribute("productosFranquicia", productos2);
			for (Producto producto : productos2) {
				if(producto.getImagen()==null||producto.getImagen().isBlank()||producto.getImagen().isEmpty()) {
					producto.setImagen("resource/Sand2.png");
				}
			}
			return productos2;
		}
		return productos;
		
	}
}
