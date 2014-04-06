package modulo05.servlets.empresa;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmpresasManager
 */
@WebServlet("/EmpresasManager")
public class EmpresasManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpresasManager() {
        super();
    }
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {
    	super.service(request, response);
    	String actionButton = request.getParameter("button");
    	if ("añadir".equals(actionButton)) {
    		//TODO cargar los datos del formulario en variables. 
    		//TODO Validar los datos introducidos. 
    		//TODO Insertar la nueva empresa.
		} else if ("nueva empresa".equals(actionButton)){
    		request.getRequestDispatcher("insert_empresa.jsp").forward(request, response);
    	} else if ("volver".equals(actionButton)) {
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
