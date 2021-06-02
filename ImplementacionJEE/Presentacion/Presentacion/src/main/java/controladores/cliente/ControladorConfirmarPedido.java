package controladores.cliente;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.servlet.http.HttpSession;

import entidadesPedidos.Pedido;

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
