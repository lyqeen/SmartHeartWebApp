<%-- 
    Document   : Login
    Created on : May 7, 2017, 2:47:43 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- CSS tags -->
        <link rel="stylesheet" type="text/css" href="css/LoginStyle.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">


        <link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">

        <style>
            body {
                
                font-family: 'Open Sans', sans-serif;
            }
        </style>


        <!-- Script tags-->
        <script src="js/jquery-3.2.0.min.js"></script>
        <script src="js/bootstrap.min.js"></script>


        <title>Login</title>

    </head>
    <body>

        <div class="container">
            <center>
                <div class="middle">
                    <div id="login">

                        <form action="javascript:void(0);" method="post">

                            <fieldset class="clearfix">

                                <p ><span class="fa fa-user"></span><input type="text"  Placeholder="Username" required value=""></p> <!-- JS because of IE support; better: placeholder="Username" -->
                                <p><span class="fa fa-lock"></span><input type="password"  Placeholder="Password" required value=""></p> <!-- JS because of IE support; better: placeholder="Password" -->

                                <div>
                                    <span style="width:48%; text-align:left;  display: inline-block;"><a class="small-text" ></a></span>
                                    <span style="width:50%; text-align:right;  display: inline-block;"><input type="submit" value=" Log In "></span>
                                </div>

                            </fieldset>
                            <div class="clearfix"></div>
                        </form>

                        <div class="clearfix"></div>

                    </div> <!-- end login -->
                    <div class="logo">LOGO

                        <div class="clearfix"></div>
                    </div>

                </div>
            </center>
        </div>


    </body>
</html>
