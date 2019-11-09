<%-- 
    Document   : newuser
    Created on : 8/07/2016, 06:20:06 PM
    Author     : LEONARDO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <link rel="stylesheet" href="css/estilos.css"/>
    </head>
    <body>
        <form  action="registroT" method="post" class="form-register" >
                <h2 class="form__titulo">CREAR UNA CUENTA DEL USUARIO</h2>
                <div class="contenedor-inputs">
                    
                    <input type="text" placeholder="Nombre" name="nombre" class="input-48"   />
                    <input type="text"  placeholder="Apellido paterno" name="apellidoP" class="input-48" />
                    <input type="text"  placeholder="Apellido materno" name="apellidom" class="input-48" />
                    <input type="number"  placeholder="Teléfono" name="tel" class="input-48" />
                    <input type="text"  placeholder="Dirección" name="direcc" class="input-100" />
                    <input type="text"  placeholder="Usuario" name="nombreuser" class="input-48" />
                    <input type="password"  placeholder="Contraseña" name="contrasenia" class="input-48" />
                    <input type="text" placeholder="Cargo" name="cargo"class="input-100"  />

                   <!-- <h3 class="input-42">Sexo</h3>-->
                    <input type="text"  placeholder="Sexo" name="sexo" class="input-48"  />
                    <!--<label class="input-41" for="mujer">F </label>
                    <input class="input-43" type="checkbox" name="sexo" id="hombre" value="M"/>
                    <label class="input-41" for="hombre">M </label>-->
                    <input type="number"  placeholder="Edad"  name="edad" class="input-48"/>
                    <input type="submit" value="Guardar" />
                    <%-- <a href="#">Regresar </a> --%>
                    <a href="Opciones.jsp">Principal </a>
                    
                   
                </div>
                
                 
            </form>
    </body>
</html>
