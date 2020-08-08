<%--
  Created by IntelliJ IDEA.
  User: Василь
  Date: 06.07.2020
  Time: 18:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Log in</title>
</head>
<body>
    <div class="header">
        <ul>
            <li></li>
            <li></li>
        </ul>
    </div>
    <div id="main-div">
        <div class="forms_container">
            <form action="authorization" method="GET">
                <label for="login">Login</label>
                <input type="text" id="login" name="login">
                <label for="password">Password</label>
                <input type="text" id="password" name="password">
                <input type="submit" value="submit">
            </form>
        </div>
    </div>
</body>
</html>
