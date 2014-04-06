<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="modulo05.sesion04.EmpresaBean, 
    		modulo05.sesion04.ListaEmpresasBean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Base de datos</title>
</head>
<body>
<jsp:useBean id="listaEmpresas" class="modulo05.sesion04.ListaEmpresasBean" scope="request" />
	
	<table>
		<tr>
			<th>CIF</th>
			<th>Nombre</th>
		</tr>
		<%
			for (EmpresaBean eb : listaEmpresas) {			
		%>
		<tr>
			<td><%=eb.getCif() %></td>
			<td><%=eb.getNombre() %></td>
		</tr>	
		<%} %>
	</table>

	<form action="index.jsp">
		<input type="submit" name="button" value="volver">
	</form>

</body>
</html>