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
import model.Producto;

@Path("/catalogo")
@Stateless
public class ObtenerCatalogoFranquiciaGETController {
	
	private @EJB ObtenerCatalogoFranquiciaLocal obtenerCatalogo;

	@GET
	//@Path("{id}")
	@Path("hola")
	//public Response execute(@PathParam("id") int idFranquicia){
	public Response execute(){
		//return Response.ok(obtenerCatalogo.execute(idFranquicia), MediaType.APPLICATION_JSON).build();
		return Response.ok("hola").build();
	}
	
}
