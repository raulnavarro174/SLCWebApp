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
<link href="${jstlCss}" rel="stylesheet" />
<title>SLC WebApp</title>
</head>
<body>
	<div class="container" style="margin-left: 0px;">
		
		<form:form action="${contextPath}/main" method="post"
				modelAttribute="dades">
			<div class="row" id="row">
		    <div class="col-3">
                <label>Dorsal</label><br>
                <select name="id_jugador" size="${Constants.NUM_JUGADORS }">
					<c:forEach items="${jugadors}" var="object">
						<option value="${object}">${object}</option>
					</c:forEach>
				</select>
            </div>
            <div class="col-3" id="camps">
				<label>Mètode</label><br>
				<select name="metode" size="${Constants.NUM_METODES }">
					<c:forEach items="${listmetodes}" var="object">
						<option value="${object.nom}"
							${object.nom.equals(dades.metode) ? "selected" : ""}>${object.nom}</option>
					</c:forEach>
				</select>
			</div>
            <div class="col-3">
				<input type="SUBMIT" value="main" class="btn btn-primary mb-2" />
			</div>
		</div>
        </form:form>
    </div>
</body>
