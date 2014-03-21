package modulo05.bean;

import java.io.Serializable;
import java.sql.Date;

public class EmpleadoBean implements Serializable{
	
	private String 	nombre;
	private Date 	fechaNacimiento;
	private int 	cifEmpresa;
	private String 	jefe;
	private int 	edad;
	
	public EmpleadoBean() {
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public int getCifEmpresa() {
		return cifEmpresa;
	}
	public void setCifEmpresa(int cifEmpresa) {
		this.cifEmpresa = cifEmpresa;
	}
	public String getJefe() {
		return jefe;
	}
	public void setJefe(String jefe) {
		this.jefe = jefe;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
