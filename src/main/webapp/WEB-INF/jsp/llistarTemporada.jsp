<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.ArrayList, com.slc.model.bd.Jugador"%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />
<title>Temporada</title>
</head>
<body>
	      
	<h1 style="margin: 15px;">Estadístiques individuals de la temporada</h1>
	<div class="container" style="margin-left: 0px;">
	<table class="table table-striped">
		<thead class="thead-dark">
			<tr>
			 <td>Dorsal</td>
			 <td>gols</td>
			 <td>assist</td>
			 <td>xuts_porta</td>
			 <td>xuts_fora</td>
			 <td>perdues</td>
			 <td>recuperacions</td>
			 <td>intercepcions</td>
			 <td>Gols generats</td>
			 <td>Regats</td>
			</tr>
	</thead>
		<%ArrayList<Jugador> lista = (ArrayList<Jugador>) request.getAttribute("resultQuery");
		if (lista != null) {
		 for (Jugador part : lista) {
			out.println("<tr>");
			out.println("<td>" + part.getId() + "</td>");
			out.println("<td>" + part.getGols() + "</td>");
			out.println("<td>" + part.getAssist() + "</td>");
			out.println("<td>" + part.getXuts_porta() + "</td>");
			out.println("<td>" + part.getXuts_fora() + "</td>");
			out.println("<td>" + part.getPerdues() + "</td>");
			out.println("<td>" + part.getRecuperacions() + "</td>");
			out.println("<td>" + part.getIntercepcions() + "</td>");
			out.println("<td>" + part.getGols_generats() + "</td>");
			out.println("<td>" + part.getRegats() + "</td>");
			out.println("</tr>");
		 	}
		 }
		 %>
	</table>
	</div>
</body>
</html>