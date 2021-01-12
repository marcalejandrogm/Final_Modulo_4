<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="CSS/estilo.css">
<title>Editar Cliente</title>
</head>
<body>
	
	 <form name="frmcrear" id="frmcrearid" action="ActualizarCliente" method="POST">

        <table class="col- col-s-4 ">
            <tr>
                <td> RUN </td>
                <td> <input value="<c:out value="${us.getRUT()}" ></c:out>" type="text" name="run" id="run" readonly> </td>
            </tr>

            <tr>
                <td> Nombres </td>
                <td> <input value="<c:out value="${us.getNombres()}" ></c:out>" type="text" name="nombres" id="nombres"></td>
            </tr>

            <tr>
                <td> Apellidos </td>
                <td> <input value="<c:out value="${us.getApellidos()}" ></c:out>" type="text" name="apellidos" id="apellidos"> </td>
            </tr>

            <tr>
                <td> Telefono </td>
                <td> <input value="<c:out value="${us.getTelefono()}" ></c:out>" type="text" name="telefono" id="telefono"> </td>
            </tr>

            <tr>
                <td> AFP </td>
                <td> <label for="Tipo_afp">Seleccione una afp:</label>

                    <select name="afps" id="afps">
                    	<option value=""><c:out value="${us.getAFP()}" ></c:out></option>
                        <option value="modelo">Modelo</option>
                        <option value="provida">Provida</option>
                        <option value="habitat">Habitat</option>
                        <option value="capital">Capital</option>
                        <option value="plan vital">Plan Vital</option>
                    </select>
                </td>
            </tr>

            <tr>
                <td> Sistema Salud </td>
                <td> <label for="Tipo_Salud">Seleccione un sistema de salud:</label>
                    <select name="salud" id="salud">
                        <option value="1">Fonasa</option>
                        <option value="2">Isapre</option>
                    </select>
                </td>
            </tr>

            <tr>
                <td> Direccion </td>
                <td> <input value="<c:out value="${us.getDireccion()}" ></c:out>" type="text" name="direccion" id="direccion"> </td>
            </tr>

            <tr>
                <td> Comuna </td>
                <td> <input value="<c:out value="${us.getComuna()}" ></c:out>" type="text" name="comuna" id="comuna"> </td>
            </tr>

            <tr>
                <td> Edad </td>
                <td> <input value="<c:out value="${us.getEdad()}" ></c:out>" type="text" name="edad" id="edad"> </td>
            </tr>


            <tr>
                <td colspan="2"><button type="submit" name="btnvalidar" id="btnvalidar" class="centrado">Modificar</button></td>

            </tr>


        </table>
    </form>
</body>
</html>