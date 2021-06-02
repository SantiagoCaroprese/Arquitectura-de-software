package controladores.cliente;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

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
			boolean vIn = false;
			byte vOut = (byte)(vIn?1:0);
			Double precio=(double) 0;
			Pedido pedido=new Pedido("idPedido", idFranquicia, "", null,vOut, "", "");
			FacesContext context = FacesContext.getCurrentInstance();
			HttpSession session = (HttpSession) context.getExternalContext().getSession(true);
			session.setAttribute("pedido", pedido);
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
