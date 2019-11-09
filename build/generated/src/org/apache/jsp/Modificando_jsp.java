package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Modificando_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Modificar</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

if (Integer.parseInt(request.getParameter("idRecibos"))!=0&&request.getParameter("Folio")!=null&&request.getParameter("Fecha")!=null&&request.getParameter("Apellidos")!=null&&request.getParameter("Nombre")!=null&&request.getParameter("Monto")!=null&&request.getParameter("Curso")!=null&&request.getParameter("Módulos")!=null&&request.getParameter("Nombre instructor")!=null&&request.getParameter("Clave del curso")!=null&&request.getParameter("Deposito referencia")!=null&&request.getParameter("Correo")!=null&&request.getParameter("Teléfono")!=null&&request.getParameter("Comentario")!=null){
  session.setAttribute("idRecibos", Integer.parseInt(request.getParameter("idRecibos")));            
        
      out.write("\n");
      out.write("        <table>\n");
      out.write("            <tbody>\n");
      out.write("            <form action=\"Actualizar.jsp\" method=\"post\">\n");
      out.write("                <tr>\n");
      out.write("                 <td>Folio:</td><td><input type=\"text\" name=\"Folio\" required=\"\" value=\"");
      out.print(request.getParameter("Folio") );
      out.write("\" ></td>\n");
      out.write("                </tr> <tr>\n");
      out.write("                <td>Fecha:</td><td><input type=\"text\" name=\"Fecha\" required=\"\" value=\"");
      out.print(request.getParameter("Fecha") );
      out.write("\" ></td>\n");
      out.write("                </tr> <tr>\n");
      out.write("                <td>Apellidos:</td><td><input type=\"text\" name=\"Apellidos\" required=\"\" value=\"");
      out.print(request.getParameter("Apellidos") );
      out.write("\" ></td>\n");
      out.write("                </tr> <tr>\n");
      out.write("                <td>Nombre:</td><td><input type=\"text\" name=\"Nombre\" required=\"\" value=\"");
      out.print(request.getParameter("Nombre") );
      out.write("\" ></td>\n");
      out.write("                </tr> <tr>\n");
      out.write("                <td>Monto:</td><td><input type=\"text\" name=\"Monto\" required=\"\" value=\"");
      out.print(request.getParameter("Monto") );
      out.write("\" ></td>\n");
      out.write("                </tr> <tr>\n");
      out.write("                <td>Curso:</td><td><input type=\"text\" name=\"Curso\" required=\"\" value=\"");
      out.print(request.getParameter("Curso") );
      out.write("\" ></td>\n");
      out.write("                </tr> <tr>\n");
      out.write("                <td>Módulo:</td><td><input type=\"text\" name=\"Modulo\" required=\"\" value=\"");
      out.print(request.getParameter("Módulos") );
      out.write("\" ></td>\n");
      out.write("                </tr> <tr>\n");
      out.write("                <td>Instructor:</td><td><input type=\"text\" name=\"Instructor\" required=\"\" value=\"");
      out.print(request.getParameter("Nombre instructor") );
      out.write("\" ></td>\n");
      out.write("                </tr> <tr>\n");
      out.write("                <td>Clave:</td><td><input type=\"text\" name=\"Clave\" required=\"\" value=\"");
      out.print(request.getParameter("Clave del curso") );
      out.write("\" ></td>\n");
      out.write("                </tr> <tr>\n");
      out.write("                <td>Deposito:</td><td><input type=\"text\" name=\"Deposito\" required=\"\" value=\"");
      out.print(request.getParameter("Deposito referencia") );
      out.write("\" ></td>\n");
      out.write("                </tr> <tr>\n");
      out.write("                <td>Correo:</td><td><input type=\"text\" name=\"Correo\" required=\"\" value=\"");
      out.print(request.getParameter("Correo") );
      out.write("\" ></td>\n");
      out.write("                </tr> <tr>\n");
      out.write("                <td>Teléfono:</td><td><input type=\"text\" name=\"Telefono\" required=\"\" value=\"");
      out.print(request.getParameter("Teléfono") );
      out.write("\" ></td>\n");
      out.write("                </tr> <tr>\n");
      out.write("                    <td>Comentario:</td><td><input type=\"text\" name=\"Comentario\" required=\"\" value=\"");
      out.print(request.getParameter("Comentario") );
      out.write("\" ></td> </tr>\n");
      out.write("                <tr>  <td></td> <td><input type=\"submit\" value=\"Enviar modificacion\"></td></tr>\n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("            ");
 } else System.out.println("no recibe nada");
                
      out.write(" \n");
      out.write("        </body>\n");
      out.write("        </table>\n");
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
