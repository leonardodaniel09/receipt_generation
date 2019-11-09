<%-- 
    Document   : filtromes
    Created on : 18/07/2016, 11:57:24 PM
    Author     : trabajo
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
        
        <form class="form-bus" action="expormes.jsp" method="post" >
            <h2 class="form_titulo"> INTRODUCIR FECHA</h2>
            <div class="contenedor">
            <input class="input-400" type="text" placeholder="Mes a buscar" name="filtro" required="required" />
            
            
            <input class="submit" type="submit" value="Buscar" />
            
            
            <a href="fechas.jsp">Regresar</a>
             </div>
        </form>
        
    </body>
</html>
