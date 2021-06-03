package com.pedidos.PedidosAPI.Controladores;

/*import InterfazLogica.CrearPedidoLocal;
import logica.CrearPedido;

import modelos.ProductoPedido;*/

import InterfazLogica.CrearPedidoLocal;
import modelos.Pedido;
import org.json.simple.JSONObject;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.net.ssl.*;
import javax.security.cert.CertificateException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

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


        //crearPedido.execute(pedido);

        JSONObject obj= new JSONObject();
        obj.put("cardNumber","4444777788889999");
        obj.put("expirationDate","2222-01-01");
        obj.put("securityCode","321");
        obj.put("owner","que pasa joder");
        obj.put("paymentMonto","4");

        System.out.println(pedido.getNombreCliente());



        /*Client client = ClientBuilder.newClient();


        Response response = client
                .target("http://25.46.31.205:8060/VisaPayment/Pay")
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(obj,MediaType.APPLICATION_JSON_TYPE))
                ;
        if(response.getStatus() == Response.Status.OK.getStatusCode()){
            System.out.println("OK");
        }else{
            String url = response.getLocation().toString();

            if(url.contains("^https://")){
                url = url.replace("https://","http://");
            }
            url = "http://25.46.31.205:8061/VisaPayment/Pay";
            System.out.println(url);
            Response s = client.target(url).request().get();
            System.out.println(s.getStatus());
            //client.target(response.getLocation()).request(MediaType.APPLICATION_JSON)
            //  .post(Entity.entity(obj,MediaType.APPLICATION_JSON_TYPE));



        }

        //System.out.println(response.getStatus());*/

        return Response
                .status(Response.Status.OK)
                .entity("")
                .build();
    }




}
