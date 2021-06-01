package modelos.catalogo;

import java.util.ArrayList;

import entidadesCatalogo.Producto;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


public class ObtenerProductosCatalogoBean {

	public ObtenerProductosCatalogoBean() {
	}
	
	public ArrayList<Producto> obtenerCatalogo() {
		try {
			Client client = ClientBuilder.newClient();
			ArrayList<Producto> productos = client
                    .target("http://25.43.202.212:8080/servicio-catalogo/catalogo")
                    .request(MediaType.APPLICATION_JSON)
                    .get(Response.class)
                    .readEntity(new GenericType<ArrayList<Producto>>() {});
			return productos;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

}
