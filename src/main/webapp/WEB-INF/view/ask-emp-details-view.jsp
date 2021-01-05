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
    <title>Ask</title>
</head>
<body>
<br>
    <h2>Dear User, Please enter your details</h2>

<br>
    <form action="/showDetails" method="get" >
        <input type="text" name="employeeName" placeholder="Write your name"/>
        <input type="submit"/>
    </form>

</body>
</html>
