<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="CSS/estilo.css">
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
   <link href="https://fonts.googleapis.com/css?family=Ubuntu:500" rel="stylesheet" type="text/css">
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdn.datatables.net/1.10.22/css/dataTables.bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.css" />
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.2/dist/jquery.validate.js"></script>
    <script src="https://cdn.datatables.net/1.10.22/js/jquery.dataTables.min.js"></script>
    <script src="https://cdn.datatables.net/1.10.22/js/dataTables.bootstrap.min.js"></script>
    
<title>Login</title>
</head>
<body>
	<section>
     <form method="post" action="Ingreso">
     <div class="ingreso">
        <div class="ingreso-header">
          <h1>Login</h1>
        </div>
        <div class="ingreso-form">
          <h3>Usuario:</h3>
          <input type="text"  id="rut"  name="rut" /><br>
          <h3>Contraseña:</h3>
          <input type="password"  id="contraseña" name="contraseña" />
          <br>
          <button type="submit" class="login-button">Ingresar</button>
          <br>
        </div>
      </div>
    </form>
 </section> 
</body>
</html>