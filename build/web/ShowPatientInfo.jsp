<%-- 
    Document   : ShowPatientInfo
    Created on : Apr 29, 2017, 5:12:15 PM
    Author     : User
--%>

<%@page import="model.Patient"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <%
            Patient dh = (Patient) request.getAttribute("infoPat");
        %>
        
        	Date that sent <%=dh.getPatFname()%> <br>
        
        
    </body>
</html>
