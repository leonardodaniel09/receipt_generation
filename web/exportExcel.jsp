<%-- 
    Document   : exportExcel
    Created on : 15/07/2016, 11:14:10 AM
    Author     : LEONARDO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Controlador.conexion"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.*"%>
<%@page import="java.io.*"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Excel</title>
    </head>
    <body>
        
        <center>
        <h1>RECIBOS DE EDUCACIÓN CONTINUA</h1>
        <table border="1" cellspacing="0">
            <tr>
                <th>id Recibos</th>
                <th>Folio</th>
                <th>Fecha</th>
                <th>Apellidos</th>
                <th>Nombre</th>
                <th>Monto</th>
                <th>Curso</th>
                <th>Módulos</th>
                <th>Nombre instructor</th>
                <th>Clave del curso</th>
                <th>Deposito referencia</th>
                <th>Correo</th>
                <th>Teléfono</th>
                <th>Comentario</th>
                
            </tr>
            <% 
            response.setHeader("Content-Disposition", "attachment;filename=\"recibosgeneral.xls\"");
            conexion co=new conexion();
            co.getconexion();
            PreparedStatement pst=null;
            ResultSet rs=null;
       
            String consulta="SELECT * FROM recibos";
            pst=(co.getconexion()).prepareStatement(consulta);
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
              <td><%=rs.getString(13)%></td>
              <td><%=rs.getString(14)%></td>
          </tr> 
            <%  }
            %>
        </table>
        </center>
    </body>
</html>
