var $foto1 = $("#imagen1"),
	$foto2 = $("#imagen2"),
	$foto3 = $("#imagen3"),
	$foto4 = $("#imagen4"),
	$boton = $("#button_reproduc"),
	$boton_etapa = $("#button_etapa"),
	$boton_parto = $("#button_partos"),
	$parrafo1 = $("#parrafo1"),
	$parrafo2 = $("#parrafo2"),
	$titulo = $("#titulo"); 

function agregarInformacionReproductores(){
	 
	$titulo.text('Control a Reproductores');
	$foto1.attr('src', 'images/reproduc1.jpg');
	$foto2.attr('src', 'images/reproduc2.jpg');
	$foto3.attr('src', 'images/reprodu3.jpg');
	$foto4.attr('src', 'images/reprodu4.jpg');
	$parrafo1.text('Lorem ipsum dolor sit amet, consectetur adipisicing elit. Placeat accusantium, in ab esse beatae nihil quis libero ullam optio ad voluptatum harum perspiciatis voluptas temporibus quas quae? Temporibus, laborum, iure.');
	$parrafo2.text('Lorem ipsum dolor sit amet, consectetur adipisicing elit. Placeat accusantium, in ab esse beatae nihil quis libero ullam optio ad voluptatum harum perspiciatis voluptas temporibus quas quae? Temporibus, laborum, iure.');

}

function agregarInformacionEtapa(){
	 
	$titulo.text('Etapas de Desarrollo');
	$foto1.attr('src', 'images/etapa.jpg');
	$foto2.attr('src', 'images/etapa10.jpg');
	$foto3.attr('src', 'images/etapa6.jpg');
	$foto4.attr('src', 'images/etapa5.jpg');
	$parrafo1.text('Lorem ipsum dolor sit amet, consectetur adipisicing elit. Placeat accusantium, in ab esse beatae nihil quis libero ullam optio ad voluptatum harum perspiciatis voluptas temporibus quas quae? Temporibus, laborum, iure.');
	$parrafo2.text('Lorem ipsum dolor sit amet, consectetur adipisicing elit. Placeat accusantium, in ab esse beatae nihil quis libero ullam optio ad voluptatum harum perspiciatis voluptas temporibus quas quae? Temporibus, laborum, iure.');

}

function agregarInformacionParto(){
	 
	$titulo.text('Control a Partos');
	$foto1.attr('src', 'images/parto.jpg');
	$foto2.attr('src', 'images/parto2.jpg');
	$foto3.attr('src', 'images/parto3.jpg');
	$foto4.attr('src', 'images/parto4.jpg');
	$parrafo1.text('Lorem ipsum dolor sit amet, consectetur adipisicing elit. Placeat accusantium, in ab esse beatae nihil quis libero ullam optio ad voluptatum harum perspiciatis voluptas temporibus quas quae? Temporibus, laborum, iure.');
	$parrafo2.text('Lorem ipsum dolor sit amet, consectetur adipisicing elit. Placeat accusantium, in ab esse beatae nihil quis libero ullam optio ad voluptatum harum perspiciatis voluptas temporibus quas quae? Temporibus, laborum, iure.');

}

$boton.on("click", agregarInformacionReproductores);
$boton_parto.on("click", agregarInformacionParto);
$boton_etapa.on("click", agregarInformacionEtapa);
