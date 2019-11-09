<%-- 
    Document   : Actualizar
    Created on : 21/07/2016, 05:53:38 PM
    Author     : trabajo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Controlador.Recibo"%>
<%@page import="Controlador.Consultas"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar....</title>
    </head>
    <body>
        <h1>Actualizado.</h1>
        <% 
        if (request.getParameter("Folio")!=null && request.getParameter("Fecha")!=null && request.getParameter("Apellidos")!=null&& request.getParameter("Nombre")!=null&& request.getParameter("Monto")!=null&& request.getParameter("Curso")!=null&& request.getParameter("Modulos")!=null&& request.getParameter("Instructor")!=null&& request.getParameter("Clave")!=null&& request.getParameter("Deposito")!=null&& request.getParameter("Correo")!=null&& request.getParameter("Telefono")!=null&& request.getParameter("Comentario")!=null){
           int idrecibos=Integer.parseInt(session.getAttribute("idRecibos").toString());
           Recibo recibo=new Recibo(idrecibos, request.getParameter("Folio"),request.getParameter("Fecha"), request.getParameter("Apellidos"), request.getParameter("Nombre"), request.getParameter("Monto"), request.getParameter("Curso"), request.getParameter("Modulos"), request.getParameter("Instructor"), request.getParameter("Clave"), request.getParameter("Deposito"), request.getParameter("Correo"), request.getParameter("Telefono"), request.getParameter("Comentario"));
           boolean  respuesta= Consultas.Actualizar(recibo); 
              session.invalidate();  
            if (respuesta != false){
                out.println("datos actualizados "+respuesta);
                out.println("<a href='editar.jsp'> ver cambios</a>");
            }else{
            out.println("datos actualizados"+respuesta);
            }
                                                     
           }
%>
    </body>
</html>
