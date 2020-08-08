<%--
  Created by IntelliJ IDEA.
  User: Василь
  Date: 07.07.2020
  Time: 21:35
  To change this template use File | Settings | File Templates.
--%>
<%@page import="org.example.model.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<h2>
    <% User currentUser = (User)request.getSession().getAttribute("user");%>
    <p>User info: </p> <%=currentUser.toString()%>
</h2>
</body>
</html>
