package modelos.catalogo;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import entidadesCatalogo.Producto;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


public class ObtenerProductosCatalogoBean {

	public ObtenerProductosCatalogoBean() {
	}
	
	public ArrayList<Producto> obtenerCatalogo() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://www.myserver.com/book");
		Invocation invocation = target.request(MediaType.APPLICATION_JSON).buildGet();
		Response response = invocation.invoke();
		ArrayList<Producto> productos=response.readEntity(new GenericType<ArrayList<Producto>>() {});
		return productos;
	}

}
