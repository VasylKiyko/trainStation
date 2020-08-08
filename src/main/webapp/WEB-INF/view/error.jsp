<%--
  Created by IntelliJ IDEA.
  User: Василь
  Date: 07.07.2020
  Time: 21:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Error</title>
</head>
<body>
    <h1>
        ${errorMessage}
    </h1>
    <a href="${pageContext.request.contextPath}/login">Try again</a>
</body>
</html>
