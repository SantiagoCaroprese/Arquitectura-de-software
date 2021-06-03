package controladores.cliente;


import java.nio.charset.Charset;
import java.util.Random;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.servlet.http.HttpSession;

import entidadesPedidos.Pedido;

@ManagedBean
@ViewScoped
public class ControladorIniciarPedido {
	
	public ControladorIniciarPedido() {
	}
	
	public String iniciarPedidoDomicilio() {
		return "false";
	}
	
	public String iniciarPedidoRecoger(String idFranquicia) {
		try {
			byte[] array = new byte[7]; 
			new Random().nextBytes(array);
		    String generatedString = new String(array, Charset.forName("UTF-8"));
			boolean vIn = false;
			byte vOut = (byte)(vIn?1:0);
			Pedido pedido=new Pedido(generatedString, idFranquicia, "", null,vOut, "", "");
			FacesContext context = FacesContext.getCurrentInstance();
			HttpSession session = (HttpSession) context.getExternalContext().getSession(true);
			session.setAttribute("pedido", pedido);
			session.setAttribute("inicio", "1");
			return "true";
		}catch(Exception e) {
			e.printStackTrace();
			return "false";
		}
		
	}
	
	public String confirmarPedido(){
		return "false";
	}
}
