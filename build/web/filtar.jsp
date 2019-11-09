<%-- 
    Document   : filtar
    Created on : 15/07/2016, 02:01:41 PM
    Author     : LEONARDO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <link rel="stylesheet" href="css/estilosearch.css"/>
        <title>reporte del día</title>
    </head>
    <body>
        
        <form class="form-bus" action="filtro2.jsp" method="post" >
            <h2 class="form_titulo"> INTRODUCIR CURSO</h2>
            <div class="contenedor">
            <input class="input-400" type="text" placeholder="Curso a buscar" name="filtro" required="required" />
            
            
            <input class="submit" type="submit" value="Buscar" />
            
            
            <a href="cuentaAdmon.jsp">Regresar</a>
             </div>
        </form>
        
    </body>
</html>
