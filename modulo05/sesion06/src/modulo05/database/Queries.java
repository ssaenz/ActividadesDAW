package modulo05.database;

public class Queries {
	
	static final String TABLA_COCHE = "Coche";
	static final String TABLA_EMPRESA = "Empresa";
	static final String TABLA_EMPLEADO = "Empleado";
	static final String TABLA_EMPLEADO_EMPRESA = "EmpleadoEmpresa";
	
	static final String EMPLEADO_NOMBRE = "nombre";
	static final String EMPLEADO_FECHA_NACIMIENTO = "fechaNacimiento";
	static final String EMPLEADO_EDAD = "edad";
	static final String EMPLEADO_NOMBRE_JEFE = "nombreJefe";
	
	static final String EMPRESA_CIF = "cif";
	static final String EMPRESA_NOMBRE = "nombre";
	
	static final String EMPLEADO_EMPRESA_CIF = "cif";
	static final String EMPLEADO_EMPRESA_NOMBRE = "nombre";
	
	static final String COCHE_MATRICULA = "matricula";
	static final String COCHE_NUMERO_PLAZAS = "numeroPlazas";
	static final String COCHE_NOMBRE_EMPLEADO = "nombre";
	static final String COCHE_CIF_EMPRESA = "cif";
	
	static final String jndiname = "jdbc/empresaReparto";
	
	static final String SELECT_ALL_COCHES = "SELECT " + COCHE_MATRICULA + ", " + COCHE_NUMERO_PLAZAS + ", " + COCHE_NOMBRE_EMPLEADO + ", " + COCHE_CIF_EMPRESA + 
											" FROM " + TABLA_COCHE;

	static final String SELECT_ALL_EMPRESAS = "SELECT " + EMPRESA_CIF + ", " + EMPRESA_NOMBRE + 
											" FROM " + TABLA_EMPRESA;

	static final String SELECT_ALL_EMPLEADOS = "SELECT " + TABLA_EMPLEADO + "." + EMPLEADO_NOMBRE + ", " + EMPLEADO_FECHA_NACIMIENTO + ", " + EMPLEADO_EDAD + ", " + EMPLEADO_NOMBRE_JEFE + ", " + EMPLEADO_EMPRESA_CIF + 
											" FROM " + TABLA_EMPLEADO + " JOIN " + TABLA_EMPLEADO_EMPRESA + " ON " + TABLA_EMPLEADO + "." + EMPLEADO_NOMBRE + "=" + TABLA_EMPLEADO_EMPRESA + "." + EMPLEADO_EMPRESA_NOMBRE;

	static final String INSERT_COCHE = "INSERT INTO " + TABLA_COCHE + " (" + COCHE_MATRICULA + ", " + COCHE_NUMERO_PLAZAS + ", " + COCHE_CIF_EMPRESA + ", " + COCHE_NOMBRE_EMPLEADO + ")" +
										" VALUES (?, ?, ?, ?)";
	
//	static final String INSERT_EMPLEADO = "INSERT INTO " + TABLA_EMPLEADO + " (" + EMPLEADO_NOMBRE + ", " + EMPLEADO_FECHA_NACIMIENTO + ", " + EMPLE
}
