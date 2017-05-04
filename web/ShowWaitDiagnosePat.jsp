<%-- 
    Document   : ShowWaitDiagnosePat
    Created on : May 4, 2017, 8:03:57 PM
    Author     : User
--%>

<%@page import="model.Patient"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
           List<Patient> pl =(List) request.getAttribute("patDia");
           if(pl !=null){
               for(Patient pa : pl){
           
       %>
        
       NAME : <%=pa.getPatFname()%>  <br>
       LASTNAME : <%=pa.getPatLname()%> <br>
       DATE : <%=pa.getInfoDate()%> <br><br>
       
       
       <%}}%>
       
       
    </body>
</html>
