package controladores.cliente;

import java.time.LocalDateTime;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.servlet.http.HttpSession;

import entidadesPedidos.Pedido;
import modelos.pedidos.ConfirmarPedidosBean;

@ManagedBean
@ViewScoped
public class ControladorConfirmarPedido {
	 private Pedido pedido=null;
	 private String mes;
	 private String year;

	public ControladorConfirmarPedido() {
		this.pedido=cargarPedido();
	}
	
	private Pedido cargarPedido() {
		FacesContext context = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
		if(session==null) {
			return null;
		}
		return (Pedido) session.getAttribute("pedido");
	}
	
	public String confirmarPedido() {
		if(pedido.getCardNumber().length()!=16 &&pedido.getCardNumber().length()!=19) {
			return "false";
		}
		/*if(pedido.getCorreoCliente().length()<5) {
			return "false";
		}
		if(pedido.getNombreCliente().length()<5) {
			return "false";
		}*/
		if(Integer.valueOf(mes)<1 || Integer.valueOf(mes)>12 || mes.length()!=2) {
			return "false";
		}
		if(Integer.valueOf(year)<LocalDateTime.now().getYear() || year.length()!=4) {
			return "false";
		}
		pedido.setExpDate(year+"-"+mes+"-"+"01");
		//lamarBean
		/*ConfirmarPedidosBean bean=new ConfirmarPedidosBean();
		if(!bean.confirmarPedido(pedido)) {
			return "false";
		}*/
		return "true";
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
	
	 
}
