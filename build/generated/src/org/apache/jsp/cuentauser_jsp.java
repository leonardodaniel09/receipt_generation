package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cuentauser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"css/stylepe.css\"/>\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("       <form action=\"ventasU\" method=\"post\" class=\"form-register\">\n");
      out.write("                <h2 class=\"form__titulo\">RECIBOS EDUCACION CONTINUA</h2>\n");
      out.write("                <div class=\"contenedor-inputs\">\n");
      out.write("                    <p class=\"input-48\">Folio</p>\n");
      out.write("                    <input type=\"text\" name=\"folio\" placeholder=\"Folio\" class=\"input-48\" />  \n");
      out.write("                    <p class=\"input-48\">Apellidos</p>\n");
      out.write("                    <input type=\"text\" name=\"apellidos\" placeholder=\"Apelidos\" class=\"input-48\" />\n");
      out.write("                    <p class=\"input-48\">Nombre</p>\n");
      out.write("                    <input type=\"text\" name=\"nombre\" placeholder=\"Nombre\" class=\"input-48\" />\n");
      out.write("                    <p class=\"input-48\">Monto</p>\n");
      out.write("                    <input type=\"text\" name=\"monto\" placeholder=\"Monto\" class=\"input-48\" />\n");
      out.write("                    <p class=\"input-48\">Curso</p>\n");
      out.write("                    <input type=\"text\" name=\"curso\" placeholder=\"Curso\" class=\"input-48\" />\n");
      out.write("                    <p class=\"input-48\">Modulos</p>\n");
      out.write("                    <input type=\"text\" name=\"modulos\" placeholder=\"Modulos\" class=\"input-48\" />\n");
      out.write("                    <p class=\"input-48\">Clave del curso o diplomado</p>\n");
      out.write("                    <input type=\"text\" name=\"clave del curso o diplomado\" placeholder=\"Clave del curso o diplomado\" class=\"input-48\" />\n");
      out.write("                    <p class=\"input-48\">Deposito referencia</p>\n");
      out.write("                    <input type=\"text\" name=\"deposito referencia\" placeholder=\"Deposito referenccia\" class=\"input-48\" />\n");
      out.write("                    <p class=\"input-48\">Correo</p>\n");
      out.write("                    <input type=\"text\" name=\"correo\" placeholder=\"Correo\" class=\"input-48\" />\n");
      out.write("                    <p class=\"input-48\">Telefono</p>\n");
      out.write("                    <input type=\"text\" name=\"telefono\" placeholder=\"Telefono\" class=\"input-48\" />\n");
      out.write("                    <p class=\"input-48\">Comentario</p>\n");
      out.write("                    <input type=\"text\" name=\"comentario\" placeholder=\"Comentario\" class=\"input-48\" />\n");
      out.write("                    <p class=\"input-48\">Galones vendidos</p>\n");
      out.write("                    <input type=\"text\" name=\"galones\" placeholder=\"Galones\" class=\"input-48\" />\n");
      out.write("                    <p class=\"input-48\">Precio</p>\n");
      out.write("                    <input type=\"text\" name=\"precio\" placeholder=\"Precio\" class=\"input-48\" />         \n");
      out.write("                    <p class=\"input-48\">Vehiculo</p>\n");
      out.write("                    <input type=\"text\" name=\"vehiculo\" placeholder=\"Vehículo\" class=\"input-48\" />\n");
      out.write("                    <p class=\"input-48\">Viajes dados</p>\n");
      out.write("                    <input type=\"text\" name=\"viajes\" placeholder=\"Viajes dados\" class=\"input-48\" />\n");
      out.write("                    <p class=\"input-48\">Ingrese su N° de usuario </p>\n");
      out.write("                    <input type=\"text\" name=\"Nusuario\" placeholder=\"Numero de usuario\" class=\"input-48\" />\n");
      out.write("                    <p class=\"input-48\">Registra la fecha de hoy</p>\n");
      out.write("                    <input type=\"text\" name=\"Fecha\" placeholder=\"aaaa-mm-dd\" class=\"input-48\" />\n");
      out.write("     \n");
      out.write("                    <a href=\"VerPedidosUser.jsp\"> Ver pedidos </a>\n");
      out.write("                    <input type=\"submit\" value=\"Enviar\"/>\n");
      out.write("                    <a href=\"index.jsp\">Cerrar Sesión</a>\n");
      out.write("                </div>               \n");
      out.write("            </form>\n");
      out.write("        \n");
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
