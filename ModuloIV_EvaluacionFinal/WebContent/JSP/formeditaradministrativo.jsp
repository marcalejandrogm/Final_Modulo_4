<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="CSS/estilo.css">
<title>Editar Administrativo</title>
</head>
<body>
	
	<form name="frmcrear" id="frmcrearid" action="ActualizarAdministrativo" method="POST">

        <table class="col- col-s-4 ">
            <tr>
                <td> RUN </td>
                <td> <input value="<c:out value="${us.getRun_adm()}" ></c:out>" type="text" name="run" id="run" readonly> </td>
            </tr>

            <tr>
                <td> Nombres </td>
                <td> <input value="<c:out value="${us.getNombres_adm()}" ></c:out>" type="text" name="nombres" id="nombres"></td>
            </tr>

            <tr>
                <td> Apellidos </td>
                <td> <input value="<c:out value="${us.getApellidos_adm()}" ></c:out>" type="text" name="apellidos" id="apellidos"> </td>
            </tr>

            <tr>
                <td> Correo Electrónico </td>
                <td> <input value="<c:out value="${us.getCorreo_adm()}" ></c:out>" type="text" name="correo" id="correo"> </td>
            </tr>

            <tr>
                <td> Nombre del área al que pertenece </td>
                <td> <input value="<c:out value="${us.getArea_adm()}" ></c:out>" type="text" name="area" id="area"> </td>
            </tr>

            <tr>
                <td colspan="2"><button type="submit" name="btnvalidar" id="btnvalidar" class="centrado">Modificar</button></td>

            </tr>


        </table>
    </form>
</body>
</html>