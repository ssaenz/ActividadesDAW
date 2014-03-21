<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="modulo05.bean.ListaEmpresasBean, 
    		modulo05.bean.EmpresaBean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Añadir nuevo coche</title>
</head>
<body>
	<jsp:useBean id="listaEmpresas" class="modulo05.bean.ListaEmpresasBean" scope="request" />
	<form action=CochesManager>
		Matricula: <input type="text" name="matricula"/>
		Numero de plazas: <input type="text" name="numPlazas"/>
		<select name="cif">
			<% for (EmpresaBean empresa:listaEmpresas){%>
				<option value="<%=empresa.getCif()%>"><%=empresa.getNombre()%></option>				
		<%	}%>
		</select>
		<input type=submit name="button" value="añadir">
	</form>
</body>
</html>