package modulo05.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modulo05.bean.CocheBean;
import modulo05.database.DBManager;

/**
 * Servlet implementation class CochesManager
 */
@WebServlet("/CochesManager")
public class CochesManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String MATRICULA = "matricula";
	private static final String NUMERO_PLAZAS = "numPlazas";
	private static final String CIF_EMPRESA = "cif";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CochesManager() {
        super();
    }
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {
    	super.service(request, response);
    	String actionButton = request.getParameter("button");
    	if ("añadir".equals(actionButton)) {

    		String matricula = request.getParameter(MATRICULA);
    		int numPlazas = Integer.parseInt(request.getParameter(NUMERO_PLAZAS));
    		int cif = Integer.parseInt(request.getParameter(CIF_EMPRESA));
    		
    		CocheBean coche = new CocheBean();
    		coche.setMatricula(matricula);
    		coche.setCifEmpresa(cif);
    		coche.setNumeroPlazas(numPlazas);
    		
    		DBManager.getInstance().createCoche(coche);
    		
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
