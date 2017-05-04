<%-- 
    Document   : ShowListDataHealth
    Created on : Apr 29, 2017, 6:31:43 PM
    Author     : User
--%>

<%@page import="model.Patient"%>
<%@page import="model.DataHealth"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- CSS tags -->
        <link rel="stylesheet" type="text/css" href="css/ShowListDataHealthStyle.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">

        <!-- Font -->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">

        <!-- Script tags-->
        <script src="js/jquery-3.2.0.min.js"></script>
        <script src="js/bootstrap.min.js"></script>


        <style>
            body {
                font-family: 'Open Sans', sans-serif;
                background-color: #fcfcfc
            }
        </style>



        <title>List Data Health</title>
    </head>
    <body>
        <!----------Navbar-------->

        <div class="container-fluid navmenu" style="padding-right: 0px; padding-left: 0px;">

            <a class="navbar-brand" href="#" style="padding-top: 8px;">
                <img alt="Brand" src="Image/logotypr05.png" width="230">
            </a>

            <ul class="nav nav-pills nav-justified" id="menu">
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li><a href="#">Home </a></li>
                <li><a href="/Test01/ShowPatientsServlet" style="color:#44cef2">List Patient</a></li>
                <li><a href="#">Register</a></li>
                <li><a href="#">Edit Profile</a></li>
                <li><a href="#">Logout</a></li>
            </ul>
        </div>


        <div class="clearfix"></div>




        <div class="container" >
            <div class="row allContent" >
                <div class="col-md-5 topicName">
                    <br>
                    &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp; &ensp; &ensp;
                    <b>Patient </b>&nbsp; Profile 
                    <img class="dec_line"  src="Image/line_rectangle.png"
                         width="220px">
                </div>
                <div class="clearfix"></div>


                <br><br>
                 <%
                                Patient p = (Patient) request.getAttribute("infoPat");
                            %>
                <div class="col-md-1"></div>
                <div class="col-md-2">
                    <img src="<%=p.getImgPath()%>" class="img-circle"  width="150" height="150">
                </div>
                <div class="col-md-8 show_info">
                    <form method="post">
                        <table border="0">
                           
                            <tr>
                                <td width="70px" valign="bottom" >
                                    Name
                                </td>
                                <td>    
                                    <input type="text" class="info-pat"  value="<%=p.getPatFname()%>" readonly>
                                </td>

                                <td width="100px" valign="bottom">    
                                    Last name
                                </td>
                                <td> 
                                    <input type="text" class="info-pat" value="<%=p.getPatLname()%>" readonly>
                                </td>
                            </tr>
                            <tr>
                                <td valign="bottom">
                                    Sex 
                                </td>
                                <td> 
                                    <input type="text" class="info-pat" placeholder="ไม่ได้ระบุเพศ" value="<%=p.getPatSex()%>" readonly>
                                </td>

                                <td valign="bottom">
                                    Age  
                                </td>
                                <td> 
                                    <input type="text" class="info-pat" placeholder="ไม่ทราบอายุ" value="<%=p.getPatAge()%>" readonly>
                                </td>
                            </tr>

                            <tr>
                                <td valign="bottom"> 
                                    แพ้ยา
                                </td>
                                <td>     
                                    <input type="text" class="info-pat" placeholder="ไม่มียาที่แพ้" value="<%=p.getUnderlying()%>" readonly></td>
                            </tr>

                        </table>


                    </form>

                </div>
                <div class="clearfix"></div>

                <!-------------โชวฺตารางเวลลาการส่งข้อมูลคนไข้------------>

                <div class="col-md-5 topicName">
                    <br>
                    &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp; &ensp; &ensp;
                    <b>List</b> Data Health 
                    <img class="dec_line"  src="Image/line_rectangle.png" width="220px">
                </div>


                <div class="clearfix"></div>




                <!------TABLE SHOW LIST PATIENT -------->


                <div class="col-md-1"></div>

                <div class="col-md-10" id="contentList" >
                    <br>
                    <table  class="table table-hover showTable">
                        <thead>
                            <tr  class="titleTable">
                                <td class="text-center" > NO </td>
                                <td class="text-center" >Date time</td>
                            </tr>
                        </thead>

                        <tbody>
                            <%
                                List<DataHealth> dhList = (List) request.getAttribute("dataList");
                                int i = 1;
                                if (dhList != null) {
                                    for (DataHealth dh : dhList) {

                            %>


                            <tr onclick="window.document.location = 'ShowDataHServlet?dhId=<%=dh.getDaId()%>';">
                                <td><%=i%></td>
                                <td><%=dh.getInfoDate()%></td>
                            </tr>
                            <%i++;
                                    }
                                }%>
                        </tbody>

                       
                    </table>
                        
                </div>
            </div>
        </div>

        <div class="clearfix"></div>
        <div class="footer">
            Copyright by abcdefghij 2017. All rights reserved.
        </div>


    </body>
</html>
