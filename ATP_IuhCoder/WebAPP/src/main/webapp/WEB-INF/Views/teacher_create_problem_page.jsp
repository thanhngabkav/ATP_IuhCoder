<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: lldtien
  Date: 8/5/2017
  Time: 10:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css"/>
</head>
<body>
<%--DIS ME BO CAI enctype="multipart/form-data" THI LAI cHAY DUOC, DEO HIEU LUON--%>
<%--FIXED, do thieu library--%>
<div class="container-fluid">
    <form:form modelAttribute="ProblemUploadForm" enctype="multipart/form-data" method="post" action="">
        <div class="form-group row">
            <form:label path="problemID" cssClass="col-2 col-form-label">Problem ID</form:label>
            <div class="col-6">
                <form:input path="problemID" cssClass="form-control" type="text"/>
            </div>
        </div>
        <div class="form-group row">
            <form:label path="problemName" cssClass="col-2 col-form-label">Problem Name</form:label>
            <div class="col-6">
                <form:input path="problemName" cssClass="form-control" type="text"/>
            </div>
        </div>
        <div class="form-group row">
            <form:label path="content" cssClass="col-2 col-form-label">Content</form:label>
            <div class="col-6">
                <form:textarea path="content" cssClass="form-control" type="text"/>
            </div>
        </div>
        <div class="form-group row">
            <form:label path="isPublicFile" cssClass="col-2 col-form-label">isPublicFile</form:label>
            <div class="col-6">
                <form:checkbox path="isPublicFile" cssClass="form-control" type="text"/>
            </div>
        </div>
        <div class="form-group row">
            <form:label path="input" cssClass="col-2 col-form-label">Input</form:label>
            <div class="col-4">
                <form:input path="input" cssClass="form-control" type="file"/>
            </div>
        </div>
        <div class="form-group row">
            <form:label path="output" cssClass="col-2 col-form-label">Output</form:label>
            <div class="col-4">
                <form:input path="output" cssClass="form-control" type="file"/>
            </div>
        </div>
        <div class="form-group row">
            <form:label path="sampleInput" cssClass="col-2 col-form-label">Sample Input</form:label>
            <div class="col-6">
                <form:input path="sampleInput" cssClass="form-control" type="text"/>
            </div>
        </div>
        <div class="form-group row">
            <form:label path="sampleOutput" cssClass="col-2 col-form-label">Sample Output</form:label>
            <div class="col-6">
                <form:input path="sampleOutput" cssClass="form-control" type="text"/>
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
