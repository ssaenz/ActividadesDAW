<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="modulo05.bean.ListaEmpresasBean,
    		modulo05.bean.ListaEmpleadosBean, 
    		modulo05.bean.EmpresaBean,
    		modulo05.bean.EmpleadoBean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Añadir nuevo coche</title>
</head>
<body>
	<jsp:useBean id="listaEmpresas" class="modulo05.bean.ListaEmpresasBean" scope="request" />
	<jsp:useBean id="listaEmpleados" class="modulo05.bean.ListaEmpleadosBean" scope="request" />
	
	<form action="CochesManager"  method="post">
		<div style="display: block">
			Matricula: <input type="text" name="matricula">
		</div>
		<div style="display: block">
			Número de plazas: <input type="text" name="numPlazas">
		</div>
		
		<div style="display: block">
			Empresa a la que pertenece: 
			<select name="cif">
				<option value="<c:out value="-1"/>"><c:out value=""/></option>
				<c:forEach var="empresa" items="${listaEmpresas}">
					<option value="<c:out value="${empresa.cif }"/>"><c:out value="${empresa.nombre }"/></option>
				</c:forEach>
			</select>
		</div>
		<div style="display: block">
			Conductor: 
			<select name="nombre">
				<option value="<c:out value="-1"/>"><c:out value=""/></option>
				<c:forEach var="empleado" items="${listaEmpleados}">
					<option value="<c:out value="${empleado.nombre }"/>"><c:out value="${empleado.nombre}"/></option>
				</c:forEach>
			</select>
		</div>
		<input type=submit name="button" value="añadir">
	</form>
</body>
</html>