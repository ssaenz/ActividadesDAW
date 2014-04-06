package modulo05.bean;

import java.io.Serializable;

public class EmpresaBean implements Serializable{

	private static final long serialVersionUID = 5043900543641444572L;
	private int 				cif;
	private String 				nombre;
	private ListaEmpleadosBean 	empleados;
	private ListaCochesBean 		coches;

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

	public ListaEmpleadosBean getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ListaEmpleadosBean empleados) {
		this.empleados = empleados;
	}

	public ListaCochesBean getCoches() {
		return coches;
	}

	public void setCoches(ListaCochesBean coches) {
		this.coches = coches;
	}


}
