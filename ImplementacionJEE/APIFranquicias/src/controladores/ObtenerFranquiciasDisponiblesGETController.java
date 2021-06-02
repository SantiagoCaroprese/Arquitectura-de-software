package controladores;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import casosDeUso.ObtenerFranquiciasDisponiblesLocal;

@Path("/disponibles")
@Stateless
public class ObtenerFranquiciasDisponiblesGETController {
	private @EJB ObtenerFranquiciasDisponiblesLocal obtenerFranquicias;
	
	@GET
	public Response execute(){
		return Response.ok(obtenerFranquicias.execute(), MediaType.APPLICATION_JSON).build();
	}
	
}
