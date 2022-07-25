<%--
  Created by IntelliJ IDEA.
  User: MadCat
  Date: 7/24/2022
  Time: 11:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>FILMS</title>
</head>
<body>

<h2>Films</h2>
<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>age</th>
        <th>car</th>
        <th>action</th>
    </tr>
    <c:forEach var="user" items="${allUsersList}">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.age}</td>
            <td>${user.car}</td>
            <td>
                <a href="/edit/${user.id}">edit</a>
                <a href="/delete/${user.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>

<h2>Add</h2>
<c:url value="/add" var="add"/>
<a href="${add}">Add new film</a>
</body>
</html>
