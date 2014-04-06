<%@ page language="java" import="m05.s03.Persona" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<jsp:include page="header.jsp" />
<p>Aquí el contenido común de la página, lo anterior es un include
	para el "header" </p>


<form id="myForm" action="SimpleServlet" method="post">
	<input type="submit" name="button" value="getBean()" />
	<input type="submit" name="button" value="SiguienteEjercicio" />
</form>

<%
	Persona p = new Persona();
	p = (Persona) request.getAttribute("persona");
	
%>
<%=(p==null)?"Haz click en getBean() para recivir el Bean.":"Recivido bean: " + p.getNombre()%>


<p>y lo siguiente es un include para el "footer".</p>
<jsp:include page="footer.jsp" />