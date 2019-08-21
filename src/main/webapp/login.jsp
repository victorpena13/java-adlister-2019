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
</head>
<body>



<form method="POST" action="/register">
    <label for="username">username</label>
    <input id="username" type="text" name="username" placeholder="username"><br>
    <label for="password">password</label>
    <input id="password" type="password" name="password" placeholder="password">
</form>



</body>
</html>
