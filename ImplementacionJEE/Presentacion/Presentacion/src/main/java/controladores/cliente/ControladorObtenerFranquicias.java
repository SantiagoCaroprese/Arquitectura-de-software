package controladores.cliente;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import entidadesFranquicia.Franquicia;
import modelos.franquicias.ObtenerFranquiciasBean;

@ManagedBean
@ViewScoped
public class ControladorObtenerFranquicias {
	
	private ArrayList<Franquicia> franquicias;

	public ControladorObtenerFranquicias() {
		this.franquicias = new ArrayList<>();
	}

	public ArrayList<Franquicia> getFranquicias() {
		if(franquicias.isEmpty()) {
			//obtener franquicia por bean
			ObtenerFranquiciasBean bean=new ObtenerFranquiciasBean();
			this.franquicias=bean.ObtenerFranquicias();
			if(this.franquicias==null || this.franquicias.isEmpty()) {
				for(int i=0;i<4;i++) {
					Franquicia f=new Franquicia();
					f.setCiudad("Ciudad "+i);
					f.setDepartamento("Departamento "+i);
					f.setDireccion("Dirección "+i);
					f.setId(i);
					f.setNombre("Frank "+i);
					franquicias.add(f);
				}
			}
		}
		return franquicias;
	}

	public void setFranquicias(ArrayList<Franquicia> franquicias) {
		this.franquicias = franquicias;
	}
	
	
}
