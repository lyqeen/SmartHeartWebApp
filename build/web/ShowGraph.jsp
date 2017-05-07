<%-- 
    Document   : ShowGraph
    Created on : May 7, 2017, 11:45:29 AM
    Author     : User
--%>

<%@page import="model.DataHealth"%>
<%@page import="model.Patient"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- CSS tags -->
        <link rel="stylesheet" type="text/css" href="css/showGraphStyle.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">


        <!----font ---->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans|Prompt" rel="stylesheet">

        <style>
            body {
                font-family: 'Prompt','Open Sans', sans-serif;
                background-color: #fcfcfc
            }
        </style>


        <!-- Script tags-->
        <script src="js/jquery-3.2.0.min.js"></script>
        <script src="js/bootstrap.min.js"></script>


        <title>Detail</title>
    </head>
    <body>
        <div class="container-fluid navmenu" style="padding-right: 0px; padding-left: 0px;">

            <a class="navbar-brand" href="#" style="padding-top: 8px;">
                <img alt="Brand" src="Image/logotypr05.png" width="230">
            </a>

            <ul class="nav nav-pills nav-justified" id="menu">
                <li></li>
                <li></li>
                <li></li>
                <li>
                    <a href="/Test01/ShowPatientsServlet" >รายชื่อผู้ป่วยทั้งหมด</a>
                </li>
                <li >
                    <a href="/Test01/ShowWaitDiagnosePatServlet">รายชื่อผู้ป่วยรอการวินิฉัย </a>
                </li>

                <li><a href="/Test01/LogoutServlet">Logout</a></li>

            </ul>
        </div>


        <div class="clearfix"></div>


        <!--------------End of menu tab-------------->

        <!---------------Content-------------->

        <div class="container" >
            <%
                Patient p = (Patient) request.getAttribute("infoPat");
                DataHealth dh = (DataHealth) request.getAttribute("dataH");
            %>
            <div class="row allContent" >
                <div class="col-md-5 mainTopic" style="background-color:">
                    <br>
                    &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;

                    <b>ECG</b>Graph 

                    <img class="dec_line"  src="Image/line_rectangle.png" width="220px">                    
                </div>
                <div class="col-md-6 text-right sequenceLink" >
                    <br><br>
                    <a href="/Test01/ShowPatientsServlet">รายชื่อคนไข้ทั้งหมด </a> / 
                    <a href="ShowListDataHealthServlet?idPat=<%=p.getPatId()%>"> <%=p.getPatFname()%> <%=p.getPatLname()%></a> /  
                    <span class="textInfo">ข้อมูล </span>
                </div>

                <div class="clearfix"></div>

                <!----------Show Graph---------->
                
                <div class="col-md-1"></div>
                <div class="col-md-10 show_info"><br>
                    <table border="0">
                    <tr>
                        <td width="100px" valign="bottom" >
                        วันเวลา
                        </td>
                        <td>    
                            <input type="text" class="info" value="<%=dh.getInfoDate()%>" placeholder=" วันที่" readonly>
                        </td>
                        
                        <td width="150px" valign="bottom">    
                      ID Data Health
                        </td>
                        <td> 
                            <input type="text" class="info" value="<%=dh.getDaId()%>" placeholder="ID" readonly>
                        </td>
                    </tr>
                    </table>
                </div>
                <div class="clearfix"></div>
                

                <div class="col-md-1"></div>
                <div class="col-md-10">
                    <br>

                    <img src="Image/ECGgraph.jpg" width="950">

                    <br><br><br>
                </div>

                <div class="clearfix"></div>

                <!----------Diagnose---------->
                <div class="col-md-5 mainTopic">
                    <br>
                    &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;
                    <b>การ</b>วินิฉัย 
                    <img class="dec_line"  src="Image/line_rectangle.png"
                         width="220px">
                </div>

                <div class="clearfix"></div>

                <div class="col-md-1"></div>

                <div class="col-md-3"><br>
                    กราฟหัวใจมีความผิดปกติในเรื่องของ
                </div>
                <form>
                    <div class="col-md-6 checkArrhy"><br>

                        <input type="radio" name="arrhyType" value="gx"> Arrhythmia  <br><br>
                        <input type="radio" name="arrhyType" value="gx"> Bradyarrhythmia  <br><br>
                        <input type="radio" name="arrhyType" value="gx"> Tachyarrhythmias  <br><br>
                        <input type="radio" name="arrhyType" value="gx"> Irregular Heartbeat  <br><br>
                        <input type="radio" name="arrhyType" value="gx"> Normal Heartbeat<br><br>


                    </div>

                    <div class="clearfix"></div>
                    <div class="col-md-1"></div>

                    <!-----------Comment----------->
                    <div class="col-md-8"><br>
                        <div class="form-group">
                            <label for="comment"> Comment:</label>
                            <textarea class="form-control" rows="6" id="comment"></textarea>
                        </div>
                    </div>

                    <div class="clearfix"></div>
                    <div class="col-md-1"></div>

                    <!---------button submit-------->
                    <div class="col-md-10 submit-btn"><br>
                        <input formaction="/Test01/ShowPatientsServlet" type="submit" value="Send Notification">
                    </div>


                </form>


            </div>
        </div>
        <div class="clearfix"></div>
        <div class="footer">
            Copyright by abcdefghij 2017. All rights reserved.
        </div>
    </body>
</html>
