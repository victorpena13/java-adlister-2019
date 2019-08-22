<%--
  Created by IntelliJ IDEA.
  User: victorpena
  Date: 2019-08-22
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>These are our Ads:</h1>

<c:forEach var="ad" items="${ads}">
    <div class="ad">
        <h2>Ad: ${ad.id}</h2>
        <p>User: ${ad.userId}</p>
        <p>Description: ${ad.description}</p>
    </div>
</c:forEach>

</body>
</html>
