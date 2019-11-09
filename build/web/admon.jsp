<%-- 
    Document   : admon
    Created on : 11-jul-2016, 14:01:55
    Author     : LEONARDO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar sesión administrador </title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <link rel="stylesheet" href="css/style.css"/>
        
    </head>
    <body>
        <form action="inicioAdmi" method="post">
            <h2>Iniciar sesión </h2>
            <input type="text" placeholder="&#128272; Usuario" name="Admon"/>
            <input type="password" placeholder="&#128273; Contraseña" name="clave"/>
            
            <input type="submit" value="Iniciar" />
             <p class="form_link"><a href="index.jsp">Regresar</a></p>
        </form>
    </body>
</html>
