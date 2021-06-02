package controladores.shared;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import entidadesPresentacion.Departamento;


@ManagedBean
@ViewScoped
public class ControladorDepartamentos {
	
	private ArrayList<Departamento> departamentos;
	private ArrayList<String> ciudades;
	private ArrayList<String> inmuebles;
	
	public ControladorDepartamentos() {
		this.departamentos=new ArrayList<>();
		this.departamentos.add(new Departamento("Cundinamarca",new ArrayList<String>() {{add("Soacha");add("Cota");add("Zipaquira");add("Funza");}}));
		this.departamentos.add(new Departamento("Bogota D.C.",new ArrayList<String>() {{add("Bogota");}}));
		this.departamentos.add(new Departamento("Antioquia",new ArrayList<String>() {{add("Medellin");add("Envigado");add("Rionegro");}}));
		this.departamentos.add(new Departamento("Arauca",new ArrayList<String>() {{add("Arauca");add("Tame");add("Saravena");add("Fortul");}}));
		this.inmuebles=new ArrayList<>();
		this.inmuebles.add("Casa");
		this.inmuebles.add("Apartamento");
		this.inmuebles.add("Conjunto");
		this.ciudades=departamentos.get(0).getCiudades();
	}

	public ArrayList<Departamento> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(ArrayList<Departamento> departamentos) {
		this.departamentos = departamentos;
	}

	public ArrayList<String> getCiudades() {
		return departamentos.get(1).getCiudades();
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
	
	
}
