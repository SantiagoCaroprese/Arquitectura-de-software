package modelos.pedidos;

import entidadesPedidos.Pedido;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

public class ConfirmarPedidosBean {

	public ConfirmarPedidosBean() {
	}
	
	@POST
	public boolean confirmarPedido(Pedido pedido) {
		try {
			Client client = ClientBuilder.newClient();
			Response response = client
					.target("http://25.107.47.80:8080/pedidosApi/pedidos")
                    .request(MediaType.APPLICATION_JSON)
                    .post(Entity.entity(pedido,MediaType.APPLICATION_JSON_TYPE));
			if(response.getStatus() == Response.Status.OK.getStatusCode()){
				return true;
		  	}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
}
