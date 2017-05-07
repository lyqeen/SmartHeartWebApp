<%-- 
    Document   : ShowDataH
    Created on : Apr 30, 2017, 2:05:56 PM
    Author     : User
--%>

<%@page import="model.DataHealth"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show DataHealth</title>
    </head>
    <body>
        
        
        <%
            DataHealth dh = (DataHealth) request.getAttribute("dataH");
        %>
        
        	Date that sent <%=dh.getInfoDate()%> <br>
                Systolic <%=dh.getSystolic()%><br>
                Diastolic <%=dh.getDiastolic()%> <br>
                Weight <%=dh.getWeight()%><br>
                Heart Rate <%=dh.getHeartRate()%> <br>
        
        
        
    </body>
</html>
