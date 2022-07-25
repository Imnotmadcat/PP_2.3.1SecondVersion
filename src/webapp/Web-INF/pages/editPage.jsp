<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <c:if test="${empty user.title}">
        <title>Add</title>
    </c:if>
    <c:if test="${!empty user.title}">
        <title>Edit</title>
    </c:if>
</head>
<body>
<c:if test="${empty user.title}">
    <c:url value="/add" var="var"/>
</c:if>
<c:if test="${!empty user.title}">
    <c:url value="/edit" var="var"/>
</c:if>
<form action="${var}" method="POST">
    <c:if test="${!empty user.title}">
        <input type="hidden" name="id" value="${user.id}">
    </c:if>
    <input type="hidden" name="id" value="${user.id}">
    <label for="name">Name</label>
    <input type="text" name="name" id="name">
    <label for="age">Age</label>
    <input type="text" name="age" id="age">
    <label for="car">Car</label>
    <input type="text" name="car" id="car">
    <input type="submit" value="Edit user">
</form>
</body>
</html>