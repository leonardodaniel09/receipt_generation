<%-- 
    Document   : cuentauser
    Created on : 12-jul-2016, 14:52:57
    Author     : LEONARDO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <link rel="stylesheet" href="css/stylepe.css"/>
       
    </head>
    <body>
        
       <form action="ventasU" method="post" class="form-register">
                <h2 class="form__titulo">RECIBOS EDUCACIÓN CONTINUA</h2>
                <div class="contenedor-inputs">
                    <p class="input-48">Folio</p>
                    <input type="text" name="folio" placeholder="Folio" class="input-48" />
                    <p class="input-48">Fecha</p>
                    <input type="text" name="fecha" placeholder="aa-mm-dd" class="input-48" />
                    <p class="input-48">Apellidos</p>
                    <input type="text" name="apellidos" placeholder="Apellidos" class="input-48" />
                    <p class="input-48">Nombre</p>
                    <input type="text" name="nombre" placeholder="Nombre" class="input-48" />
                    <p class="input-48">Monto</p>
                    <input type="text" name="monto" placeholder="Monto" class="input-48" />
                    <p class="input-48">Curso</p>
                    <input type="text" name="curso" placeholder="Curso" class="input-48" />
                    <p class="input-48">Módulos</p>
                    <input type="text" name="modulos" placeholder="Módulos" class="input-48" />
                    <p class="input-48">Nombre instructor</p>
                    <input type="text" name="instructor" placeholder="Nombre instructor" class="input-48" />
                    <p class="input-48">Clave del curso o diplomado</p>
                    <input type="text" name="clave del curso o diplomado" placeholder="Clave del curso o diplomado" class="input-48" />
                    <p class="input-48">Deposito referencia</p>
                    <input type="text" name="deposito referencia" placeholder="Deposito referenccia" class="input-48" />
                    <p class="input-48">Correo</p>
                    <input type="text" name="correo" placeholder="Correo" class="input-48" />
                    <p class="input-48">Teléfono</p>
                    <input type="text" name="telefono" placeholder="Teléfono" class="input-48" />
                    <p class="input-48">Comentario</p>
                    <input type="text" name="comentario" placeholder="Comentario" class="input-48" />
                    
                    <%-- <a href="VerRecibosUser.jsp"> Ver recibos </a>  --%>
                    <input type="submit" value="Enviar"/>
                    <a href="Opciones.jsp">Regresar</a>
                </div>               
            </form>
        
    </body>
</html>
