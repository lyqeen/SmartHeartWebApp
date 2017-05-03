package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <!-- CSS tags -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/home02.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("\n");
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
      out.write("        <title>Home</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!----------Navbar-------->\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid navmenu\" style=\"padding-right: 0px; padding-left: 0px;\">\n");
      out.write("\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\" style=\"padding-top: 8px;\">\n");
      out.write("                <img alt=\"Brand\" src=\"logotypr05.png\" width=\"230\">\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("            <ul class=\"nav nav-pills nav-justified\" id=\"menu\">\n");
      out.write("                <li></li>\n");
      out.write("                <li></li>\n");
      out.write("                <li></li>\n");
      out.write("                <li></li>\n");
      out.write("                <li><a href=\"#\" style=\"color:#44cef2\">Home </a></li>\n");
      out.write("                <li><a href=\"/Test01/ShowPatientsServlet\" >List Patient</a></li>\n");
      out.write("                <li><a href=\"#\">Register</a></li>\n");
      out.write("                <li><a href=\"#\">Edit Profile</a></li>\n");
      out.write("                <li><a href=\"#\">Logout</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <img src=\"Image/female-doctor-at-desk-508387030-w.jpg\" width=\"1349px\">\n");
      out.write("\n");
      out.write("                <div class=\"col-md-1\" one></div>\n");
      out.write("                <div class=\"col-md-10\">\n");
      out.write("                    <div class=\"col-md-4 regis\">\n");
      out.write("                        <br>\n");
      out.write("                        <span class=\"reg\">REGISTER</span><br>\n");
      out.write("                        <span class=\"content\">\n");
      out.write("                            สมัครสมาชิกให้ผู้ป่วยของคุณ เพื่อใช้งานระบบ</span>\n");
      out.write("                        <br>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-4 patient\"> \n");
      out.write("\n");
      out.write("                        <div class=\"col-md-5 asd\"  >\n");
      out.write("                            <br><span class=\"titleTopic\"><b>NUMBER</b> OF YOUR PATIENT<br></span>\n");
      out.write("                        </div> \n");
      out.write("                        <div class=\"col-md-7 num\">\n");
      out.write("                            <br><p class=\"count numberC\">127</p>\n");
      out.write("                        </div>                  \n");
      out.write("\n");
      out.write("                        <script>\n");
      out.write("                            $('.count').each(function () {\n");
      out.write("                                $(this).prop('Counter', 0).animate({\n");
      out.write("                                    Counter: $(this).text()\n");
      out.write("                                }, {\n");
      out.write("                                    duration: 2900,\n");
      out.write("                                    easing: 'swing',\n");
      out.write("                                    step: function (now) {\n");
      out.write("                                        $(this).text(Math.ceil(now));\n");
      out.write("                                    }\n");
      out.write("                                });\n");
      out.write("                            });\n");
      out.write("                        </script>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-4 regis\"> \n");
      out.write("                        <br>\n");
      out.write("                        Emergency Patient<br>\n");
      out.write("\n");
      out.write("                        <p>Hwangminhyun, Kang Dongho, Park Woojin, Jung Sewoon ii</p><br>\n");
      out.write("                    </div>    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            Copyright by abcdefghij 2017. All rights reserved.\n");
      out.write("        </div>\n");
      out.write("\n");
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
