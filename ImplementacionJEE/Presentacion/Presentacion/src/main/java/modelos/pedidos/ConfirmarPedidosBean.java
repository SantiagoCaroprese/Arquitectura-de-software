package modelos.pedidos;

import entidadesPedidos.Pedido;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response.Status;

public class ConfirmarPedidosBean {

	public ConfirmarPedidosBean() {
	}
	
	@POST
	public boolean confirmarPedido(Pedido pedido) {
		try {
			Client client = ClientBuilder.newClient();
			String response = client
                    .target("http://25.107.47.80:8080/pedidosApi/pedidos")
                    .request()
                    .accept(MediaType.TEXT_PLAIN)
                    .post(Entity.json(pedido),Pedido.class)
                    .toString();
			if(Status.valueOf(response).equals(Status.OK)) {
				return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
}
