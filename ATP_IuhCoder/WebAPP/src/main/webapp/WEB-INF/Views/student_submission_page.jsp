<%--
  Created by IntelliJ IDEA.
  User: lldtien
  Date: 7/19/2017
  Time: 9:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HomePage</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="resources/css/my_navbar.css"/>
    <link rel="stylesheet" href="resources/css/news_css.css"/>
    <link rel="stylesheet" href="resources/css/rating_css.css"/>
    <link rel="stylesheet" href="resources/css/home_page_css.css"/>
</head>
<body>
<div class="main">
    <jsp:include page="../subViews/header_fixed_top.jsp"/>
    <div class="home-content" style="padding-top: 110px">
        <div class="content-left  col-md-12">
            <jsp:include page="../subViews/submission.jsp"/>
        </div>

    </div>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js"></script>
</body>
</html>
