<%-- 
    Document   : index
    Created on : 7/07/2016, 08:00:07 PM
    Author     : LEONARDO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css"/>
        <title>DEPARTAMENTO DE EDUCACIÓN CONTINUA Y A DISTANCIA</title>
    </head>
    <body>
       <form action="iniciarU" method="post">
                <h2>Iniciar sesión </h2>
                <input type="text" placeholder="&#128272; Usuario" name="usuario" />
                <input type="password" placeholder="&#128273; Contraseña" name="clave" />
                <input type="submit" value="Ingresar"/>
                  
                <%--   <p class="form_link"> Administrador <a href="admon.jsp">Ingrese aquí </a></p> --%>
                
                
            </form>
    </body>
</html>
