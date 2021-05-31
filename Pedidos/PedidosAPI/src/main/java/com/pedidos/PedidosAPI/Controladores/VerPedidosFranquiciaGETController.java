package com.pedidos.PedidosAPI.Controladores;

import logica.VerPedidosFranquicia;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/pedidos")
@Stateless
public class VerPedidosFranquiciaGETController {

    private @EJB
    VerPedidosFranquicia verPedidosFranquicia;

    @GET
    @Path("{idFranquicia}")
    public Response verPedidosFranquicia(@PathParam("idFranquicia") String idFranquicia){
        verPedidosFranquicia.execute(idFranquicia);
        return Response
                .status(Response.Status.OK)
                .entity("")
                .build();
    }
}
