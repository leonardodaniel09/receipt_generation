<%-- 
    Document   : Modificando
    Created on : 21/07/2016, 02:10:32 PM
    Author     : trabajo
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Modificar</title>
        <style type="text/css">
body{
	background:cornsilk;
}
</style>
    </head>
    <body>
        <%
       
     if (Integer.parseInt(request.getParameter("idRecibos"))!=0&&request.getParameter("folio")!=null&&request.getParameter("fecha")!=null&&request.getParameter("apellidos")!=null&&request.getParameter("nombre")!=null&&request.getParameter("monto")!=null&&request.getParameter("curso")!=null&&request.getParameter("modulo")!=null&&request.getParameter("nom_instructor")!=null&&request.getParameter("clave")!=null&&request.getParameter("deposito_referencia")!=null&&request.getParameter("correo")!=null&&request.getParameter("telefono")!=null&&request.getParameter("comentario")!=null){
  session.setAttribute("idRecibos", Integer.parseInt(request.getParameter("idRecibos"))); 
            
           

%>
        <%--
        <%
 if (Integer.parseInt(request.getParameter("idRecibos"))!=0&&request.getParameter("Folio")!=null&&request.getParameter("Fecha")!=null&&request.getParameter("Apellidos")!=null&&request.getParameter("Nombre")!=null&&request.getParameter("Monto")!=null&&request.getParameter("Curso")!=null&&request.getParameter("Módulos")!=null&&request.getParameter("Nombre instructor")!=null&&request.getParameter("Clave del curso")!=null&&request.getParameter("Deposito referencia")!=null&&request.getParameter("Correo")!=null&&request.getParameter("Teléfono")!=null&&request.getParameter("Comentario")!=null){
  session.setAttribute("idRecibos", Integer.parseInt(request.getParameter("idRecibos")));            
%> --%>
        <h3>MODIFICAR REGISTROS DE LOS RECIBOS</h3>
        <table border="0" cellspacing="15" bgcolor="seagreen">
            <tbody>
            <form action="Actualizar.jsp" method="post">
                <%--    <tr>
                 <td>id:</td><td><input type="text" name="idrecibos" required="" value="<%=request.getParameter("idRecibos") %>" ></td>
</tr> --%> <tr>
                 <td>Folio:</td><td><input type="text" name="Folio" required="" value="<%=request.getParameter("folio") %>" ></td>
                </tr>
                    <tr>
                 <td>Fecha:</td><td><input type="text" name="Fecha" required="" value="<%=request.getParameter("fecha") %>" ></td>
                </tr> <tr>
                <td>Apellidos:</td><td><input type="text" name="Apellidos" required="" value="<%=request.getParameter("apellidos") %>" ></td>
                </tr> <tr>
                <td>Nombre:</td><td><input type="text" name="Nombre" required="" value="<%=request.getParameter("nombre") %>" ></td>
                </tr> <tr>
                <td>Monto:</td><td><input type="text" name="Monto" required="" value="<%=request.getParameter("monto") %>" ></td>
                </tr> <tr>
                <td>Curso:</td><td><input type="text" name="Curso" required="" value="<%=request.getParameter("curso") %>" ></td>
                </tr> <tr>
                <td>Modulo:</td><td><input type="text" name="Modulos" required="" value="<%=request.getParameter("modulo") %>" ></td>
                </tr> <tr>
                <td>Instructor:</td><td><input type="text" name="Instructor" required="" value="<%=request.getParameter("nom_instructor") %>" ></td>
                </tr> <tr>
                <td>Clave:</td><td><input type="text" name="Clave" required="" value="<%=request.getParameter("clave") %>" ></td>
                </tr> <tr>
                <td>Deposito:</td><td><input type="text" name="Deposito" required="" value="<%=request.getParameter("deposito_referencia") %>" ></td>
                </tr> <tr>
                <td>Correo:</td><td><input type="text" name="Correo" required="" value="<%=request.getParameter("correo") %>" ></td>
                </tr> <tr>
                <td>Teléfono:</td><td><input type="text" name="Telefono" required="" value="<%=request.getParameter("telefono") %>" ></td>
                </tr> <tr>
                <td>Comentario:</td><td><input type="text" name="Comentario" required="" value="<%=request.getParameter("comentario") %>" ></td>
                </tr> 
               
                <tr> <td><td><input type="submit" value="Enviar Modificacion"></td></tr> </td>
              
          
            </form>
                    <% } 
%>  
        </tbody>
        </table>
    <a  href="editar.jsp">Regresar</a></tr>
        </body>
       
     
</html>
