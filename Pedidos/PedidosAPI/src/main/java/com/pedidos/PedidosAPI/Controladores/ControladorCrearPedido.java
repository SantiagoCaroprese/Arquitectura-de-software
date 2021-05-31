package com.pedidos.PedidosAPI.Controladores;

import logica.CrearPedido;
import modelos.Pedido;
import modelos.ProductoPedido;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Path("/pedidos")
@Produces(MediaType.APPLICATION_JSON)
public class ControladorCrearPedido {

    private CrearPedido crearPedido;

    @POST
    public Response crearNuevoPedido(RequestPedido requestPedido){
        Pedido p = new Pedido("10","100",requestPedido.estado,
                Timestamp.valueOf(LocalDateTime.now()),
                (byte)(requestPedido.domicilio?1:0),
                requestPedido.nombreCliente,requestPedido.correoCliente);
        crearPedido.execute(p,requestPedido.productos);
        return Response
                .status(Response.Status.OK)
                .entity("")
                .build();
    }



    private class RequestPedido{
        String idFranquicia;
        boolean domicilio;
        String direccion;
        String estado;
        String nombreCliente;
        String correoCliente;
        List<ProductoPedido> productos;

        public boolean isDomicilio() {
            return domicilio;
        }

        public void setDomicilio(boolean domicilio) {
            this.domicilio = domicilio;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public String getNombreCliente() {
            return nombreCliente;
        }

        public void setNombreCliente(String nombreCliente) {
            this.nombreCliente = nombreCliente;
        }

        public String getCorreoCliente() {
            return correoCliente;
        }

        public void setCorreoCliente(String correoCliente) {
            this.correoCliente = correoCliente;
        }

        public List<ProductoPedido> getProductos() {
            return productos;
        }

        public void setProductos(List<ProductoPedido> productos) {
            this.productos = productos;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }
    }

}
