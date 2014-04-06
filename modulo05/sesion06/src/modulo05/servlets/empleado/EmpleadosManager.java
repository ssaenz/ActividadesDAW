package modulo05.servlets.empleado;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modulo05.bean.EmpleadoBean;
import modulo05.bean.ListaEmpresasBean;
import modulo05.database.DBManager;

/**
 * Servlet implementation class EmpleadosManager
 */
@WebServlet("/EmpleadosManager")
public class EmpleadosManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String NOMBRE = "nombre";
	private static final String FECHA_NACIMIENTO = "fechaNacimiento";
	private static final String EDAD = "edad";
	private static final String CIF_EMPRESA = "cif";
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpleadosManager() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {
    	super.service(request, response);
    	String actionButton = request.getParameter("button");
    	if ("save".equals(actionButton)) {
    		String nombre = request.getParameter(NOMBRE);
    		String fechaNacimiento = request.getParameter(FECHA_NACIMIENTO);
    		int edad = Integer.parseInt(request.getParameter(EDAD));
    		int cif = Integer.parseInt(request.getParameter(CIF_EMPRESA));
    		//TODO Validar los datos del formulario
    		EmpleadoBean empleado = new EmpleadoBean();
    		empleado.setNombre(nombre);
    		empleado.setFechaNacimiento(Date.valueOf(fechaNacimiento));
    		empleado.setCifEmpresa(cif);
    		empleado.setEdad(edad);
    		
//    		DBManager.getInstance().
		} else if ("nuevo empleado".equals(actionButton)){
			ListaEmpresasBean empresas = DBManager.getInstance().getEmpresas();
			request.setAttribute("listaEmpresas", empresas);
    		request.getRequestDispatcher("insert_empleado.jsp").forward(request, response);
    	}else if ("volver".equals(actionButton)) {
    		request.getRequestDispatcher("index.jsp").forward(request, response);
    	}
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
