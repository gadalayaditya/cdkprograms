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
<h2>Service Form</h2>
<form:form method="POST" action="addService">
    <table>
        <tr>
            <td width="127"><form:label path="id"> id:</form:label></td>
            <td width="102"><form:input path="id" /></td>
        </tr>
        <tr>
            <td><form:label path="cName">Customer Name:</form:label></td>
            <td><form:input path="cName" /></td>
        </tr>
        <tr>
            <td><form:label path="vNo">Vehicle number:</form:label></td>
            <td><form:input path="vNo" /></td>
        </tr>
        <tr>
            <td><form:label path="vName">model name:</form:label></td>
            <td><form:input path="vName" /></td>
        </tr>
        <tr>
            <td><form:label path="type">two wheeler or four:</form:label></td>
            <td><form:input path="type" /></td>
        </tr>

        <tr>
            <td colspan="2"><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>
