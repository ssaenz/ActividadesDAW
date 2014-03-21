<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="modulo05.bean.EmpleadoBean, 
    		modulo05.bean.ListaEmpleadosBean"%>
    
<!DOCTYPE html P0BLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="listaEmpleados" class="modulo05.bean.ListaEmpleadosBean" scope="request" />
	
	<table>
		<tr>
			<th>Nombre</th>
			<th>Fecha Nacimiento</th>
			<th>Edad</th>
			<th>Cif empresa</th>
			<th>Jefe</th>
		</tr>
	
	
	<%
		for(EmpleadoBean empleado : listaEmpleados){ %>
			<tr>
				<td><%=empleado.getNombre() %></td>
				<td><%=empleado.getFechaNacimiento() %></td>
				<td><%=empleado.getEdad() %></td>
				<td><%=empleado.getCifEmpresa() %></td>
				<td><%=empleado.getJefe() %></td>
			</tr>
	<%	}
	%>
	</table>
	<form action="Controlador">
		<input type="submit" name="button" value="nuevo empleado">
		<input type="submit" name="button" value="volver">
	</form>
</body>
</html>