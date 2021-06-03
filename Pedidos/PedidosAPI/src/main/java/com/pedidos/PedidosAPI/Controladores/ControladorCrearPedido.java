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
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
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
    public Response crearNuevoPedido(Pedido pedido) throws NamingException {
        System.out.println("No pls");
        Context context = new InitialContext();

        CrearPedidoLocal mbean = (CrearPedidoLocal) context.lookup("java:global/CrearPedido");
        if(mbean == null){
            System.out.println("Esta null");
        }
        //crearPedido.execute(requestPedido);

        JSONObject obj= new JSONObject();
        obj.put("cardNumber","4567234789071234");
        obj.put("expirationDate","2222-01-01");
        obj.put("securityCode","321");
        obj.put("owner","lol");
        obj.put("paymentMonto","4");

        Client client = ClientBuilder.newClient();
        Response response = client
                .target("http://25.46.31.205:44342/" + "VisaPayment" + "/Pay")
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(obj,MediaType.APPLICATION_JSON_TYPE));

        return Response
                .status(Response.Status.OK)
                .entity("")
                .build();
    }






}
