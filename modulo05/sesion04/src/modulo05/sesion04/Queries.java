package modulo05.sesion04;

public class Queries {
	
	static final String TABLA_EMPRESA = "Empresa";
	
	static final String EMPRESA_CIF = "cif";
	static final String EMPRESA_NOMBRE = "nombre";
	
	static final String SELECT_ALL_EMPRESAS = "SELECT " + EMPRESA_CIF + ", " + EMPRESA_NOMBRE + 
											" FROM " + TABLA_EMPRESA;

}
