package com.pedidos.PedidosAPI.Controladores;

import logica.VerEstadoPedido;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/pedidos")
public class VerEstadoPedidoGETController {

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
