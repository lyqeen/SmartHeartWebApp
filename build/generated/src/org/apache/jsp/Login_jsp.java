package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <!-- CSS tags -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/LoginStyle.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                font-family: 'Open Sans', sans-serif;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Script tags-->\n");
      out.write("        <script src=\"js/jquery-3.2.0.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <title>Login</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <center>\n");
      out.write("                <div class=\"middle\">\n");
      out.write("                    <div id=\"login\">\n");
      out.write("\n");
      out.write("                        <form action=\"javascript:void(0);\" method=\"post\">\n");
      out.write("\n");
      out.write("                            <fieldset class=\"clearfix\">\n");
      out.write("\n");
      out.write("                                <p ><span class=\"fa fa-user\"></span><input type=\"text\"  Placeholder=\"Username\" required></p> <!-- JS because of IE support; better: placeholder=\"Username\" -->\n");
      out.write("                                <p><span class=\"fa fa-lock\"></span><input type=\"password\"  Placeholder=\"Password\" required></p> <!-- JS because of IE support; better: placeholder=\"Password\" -->\n");
      out.write("\n");
      out.write("                                <div>\n");
      out.write("                                    <span style=\"width:48%; text-align:left;  display: inline-block;\"><a class=\"small-text\" href=\"#\"></a></span>\n");
      out.write("                                    <span style=\"width:50%; text-align:right;  display: inline-block;\"><input type=\"submit\" value=\" Log In \" formaction=\"ShowPats04.html\"></span>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </fieldset>\n");
      out.write("                            <div class=\"clearfix\"></div>\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("                    </div> <!-- end login -->\n");
      out.write("                    <div class=\"logo\">LOGO\n");
      out.write("\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </center>\n");
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
