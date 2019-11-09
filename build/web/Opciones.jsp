<%-- 
    Document   : Opciones
    Created on : 18/07/2016, 06:52:01 PM
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
                <h2>BIENVENIDO ADMINISTRADOR</h2>
                <a class="input1" href="index.jsp">Cerrar sesión </a>
                <p class="tema">Opciones</p>
                <%--  <p class="report"><a href="ReportDelDia1.jsp">Descargar por curso a Excel </a></p> --%>
                <%--  <a class="input2" href="index.jsp">Cerrar sesión </a> --%>
                <%--<p class="report"><a href="Reportegeneral.jsp">Ver reporte general </a></p>  --%>
                <%--  <p class="tema">Imprimir reporte</p> --%>
                <a class="pedi" href="cuentaAdmon.jsp">Consulta por tipo </a>
                <a class="pedi" href="fechas.jsp">Consulta por fecha </a>
                <a class="pedi" href="cuentauser.jsp">Agregar registros</a>
                <a class="pedi" href="newuser.jsp">Agregar Usuario</a>
                <a class="pedi" href="editar.jsp">Editar registros</a>
                <a class="pedi" href="descargaexcel.jsp">Descargar a formato Excel</a>
                <%--    <a class="pedi" href="newuser.jsp">Trabajadores</a> --%>
                <%--     <p class="form_link">(Agregar trabajadores)</p> --%>
            </form>
    </body>
</html>
