<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="CSS/estilo.css">
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Listar Capacitaciones</title>
</head>
<body>
	<header class="col-6 col-s-5">
		<nav class="nav_diseño">
			<a href="<%=request.getContextPath()%>/Inicio">Página de Inicio</a> |
			<a href="<%=request.getContextPath()%>/Contacto">Contacto</a> | 
			<a href="<%=request.getContextPath()%>/CrearUsuario">Crear Usuario</a> | 
			<a href="<%=request.getContextPath()%>/CrearCapacitacion">Crear Capacitación</a> |
			<a href="<%=request.getContextPath()%>/ListadoUsuario">Listado Usuarios</a> |
			<a href="<%=request.getContextPath()%>/CerrarSesion">Cerrar Sesión</a>
		</nav>
	</header>
	
	 <table id = "tabla">
        <tr>
          <th>ID de Capacitación</th>
          <th>Fecha de capacitación</th>
          <th>Hora de capacitación</th>
          <th>Lugar de capacitación</th>
          <th>Duración de la capacitación</th>
          <th>Rut del cliente</th>
        </tr>
        <c:forEach items="${listacap}" var="cap">
        <tr>
          <td><c:out value="${cap.getId()}" /></td>
          <td><c:out value="${cap.getFecha()}" /></td>
          <td><c:out value="${cap.getHora()}" /></td>
          <td><c:out value="${cap.getLugar()}" /></td>
          <td><c:out value="${cap.getDuracion()}" /></td>
          <td><c:out value="${cap.getRutCliente()}" /></td>
        </tr>
        </c:forEach>
      </table>
</body>
</html>