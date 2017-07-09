<%--
  Created by IntelliJ IDEA.
  User: lldtien
  Date: 7/9/2017
  Time: 8:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="/resources/css/my_navbar.css"/>
    <link rel="stylesheet" href="/resources/css/news_css.css"/>
    <link rel="stylesheet" href="/resources/css/rating_css.css"/>
    <link rel="stylesheet" href="/resources/css/home_page_css.css"/>
</head>
<body>
    <div class="main">
        <jsp:include page="../subViews/navbar_header.jsp"></jsp:include>
        <div class="home-content">
            <div class="content-left">
                    <jsp:include page="../subViews/news.jsp"></jsp:include>
            </div>
            <div class="content-right">
                    <div class="right-problem">
                        <jsp:include page="../subViews/problem.jsp"></jsp:include>
                    </div>
                    <div class="right-rating">
                        <jsp:include page="../subViews/rate.jsp"></jsp:include>
                    </div>
            </div>
        </div>
    </div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js"></script>
</body>
</html>
