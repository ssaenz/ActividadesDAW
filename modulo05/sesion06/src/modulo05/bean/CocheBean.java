package modulo05.bean;

import java.io.Serializable;

public class CocheBean implements Serializable{

	private static final long serialVersionUID = -1812992297893817666L;
	private String 	matricula;
	private int 	numeroPlazas;
	private String 	conductor;
	private int 	cifEmpresa;
	
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
		return conductor;
	}
	public void setConductor(String conductor) {
		this.conductor = conductor;
	}
	public int getCifEmpresa() {
		return cifEmpresa;
	}
	public void setCifEmpresa(int cifEmpresa) {
		this.cifEmpresa = cifEmpresa;
	}
	
}
