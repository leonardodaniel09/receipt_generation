<%-- 
    Document   : ReporteDelDia
    Created on : 11/07/2016, 12:17:25 PM
    Author     : LEONARDO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="java.io.*"%>
<%@page import="java.sql.*"%>
<%@page import="Controlador.conexion"%>
<%@page import="Controlador.Consultas"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <link rel="stylesheet" href="css/estilotabla.css"/>
        
        
        <script>
            function Excel(){
              vExcel = window.open("ExcelReportegeneral.jsp","","status=0,location=0,menubar=0,width=400,height=200");  
            }
        </script>
        <title>Reporte del dia</title>
    </head>
    <body>
       
        <center>
        <h1>REPORTE GENERAL</h1>
        <table class=" jtabla" border="1" cellspacing="0">
            <tr>
                <th>Nº del trabajador</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Cargo</th>
                <th>Vehículo</th>
                <th>Galones vendidos</th>
                <th>Viajes dados</th>
                
            </tr>
            <% 
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
              <td title="N° del trabajador"><%=rs.getString(1)%></td>
              <td title="Nombre"><%=rs.getString(2)%></td>
              <td title="Apellido"><%=rs.getString(3)%></td>
              <td title="Cargo"><%=rs.getString(4)%></td>
              <td title="Vehículo"><%=rs.getString(5)%></td>
              <td title="Galones vendidos"><%=rs.getString(6)%></td>
              <td title="Viajes dados"><%=rs.getString(7)%></td>
          </tr> 
            <%  }
            %>
        </table>
        <br>  
        
        <input class="boton" type="button" value="Descargar a Excel"  name="btn_Excel" onclick="Excel()"/>
         <br> 
        <a  href="cuentaAdmon.jsp">Regresar</a>
        
    </body>
</html>
