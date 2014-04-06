<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="modulo05.bean.ListaCochesBean, 
    		modulo05.bean.CocheBean"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="listaCoches" class="modulo05.bean.ListaCochesBean" scope="request" />
	
	<table>
		<tr>
			<th>Matricula</th>
			<th>Numero Plazas</th>
			<th>Conductor</th>
			<th>Empresa</th>
		</tr>
	
		<c:forEach var="coche" items="${listaCoches}">
			<tr>
				<td><c:out value="${coche.matricula}"/></td>
				<td><c:out value="${coche.numeroPlazas}"/></td>
				<td><c:out value="${coche.conductor}"/></td>
				<td><c:out value="${coche.cifEmpresa}"/></td>
			</tr>
		</c:forEach>
	</table>
	
	<form action="CochesManager">
		<input type="submit" name="button" value="nuevo coche">
		<input type="submit" name="button" value="volver">
	</form>
</body>
</html>