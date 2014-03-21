package m05.s02;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletHello
 */

@WebServlet(urlPatterns={"/ServletHello","/ServletHello2"}, 
initParams={ @WebInitParam(name="param1", value="value1"), @WebInitParam(name="param2", value="value2")
})
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private class Contact {
		private String name;
		private String telephone;
		public Contact(String name, String telephone) {
			this.name = name;
			this.telephone = telephone;
		}

		public String getName() {
			return this.name;
		}

		public String getTelephone () {
			return this.telephone;
		}
	}

	private ArrayList<Contact> contacts = new ArrayList<Contact>();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MyServlet() {
		super();
	}
	StringBuilder sb;
	/**
	 * @see HttpServlet#init(ServletConfig)
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		ServletContext context = this.getServletContext();
		
		sb = new StringBuilder("******************Servlet info*****************\n");

		Enumeration<String> initAttrs = context.getInitParameterNames();
		sb.append("----> Initial parameters for the servlet context:\n");
		while (initAttrs.hasMoreElements()) {
			String paramName = initAttrs.nextElement();
			sb.append(paramName + ": " + context.getInitParameter(paramName) + "\n");
		}

		Enumeration<String> listAttrs = context.getAttributeNames();
		sb.append("----> Attribute names for servlet context:\n");
		while (listAttrs.hasMoreElements()) {
			String attrName = listAttrs.nextElement();
			sb.append(attrName  + "\n");
		}

		Enumeration<String> initParams = config.getInitParameterNames();
		sb.append("----> Servlet configuration initial parameters:\n");
		while ( initParams.hasMoreElements() ) {
			String name = initParams.nextElement();
			sb.append(name + ": " + config.getInitParameter(name) + "\n");
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("index.html").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		contacts.add(new Contact(request.getParameter("name"), request.getParameter("telephone")));
		String actionButton = request.getParameter("button");
		if ("Enviar".equals(actionButton)) {
			RequestDispatcher view = request.getRequestDispatcher("/index.html");
			view.forward(request, response);
		} else {

			PrintWriter out = response.getWriter();
			for (Contact c : contacts) {
				out.print("User: " + c.getName() + ", ");
				out.print("Telephone: " + c.getTelephone() + "\n");
			}	Enumeration<String> headers = request.getHeaderNames();
			
			sb.append("-> Request headers:\n");
			while (headers.hasMoreElements()) {
				String headerName = headers.nextElement();
				sb.append(headerName + ": " + request.getHeader(headerName) + "\n");
			}
			
			out.print(sb.toString());
		}

	}

}
