package m05.s03;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaPersonasBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2247315294663734403L;
	
	private ArrayList<Persona> personas = new ArrayList<Persona>();
	
	public ListaPersonasBean () {
		
	}
	
	public void setPersonas (ArrayList<Persona> personas) {
		this.personas = personas;
	}
	
	public ArrayList<Persona> getPersonas () {
		return this.personas;
	}
}
