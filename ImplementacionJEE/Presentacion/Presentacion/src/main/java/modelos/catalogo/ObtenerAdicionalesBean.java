package modelos.catalogo;

import java.util.ArrayList;

import entidadesCatalogo.Ingrediente;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class ObtenerAdicionalesBean {

	public ObtenerAdicionalesBean() {
	}

	public ArrayList<Ingrediente> ObtenerAdicionales() {
		try {
			Client client = ClientBuilder.newClient();
			ArrayList<Ingrediente> franquicias = client
                    .target("http://25.43.202.212:8080/servicio-catalogo/complementos")
                    .request(MediaType.APPLICATION_JSON)
                    .get(Response.class)
                    .readEntity(new GenericType<ArrayList<Ingrediente>>() {});
			return franquicias;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
