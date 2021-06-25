<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.ArrayList,com.slc.model.bd.Jugador"%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />
<title>Show Jugadors</title>
</head>
<body>
	      
	<h1>Jugadors</h1>
	<div class="container" style="margin-left: 0px;">
	<table class="table table-striped">
		<thead class="thead-dark">
			<tr>
			 <td>id</td>
			 <td>gols</td>
			 <td>assist</td>
			 <td>xuts_porta</td>
			 <td>xuts_fora</td>
			 <td>perdues</td>
			 <td>partits</td>
			 <td>recuperacions</td>
			 <td>intercepcions</td>
			</tr>
	</thead>
		<%ArrayList<Jugador> lista = (ArrayList<Jugador>) request.getAttribute("resultQuery");
		if (lista != null) {
		 for (Jugador jug : lista) {
			out.println("<tr>");
			out.println("<td>" + jug.getId() + "</td>");
			out.println("<td>" + jug.getGols() + "</td>");
			out.println("<td>" + jug.getAssist() + "</td>");
			out.println("<td>" + jug.getXuts_porta() + "</td>");
			out.println("<td>" + jug.getXuts_fora() + "</td>");
			out.println("<td>" + jug.getPerdues() + "</td>");
			out.println("<td>" + jug.getPartits() + "</td>");
			out.println("<td>" + jug.getRecuperacions() + "</td>");
			out.println("<td>" + jug.getIntercepcions() + "</td>");
			out.println("</tr>");
		 	}
		 }
		 %>
	</table>
	</div>
</body>
</html>