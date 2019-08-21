<%--
  Created by IntelliJ IDEA.
  User: victorpena
  Date: 2019-08-21
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! int counter = 0; %>
<% counter += 1; %>


<% request.getQueryString(); %>
<% request.getRequestURL(); %>
<% request.getParameter("color"); %>
<%--                <% request.getHeader(); %>--%>



<html>
<head>
    <title>Title</title>
    <%@ include file="/partials/header.jsp" %>
    <link rel="stylesheet" href="about.css">
</head>
<body>
<h1>EAT SHIT</h1>

<div class="container">
    <div class="row">
        <div class="col-lg-3 col-md-6">
            <p>the current count: <%= counter%></p>
        </div>
        <div class="col-lg-3 col-md-6">
            <p>
               URL:  <br>
                queryString:  <br>
                url parameter:
                </p>
        </div>
        <div class="col-lg-3 col-md-6">
            <p>Sit quibusdam dolorum delectus ducimus consequatur ullam cupiditate quia sit, laboriosam distinctio distinctio est blanditiis vitae laudantium dolore? Tempore doloremque aspernatur repellat consectetur sit vero velit possimus suscipit? Odit doloremque?</p>
        </div>
        <div class="col-lg-3 col-md-6">
            <p>Consectetur doloribus dolor quia iste sint! Totam suscipit possimus deserunt adipisci beatae? Mollitia explicabo voluptates hic delectus voluptates commodi necessitatibus perferendis. Rem ipsam itaque illo perspiciatis illo doloribus. Enim iste.</p>
        </div>
    </div>
</div>



<%--<c: if test ="${param.color == 'blue'}">--%>
<%--    <h1>This page is blue</h1>--%>
<%--</c:>--%>



<%! String[] names = {"fer,", "dan", "nestor"}; %>
<% request.setAttribute("names", names); %>

<nav>
    <ul>
        <c:forEach var="name" items="${names}">
            <li>${name}</li>
        </c:forEach>
    </ul>
</nav>






<%@ include file="/partials/scripts.jsp" %>
</body>
</html>
