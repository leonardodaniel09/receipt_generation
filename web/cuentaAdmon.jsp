<%-- 
    Document   : cuentaAdmon
    Created on : 12-jul-2016, 15:08:26
    Author     : LEONARDO
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
                
                <%-- <p class="report"><a href="ReportDelDia1.jsp">Descargar por curso a Excel </a></p> --%>
                <p class="report"><a href="Opciones.jsp">Regresar </a></p>
                <a class="input2" href="index.jsp">Cerrar sesión </a>
                 
                <%--<p class="report"><a href="Reportegeneral.jsp">Ver reporte general </a></p>  --%>
                <p class="tema">Consultas</p>
                <a class="pedi" href="filtar.jsp">Ver recibos por curso </a>
                <a class="pedi" href="filtronombre.jsp">Ver recibos por nombre </a>
                <a class="pedi" href="filtroApellidos.jsp">Ver recibos por apellidos </a>
                <a class="pedi" href="filtromonto.jsp">Ver recibos por monto </a>
                <a class="pedi" href="filtromodulos.jsp">Ver recibos por módulos </a>
                <a class="pedi" href="filtroinstructor.jsp">Ver recibos por nombre del instructor </a>
                <a class="pedi" href="filtroclave.jsp">Clave de diplomado </a>
                <a class="pedi" href="filtrodeposito.jsp">Ver recibos por depósito </a>
                <a class="pedi" href="filtrocorreo.jsp">Recibos por correo </a>
                <a class="pedi" href="filtrotelefono.jsp">Ver recibos por teléfono </a>
                <a class="pedi" href="ecxel.jsp">Ver recibos  general</a> 
                <%-- <a class="pedi" href="newuser.jsp">Trabajadores</a> 
<p class="form_link">(Agregar trabajadores)</p> --%>
                
            </form>
                
    </body>
</html>
