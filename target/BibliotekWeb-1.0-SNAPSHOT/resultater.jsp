<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="includes/header.inc" %>

<h1 class="text-center mt-4">Søgeresultater</h1>
<h3>Her er hvad du har søgt på:</h3>
<ul>
    <li>Titel: ${requestScope.titel}</li>
    <li>Forfatter: ${requestScope.forfatter}</li>
    <li>Udgivelsesår: ${requestScope.udgivelsesaar}</li>
</ul>

<h3>Du har fundet:</h3>

<ol>
    <c:forEach var="bog" items="${requestScope.bogliste}">
        <li>${bog.titel}, ${bog.forfatter}, ${bog.udgivelsesaar}</li>
    </c:forEach>
</ol>

<%@ include file="includes/footer.inc" %>
