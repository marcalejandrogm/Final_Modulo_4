<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="CSS/estilo.css">
<meta charset="ISO-8859-1">
<title>Listado Usuarios</title>
</head>
<body>
	<header class="col-6 col-s-5">
		<nav class="nav_diseño">
			<a href="<%=request.getContextPath()%>/Inicio">Página de Inicio</a> |
			<a href="<%=request.getContextPath()%>/Contacto">Contacto</a> |
			<a href="<%=request.getContextPath()%>/CrearUsuario">Crear Usuario</a> | 
			<a href="<%=request.getContextPath()%>/CrearCapacitacion">Crear Capacitación</a> |
			<a href="<%=request.getContextPath()%>/ListarCapacitacion">Listar Capacitación</a> | 
			<a href="<%=request.getContextPath()%>/CerrarSesion">Cerrar Sesión</a>
		</nav>
	</header>

		<table id="tabla">

			<tr>
				<th>Nombre Usuario</th>
				<th>Fecha de Nacimiento</th>
				<th>Run Usuario</th>
				<th>Acciones</th>
			</tr>
			
			<c:forEach items="${lusuarios}" var="lu">
				<tr>
					<td><c:out value="${lu.getNombre()}" /></td>
					<td><c:out value="${lu.getFecha_nacimiento()}" /></td>
					<td><c:out value="${lu.getRun_usuario()}" /></td>
					<td> 
						<a href="EditarUsuario?id=<c:out value="${lu.getRun_usuario()}" />&tipo=<c:out value="${lu.getTipo()}"/>">Editar</a>&nbsp; 
					</td>
				</tr>
			</c:forEach>
			
		</table>
	

</body>
</html>