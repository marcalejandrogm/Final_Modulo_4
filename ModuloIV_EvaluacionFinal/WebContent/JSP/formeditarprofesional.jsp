<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="CSS/estilo.css">
<title>Profesional</title>
</head>
<body>
	<form name="frmcrear" id="frmcrearid" action="ActualizarProfesional" method="POST">

        <table class="col- col-s-4 ">
            <tr>
                <td> RUN </td>
                <td> <input value="<c:out value="${us.getRun_profesional()}" ></c:out>" type="text" name="run" id="run" readonly> </td>
            </tr>

            <tr>
                <td> Nombres </td>
                <td> <input value="<c:out value="${us.getNombre_pro()}" ></c:out>" type="text" name="nombres" id="nombres"></td>
            </tr>

            <tr>
                <td> Apellidos </td>
                <td> <input value="<c:out value="${us.getApellido_pro()}" ></c:out>" type="text" name="apellidos" id="apellidos"> </td>
            </tr>

            <tr>
                <td> Teléfono </td>
                <td> <input value="<c:out value="${us.getTelefono_pro()}" ></c:out>" type="text" name="telefono" id="telefono"> </td>
            </tr>


            <tr>
                <td> Título Profesional </td>
                <td> <input value="<c:out value="${us.getTitulo()}" ></c:out>" type="text" name="titulo" id="titulo"> </td>
            </tr>

            <tr>
                <td> Proyecto Asignado </td>
                <td> <input value="<c:out value="${us.getProyecto()}" ></c:out>" type="text" name="proyecto" id="proyecto"> </td>
            </tr>

            <tr>
                <td colspan="2"><button type="submit" name="btnvalidar" id="btnvalidar" class="centrado">Modificar</button></td>

            </tr>


        </table>
    </form>
</body>
</html>