<%--
  Created by IntelliJ IDEA.
  User: victorpena
  Date: 2019-08-21
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>




<html>
<head>
    <title>Title</title>
    <%@ include file="/partials/header.jsp"%>
<%--    <link rel="stylesheet" href="css/style.css">--%>
<%--    <link rel="stylesheet" href="css/kids.css">--%>
</head>
<body>

<%@ include file="/partials/navbar.jsp" %>

<%--<c:choose>--%>
<%--    <c:when test="${param.username == 'admin' and param.password == 'password'}">--%>
<%--        <c:redirect url="profile.jsp"></c:redirect>--%>
<%--    </c:when>--%>
<%--    <c:otherwise>--%>
<%--        <form method="POST" action="/login.jsp">--%>
<%--            <label for="username">username</label>--%>
<%--            <input id="username" type="text" name="username" placeholder="username"><br>--%>
<%--            <label for="password">password</label>--%>
<%--            <input id="password" type="password" name="password" placeholder="password"><br>--%>
<%--            <button type="submit">Submit the form</button>--%>
<%--        </form>--%>
<%--    </c:otherwise>--%>
<%--</c:choose>--%>


<form method="POST" action="/login">
    <label for="username">username</label>
    <input id="username" type="text" name="username" placeholder="username"><br>
    <label for="password">password</label>
    <input id="password" type="password" name="password" placeholder="password"><br>
    <button type="submit">Submit the form</button>
</form>



</body>
</html>
