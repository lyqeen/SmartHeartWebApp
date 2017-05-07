
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- CSS tags -->
        <link rel="stylesheet" type="text/css" href="css/test45LoginStyle.css">
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

        <form action="LoginServlet" method="post">

          <fieldset class="clearfix">

            <p ><span class="fa fa-user"></span><input type="text" id="username" name="username" Placeholder="Username" required></p> <!-- JS because of IE support; better: placeholder="Username" -->
            <p><span class="fa fa-lock"></span><input type="password" id="pass" name="pass"  Placeholder="Password" required></p> <!-- JS because of IE support; better: placeholder="Password" -->
            <%if(request.getAttribute("message")!= null){%><%=request.getAttribute("message")%><%}%>
             <div>
                                <span style="width:48%; text-align:left;  display: inline-block;">
                                    <p class="small-text"> ${request.getAttribute("message")}</p>
                                </span>
                                <span style="width:50%; text-align:right;  display: inline-block;">
                                    <input type="submit" value=" Log In " >
                                </span>
                            </div>

          </fieldset>
<div class="clearfix"></div>
        </form>

        <div class="clearfix"></div>

      </div> <!-- end login -->
      <div class="logo">
          <img src="Image/logotypr05.png">
          <div class="clearfix"></div>
      </div>
      
      </div>
</center>
        </div>
        
        
        
    </body>
</html>
