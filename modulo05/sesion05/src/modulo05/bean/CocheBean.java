package modulo05.bean;

import java.io.Serializable;

public class CocheBean implements Serializable{

	private String matricula;
	private int numeroPlazas;
	private String Conductor;
	private int cifEmpresa;
	
	public CocheBean() {
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getNumeroPlazas() {
		return numeroPlazas;
	}
	public void setNumeroPlazas(int numeroPlazas) {
		this.numeroPlazas = numeroPlazas;
	}
	public String getConductor() {
		return Conductor;
	}
	public void setConductor(String conductor) {
		Conductor = conductor;
	}
	public int getCifEmpresa() {
		return cifEmpresa;
	}
	public void setCifEmpresa(int cifEmpresa) {
		this.cifEmpresa = cifEmpresa;
	}
	
}
