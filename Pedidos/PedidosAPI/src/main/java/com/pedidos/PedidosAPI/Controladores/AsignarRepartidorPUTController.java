package com.pedidos.PedidosAPI.Controladores;


import logica.AsignarRepartidor;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/pedidos")
@Stateless
@Produces(MediaType.APPLICATION_JSON)
public class AsignarRepartidorPUTController {

    private @EJB AsignarRepartidor asignarRepartidor;

    @PUT
    @Path("/repartidores")
    public Response asignarRepartidor(RequestAsignar requestAsignar){
        asignarRepartidor.execute(requestAsignar.getIdPedido(),requestAsignar.getIdRepartidor());
        return Response
                .status(Response.Status.OK)
                .entity("")
                .build();
    }

    private class RequestAsignar{
        String idPedido;
        String IdRepartidor;

        public String getIdPedido() {
            return idPedido;
        }

        public void setIdPedido(String idPedido) {
            this.idPedido = idPedido;
        }

        public String getIdRepartidor() {
            return IdRepartidor;
        }

        public void setIdRepartidor(String idRepartidor) {
            IdRepartidor = idRepartidor;
        }
    }

    /*

    <properties>
			<property name="eclipselink.jdbc.url" value="jdbc:mysql://localhost:3306/pedidos"/>
			<property name="eclipselink.jdbc.driver" value="com.mysql.jdbc.Driver"/>
		</properties>
     */
}
