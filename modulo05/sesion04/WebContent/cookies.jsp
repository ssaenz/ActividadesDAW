<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cookies</title>
</head>
<body>

<%
	String name = request.getParameter("name");
	String value = request.getParameter("value");
	if (name != null && value != null && name.length() > 0 && value.length() > 0) {
		Cookie newCookie = new Cookie(name, value);
		response.addCookie(newCookie);
	}
%>
<h2>Ejercicio de coockies</h2>
	<%
		Cookie[] cookies = request.getCookies();
		if (cookies == null) {						%>
			<p>No se ha encontrado ninguna coockie</p>
			
		<%} else {
			for (Cookie c : cookies) {				%>

				<p>Coockie: <%=c.getName()%></p>
				<p>Info: <%=c.getValue()%></p>

	<%
			}
		}
	%>
	
	<form>
	<div style="display:block" >Nombre: <input type="text" name="name"></div>
	<div style="display:block" >Valor:	<input type="text" name="value"></div>
	<input type="submit" value="Crear coockie"> (No se mostrará en el log superior hasta la siguiente petición al servidor) 
	</form>
<div style="display: block;"><form action="index.jsp"><input type="submit" value="volver"></div>

</body>
</html>