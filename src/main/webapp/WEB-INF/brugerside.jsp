<%--
  Created by IntelliJ IDEA.
  User: tobiasberg
  Date: 14/03/2023
  Time: 22.13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Velkommen ${sessionScope.person.navn}
<br>
<br>
<br>
<c:forEach var="emne" items="${sessionScope.person.stringArrayList}">
<br>
    ${emne}

</c:forEach>

<br>
<br>

<form action="ServletEditListe">
    <label>Tilføj til liste:</label><br>
    <input type="text" name="emne" value=""><br>
    <input type="submit" value="Tilføj">
</form>
<br>
<br>
<h2>${requestScope.msg}</h2>
<br>
<form action="ServletSave">
    <label></label><br>
    <input type="submit" value="Gem">
</form>
<br>
<br>
<form action="ServletSave" method="post">
    <input type="submit" value="Log af">
</form>
</body>
</html>
