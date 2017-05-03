package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import model.Patient;

public final class ShowPatients_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <!-- CSS tags -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/ShowPatientsStyle.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Font -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Script tags-->\n");
      out.write("        <script src=\"js/jquery-3.2.0.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                font-family: 'Open Sans', sans-serif;\n");
      out.write("                background-color: #fcfcfc\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <title>Patient List</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!----------Navbar-------->\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid navmenu\" style=\"padding-right: 0px; padding-left: 0px;\">\n");
      out.write("\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\" style=\"padding-top: 8px;\">\n");
      out.write("                <img alt=\"Brand\" src=\"Image/logotypr05.png\" width=\"230\">\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("            <ul class=\"nav nav-pills nav-justified\" id=\"menu\">\n");
      out.write("                <li></li>\n");
      out.write("                <li></li>\n");
      out.write("                <li></li>\n");
      out.write("                <li></li>\n");
      out.write("                <li><a href=\"#\">Home </a></li>\n");
      out.write("                <li><a href=\"/Test01/ShowPatientsServlet\" style=\"color:#44cef2\">List Patient</a></li>\n");
      out.write("                <li><a href=\"#\">Register</a></li>\n");
      out.write("                <li><a href=\"#\">Edit Profile</a></li>\n");
      out.write("                <li><a href=\"#\">Logout</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("        <div class=\"container\" >\n");
      out.write("            <div class=\"row allContent\" >\n");
      out.write("                <div class=\"col-md-4\"></div>\n");
      out.write("                <div class=\"col-md-4 titleHeader\">\n");
      out.write("                    <br>\n");
      out.write("                    <b>Patient</b> List\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\"></div>\n");
      out.write("\n");
      out.write("                <div class=\"clearfix\"></div> \n");
      out.write("\n");
      out.write("                <!------TABLE SHOW LIST PATIENT -------->\n");
      out.write("                <div class=\"col-md-1\"></div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-10\" id=\"contentList\" >\n");
      out.write("                    <br><br>\n");
      out.write("                    <table  class=\"table table-hover showListPat\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr  class=\"titleTable\">\n");
      out.write("                                <td class=\"text-center\" > PATIENT NO </td>\n");
      out.write("                                <td class=\"text-center\">FIRST NAME</td>\n");
      out.write("                                <td class=\"text-center\">LAST NAME</td>\n");
      out.write("                                <td class=\"text-center\">SENT DATE</td>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("\n");
      out.write("                        <tbody>\n");
      out.write("                            ");

                                List<Patient> plist = (List) request.getAttribute("patientList");
                                if (plist != null) {
                                    for (Patient pa : plist) {
                            
      out.write("\n");
      out.write("                            <tr onclick=\"window.document.location = 'ShowListDataHealthServlet?idPat=");
      out.print(pa.getPatId());
      out.write("';\">\n");
      out.write("                                <!--<input type=\"hidden\" value=\"");
      out.print(pa.getPatId());
      out.write("\" name=\"idPat\">-->\n");
      out.write("                                <td>");
      out.print(pa.getPatId());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(pa.getPatFname());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(pa.getPatLname());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(pa.getInfoDate());
      out.write("</td>\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            ");
}
                                } else {
                                    System.out.println("no info");
                                }
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"clearfix\"></div>\n");
      out.write("         <div class=\"footer\">\n");
      out.write("            Copyright by abcdefghij 2017. All rights reserved.\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
