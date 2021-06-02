package modelos.franquicias;

import java.util.ArrayList;

import entidadesFranquicia.Franquicia;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


public class ObtenerFranquiciasBean {

	public ObtenerFranquiciasBean() {
	}

	public ArrayList<Franquicia> ObtenerFranquicias() {
		try {
			Client client = ClientBuilder.newClient();
			ArrayList<Franquicia> franquicias = client
                    .target("http://25.43.202.212:8085/servicio-franquicias/disponibles")
                    .request(MediaType.APPLICATION_JSON)
                    .get(Response.class)
                    .readEntity(new GenericType<ArrayList<Franquicia>>() {});
			return franquicias;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
