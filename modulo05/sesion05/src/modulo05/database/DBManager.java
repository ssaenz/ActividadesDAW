package modulo05.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import modulo05.bean.CocheBean;
import modulo05.bean.EmpleadoBean;
import modulo05.bean.EmpresaBean;
import modulo05.bean.ListaCochesBean;
import modulo05.bean.ListaEmpleadosBean;
import modulo05.bean.ListaEmpresasBean;

public class DBManager {
	
	private static final String EMPLEADO_NOMBRE = "nombre";
	private static final String EMPLEADO_FECHA_NACIMIENTO = "fechaNacimiento";
	private static final String EMPLEADO_EDAD = "edad";
	private static final String EMPLEADO_NOMBRE_JEFE = "nombreJefe";
	private static final String EMPRESA_CIF = "cif";
	private static final String EMPRESA_NOMBRE = "nombre";
	private static final String COCHE_MATRICULA = "matricula";
	private static final String COCHE_NUMERO_PLAZAS = "numeroPlazas";
	private static final String jndiname = "jdbc/empresaReparto";
	
	private static DBManager mInstance;
	private DataSource dataSource;
	private DBManager () {
		
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			this.dataSource =  (DataSource) envContext.lookup(jndiname);
		} catch (NamingException e) {
			// Handle error that it's not configured in JNDI.
			e.printStackTrace();
		}
	}
	
	public static DBManager getInstance() {
		if (mInstance == null)
			mInstance = new DBManager();
		return mInstance;
	}
	
	private Connection getConnection () {
		try {
			return dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public ListaEmpleadosBean getEmpleados () {
		ListaEmpleadosBean listaEmpleados = new ListaEmpleadosBean();
		Connection c = null;
		try {
			c = getConnection();
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM Empleado JOIN EmpleadoEmpresa ON Empleado.nombre=EmpleadoEmpresa.nombre");
			while(rs.next()){
				EmpleadoBean empleado = new EmpleadoBean();
				empleado.setNombre(rs.getString(EMPLEADO_NOMBRE));
				empleado.setFechaNacimiento(rs.getDate(EMPLEADO_FECHA_NACIMIENTO));
				empleado.setEdad(rs.getInt(EMPLEADO_EDAD));
				empleado.setJefe(rs.getString(EMPLEADO_NOMBRE_JEFE));
				empleado.setCifEmpresa(rs.getInt(EMPRESA_CIF));
				listaEmpleados.add(empleado);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return listaEmpleados;
	}
	
	public ListaEmpresasBean getEmpresas() {
		ListaEmpresasBean listaEmpresas = new ListaEmpresasBean();
		Connection c = null;
		try {
			c = getConnection();
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM Empresa");
			while(rs.next()){
				EmpresaBean empresa = new EmpresaBean();
				empresa.setNombre(rs.getString(EMPRESA_NOMBRE));
				empresa.setCif(rs.getInt(EMPRESA_CIF));
				listaEmpresas.add(empresa);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return listaEmpresas;
	}
	
	public ListaCochesBean getCoches() {
		ListaCochesBean listaCoches = new ListaCochesBean();
		Connection c = null;
		try {
			c = getConnection();
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM Coche");
			while(rs.next()){
				CocheBean coche = new CocheBean();
				coche.setMatricula(rs.getString(COCHE_MATRICULA));
				coche.setNumeroPlazas(rs.getInt(COCHE_NUMERO_PLAZAS));
				coche.setConductor(rs.getString(EMPLEADO_NOMBRE));
				coche.setCifEmpresa(rs.getInt(EMPRESA_CIF));
				listaCoches.add(coche);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return listaCoches;
	}
	
	public boolean createCoche (CocheBean coche) {
		Connection c = null;
		try {
			c = getConnection();
			PreparedStatement ps = c.prepareStatement("INSERT INTO Coche(matricula, numeroPlazas, cif, nombre) VALUES (?, ?, ?, ?)");
			ps.setString(1, coche.getMatricula());
			ps.setInt(2, coche.getNumeroPlazas());
			ps.setInt(3, coche.getCifEmpresa());
			ps.setString(4, coche.getConductor());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return true;
	}
	
	
}
