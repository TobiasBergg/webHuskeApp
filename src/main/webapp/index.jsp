<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="ServletLogin">Log ind</a>

<c:forEach var="emne" items="${requestScope.personer}">
    <br>
    ${emne.value.navn}

</c:forEach>

<br>
<br>
${requestScope.msg}
<br>

<h2>Log ind: </h2>

<form action="ServletLogin" method="post">
    <label>Angiv navn:</label><br>
    <input type="text" name="fname" value="Sander"><br>
    <label>Kode:</label><br>
    <input type="text" name="lname" value="1"><br><br>
    <input type="submit" value="Log ind">
</form>

</body>
</html>