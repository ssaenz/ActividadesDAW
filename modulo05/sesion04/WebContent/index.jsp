<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sesion</title>
</head>
<body>

<%
	String nombreValue = (String) request.getParameter("nombre");
	String apellidosValue = (String) request.getParameter("apellidos");
	String telefonoValue = (String) request.getParameter("telefono");
	boolean invalidate = false;
	
	String button = (String) request.getParameter("button");
	if ("save on session".equals(button)) {
		session.setAttribute("nombre", nombreValue);
		session.setAttribute("apellidos", apellidosValue);
		session.setAttribute("telefono", telefonoValue);
	} else if ("clear session".equals(button)) {
		session.invalidate();
		invalidate = true;
	}
%>
	
<form >

	<div style="display: block;">Nombre: <input type="text" name="nombre" 
								<% if (!invalidate && session != null && session.getAttribute("nombre") != null)  {%>
									value="<%=session.getAttribute("nombre") %>"></div> 
								<%} else { %> 
									></div> 
								<%} %>
	<div style="display: block;">Apellidos: <input type="text" name="apellidos"
								<% if (!invalidate && session != null && session.getAttribute("apellidos") != null)  {%>
									value="<%=session.getAttribute("telefono") %>"></div> 
								<%} else { %> 
									></div> 
								<%} %>
	<div style="display: block;">Teléfono: <input type="text" name="telefono"
								<% if (!invalidate && session != null && session.getAttribute("telefono") != null)  {%>
									value="<%=session.getAttribute("telefono") %>"></div> 
								<%} else { %> 
									></div> 
								<%} %>
	<input type="submit" name="button" value="save on session">
	<input type="submit" name="button" value="clear session">
</form>
</body>
</html>
