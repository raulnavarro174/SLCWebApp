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
		<form>
		    <div class="col-1">
                <label>Dorsal</label>
                <form:input path="id_jugador" id="camps" type="number"
                    name="id_jugador" value="${dades.getId_jugador()}" required="required"/>
            </div>
            <div class="col-1">
                <button class="btn btn-primary mb-2"
                formaction="${contextPath}/sumaGol" type="submit">Gol</button>
            </div>
        </form>
        </div>
    </div>
</body>

