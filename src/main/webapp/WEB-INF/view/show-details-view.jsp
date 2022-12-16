<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<%--<h2>Your are welcome, ${param.employeeName}!</h2>--%>
<H2>
    name: ${employee.name}<br>
    surname: ${employee.surname}<br>
    salary: ${employee.salary}<br>
    Department: ${employee.department}<br>
    Phone number: ${employee.phoneNumber}<br>
    Email: ${employee.email}<br>
    Car: ${employee.carBrand}<br>
    Language(s):
    <ul>
        <c:forEach var="lang" items="${employee.languages}">
            <li>${lang}</li>
        </c:forEach>
    </ul>
</H2>
<a href="/spring_course_mvc/">home</a>
</body>
</html>
