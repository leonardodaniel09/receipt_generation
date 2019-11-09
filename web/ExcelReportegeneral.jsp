<%-- 
    Document   : ExcelReporteDelDia
    Created on : 15/07/2016, 12:41:40 PM
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
        <h1>REPORTE DEL DIA</h1>
        <table border="1" cellspacing="0">
            <tr>
                <th>N Del Trabajados</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Cargo</th>
                <th>Vehiculo</th>
                <th>Galones Vendidos</th>
                <th>Viajes Dados</th>
                
            </tr>
            <% 
            response.setHeader("Content-Disposition", "attachment;filename=\"Reporte general.xls\"");
            conexion co=new conexion();
            co.getconexion();
            PreparedStatement pst=null;
            ResultSet rs=null;
       
            String consulta="select idRegistrar_trabajador, Nombre, Apellido_Paterno, Cargo, Vehiculo, Galones_Vendidos, Viajes_Dados from trabajadores, ventas where trabajadores.idRegistrar_trabajador = ventas.Trabajadores_idRegistrar_trabajador ";
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
          </tr> 
            <%  }
            %>
        </table>
    </body>
</html>
