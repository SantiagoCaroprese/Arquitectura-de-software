package controladores;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import casosDeUso.ObtenerComplementosLocal;


@Path("/complementos")
@Stateless
public class ObtenerComplementosGETController {
	private @EJB ObtenerComplementosLocal obtenerComplementos;

	@GET
	public Response execute(){
		return Response.ok(obtenerComplementos.execute(), MediaType.APPLICATION_JSON).build();
	}
}
