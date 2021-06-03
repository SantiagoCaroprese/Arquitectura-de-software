package com.pedidos.PedidosAPI.endpoints;

/*import InterfazLogica.CrearPedidoLocal;
import logica.CrearPedido;

import modelos.ProductoPedido;*/

import InterfazLogica.CrearPedidoLocal;
import modelos.Pedido;
import org.json.simple.JSONObject;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

@Path("/pedidos")
@Stateless
@LocalBean
public class ControladorCrearPedido {

    @EJB(beanInterface = CrearPedidoLocal.class)
    CrearPedidoLocal crearPedido;


    @POST
    public Response crearNuevoPedido(Pedido pedido) throws NamingException, NoSuchAlgorithmException, KeyManagementException {
        System.out.println("Nueva solicitud de creacion de pedido");
        Context context = new InitialContext();

        try{
            CrearPedidoLocal mbean = (CrearPedidoLocal) context.lookup("java:module/CrearPedido");
            mbean.execute(pedido);
        }catch (Exception e){
                System.out.println("Esta null");
                System.out.println(context.getEnvironment());
                return Response.status(Response.Status.BAD_REQUEST).entity("Ha ocurrido una excepcion").build();
        }




        return Response
                .status(Response.Status.OK)
                .entity("")
                .build();
    }




}
