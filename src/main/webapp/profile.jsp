<%--
  Created by IntelliJ IDEA.
  User: victorpena
  Date: 2019-08-21
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
</head>
<%--<link rel="stylesheet" href="css/style.css">--%>
<%--<link rel="stylesheet" href="css/kids.css">--%>
<jsp:include page="/partials/header.jsp">
    <jsp:param name = "isKid" value="true"/>
</jsp:include>
<body>
<%@ include file="/partials/navbar.jsp" %>


<h1>profile page user: <%= request.getParameter("nameuser") %>!</h1>


</body>
</html>