<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="modulo05.bean.EmpresaBean, 
    		modulo05.bean.ListaEmpresasBean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="listaEmpresas" class="modulo05.bean.ListaEmpresasBean" scope="request" />
	
	<table>
		<tr>
			<th>CIF</th>
			<th>Nombre</th>
		</tr>
	
	
	<%
		for(EmpresaBean empresa : listaEmpresas){ %>
			<tr>
				<td><%=empresa.getCif() %></td>
				<td><%=empresa.getNombre() %></td>
			</tr>
	<%	}
	%>
	</table>

	<form action="Controlador">
		<input type="submit" name="button" value="nueva empresa">
		<input type="submit" name="button" value="volver">
	</form>

</body>
</html>