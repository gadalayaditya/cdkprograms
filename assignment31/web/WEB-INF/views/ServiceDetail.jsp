<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Spring MVC Form Handling</title>
</head>
<body>
<h2>Submitted Employee Information</h2>
<table border="1">
    <tr>
        <td> ID </td>
        <td>${id}</td>
    </tr>
    <tr>
        <td>Customer Name</td>
        <td>${cName}</td>
    </tr>
    <tr>
        <td>Vehicle number</td>
        <td>${vNo}</td>
    </tr>
    <tr>
        <td>vehicle name</td>
        <td>${vName}</td>
    </tr>
    <tr>
        <td>type</td>
        <td>${type}</td>
    </tr>
</table>
</body>
</html>