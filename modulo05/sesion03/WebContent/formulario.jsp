<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList,m05.s02.Persona"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form id="myForm" action="SimpleServlet" method="post">
		Name: <input type="text" name="nombre" /> 
		Apellidos: <input type="text" name="apellidos" />
		DNI: <input type="text" name="dni" />
		<input type="submit" name="button" value="add" />
		<input type="submit" name="button" value="show" />
	<%
		ArrayList<Persona> listaPersonas = (ArrayList<Persona>) request.getAttribute("listaPersonas");
		if (listaPersonas != null) { %>
		<ul>
			<%for (Persona p : listaPersonas) {%>
				<li><%=p.toString() %></li>
			<%}%>
			</ul>
		<input type="submit" name="button" value="Ahora con beans" />
		<%}
	%>
		
	</form>
</body>
</html>