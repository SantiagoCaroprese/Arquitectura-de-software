package controladores.cliente;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import entidadesPresentacion.Departamento;

@ManagedBean
@ViewScoped
public class ControladorIniciarPedidoDomicilio {
	
	private ArrayList<Departamento> departamentos;
	private ArrayList<String> ciudades;
	private ArrayList<String> inmuebles;
	private String departamento;
	private String ciudad;
	private String observaciones;
	private String direccion;

	public ControladorIniciarPedidoDomicilio() {
		this.departamentos=new ArrayList<>();
		this.departamentos.add(new Departamento("Cundinamarca",new ArrayList<String>() {{add("Soacha");add("Cota");add("Zipaquira");add("Funza");}}));
		this.departamentos.add(new Departamento("Bogota D.C.",new ArrayList<String>() {{add("Bogota");}}));
		this.departamentos.add(new Departamento("Antioquia",new ArrayList<String>() {{add("Medellin");add("Envigado");add("Rionegro");}}));
		this.departamentos.add(new Departamento("Arauca",new ArrayList<String>() {{add("Arauca");add("Tame");add("Saravena");add("Fortul");}}));
		this.inmuebles=new ArrayList<>();
		this.inmuebles.add("Casa");
		this.inmuebles.add("Apartamento");
		this.inmuebles.add("Conjunto");
		this.departamento=departamentos.get(0).getDepartamento();
	}
	
	public String crearPedidoDomicilio() {
		return "true";
	}

	public ArrayList<Departamento> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(ArrayList<Departamento> departamentos) {
		this.departamentos = departamentos;
	}

	public ArrayList<String> getCiudades() {
		for (Departamento string : departamentos) {
			if(string.getDepartamento().equals(departamento)) {
				ciudades=string.getCiudades();
				break;
			}
		}
		return ciudades;
	}

	public void setCiudades(ArrayList<String> ciudades) {
		this.ciudades = ciudades;
	}

	public ArrayList<String> getInmuebles() {
		return inmuebles;
	}

	public void setInmuebles(ArrayList<String> inmuebles) {
		this.inmuebles = inmuebles;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}	
	
}
