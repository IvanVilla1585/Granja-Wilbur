<%-- 
    Document   : index
    Created on : 9/07/2015, 01:41:37 PM
    Author     : Juan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8"> 
        <jsp:include page="encabezado.jsp"></jsp:include>
	<title>Granja Porcícola Wilbur</title>
        <script>
            $(document).ready(function(){
                $("#formIngreso").submit(function(){
                    $.post("formIngreso", $("#formIngreso").serialize(), function(data){
                        perfil = jQuery.trim(data);
                        if(perfil == "1"){
                            document.location.href = "MenuAdmin.jsp";
                        }else if(perfil == "2"){
                            document.location.href = "MenuEmpl.jsp";
                        }else{
                            alert("Usuario no valido.");
                        }                    
                    });
                    return false;
                });
            });
        </script>
</head>
<body>
    <%
    %>
    <section class="container">
        <header>
            <h1>Porcícola Wilbur</h1>
            <a href="#modal1" class="button_registro icon-icon-user-d position">Ingresar</a>
            <a href="#modal1" class="icon-icon-user position" id="menu1" ></a>
            <div id="modal1" class="modalmask">
                <div class="modalbox movedown relative">    
                    <h2 class="title">Ingreso al Sistema</h2>
                    <form action="formIngreso" method="POST" name="formIngreso" id="formIngreso">
                        <div class="usuario">
                            <p class="label">Usuario</p>
                            <input type="text" placeholder="Usuario" class="usu" name="txtUsuario" id="txtUsuario"/> 
                            <p class="label contra">Contraseña</p>
                            <input type="password" placeholder="Contraseña" name="txtPass" id="txtPass"/>
                        </div>
                        <div class="buttons">
                            <a href="#" class="absolute recuperar">Recuperar Contraseña?</a>
                            <a href="#close" class="button_procesos salir">Volver</a>
                            <input type="submit" class="button_procesos ingresar" value="Ingresar" id="btnIngresar" name="btnIngresar">                            
                        </div> 	
                    </form>
                </div>
            </div> 
            <div class="sponsors">
                <figure>
                    <img src="images/Logo.jpg" alt="Granja Porcicola Wilbur">
                </figure>
                <a href="https://www.facebook.com/edward.monsalve.1422" class="icon-facebook"></span>
                <a href="http://twitter.com/EdwardMCas" class="icon-twitter"></a>
                <a href="https://www.linkedin.com/profile/view?id=366152387&trk=nav_responsive_tab_profile_pic" class="icon-linkedin"></a>
                <a href="https://www.youtube.com" class="icon-youtube3"></a>
            </div>
        </header>
        <div class="seccion">
            <div class="redBackground">
                <h2>¿ Quiénes Somos ?</h2>
            </div>
            <p>
                Somos una empresa joven  y fresca, con una vasta experiencia en la crianza de porcinos, donde nuestro principal patrimonio es el talento humano que ha hecho posible nuestro crecimiento ...
            </p>
            <div class="button_procesos">Ver Más</div>
        </div>
        <div class="seccionProcess white">
            <div class="redBackground">
                <h2>Nuestros Procesos</h2>
            </div>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Soluta et molestiae iste, quis omnis voluptatem facere atque, aliquam voluptate natus inventore possimus commodi, impedit fuga sapiente consequuntur quo, sequi consequatur.</p>			
            <div id="modalprocess" class="modalmask_process">
                <div class="modalbox_process mo_process movedown relative" id="model_process">    
                    <h2 class="title title_process" id="titulo"></h2>
                    <ul class="rslides">
                        <li><img src="" id="imagen1" alt=""></li>
                        <li><img src="" id="imagen2" alt=""></li>
                        <li><img src="" id="imagen3" alt=""></li>
                        <li><img src="" id="imagen4" alt=""></li>
                    </ul>
                    <p id="parrafo1">			
                    </p>
                    <p id="parrafo2">			
                    </p>
                    <a href="" class="button_procesos buttons_links">Volver</a>
                </div>
            </div>
            <article class="process">
                <figure class="image">
                    <img src="images/reproductor.jpg" alt="Crianza de lechones en la granja porcicola wilbur.">
                </figure>
                <p class="name">Control Reproductores</p>
                <p class="descripcion">Llevamos un control estricto y adecuado con todos los animales reproductores de la granja...</p>
                <a href="#modalprocess" class="button_procesos buttons_links" id="button_reproduc">Ver Más..</a>
            </article>
            <article class="process">
                <figure class="image">
                    <img src="images/reprodu.jpg" alt="Crianza de lechones en la granja porcicola wilbur." class="borders" class="borders">
                </figure>
                <p class="name">Control a los Partos</p>
                <p class="descripcion">Llevamos un control estricto y adecuado con todos los animales reproductores de la granja...</p>
                <a href="#modalprocess" class="button_procesos buttons_links" id="button_partos">Ver Más..</a>
            </article>
            <article class="process">
                <figure class="image">
                    <img src="images/jaulas.jpg" alt="Crianza de lechones en la granja porcicola wilbur." class="borders" class="borders">
                </figure>
                <p class="name">Etapas de Desarrollo</p>
                <p class="descripcion">Llevamos un control estricto y adecuado con todos los animales reproductores de la granja...</p>
                <a href="#modalprocess" class="button_procesos buttons_links" id="button_etapa">Ver Más..</a>
            </article>
            <article class="process">
                <figure class="image">
                    <img src="images/reproductor.jpg" alt="Crianza de lechones en la granja porcicola wilbur.">
                </figure>
                <p class="name">Control Reproductores</p>
                <p class="descripcion">Llevamos un control estricto y adecuado con todos los animales reproductores de la granja...</p>
                <a href="#modalprocess" class="button_procesos buttons_links">Ver Más..</a>
            </article>
            <article class="process">
                <figure class="image">
                    <img src="images/reprodu.jpg" alt="Crianza de lechones en la granja porcicola wilbur." class="borders" class="borders">
                </figure>
                <p class="name">Control a los Partos</p>
                <p class="descripcion">Llevamos un control estricto y adecuado con todos los animales reproductores de la granja...</p>
                <a href="#modalprocess" class="button_procesos buttons_links">Ver Más..</a>
            </article>
            <article class="process">
                <figure class="image">
                    <img src="images/jaulas.jpg" alt="Crianza de lechones en la granja porcicola wilbur." class="borders" class="borders">
                </figure>
                <p class="name">Etapas de Desarrollo</p>
                <p class="descripcion">Llevamos un control estricto y adecuado con todos los animales reproductores de la granja...</p>
                <a href="#modalprocess" class="button_procesos buttons_links">Ver Más..</a>
            </article>
        </div>
        <div class="seccion contact">
            <div class="redBackground">
                <h2>Escribenos</h2>
            </div>
            <div class="input">
                <span>Nombre</span>
                <input type="text" placeholder="Nombre">
            </div>
            <div class="input">
                <span class="tittle" >Email   </span>
                <input type="text" placeholder="Email">
            </div>
            <div class="input">
                <textarea name="comentario" id="" cols="30" rows="5" placeholder="Dejanos tu comentario"></textarea>
            </div>
            <div href="#" class="button_procesos contacto padding">Enviar</div> 
        </div>		
        <footer>
            <p>Granja Porcícola Wilbur</p>
            <p>siguenos en:</p>
            <aside class="redes">
                <a href="https://www.facebook.com/edward.monsalve.1422" class="icon-facebook"></span>
                    <a href="http://twitter.com/EdwardMCas" class="icon-twitter"></a>
                    <a href="https://www.linkedin.com/profile/view?id=366152387&trk=nav_responsive_tab_profile_pic" class="icon-linkedin"></a>
                    <a href="https://www.youtube.com" class="icon-youtube3"></a>
            </aside>
        </footer> 
    </section>
    <script src="js/mostrar.js"></script>	
    <script src="js/vendors/responsiveslides.min.js"></script>
    <script>
            $(function() {
            $(".rslides").responsiveSlides();
            });
    </script>
</body>
</html>
