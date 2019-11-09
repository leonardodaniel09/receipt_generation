<%-- 
    Document   : editar
    Created on : 21/07/2016, 10:09:08 AM
    Author     : trabajo
--%>

<%@page import="Controlador.Recibo"%>
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
       
        <title>Registros de los recibos</title>
        
    </head>
    <body>
    <center>
        <h1>RECIBOS DE EDUCACIÓN CONTINUA</h1>
        
         <table border="1" cellspacing="0" bgcolor="seagreen">
             
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

          %>
          <tr>
              <td><%=recibo.get(i).getId_Recibos()%></td>
              <td><%=recibo.get(i).getFolio()%></td>
              <td><%=recibo.get(i).getFecha()%></td>
              <td><%=recibo.get(i).getApellidos()%></td>
              <td><%=recibo.get(i).getNombre()%></td>
              <td><%=recibo.get(i).getMonto()%></td>
              <td><%=recibo.get(i).getCurso()%></td>
              <td><%=recibo.get(i).getModulos()%></td>
              <td><%=recibo.get(i).getNominstructor()%></td>
              <td><%=recibo.get(i).getClavecurso()%></td>
              <td><%=recibo.get(i).getDeposito()%></td>
              <td><%=recibo.get(i).getCorreo()%></td>
              <td><%=recibo.get(i).getTelefono()%></td>
              <td><%=recibo.get(i).getComentario()%></td>
               <td ><a href="Modificando.jsp?idRecibos=<%=recibo.get(i).getId_Recibos()%>&&folio=<%=recibo.get(i).getFolio()%>&&fecha=<%=recibo.get(i).getFecha()%>&&apellidos=<%=recibo.get(i).getApellidos()%>&&nombre=<%=recibo.get(i).getNombre()%>&&monto=<%=recibo.get(i).getMonto()%>&&curso=<%=recibo.get(i).getCurso()%>&&modulo=<%=recibo.get(i).getModulos()%>&&nom_instructor=<%=recibo.get(i).getNominstructor()%>&&clave=<%=recibo.get(i).getClavecurso()%>&&deposito_referencia=<%=recibo.get(i).getDeposito()%>&&correo=<%=recibo.get(i).getCorreo()%>&&telefono=<%=recibo.get(i).getTelefono()%>&&comentario=<%=recibo.get(i).getComentario()%>">Modificar</a></td>
                           
          </tr> 
            <%  }
            %>
        </table>
        <br>
        <br>        
        <a  href="Opciones.jsp">Regresar</a> 
        </center>
        
    </body>
</html>
