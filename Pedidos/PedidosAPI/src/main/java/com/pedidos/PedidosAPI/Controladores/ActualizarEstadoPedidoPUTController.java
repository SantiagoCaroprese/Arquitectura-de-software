package com.pedidos.PedidosAPI.Controladores;

import logica.ActualizarEstadoPedido;

import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/pedidos")
public class ActualizarEstadoPedidoPUTController {

    ActualizarEstadoPedido actualizarEstadoPedido;

    @PUT
    public Response actualizarEstadoPedido(RequestEstado requestEstado){
        actualizarEstadoPedido.execute(requestEstado.getIdPedido(),requestEstado.getEstado());
        return Response
                .status(Response.Status.OK)
                .entity("")
                .build();
    }

    private class RequestEstado{
        String idPedido;
        String estado;

        public String getIdPedido() {
            return idPedido;
        }

        public void setIdPedido(String idPedido) {
            this.idPedido = idPedido;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }
    }
}
