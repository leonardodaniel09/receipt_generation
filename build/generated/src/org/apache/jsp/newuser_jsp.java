package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newuser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      out.write("        <title>Registrar</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilos.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form  action=\"registroT\" method=\"post\" class=\"form-register\" >\n");
      out.write("                <h2 class=\"form__titulo\">CREAR UNA CUENTA DEL TRABAJADOR</h2>\n");
      out.write("                <div class=\"contenedor-inputs\">\n");
      out.write("                    \n");
      out.write("                    <input type=\"text\" placeholder=\"Nombre\" name=\"nombre\" class=\"input-48\"   />\n");
      out.write("                    <input type=\"text\"  placeholder=\"Apellido paterno\" name=\"apellidoP\" class=\"input-48\" />\n");
      out.write("                    <input type=\"text\"  placeholder=\"Apellido materno\" name=\"apellidom\" class=\"input-48\" />\n");
      out.write("                    <input type=\"number\"  placeholder=\"Teléfono\" name=\"tel\" class=\"input-48\" />\n");
      out.write("                    <input type=\"text\"  placeholder=\"Dirección\" name=\"direcc\" class=\"input-100\" />\n");
      out.write("                    <input type=\"text\"  placeholder=\"Usuario\" name=\"nombreuser\" class=\"input-48\" />\n");
      out.write("                    <input type=\"password\"  placeholder=\"Contraseña\" name=\"contrasenia\" class=\"input-48\" />\n");
      out.write("                    <input type=\"text\" placeholder=\"Cargo\" name=\"cargo\"class=\"input-100\"  />\n");
      out.write("\n");
      out.write("                   <!-- <h3 class=\"input-42\">Sexo</h3>-->\n");
      out.write("                    <input type=\"text\"  placeholder=\"Sexo\" name=\"sexo\" class=\"input-48\"  />\n");
      out.write("                    <!--<label class=\"input-41\" for=\"mujer\">F </label>\n");
      out.write("                    <input class=\"input-43\" type=\"checkbox\" name=\"sexo\" id=\"hombre\" value=\"M\"/>\n");
      out.write("                    <label class=\"input-41\" for=\"hombre\">M </label>-->\n");
      out.write("                    <input type=\"number\"  placeholder=\"Edad\"  name=\"edad\" class=\"input-48\"/>\n");
      out.write("                    <input type=\"submit\" value=\"Guardar\" />\n");
      out.write("                    <a href=\"#\">Regresar </a>\n");
      out.write("                    <a href=\"cuentaAdmon.jsp\">Principal </a>\n");
      out.write("                    \n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                 \n");
      out.write("            </form>\n");
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
