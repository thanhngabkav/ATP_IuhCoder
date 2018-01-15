<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: lldtien
  Date: 8/10/2017
  Time: 2:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Contest Form</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css"/>
</head>
<body>
<div class="container-fluid">
    <form:form modelAttribute="CreateContestForm" enctype="multipart/form-data" method="post" action="">
        <div id="contestForm">
            <div class="form-group row">
                <form:label path="contestName" cssClass="col-2 col-form-label">Contest Name</form:label>
                <div class="col-6">
                    <form:input path="contestName" cssClass="form-control" type="text"/>
                </div>
            </div>
            <div class="form-group row">
                <form:label path="startTime" cssClass="col-2 col-form-label">Start Time</form:label>
                <div class="col-6">
                    <form:input path="startTime" type="text" cssClass="form-control"/>
                </div>
            </div>
            <div class="form-group row">
                <form:label path="duration" cssClass="col-2 col-form-label">Duration</form:label>
                <div class="col-6">
                    <form:input path="duration" cssClass="form-control" type="text"/>
                </div>
            </div>
            <div class="form-group row">
                <form:label path="problemName" cssClass="col-2 col-form-label">Problem A</form:label>
                <div class="col-4">
                    <form:input path="problemName" cssClass="form-control" type="text"/>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="offset-2">
                <button  id="addMoreProblem" type="button">Add more Problem</button>
            </div>
        </div>
        <div class="form-group row">
            <div class="offset-2">
                <input type="submit" value="Upload"/>
            </div>
        </div>
    </form:form>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js"></script>
<script src="/WebApp/resources/js/teacher_create_contest_js.js"></script>
</body>
</html>
