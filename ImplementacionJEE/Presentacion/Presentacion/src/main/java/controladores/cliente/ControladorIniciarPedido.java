package controladores.cliente;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ManagedBean
@ViewScoped
public class ControladorIniciarPedido {

	private ArrayList<String> departamentos;
	
	public ControladorIniciarPedido() {
		departamentos=new ArrayList<String>();
	}

	public ArrayList<String> getDepartamentos() {
		departamentos=new ArrayList<String>();
		departamentos.add("Cundinamarca");
		departamentos.add("Bolivar");
		departamentos.add("Antioquia");
		return departamentos;
	}

	public void setDepartamentos(ArrayList<String> departamentos) {
		this.departamentos = departamentos;
	}
	
	
	
}
