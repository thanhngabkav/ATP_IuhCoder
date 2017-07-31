<%--
  Created by IntelliJ IDEA.
  User: lldtien
  Date: 7/19/2017
  Time: 12:28 PM
  To change tdis template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="/WEB-INF/taglibs/paginationTaglib.tld" prefix="page"%>
<table class="table table-striped table-shadow">
    <thead class="thead-inverse">
    <tr>
        <th >ID</th>
        <th >Time</th>
        <th >Problem Name</th>
        <th >Verdict</th>
        <th >Time</th>
        <th  class="table-text-right">Memory</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${submissions}" var="submission">
        <tr scope="row">
            <td>${submission.getSubmissionID()}</td>
            <td>${submission.getStartTime()}</td>
            <td>${submission.getProblemName()}</td>
            <td>${submission.getVerdict()}</td>
            <td>${submission.getTime()}</td>
            <td class="table-text-right">${submission.getMemory()}</td>
        </tr>
    </c:forEach>
    <tr scope="row">
        <td >bnm</td>
        <td >Time</td>
        <td >bnm Name</td>
        <td >sdf</td>
        <td >xcv</td>
        <td  class="table-text-right">zxc</td>
    </tr>
    <tr scope="row">
        <td >asdasd</td>
        <td >zxc</td>
        <td >zxc Name</td>
        <td >qwe</td>
        <td >asd</td>
        <td  class="table-text-right">Memory</td>
    </tr>
    <tr scope="row">
        <td >ert</td>
        <td >Time</td>
        <td >qwe zxc</td>
        <td >qwe</td>
        <td >zxc</td>
        <td  class="table-text-right">Memory</td>
    </tr>
    </tbody>
</table>
<style>
    .pagination a{
        width: 35px;
        height: 35px;
        border-radius: 50%;
        box-shadow: 2px 4px 8px 0px rgba(46,61,73,0.2);
        display: block;
        margin: 5px;

        font-size: 14px;
        text-align: center;
        text-decoration: none;
        line-height: 32px;
        font-weight: 500;
    }
    .picked{
        background: #267EB8;
        color: white;
    }
</style>
<page:paginate pages="${pages}"  count="${count}" uri="Submission"/>