<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="CSS/estilo.css">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Crear Capacitación</title>
</head>
<body>
	<header class="col-6 col-s-5">
		<nav class="nav_diseño">
			<a href="<%=request.getContextPath()%>/Inicio">Página de Inicio</a>|
			<a href="<%=request.getContextPath()%>/Contacto">Contacto</a>|
			<a href="<%=request.getContextPath()%>/CrearUsuario">Crear Usuario</a> | 
			<a href="<%=request.getContextPath()%>/ListarCapacitacion">Listar Capacitación</a> | 
			<a href="<%=request.getContextPath()%>/ListadoUsuario">Listado Usuarios</a>|
			<a href="<%=request.getContextPath()%>/CerrarSesion">Cerrar Sesión</a>
		</nav>
	</header>

	<form method="post" action="InsertarCapacitacion">
	<table id="tabla">
	 <tr>
      <td>ID Capacitación:</td>
      <td><input type="text" name="id" id="id"></td>
    </tr>
    <tr>
      <td>Fecha Capacitación:</td>
      <td><input type="date" name="fecha" id="fecha"></td>
    </tr>
    <tr>
      <td>Hora de capacitación:</td>
      <td><input type="time" name="hora" id="hora"></td>
    </tr>
    <tr>
      <td>Lugar:</td>
      <td><input type="text" name="lugar" id="lugar"></td>
    </tr>
    <tr>
      <td>Duración:</td>
      <td><input type="text" name="duracion" id="duracion"></td>
    </tr>
    <tr>
      <td>Rut del Cliente:</td>
      <td><input type="text" name="rut" id="rut"></td>
    </tr>
    <tr>
       <td colspan="2"><button type="submit" class="centrado" >Crear</button></td>
           
    </tr>
  </table>
  </form>
</body>
</html>