var $container = $("#conten_registro"),
	$boton = $("#menu");


function mostrarRegistrar(){
	$container.slideToggle();
	return false;	
}

$boton.click(mostrarRegistrar);