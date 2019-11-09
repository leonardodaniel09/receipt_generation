<%-- 
    Document   : exporfiltro3
    Created on : 15/07/2016, 07:27:29 PM
    Author     : LEONARDO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="java.io.*"%>
<%@page import="java.sql.*"%>
<%@page import="javax.servlet.ServletResponse"%>
<%@page import="Controlador.conexion"%>
<%@page import="Controlador.Consultas"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>

<%@page import="java.io.IOException"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="javax.servlet.ServletException"%>
<%@page import="javax.servlet.http.HttpServlet"%>
<%@page import="javax.servlet.http.HttpServletRequest"%>
<%@page import="javax.servlet.http.HttpServletResponse"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <link rel="stylesheet" href="css/estilotabla.css"/>
        <title>Excel</title>
    </head>
    <body>
        <center>
        <h1>REGISTROS DE LOS RECIBOS</h1>
        
        <table border="1" cellspacing="0">
            <tr>
                <th>Folio</th>
                <th>Fecha</th>
                <th>Apellidos</th>
                <th>Nombre</th>
                <th>Monto</th>
                <th>Curso</th>
                <th>Modulos</th>
                <th>Clave del curso</th>
                <th>Deposito referencia</th>
                <th>Correo</th>
                <th>Telefono</th>
                <th>Comentario</th>
                
            </tr>
            <% 
            // response.setHeader("Content-Disposition", "attachment;filename=\"recibosdeldia.xls\"");
        
            String foltro =request.getParameter("filtro");
            conexion c=new conexion();
            c.getconexion();
            PreparedStatement pst=null;
            ResultSet rs=null;
       
            String consulta="SELECT Folio,Fecha,Apellidos,Nombre,Monto,Curso,Modulos,Clave_del_Curso_o_Diplomado,Deposito_Referencia,Correo,Telefono,Comentario  FROM recibos where  Nombre ='"+foltro+"'";
            pst=(c.getconexion()).prepareStatement(consulta);
            rs=pst.executeQuery();
            
       while (rs.next()){

          %>
          <tr>
              <td><%=rs.getString(1)%></td>
              <td><%=rs.getString(2)%></td>
              <td><%=rs.getString(3)%></td>
              <td><%=rs.getString(4)%></td>
              <td><%=rs.getString(5)%></td>
              <td><%=rs.getString(6)%></td>
              <td><%=rs.getString(7)%></td>
              <td><%=rs.getString(8)%></td>
              <td><%=rs.getString(9)%></td>
              <td><%=rs.getString(10)%></td>
              <td><%=rs.getString(11)%></td>
              <td><%=rs.getString(12)%></td>
          </tr> 
            <%  }
            %>
        </table>
        <br>
        <a  href="filtronombre.jsp">Regresar</a> 
    </body>
</html>
