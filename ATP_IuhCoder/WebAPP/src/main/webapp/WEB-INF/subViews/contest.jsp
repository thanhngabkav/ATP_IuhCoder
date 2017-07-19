<%--
  Created by IntelliJ IDEA.
  User: lldtien
  Date: 7/19/2017
  Time: 12:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<table class="table table-striped">
    <thead class="thead-inverse">
    <tr>
        <th>ID</th>
        <th>Contest Name</th>
        <th>Writer</th>
        <th>Start Time</th>
        <th>During</th>
        <th>Status</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${contests}" var="contest">
        <tr>
            <td>${contest.getContestID()}</td>
            <td>${contest.getContestName()}</td>
            <td>${contest.getContestWriter()}</td>
            <td>${contest.getContestStartTime()}</td>
            <td>${contest.getContestStartTime() - contest.getContestEndTime()}</td>
            <td>${contest.getContestStatus()}</td>
        </tr>
    </c:forEach>
    <tr>
        <th scope="row">1</th>
        <td>Mark</td>
        <td>Otto</td>
        <td>@mdo</td>
        <td>@mdo</td>
        <td>@mdo</td>
    </tr>
    <tr>
        <th scope="row">2</th>
        <td>Jacob</td>
        <td>Thornton</td>
        <td>Thornton</td>
        <td>Thornton</td>
        <td>@fat</td>
    </tr>
    <tr>
        <th scope="row">3</th>
        <td>Larry</td>
        <td>Larry</td>
        <td>Larry</td>
        <td>the Bird</td>
        <td>@twitter</td>
    </tr>
    </tbody>
</table>
