<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<a href="/index.html">메인</a>
<table>
    <thead>
    <th>id</th>
    <th>username</th>
    <th>age</th>
    </thead>
    <tbody>
    <c:forEach var="member1" items="${members}">
        <tr> <td>${member1.id}</td>
            <td>${member1.username}</td>
            <td>${member1.age}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>