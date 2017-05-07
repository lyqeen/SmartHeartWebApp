<%-- 
    Document   : ShowPatients
    Created on : Apr 29, 2017, 3:42:42 PM
    Author     : User
--%>

<%@page import="java.util.List"%>
<%@page import="model.Patient"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- CSS tags -->
        <link rel="stylesheet" type="text/css" href="css/ShowPatientsStyle.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">

        <!-- Font -->
         <link href="https://fonts.googleapis.com/css?family=Open+Sans|Prompt" rel="stylesheet">


        <!-- Script tags-->
        <script src="js/jquery-3.2.0.min.js"></script>
        <script src="js/bootstrap.min.js"></script>


         <style>
            body {
                font-family: 'Prompt','Open Sans', sans-serif;
                background-color: #fcfcfc
            }
        </style>


        <title>Patient List</title>
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
                <li></a></li>
                <li><a href="/Test01/ShowPatientsServlet" style="color:#44cef2"> รายชื่อผู้ป่วยทั้งหมด </a></li>
                <li><a href="/Test01/ShowWaitDiagnosePatServlet"> ผู้ป่วยรอการวินิจฉัย </a></li>
                <li><a href="/Test01/LogoutServlet">Logout</a></li>
            </ul>
        </div>

        <div class="clearfix"></div>

        <div class="container" >
            <div class="row allContent" >
                <div class="col-md-4"></div>
                <div class="col-md-4 titleHeader">
                    <br>
                    <b>Patient</b> List
                    <img class="dec_line" src="Image/line_diamon.png">
                </div>
                <div class="col-md-4"></div>

                <div class="clearfix"></div> 

                <!------TABLE SHOW LIST PATIENT -------->
                <div class="col-md-1"></div>

                <div class="col-md-10" id="contentList" >
                    <br><br>
                    <table  class="table table-hover showListPat">
                        <thead>
                            <tr  class="titleTable">
                                <td class="text-center" > PATIENT NO </td>
                                <td class="text-center">FIRST NAME</td>
                                <td class="text-center">LAST NAME</td>
                                <td class="text-center">SENT DATE</td>
                                
                            </tr>
                        </thead>

                        <tbody>
                            <%
                                List<Patient> plist = (List) request.getAttribute("patientList");
                                if (plist != null) {
                                    for (Patient pa : plist) {
                            %>
                            <tr onclick="window.document.location = 'ShowListDataHealthServlet?idPat=<%=pa.getPatId()%>';">
                                <!--<input type="hidden" value="<%=pa.getPatId()%>" name="idPat">-->
                                <td><%=pa.getPatId()%></td>
                                <td><%=pa.getPatFname()%></td>
                                <td><%=pa.getPatLname()%></td>
                                <td><%=pa.getInfoDate()%></td>
                          
                            </tr>

                            <%}
                                } else {
                                    System.out.println("no info");
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
