package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ShowGraph_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <!-- CSS tags -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/showGraphStyle.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!----font ---->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans|Prompt\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                font-family: 'Prompt','Open Sans', sans-serif;\n");
      out.write("                background-color: #fcfcfc\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Script tags-->\n");
      out.write("        <script src=\"js/jquery-3.2.0.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <title>Detail</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
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
      out.write("                <li>\n");
      out.write("                    <a href=\"/Test01/ShowPatientsServlet\" >รายชื่อผู้ป่วยทั้งหมด</a>\n");
      out.write("                </li>\n");
      out.write("                <li >\n");
      out.write("                    <a href=\"/Test01/ShowWaitDiagnosePatServlet\">รายชื่อผู้ป่วยรอการวินิฉัย </a>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <li><a href=\"#\">Logout</a></li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--------------End of menu tab-------------->\n");
      out.write("\n");
      out.write("        <!---------------Content-------------->\n");
      out.write("\n");
      out.write("        <div class=\"container\" >\n");
      out.write("            <div class=\"row allContent\" >\n");
      out.write("                <div class=\"col-md-5 mainTopic\" style=\"background-color:\">\n");
      out.write("                    <br>\n");
      out.write("                    &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;\n");
      out.write("\n");
      out.write("                    <b>ECG</b>Graph \n");
      out.write("\n");
      out.write("                    <img class=\"dec_line\"  src=\"Image/line_rectangle.png\" width=\"220px\">                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6 text-right sequenceLink\" >\n");
      out.write("                    <br><br>\n");
      out.write("                    <a href=\"/Test01/ShowPatientsServlet\">รายชื่อคนไข้ทั้งหมด</a> /<a href=\"#\"> ชื่อคนไข้</a> / ข้อมูล \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("                <!----------Show Graph---------->\n");
      out.write("\n");
      out.write("                <div class=\"col-md-1\"></div>\n");
      out.write("                <div class=\"col-md-10\">\n");
      out.write("                    <br>\n");
      out.write("\n");
      out.write("                    <img src=\"ECGgraph.jpg\" width=\"950\">\n");
      out.write("\n");
      out.write("                    <br><br><br>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("                <!----------Diagnose---------->\n");
      out.write("                <div class=\"col-md-5 mainTopic\">\n");
      out.write("                    <br>\n");
      out.write("                    &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;\n");
      out.write("                    <b>การ</b>วินิฉัย \n");
      out.write("                    <img class=\"dec_line\"  src=\"line_rectangle.png\"\n");
      out.write("                         width=\"220px\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-1\"></div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-3\"><br>\n");
      out.write("                    กราฟหัวใจมีความผิดปกติในเรื่องของ\n");
      out.write("                </div>\n");
      out.write("                <form>\n");
      out.write("                    <div class=\"col-md-6 checkArrhy\"><br>\n");
      out.write("\n");
      out.write("                        <input type=\"radio\" name=\"arrhyType\" value=\"gx\"> Arrhythmia  <br><br>\n");
      out.write("                        <input type=\"radio\" name=\"arrhyType\" value=\"gx\"> Bradyarrhythmia  <br><br>\n");
      out.write("                        <input type=\"radio\" name=\"arrhyType\" value=\"gx\"> Tachyarrhythmias  <br><br>\n");
      out.write("                        <input type=\"radio\" name=\"arrhyType\" value=\"gx\"> Irregular Heartbeat  <br><br>\n");
      out.write("                        <input type=\"radio\" name=\"arrhyType\" value=\"gx\"> Normal Heartbeat<br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                    <div class=\"col-md-1\"></div>\n");
      out.write("\n");
      out.write("                    <!-----------Comment----------->\n");
      out.write("                    <div class=\"col-md-8\"><br>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"comment\"> Comment:</label>\n");
      out.write("                            <textarea class=\"form-control\" rows=\"6\" id=\"comment\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                    <div class=\"col-md-1\"></div>\n");
      out.write("                    \n");
      out.write("                    <!---------button submit-------->\n");
      out.write("                    <div class=\"col-md-10 submit-btn\"><br>\n");
      out.write("                        <input formaction=\"ShowPats04.html\" type=\"submit\" value=\"Send Notification\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"clearfix\"></div>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            Copyright by abcdefghij 2017. All rights reserved.\n");
      out.write("        </div>\n");
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
