package com.pedidos.Conectores.PagoREST;

import com.pedidos.Conectores.Pago.IServicioPago;
import org.json.simple.JSONObject;

import javax.ejb.Stateless;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Stateless
public class PagoRest implements IServicioPago {
    @Override
    public boolean realizarPago(String cardNumber, String expDate, String secCode, String owner, String payments, String tipo) {

        JSONObject obj=new JSONObject();
        obj.put("cardNumber",cardNumber);
        obj.put("expirationDate",expDate);
        obj.put("securityCode",secCode);
        obj.put("owner",owner);
        obj.put("paymentMonto",payments);

        Client client = ClientBuilder.newClient();
        Response response = client
                .target("http://25.46.31.205:8060/" + tipo + "/Pay/")
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(obj,MediaType.APPLICATION_JSON_TYPE));

        if(response.getStatus() == Response.Status.OK.getStatusCode()){
            return true;
        }else{
            System.out.println(response.getLocation());
            Response s = client.target(response.getLocation()).request().get();
            System.out.println(s.getStatus());
            //client.target(response.getLocation()).request(MediaType.APPLICATION_JSON)
                  //  .post(Entity.entity(obj,MediaType.APPLICATION_JSON_TYPE));



        }

        return true;
    }
}
