<%-- 
    Document   : descargainstructor
    Created on : 19/07/2016, 01:25:38 PM
    Author     : trabajo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <link rel="stylesheet" href="css/estilosearch.css"/>
        <title>descargas</title>
    </head>
    <body>
        
        <form class="form-bus" action="instructorexcel.jsp" method="post" >
            <h2 class="form_titulo"> INTRODUCIR INSTRUCTOR</h2>
            <div class="contenedor">
            <input class="input-400" type="text" placeholder="Instructor" name="filtro" required="required" />
            
            
            <input class="submit" type="submit" value="Descargar" />
            
            
            <a href="descargaexcel.jsp">Regresar</a>
             </div>
        </form>
        
    </body>
</html>
