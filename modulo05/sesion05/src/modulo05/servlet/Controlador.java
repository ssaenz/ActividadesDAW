package modulo05.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modulo05.bean.ListaCochesBean;
import modulo05.bean.ListaEmpleadosBean;
import modulo05.bean.ListaEmpresasBean;
import modulo05.database.DBManager;

/**
 * Servlet implementation class Controlador
 */
@WebServlet("/Controlador")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlador() {
        super();
    }
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {
    	super.service(request, response);
    	String actionButton = request.getParameter("button");
    	if ("Empresa".equals(actionButton)){
    		ListaEmpresasBean empresas = DBManager.getInstance().getEmpresas();
    		request.setAttribute("listaEmpresas", empresas);
        	request.getRequestDispatcher("empresa.jsp").forward(request, response);
    	}
    	else if ("Empleado".equals(actionButton)){
    		ListaEmpleadosBean empleados = DBManager.getInstance().getEmpleados();
    		request.setAttribute("listaEmpleados", empleados);
        	request.getRequestDispatcher("empleado.jsp").forward(request, response);

    	}
    	else if ("Coche".equals(actionButton)){
    		ListaCochesBean coches = DBManager.getInstance().getCoches();
    		request.setAttribute("listaCoches", coches);
        	request.getRequestDispatcher("coche.jsp").forward(request, response);
    	}
    	else if ("nuevo coche".equals(actionButton)){
    		ListaEmpresasBean empresas = DBManager.getInstance().getEmpresas();
    		request.setAttribute("listaEmpresas", empresas);
    		request.getRequestDispatcher("insert_coche.jsp").forward(request, response);
    	}
    	else if ("nueva empresa".equals(actionButton)){
    		request.getRequestDispatcher("insert_empresa.jsp").forward(request, response);
    	}
    	else if ("volver".equals(actionButton)){
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
