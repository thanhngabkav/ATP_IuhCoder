<%--
  Created by IntelliJ IDEA.
  User: lldtien
  Date: 7/19/2017
  Time: 12:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table class="table table-striped" width="100%">
    <thead class="thead-inverse">
    <tr class="row">
        <th class="col-md-1">ID</th>
        <th class="col-md-1">Time</th>
        <th class="col-md-5">Problem Name</th>
        <th class="col-md-2">Verdict</th>
        <th class="col-md-1">Time</th>
        <th class="col-md-2">Memory</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${submissions}" var="submission">
        <tr class="row">
            <td>${submission.getContestID()}</td>
            <td>${submission.getContestName()}</td>
            <td>${submission.getContestWriter()}</td>
            <td>${submission.getContestStartTime()}</td>
            <td>${submission.getContestStartTime() - contest.getContestEndTime()}</td>
            <td>${submission.getContestStatus()}</td>
        </tr>
    </c:forEach>
    <tr class="row">
        <th class="col-md-1">bnm</th>
        <th class="col-md-1">Time</th>
        <th class="col-md-5">bnm Name</th>
        <th class="col-md-2">sdf</th>
        <th class="col-md-1">xcv</th>
        <th class="col-md-2">zxc</th>
    </tr>
    <tr class="row">
        <th class="col-md-1">asdasd</th>
        <th class="col-md-1">zxc</th>
        <th class="col-md-5">zxc Name</th>
        <th class="col-md-2">qwe</th>
        <th class="col-md-1">asd</th>
        <th class="col-md-2">Memory</th>
    </tr>
    <tr class="row">
        <th class="col-md-1">ert</th>
        <th class="col-md-1">Time</th>
        <th class="col-md-5">qwe zxc</th>
        <th class="col-md-2">qwe</th>
        <th class="col-md-1">zxc</th>
        <th class="col-md-2">Memory</th>
    </tr>
    </tbody>
</table>
