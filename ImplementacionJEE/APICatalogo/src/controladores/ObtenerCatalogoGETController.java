package controladores;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import casosDeUso.ObtenerCatalogoFranquiciaLocal;
import casosDeUso.ObtenerCatalogoLocal;
import model.Producto;

@Path("/catalogo")
@Stateless
public class ObtenerCatalogoGETController {
	
	private @EJB ObtenerCatalogoLocal obtenerCatalogo;

	@GET
	public Response execute(){
		return Response.ok(obtenerCatalogo.execute(), MediaType.APPLICATION_JSON).build();
	}
	
}
