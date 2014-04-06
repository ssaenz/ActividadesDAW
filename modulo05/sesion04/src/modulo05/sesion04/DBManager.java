package modulo05.sesion04;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBManager {

	private static final String jndiname = "jdbc/empresaReparto";

	private static DBManager mInstance;
	private DataSource dataSource;
	private DBManager () {

		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			this.dataSource =  (DataSource) envContext.lookup(jndiname);
		} catch (NamingException e) {
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

	public ListaEmpresasBean getEmpresas() {
		ListaEmpresasBean listaEmpresas = new ListaEmpresasBean();
		Connection c = null;
		try {
			c = getConnection();
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery(Queries.SELECT_ALL_EMPRESAS);
			while(rs.next()){
				EmpresaBean empresa = new EmpresaBean();
				empresa.setNombre(rs.getString(Queries.EMPRESA_NOMBRE));
				empresa.setCif(rs.getInt(Queries.EMPRESA_CIF));
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
}
