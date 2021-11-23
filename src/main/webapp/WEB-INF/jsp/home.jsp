<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<%@ page import="java.util.ArrayList,com.slc.model.Dades,com.slc.component.Constants"%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<c:url value="/css/main.css" var="jstlCss" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/custom.js"></script>
<link href="${jstlCss}" rel="stylesheet" />
<title>SLC WebApp</title>
</head>
<body>
	<div class="container" style="margin-left: 0px;">
		
		<form:form id="main_form" action="${contextPath}/main" method="post"
				modelAttribute="dades">
			<div class="row" id="row">
		    <div class="col-3">
                <label>Dorsal</label><br>
                <select name="id_jugador" size="${Constants.NUM_JUGADORS }">
					<c:forEach items="${jugadors}" var="object">
						<option class="dorsal_select" value="${object}">${object}</option>
					</c:forEach>
				</select>
            </div>
            <div class="col-3" id="camps">
				<label>Mètode</label><br>
				<select name="metode" size="${Constants.NUM_METODES}">
					<c:forEach items="${listmetodes}" var="object">
						<option class="metode_select" value="${object.nom}"
							${object.nom.equals(dades.metode) ? "selected" : ""}>${object.nom}</option>
					</c:forEach>
				</select>
			</div>
            <div class="col-3">
				<button class="btn btn-primary mb-2"
							formaction="${contextPath}/escriu" type="submit">Estadístiques partit</button>
				<button class="btn btn-primary mb-2"
							formaction="${contextPath}/escriuTemporada" type="submit">Estadístiques temporada</button>
			</div>
		</div>
        </form:form>
    </div>
</body>
