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
        <th>Problem Name</th>
        <th>Problem Type</th>
        <th>Num</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${contests}" var="contest">
        <tr>
            <td>${problem.getProblemID()}</td>
            <td>${problem.getProblemName()}</td>
            <td>${problem.getProblemType()}</td>
            <td>${problem.getNumberProblemSolved()}</td>
        </tr>
    </c:forEach>
    <tr>
        <th scope="row">1</th>
        <td>Mark</td>
        <td>Otto</td>
        <td>@mdo</td>
    </tr>
    <tr>
        <th scope="row">2</th>
        <td>Jacob</td>
        <td>Thornton</td>
        <td>@fat</td>
    </tr>
    <tr>
        <th scope="row">3</th>
        <td>Larry</td>
        <td>the Bird</td>
        <td>@twitter</td>
    </tr>
    </tbody>
</table>
