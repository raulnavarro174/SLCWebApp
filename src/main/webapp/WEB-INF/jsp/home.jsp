<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<%@ page import="java.util.ArrayList,com.slc.model.Dades"%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />
<title>SLC WebApp</title>
</head>
<body>
	<div class="container" style="margin-left: 0px;">
		<div class="container">
		<form:form action="${contextPath}/main" method="post"
				modelAttribute="dades">
		    <div class="col-1">
                <label>Dorsal</label>
                <form:input path="id_jugador" id="camps" type="number"
                    name="filtreId_jugador" value="${dades.getId_jugador()}" required="required"/>
            </div>
            <div class="col-1" id="camps">
				<label>Mètode</label> <select name="metode">
					<c:forEach items="${listmetodes}" var="object">
						<option value="${object.nom}"
							${object.nom.equals(dades.metode) ? "selected" : ""}>${object.nom}</option>
					</c:forEach>
				</select>
			</div>
            <div class="col-1">
				<input type="SUBMIT" value="main" class="btn btn-primary mb-2" />
			</div>
        </form:form>
        </div>
    </div>
</body>
