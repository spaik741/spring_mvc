<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: spaik
  Date: 05.01.2021
  Time: 13:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show</title>
</head>
<body>
    <br>
    <p>
        Your name: ${employee.name}
        <br>
        Your surname: ${employee.surname}
        <br>
        Your surname: ${employee.salary}
        <br>
        Your surname: ${employee.email}
        <br>
        Your surname: ${employee.department}
        <br>
        Your car brand: ${employee.carBrand}
        <br>
        Language(s)
        <ul>
            <c:forEach var="lang" items="${employee.languages}">
                <li>${lang}</li>
            </c:forEach>
        </ul>
    </p>
</body>
</html>
