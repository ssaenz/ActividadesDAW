<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="modulo05.bean.EmpresaBean, 
    		modulo05.bean.ListaEmpresasBean"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
	
	<c:forEach var="empresa" items="${listaEmpresas}">
		<tr>
			<td><c:out value="${empresa.cif}"/></td>
			<td><c:out value="${empresa.nombre}"/></td>
		</tr>	
	</c:forEach>

	</table>

	<form action="EmpresasManager">
		<input type="submit" name="button" value="nueva empresa">
		<input type="submit" name="button" value="volver">
	</form>

</body>
</html>