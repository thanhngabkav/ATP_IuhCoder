<%--
  Created by IntelliJ IDEA.
  User: lldtien
  Date: 7/25/2017
  Time: 3:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <link href="resources/css/login.css" rel="stylesheet"/>
    <title>Login</title>

</head>


<body>
<div class="login-page">
    <div class="login-form">
        <div class="login-content-left">

            <input id="tab-1" type="radio" name="tab" class="sign-up" style="display: none" />
            <label id="lb-tab-1" for="tab-1" class="btn pill right"  >Register</label>
            <input id="tab-2" type="radio" name="tab" class="sign-in" style="display: none" checked/>
            <label id="lb-tab-2" for="tab-2" class="btn pill left" >Sign In</label>

            <div class="top-content">
                <div class="back-home">
                    <img src="../img/ic_arrow_back.png"/>
                </div>
            </div>
            <div class="sign-in-content" id="sign-in">
                <h2>
                    Sign In
                </h2>
                <div class="group">
                    <input type="text" required="">
                    <span class="highlight"></span>
                    <span class="bar"></span>
                    <label>UserName</label>
                </div>
                <div class="group">
                    <input type="text" required="">
                    <span class="highlight"></span>
                    <span class="bar"></span>
                    <label>Password</label>
                </div>
                <button>Login</button>
            </div>
            <div class="sign-up-content" id="sign-up">
                <h2 >
                    Sign Up
                </h2>
                <div class="group">
                    <input type="text" required="">
                    <span class="highlight"></span>
                    <span class="bar"></span>
                    <label>UserName</label>
                </div>
                <div class="group">
                    <input type="text" required="">
                    <span class="highlight"></span>
                    <span class="bar"></span>
                    <label>Password</label>
                </div>
                <div class="group">
                    <input type="text" required="">
                    <span class="highlight"></span>
                    <span class="bar"></span>
                    <label>Confirm Password</label>
                </div>
                <div class="group">
                    <input type="text" required="">
                    <span class="highlight"></span>
                    <span class="bar"></span>
                    <label>Email</label>
                </div>
                <button>Sign Up</button>
            </div>
        </div>
        <div class="login-content-right">
            <div class="text-head">
                <h1>IUHCODER</h1>
                <h1>TYPING YOUR FUTURE</h1>
            </div>
            <div class="text-body">
                <h4>
                    A BUG IS NEVER JUST A MISTAKE, IT REPRESENTS SOMETHING BIGGER. AN ERROR OF THINKING, THAT MAKES YOU WHO YOU ARE
                </h4>
                <h5>ELLIOT ALDERSON</h5>
            </div>
        </div>

    </div>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="resources/js/login_js.js"></script>
</body>
</html>
