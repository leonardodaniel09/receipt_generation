package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.io.*;
import java.sql.*;
import javax.servlet.ServletResponse;
import Controlador.conexion;
import Controlador.Consultas;
import java.sql.Connection;
import java.sql.ResultSet;

public final class tabla_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilotabla.css\"/>\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <center>\n");
      out.write("        <h1>RECIBOS DE EDUCACIÓN CONTINUA</h1>\n");
      out.write("        <table class=\"jtabla\" border=\"1\" cellspacing=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Folio</th>\n");
      out.write("                <th>Fecha</th>\n");
      out.write("                <th>Apellidos</th>\n");
      out.write("                <th>Nombre</th>\n");
      out.write("                <th>Monto</th>\n");
      out.write("                <th>Curso</th>\n");
      out.write("                <th>Módulos</th>\n");
      out.write("                <th>Nombre instructor</th>\n");
      out.write("                <th>Clave del curso</th>\n");
      out.write("                <th>Deposito referencia</th>\n");
      out.write("                <th>Correo</th>\n");
      out.write("                <th>Teléfono</th>\n");
      out.write("                <th>Comentario</th>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            ");
 
            String foltro =request.getParameter("filtro");
            conexion co=new conexion();
            co.getconexion();
            PreparedStatement pst=null;
            ResultSet rs=null;
       
            String consulta="SELECT Folio,Fecha,Apellidos,Nombre,Monto,Curso,Modulos,Nom_Instructor,Clave_del_Curso_o_Diplomado,Deposito_Referencia,Correo,Telefono,Comentario FROM recibos where  Modulos like '"+foltro+"%'";
            pst=(co.getconexion()).prepareStatement(consulta);
            rs=pst.executeQuery();
            
       while (rs.next()){

          
      out.write("\n");
      out.write("          <tr>\n");
      out.write("              <td title=\"Folio\">");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("              <td title=\"Fecha\">");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("              <td title=\"Apellidos\">");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("              <td title=\"Nombre\">");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("              <td title=\"Monto\">");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("              <td title=\"Curso\">");
      out.print(rs.getString(6));
      out.write("</td>\n");
      out.write("              <td title=\"Módulos\">");
      out.print(rs.getString(7));
      out.write("</td>\n");
      out.write("              <td title=\"Nombre instructor\">");
      out.print(rs.getString(8));
      out.write("</td>\n");
      out.write("              <td title=\"Clave del curso\">");
      out.print(rs.getString(9));
      out.write("</td>\n");
      out.write("              <td title=\"Deposito referencia\">");
      out.print(rs.getString(10));
      out.write("</td>\n");
      out.write("              <td title=\"Correo\">");
      out.print(rs.getString(11));
      out.write("</td>\n");
      out.write("              <td title=\"Teléfono\">");
      out.print(rs.getString(12));
      out.write("</td>\n");
      out.write("              <td title=\"Comentario\">");
      out.print(rs.getString(13));
      out.write("</td>\n");
      out.write("          </tr> \n");
      out.write("            ");
  }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("        <br> \n");
      out.write("        <a  href=\"filtromodulos.jsp\">Regresar</a> \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
