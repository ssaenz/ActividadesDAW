<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Añadir nueva empresa</title>
</head>
<body>

<form action="EmpresasManager" method="post" enctype="text/plain">

		<table width="100%" border="0" cellspacing="0" cellpadding="10">
			<tr>CIF <input type="text" name="cif" value=""></tr>
			<tr>Nombre: <input type="text" name="nombreempresa" value="" ></tr>
			<tr> <input type="submit" value="Save"></tr>
		</table>
		
</form>

</body>
</html>