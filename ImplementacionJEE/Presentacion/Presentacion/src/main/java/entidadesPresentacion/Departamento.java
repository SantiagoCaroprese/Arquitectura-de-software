package entidadesPresentacion;

import java.util.ArrayList;

public class Departamento {
	
	private String departamento;
	private ArrayList<String> ciudades;
	
	public Departamento(String departamento, ArrayList<String> ciudades) {
		super();
		this.ciudades=new ArrayList<>();
		this.departamento = departamento;
		this.ciudades = ciudades;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public ArrayList<String> getCiudades() {
		return ciudades;
	}
	public void setCiudades(ArrayList<String> ciudades) {
		this.ciudades = ciudades;
	}
	
	
}
