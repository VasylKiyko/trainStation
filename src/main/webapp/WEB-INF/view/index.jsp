<%--
  Created by IntelliJ IDEA.
  User: Василь
  Date: 04.07.2020
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Schedule:</h1>
    <table>
        <tr>
            <td>ID</td>
            <td>From city</td>
            <td>To city</td>
            <td>Departure</td>
            <td>Arrival</td>
            <td>Departure Date</td>
            <td>Arrival Date</td>
            <td>Platform Number</td>
            <td>TrainID</td>
        </tr>
        <c:forEach var="scheduleRow" items="${timetableList}">
            <tr>
                <td>${scheduleRow.getRowID()}</td>
                <td>${scheduleRow.getRoute().getCityFrom()}</td>
                <td>${scheduleRow.getRoute().getCityTo()}</td>
                <td>${scheduleRow.getRoute().getDepartureTime()}</td>
                <td>${scheduleRow.getRoute().getArrivalTime()}</td>
                <td>${scheduleRow.getDepartureDate()}</td>
                <td>${scheduleRow.getArrivalDate()}</td>
                <td>${scheduleRow.getPlatformNumber()}</td>
                <td>${scheduleRow.getTrainID()}</td>
            </tr>
        </c:forEach>
    </table>


    <p>
        <a href="${pageContext.request.contextPath}/login">Log in</a>
    </p>
</body>
</html>
