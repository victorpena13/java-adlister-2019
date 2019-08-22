<%--
  Created by IntelliJ IDEA.
  User: victorpena
  Date: 2019-08-22
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<link rel="stylesheet" href="/css/style.css">

<c:if test="${param.isKid == true}">
    <link rel="stylesheet" href="/css/kids.css">
</c:if>