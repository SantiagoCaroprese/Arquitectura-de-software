package com.pedidos.PedidosAPI.Controladores;

import logica.VerEstadoPedido;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/pedidos")
@Stateless
public class VerEstadoPedidoGETController {

    private @EJB
    VerEstadoPedido verEstadoPedido;

    @GET
    @Path("{idPedido}")
    public Response verEstadoPedio(@PathParam("idPedido") String idPedido){

        verEstadoPedido.execute(idPedido);

        return Response
                .status(Response.Status.OK)
                .entity("")
                .build();
    }
}
