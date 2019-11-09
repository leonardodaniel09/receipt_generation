package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Controlador.Recibo;
import java.util.*;
import java.io.*;
import java.sql.*;
import javax.servlet.ServletResponse;
import Controlador.conexion;
import Controlador.Consultas;
import java.sql.Connection;
import java.sql.ResultSet;

public final class editar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilotabla.css\"/>\n");
      out.write("       \n");
      out.write("        <title>Registros de los recibos</title>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h1>RECIBOS DE EDUCACIÓN CONTINUA</h1>\n");
      out.write("        \n");
      out.write("         <table border=\"1\" cellspacing=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <th>id Recibos</th>\n");
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
 
            conexion co=new conexion();
            co.getconexion();
            PreparedStatement pst=null;
            ResultSet rs=null;
            
            
            List<Recibo> recibo=new ArrayList<Recibo>();
            try { 
            String consulta="SELECT idRecibos,Folio,Fecha,Apellidos,Nombre,Monto,Curso,Modulos,Nom_Instructor,Clave_del_Curso_o_Diplomado,Deposito_Referencia,Correo,Telefono,Comentario FROM recibos";
            pst=(co.getconexion()).prepareStatement(consulta);
            rs=pst.executeQuery();                 
        while(rs.next()){
            Recibo us=new Recibo(rs.getInt("idRecibos"), rs.getString("Folio"), rs.getString("Fecha"), rs.getString("Apellidos"), rs.getString("Nombre"), rs.getString("Monto"), rs.getString("Curso"), rs.getString("Modulos"), rs.getString("Nom_Instructor"), rs.getString("Clave_del_Curso_o_Diplomado"), rs.getString("Deposito_Referencia"), rs.getString("Correo"), rs.getString("Telefono"), rs.getString("Comentario"));
            recibo.add(us);
        }
        pst.close();
        
        } catch (Exception e) {
           
        }
            
       for (int i=0; i<recibo.size(); i++){

          
      out.write("\n");
      out.write("          <tr>\n");
      out.write("              <td>");
      out.print(recibo.get(i).getId_Recibos());
      out.write("</td>\n");
      out.write("              <td>");
      out.print(recibo.get(i).getFolio());
      out.write("</td>\n");
      out.write("              <td>");
      out.print(recibo.get(i).getFecha());
      out.write("</td>\n");
      out.write("              <td>");
      out.print(recibo.get(i).getApellidos());
      out.write("</td>\n");
      out.write("              <td>");
      out.print(recibo.get(i).getNombre());
      out.write("</td>\n");
      out.write("              <td>");
      out.print(recibo.get(i).getMonto());
      out.write("</td>\n");
      out.write("              <td>");
      out.print(recibo.get(i).getCurso());
      out.write("</td>\n");
      out.write("              <td>");
      out.print(recibo.get(i).getModulos());
      out.write("</td>\n");
      out.write("              <td>");
      out.print(recibo.get(i).getNominstructor());
      out.write("</td>\n");
      out.write("              <td>");
      out.print(recibo.get(i).getClavecurso());
      out.write("</td>\n");
      out.write("              <td>");
      out.print(recibo.get(i).getDeposito());
      out.write("</td>\n");
      out.write("              <td>");
      out.print(recibo.get(i).getCorreo());
      out.write("</td>\n");
      out.write("              <td>");
      out.print(recibo.get(i).getTelefono());
      out.write("</td>\n");
      out.write("              <td>");
      out.print(recibo.get(i).getComentario());
      out.write("</td>\n");
      out.write("               <td ><a href=\"Modificando.jsp?idRecibos=");
      out.print(recibo.get(i).getId_Recibos());
      out.write("&&folio=");
      out.print(recibo.get(i).getFolio());
      out.write("&&fecha=");
      out.print(recibo.get(i).getFecha());
      out.write("&&apellidos=");
      out.print(recibo.get(i).getApellidos());
      out.write("&&nombre=");
      out.print(recibo.get(i).getNombre());
      out.write("&&monto=");
      out.print(recibo.get(i).getMonto());
      out.write("&&curso=");
      out.print(recibo.get(i).getCurso());
      out.write("&&modulo=");
      out.print(recibo.get(i).getModulos());
      out.write("&&nom_instructor=");
      out.print(recibo.get(i).getNominstructor());
      out.write("&&clave=");
      out.print(recibo.get(i).getClavecurso());
      out.write("&&deposito_referencia=");
      out.print(recibo.get(i).getDeposito());
      out.write("&&correo=");
      out.print(recibo.get(i).getCorreo());
      out.write("&&telefono=");
      out.print(recibo.get(i).getTelefono());
      out.write("&&comentario=");
      out.print(recibo.get(i).getComentario());
      out.write("\">Modificar</a></td>\n");
      out.write("                           \n");
      out.write("          </tr> \n");
      out.write("            ");
  }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("        <br>\n");
      out.write("        <br>        \n");
      out.write("        <a  href=\"Opciones.jsp\">Regresar</a> \n");
      out.write("        </center>\n");
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
