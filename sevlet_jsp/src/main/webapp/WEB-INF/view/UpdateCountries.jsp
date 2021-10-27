<%--
  Created by IntelliJ IDEA.
  User: zeezx
  Date: 10/27/2021
  Time: 7:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update</title>
</head>
<body>
    <h1>Countries Update Form</h1>
    <form action="updatecountry" method="post">
        <table>
            <tr>
                <td>Country ID</td>
                <td>Name</td>
                <td>National Day:</td>
                <td>Country Code 2</td>
                <td>Country Code 3</td>
                <td>Area</td>
            </tr>
            <tr>
                <td><input type="text" name="countryID" /></td>
                <td><input type="text" name="name" /></td>
                <td><input type="text" name="nationalDay" /></td>
                <td><input type="text" name="countryCode2" /></td>
                <td><input type="text" name="countryCode3" /></td>
                <td><input type="text" name="area" /></td>
            </tr>
        </table>
        <input type="submit" value="Update">
    </form>
    <a href="showcountries">Show Countries</a><br>
    <a href="/index.jsp">Home</a>
</body>
</html>
