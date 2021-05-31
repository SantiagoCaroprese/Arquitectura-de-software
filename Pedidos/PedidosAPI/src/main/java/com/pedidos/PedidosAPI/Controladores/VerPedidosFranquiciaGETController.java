package com.pedidos.PedidosAPI.Controladores;

import logica.VerPedidosFranquicia;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/pedidos")
public class VerPedidosFranquiciaGETController {

    private VerPedidosFranquicia verPedidosFranquicia;

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
