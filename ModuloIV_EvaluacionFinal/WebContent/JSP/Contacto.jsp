<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="CSS/estilo.css">
<title>Contacto</title>
</head>
<body>
	<header class="col-6 col-s-5">
		<nav class="nav_diseño">
			<a href="<%=request.getContextPath()%>/Inicio">Página de Inicio</a>|
			<a href="<%=request.getContextPath()%>/CrearUsuario">Crear Usuario</a> | 
			<a href="<%=request.getContextPath()%>/CrearCapacitacion">Crear Capacitación</a>|
			<a href="<%=request.getContextPath()%>/ListarCapacitacion">Listar Capacitación</a> | 
			<a href="<%=request.getContextPath()%>/ListadoUsuario">Listado Usuarios</a>|
			<a href="<%=request.getContextPath()%>/CerrarSesion">Cerrar Sesión</a>
		</nav>
	</header>

	<br>

	<h1>Favor complete la información solicitada</h1>
	<form name="frmcrear" id="frmcrearid" action="Contacto" method="POST">

        <table id="tabla">
            <tr>
                <td>Ingrese nombre:</td>
                <td> <input  type="text" name="nombre" id="nombre"> </td>
            </tr>

            <tr>
                <td>Ingrese correo electrónico:</td>
                <td> <input  type="text" name="correo" id="correo"></td>
            </tr>

            <tr>
                <td>Ingrese teléfono:</td>
                <td> <input  type="text" name="telefono" id="telefono"> </td>
            </tr>

            <tr>
                <td> Ingrese mensaje: </td>
                <td> <textarea  name="mensaje" id="mensaje"></textarea></td>
            </tr>

           
            <tr>
                <td colspan="2"><button type="submit" name="btnvalidar" id="btnvalidar" class="centrado">Enviar</button></td>

            </tr>


        </table>
    </form>
	
</body>
</html>