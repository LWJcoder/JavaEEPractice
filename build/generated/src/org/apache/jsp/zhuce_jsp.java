package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class zhuce_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>注册页面</title>\n");
      out.write("        <style>\n");
      out.write("            .info{\n");
      out.write("                margin:3% 43%;\n");
      out.write("            }            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 style=\"text-align: center\">欢迎注册</h1>\n");
      out.write("        \n");
      out.write("<form method=\"post\" action=\"zhuce\">\n");
      out.write("\t<div class=\"info\">\n");
      out.write("\t\t<label for=\"username\">用户名:</label>\n");
      out.write("\t\t<input type=\"text\" id=\"username\" name=\"username\" class=\"required\" />\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"info\">\n");
      out.write("\t\t<label for=\"personinfo\">密码:</label>\n");
      out.write("\t\t<input type=\"password\" id=\"password\" name=\"password\"  class=\"required\" />\n");
      out.write("\t</div>\n");
      out.write("    \n");
      out.write("    \t<div class=\"info\">\n");
      out.write("\t\t<label for=\"email\">邮箱:</label>\n");
      out.write("\t\t<input type=\"text\" id=\"email\" name=\"email\" />\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"info\">\n");
      out.write("            <input type=\"submit\" value=\"提交\" id=\"send\" name=\"Submit2\"/>\n");
      out.write("                <input type=\"reset\" id=\"res\"/>\n");
      out.write("\t</div>\n");
      out.write("</form>\n");
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
