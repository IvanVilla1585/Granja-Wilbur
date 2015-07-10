var $txtdocumento = document.getElementById("txtNumDocumento"),
	$txtNombre = document.getElementById("txtNombre"),
    $cbxListPerfil = document.getElementById("cbxListPerfil"),
    $txtNomUsuario  = document.getElementById("txtNomUsuario"),
    $txtContrasena = document.getElementById("txtContrasena"),
    $txtConfContrasena = document.getElementById("txtConfContrasena");


function limpiar(){

	$txtdocumento.value="";
	$txtNombre.value="";
	$txtNomUsuario.value="";
	$txtContrasena.value="";
	$txtConfContrasena.value="";

}

function activarCampos(){ 

	$txtdocumento.setAttribute('disabled', true);
	$txtNombre.setAttribute('disabled', true);
	$txtNomUsuario.setAttribute('disabled', true);
	$txtContrasena.setAttribute('disabled', true);
	$txtConfContrasena.setAttribute('disabled', true);
	$cbxListPerfil.setAttribute('disabled', true); 
}

function desactivarCampos(){ 

	$txtdocumento.setAttribute('disabled', false);
	$txtNombre.setAttribute('disabled', false);
	$txtNomUsuario.setAttribute('disabled', false);
	$txtContrasena.setAttribute('disabled', false);
	$txtConfContrasena.setAttribute('disabled', false);
	$cbxListPerfil.setAttribute('disabled', false);  
}

