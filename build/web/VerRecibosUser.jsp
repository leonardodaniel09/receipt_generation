<%-- 
    Document   : VerRecibosUser
    Created on : 11/07/2016, 12:08:04 PM
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
<!DOCTYPE html>
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <link rel="stylesheet" href="css/estilosearch.css"/>
        <title>Buscar recibos</title>
    </head>
    <body>
        <form class="acomodar" ></form>
        <form class="form-bus" action="verRecibosUser1.jsp" method="post" >
            <h2 class="form_titulo" > INTRODUCIR CURSO </h2>
            <div class="contenedor">
            <input class="input-400" type="text" placeholder="Curso a buscar" name="filtro" required="required" />
                     
            <input class="submit" type="submit" value="Buscar" /> 
            <br>
            <br>
        <a  href="cuentauser.jsp">Regresar</a> 
            </div>
        </form>
    </body>
</html>


