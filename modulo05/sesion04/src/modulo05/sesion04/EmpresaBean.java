package modulo05.sesion04;

import java.io.Serializable;

public class EmpresaBean implements Serializable{

	private static final long serialVersionUID = 5043900543641444572L;
	private int 				cif;
	private String 				nombre;

	public EmpresaBean() {
	}

	public int getCif() {
		return cif;
	}

	public void setCif(int cif) {
		this.cif = cif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
