/**
 *funcionUusuario.js
 *Permite mostrar el formulario para crear un cliente dependiendo el tipo
 * 1.- cliente 2.- administrativo 3.- profesional  
*/

function cargartipo(){
	var tipo = document.getElementById("tipousuario");
	var a = tipo.value;
	
	if(a== 1){
		document.getElementById("contenido").innerHTML = 
				"<tr><td> RUN </td> <td> <input type='text' name='run' id='run'> </td></tr><br>"+
			"<tr><td> Nombres </td><td> <input type='text' name='nombres' id='nombres'></td></tr><br>"+
            "<tr><td> Apellidos </td><td> <input type='text' name='apellidos' id='apellidos'></td></tr><br>"+
			"<tr><td> Telefono </td><td> <input type='text' name='telefono' id='telefono'></td></tr><br>"+
            "<tr><td> AFP </td><td> <label for='Tipo_afp'>Seleccione una afp:</label><select name='afps' id='afps'>"+
				"<option value='modelo'>Modelo</option><option value='provida'>Provida</option>"+
				"<option value='habitat'>Habitat</option><option value='capital'>Capital</option>"+
				"<option value='plan vital'>Plan vital</option></select></td></tr><br>"+
			"<tr><td> Sistema salud </td><td> <label for='Tipo_Salud'>Seleccione un sistema de salud:</label>"+
			"<select name='salud' id='salud'><option value='1'>Fonasa</option><option value='2'>Isapre</option>"+
			"</select></td></tr><br>"+
			"<tr><td> Dirección </td><td> <input type='text' name='direccion' id='direccion'> </td></tr><br>"+
			"<tr><td> Comuna </td><td> <input type='text' name='comuna' id='comuna'></td></tr><br>"+
           "<tr><td> Edad </td><td> <input type='text' name='edad' id='edad'></td></tr>"

	}else if(a== 2){
		document.getElementById("contenido").innerHTML =
			"<tr><td> RUN administrativo </td> <td> <input type='text' name='run_adm' id='run_adm'> </td></tr><br>" +
			"<tr><td> Nombres </td><td> <input type='text' name='nombres_adm' id='nombres_adm'></td></tr><br>" +
			"<tr><td> Apellidos </td><td> <input type='text' name='apellidos_adm' id='apellidos_adm'></td></tr><br>" +
			"<tr><td> Correo Electrónico </td><td> <input type='text' name='correo_adm' id='correo_adm'></td></tr><br>" +
			"<tr><td> Area </td><td> <input type='text' name='area_adm' id='area_adm'></td></tr><br>"
	}else if(a== 3){
		document.getElementById("contenido").innerHTML = 
		    "<tr><td> RUN profesional </td> <td> <input type='text' name='run_pro' id='run_pro'> </td></tr><br>"+
			"<tr><td> Nombres </td><td> <input type='text' name='nombre_pro' id='nombre_pro'></td></tr><br>"+
            "<tr><td> Apellidos </td><td> <input type='text' name='apellido_pro' id='apellido_pro'></td></tr><br>"+
			"<tr><td> Teléfono </td><td> <input type='text' name='telefono_pro' id='telefono_pro'></td></tr><br>"+
			"<tr><td> Titulo del Profesional </td><td> <input type='text' name='titulo' id='titulo'></td></tr><br>"+	
			"<tr><td> Nombre del Proyecto </td><td> <input type='text' name='proyecto' id='proyecto'></td></tr><br>"
	}
}