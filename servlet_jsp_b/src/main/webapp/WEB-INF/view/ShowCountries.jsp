<%--
  Created by IntelliJ IDEA.
  User: zeezx
  Date: 10/22/2021
  Time: 9:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Countries List</title>
</head>
<body>
<h2>Country List</h2>
<table id="table" border="2" cellspacing="3" cellpadding="2">
    <tr>
        <th>Country ID</th>
        <th>Name</th>
        <th>National Day</th>
        <th>Country Code 2</th>
        <th>Country Code 3</th>
        <th>Area</th>
    </tr>
    <c:forEach var = "i" items="${listC}">
        <tr>
            <td>${i.countryID}</td>
            <td>${i.name}</td>
            <td>${i.nationalDay}</td>
            <td>${i.countryCode2}</td>
            <td>${i.countryCode3}</td>
            <td>${i.area}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
