
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%!int visitCount = 0;

	void addVisit() {
		visitCount++;
	}%>
<%
	addVisit();
%>
<html>
<head>
<title>Ejemplo de la directiva include</title>
</head>
<body>
	<p>
		Esta página ha recivido
		<%=visitCount%>
		visitas.
	</p>