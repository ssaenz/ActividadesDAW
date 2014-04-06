<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="modulo05.bean.ListaEmpresasBean, 
    		modulo05.bean.EmpresaBean"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Añadir un nuevo empleado</title>
</head>
<body>

	<jsp:useBean id="listaEmpresas" class="modulo05.bean.ListaEmpresasBean" scope="request" />
	<form action="EmpleadosManager" method="post">

		<div style="display: block">
			Nombre: <input type="text" name="nombre">
		</div>
		<div style="display: block">
			Fecha nacimiento: <input type="text" name="fechaNacimiento"> (yyyy-mm-dd)
		</div>
		<div style="display: block">
			Edad: <input type="text" name="edad">
		</div>
		<div style="display: block">
			<select name="cif">
			<c:forEach var="empresa" items="${listaEmpresas}">
				<option value="<c:out value="${empresa.cif }"/>"><c:out value="${empresa.nombre }"/></option>
			</c:forEach>
		</select>
		</div>
		<div style="display: block">
			<input type="submit" value="Insert">
		</div>

	</form>
</body>
</html>