<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ask</title>
</head>
<body>
<br>
    <h2>Dear User, Please enter your details</h2>

<br>
<!--
    <form action="/showDetails" method="get" >
        <input type="text" name="employeeName" placeholder="Write your name"/>
        <input type="submit"/>
    </form>
-->

<form:form action="showDetails" modelAttribute="employee">

    Name <form:input path="name"/>
    <br>
    Surname <form:input path="surname"/>
    <br>
    Salary <form:input path="salary"/>
    <br>
    Department  <form:select path="department">
                    <form:options items="${employee.departments}"/>
                </form:select>
    <br>
    Select car brand <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br>
    Foreign Language(s)
    <form:checkboxes path="languages" items="${employee.languageList}"/>
    <br>
    <input type="submit" value="OK">
</form:form>

</body>
</html>
