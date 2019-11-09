<%-- 
    Document   : descargaexcel
    Created on : 19/07/2016, 12:07:36 PM
    Author     : trabajo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrador </title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <link rel="stylesheet" href="css/estiload.css"/>
    </head>
    <body>
        <form class="contenedor">
                <a class="pedi" href="Opciones.jsp">Regresar </a>
                <p class="tema">Tipos de descarga</p>
                <%--  <p class="report"><a href="ReportDelDia1.jsp">Descargar por curso a Excel </a></p> --%>
                <%--  <a class="input2" href="index.jsp">Cerrar sesión </a> --%>
                <%--<p class="report"><a href="Reportegeneral.jsp">Ver reporte general </a></p>  --%>
                <%--  <p class="tema">Imprimir reporte</p> --%>
                
                <a class="pedi" href="ReportDelDia1.jsp">Descarga por curso </a>
                <a class="pedi" href="descargafecha.jsp">Descarga por fecha </a>
                <a class="pedi" href="descarganombre.jsp">Descarga por nombre</a>
                <a class="pedi" href="descargaapellido.jsp">Descarga por apellidos</a>
                <a class="pedi" href="descargamodulo.jsp">Descarga por Modulos</a>
                <a class="pedi" href="descargatelefono.jsp">Descarga por teléfono</a>
                <a class="pedi" href="descargainstructor.jsp">Descargar por instructor</a>
                <%--    <a class="pedi" href="newuser.jsp">Trabajadores</a> --%>
                <%--     <p class="form_link">(Agregar trabajadores)</p> --%>
            </form>
    </body>
</html>
