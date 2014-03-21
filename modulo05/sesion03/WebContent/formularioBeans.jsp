<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="m05.s02.Persona, m05.s02.ListaPersonasBean"%>
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
		<input type="submit" name="buttonBean" value="add" />
		<input type="submit" name="buttonBean" value="show" />
	</form>
	
	<jsp:useBean id="listaPersonas" class="m05.s02.ListaPersonasBean" scope="request"></jsp:useBean>
	
	<%
		if (listaPersonas.getPersonas() != null) { %>
		<ul>
			<%for (Persona p : listaPersonas.getPersonas()) {%>
				<li><%=p.toString() %></li>
			<%}%>
			</ul>
		<%}
	%>
</body>
</html>