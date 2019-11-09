<%-- 
    Document   : ecxel
    Created on : 13/07/2016, 10:38:48 PM
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

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <link rel="stylesheet" href="css/estilotabla.css"/>
        <script>
            function aExcel(){
              vExcel = window.open("exportExcel.jsp","","status=0,location=0,menubar=0,width=400,height=200");  
            }
        </script>
        <title>Registros de los recibos</title>
        
    </head>
    <body>
    <center>
        <h1>RECIBOS DE EDUCACIÓN CONTINUA</h1>
        
        <table class="jtabla" border="1" cellspacing="0">
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
              <td title="id Recibos"><%=rs.getString(1)%></td>
              <td title="Folio"><%=rs.getString(2)%></td>
              <td title="Fecha"><%=rs.getString(3)%></td>
              <td title="Apellidos"><%=rs.getString(4)%></td>
              <td title="Nombre"><%=rs.getString(5)%></td>
              <td title="Monto"><%=rs.getString(6)%></td>
              <td title="Curso"><%=rs.getString(7)%></td>
              <td title="Módulos"><%=rs.getString(8)%></td>
              <td title="Nombre instructor"><%=rs.getString(9)%></td>
              <td title="Clave del curso"><%=rs.getString(10)%></td>
              <td title="Deposito referencia"><%=rs.getString(11)%></td>
              <td title="Correo"><%=rs.getString(12)%></td>
              <td title="Teléfono"><%=rs.getString(13)%></td>
               <td title="Comentario"><%=rs.getString(14)%></td> 
          </tr> 
            <%  }
            %>
        </table>
        <br>
        <br>        
        <input class="boton" type="button" value="Descargar a Excel"  name="btn_Excel" onclick="aExcel()"/>
         <br> 
        <a  href="cuentaAdmon.jsp">Regresar</a> 
        </center>
        
    </body>
</html>
