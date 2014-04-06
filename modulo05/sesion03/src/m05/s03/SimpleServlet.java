package m05.s03;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet("/SimpleServlet")
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private int personCount = 0;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SimpleServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	private ArrayList<Persona> personas = new ArrayList<Persona>();

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String button = request.getParameter("button");
		if (button != null) {
			if (button.equals("getBean()")) {
				Persona p = new Persona();
				p.setNombre("Persona " + personCount);
				personCount ++;
				request.setAttribute("persona", p);
				request.getRequestDispatcher("index.jsp").forward(request, response);
			} else if (button.equals("SiguienteEjercicio")) {
				request.getRequestDispatcher("formulario.jsp").forward(request, response);
			} else if (button.equals("add")) {
				String nombre = request.getParameter("nombre");
				String apellidos = request.getParameter("apellidos");
				String dni = request.getParameter("dni");
				Persona p = new Persona();
				p.setNombre(nombre);
				p.setApellidos(apellidos);
				p.setDNI(dni);
				personas.add(p);
				request.getRequestDispatcher("formulario.jsp").forward(request, response);
			} else if (button.equals("show")) {
				request.setAttribute("listaPersonas", personas);
				request.getRequestDispatcher("formulario.jsp").forward(request, response);
			}else if (button.equals("Ahora con beans")) {
				request.getRequestDispatcher("formularioBeans.jsp").forward(request, response);
			} 
		}else if (request.getParameter("buttonBean").equals("add")) {
			String nombre = request.getParameter("nombre");
			String apellidos = request.getParameter("apellidos");
			String dni = request.getParameter("dni");
			Persona p = new Persona();
			p.setNombre(nombre);
			p.setApellidos(apellidos);
			p.setDNI(dni);
			personas.add(p);
			request.getRequestDispatcher("formularioBeans.jsp").forward(request, response);
		} else if (request.getParameter("buttonBean").equals("show")) {
			ListaPersonasBean listaBean = new ListaPersonasBean();
			listaBean.setPersonas(personas);
			request.setAttribute("listaPersonas", listaBean);
			request.getRequestDispatcher("formularioBeans.jsp").forward(request, response);
		}
	}

}
