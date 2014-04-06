package m05.s03;

public class Persona implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7544247929138543535L;
	private String nombre;
	private String apellidos;
	private String dni;
	
	public Persona() {}
	
	public void setNombre(String n) {
		this.nombre = n;
	}
	
	public String getNombre() { 
		return (this.nombre); 
	}

	public void setApellidos (String apellidos) {
		this.apellidos = apellidos;
	}

	public String getApellidos () {
		return this.apellidos;
	}

	public void setDNI (String dni) {
		this.dni = dni;
	}

	public String getDNI () {
		return this.dni;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + getNombre() + ", Apellidos: " + getApellidos() + ", DNI: " + getDNI();
	}
}
