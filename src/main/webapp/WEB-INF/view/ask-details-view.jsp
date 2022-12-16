<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Nelfy
  Date: 12/15/2022
  Time: 4:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Please, enter your details</h2>
<form:form action="showDetails" modelAttribute="employee">

    <h4>Name <form:input path="name"/>
        <form:errors path="name"/>
        <br>
        Surname <form:input path="surname"/><br>
        Salary <form:input path="salary"/>
        <form:errors path="salary"/>
        <br>
        Department <form:select path="department">
            <form:options items="${employee.departmentHashMap}"/>
        </form:select><br>

        PhoneNumber <form:input path="phoneNumber"/>
        <form:errors path="phoneNumber"/><br>

        email <form:input path="email"/>
        <form:errors path="email"/></h4>

    <h4>Which car do you want?</h4>
    <form:radiobuttons path="carBrand" items="${employee.carBrandHashMap}"/>
    <h4>Foreign Language(s)</h4>
    <form:checkboxes path="languages" items="${employee.languagesHashMap}"/><br><br>

    <input type="submit" value="OK">
</form:form>
</body>
</html>
