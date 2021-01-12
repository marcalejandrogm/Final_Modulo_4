<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<script src="funcionUsuario.js"></script>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="CSS/estilo.css">
<title>Crear Usuario</title>
</head>
<body>
	<header class="col-6 col-s-5">
		<nav class="nav_diseño">
			<a href="<%=request.getContextPath()%>/Inicio">Página de Inicio</a>|
			<a href="<%=request.getContextPath()%>/Contacto">Contacto</a>| 
			<a href="<%=request.getContextPath()%>/CrearCapacitacion">Crear Capacitación</a>|
			<a href="<%=request.getContextPath()%>/ListarCapacitacion">Listar Capacitación</a> | 
			<a href="<%=request.getContextPath()%>/ListadoUsuario">Listado Usuarios</a>|
			<a href="<%=request.getContextPath()%>/CerrarSesion">Cerrar Sesión</a>
		</nav>
	</header>
	
	<section>
		<form method="post" action="InsertarUsuario" >
		<table id="tabla">
			<tr>
				<td>Nombre y apellido</td>
				<td><input type="text" name="txtnombre" id="txtnombre"></td>
			</tr>

			<tr>
				<td>Fecha nacimiento</td>
				<td><input type="text" name="txtfecha" id="txtfecha"></td>
			</tr>

			<tr>
				<td>RUN Usuario</td>
				<td><input type="text" name="txtrun" id="txtrun"></td>
			</tr>

			<tr>
				<td>Tipo usuario</td>
				<td><label for="Tipo_usuario">Seleccione el tipo de
						usuario:</label> <select name="tipousuario" id="tipousuario" onchange="cargartipo();">
						<option>Seleccione opción</option>
						<option value="1">Cliente</option>
						<option value="2">Administrativo</option>
						<option value="3">Profesional</option>
				</select></td>
			</tr>
			
			<tr>
				<td colspan=2><div id="contenido"></div></td>
				
			</tr>
			
			<tr>
				<td colspan="2"><button type="submit" class="centrado">Crear</button></td>

			</tr>


		</table>
		</form>
	</section>


	<footer class="col-6 col-s-5">
		<h4>CREADO POR EL GRUPO 4</h4>
	</footer>
</body>
</html>