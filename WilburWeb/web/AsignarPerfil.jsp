<%-- 
    Document   : AsignarPerfil
    Created on : 9/07/2015, 04:31:43 PM
    Author     : Juan
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Conexion.*"%>
<%@page import="Utilidades.*"%>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Asignar Perfil</title>
        <link rel="stylesheet" href="styl.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
</head>
<body>
    <%
            //Variable que muestra los mensajes del sistema.
            String mensaje = "";
            
            //Identificar el boton que el usuario presiono.
            boolean guardar = false;
            boolean buscar = false;
            boolean editar = false;
            boolean eliminar = false;
            boolean nuevo = false;
            boolean listar = false;
            boolean limpiar = false;
            boolean volver = false;
            
            if(request.getParameter("nuevo") != null)
            {
                nuevo = true;
            }
            
            if(request.getParameter("guardar") != null)
            {
                guardar = true;
            }
            
            if(request.getParameter("buscar") != null){
                buscar = true;
            }
            
            if(request.getParameter("editar") != null){
                editar = true;
            }
            
            if(request.getParameter("eliminar") != null){
                eliminar = true;
            }
            
            if(request.getParameter("listar") != null){
                listar = true;
            }
            
            if(request.getParameter("limpiar") != null){
                limpiar = true;
            }
            
            if(request.getParameter("volver") != null){
                volver = true;
            }
            
            //Obtenemos el valor como fue llamado el formulario.
            String cbxTipoDoc = "0";
            String txtNumDocumento = "";
            String txtNombre = "";
            String cbxListPerfil = "0";
            String txtNomUsuario = "";
            String txtContrasena = "";
            String txtConfContrasena = "";
                        
            if(request.getParameter("cbxTipoDoc") != null)
            {
                cbxTipoDoc = request.getParameter("cbxTipoDoc");
            }
            
            if(request.getParameter("txtNumDocumento") != null)
            {
                txtNumDocumento = request.getParameter("txtNumDocumento");
            }
            
            if(request.getParameter("txtNombre") != null)
            {
                txtNombre = request.getParameter("txtNombre");
            }
            
            if(request.getParameter("cbxListPerfil") != null)
            {
                cbxListPerfil = request.getParameter("cbxListPerfil");
            }
            
            if(request.getParameter("txtNomUsuario") != null)
            {
                txtNomUsuario = request.getParameter("txtNomUsuario");
            }
            
            if(request.getParameter("txtContrasena") != null)
            {
                txtContrasena = request.getParameter("txtContrasena");
            }
            
            if(request.getParameter("txtConfContrasena") != null)
            {
                txtConfContrasena = request.getParameter("txtConfContrasena");
            }
            
            //Si presiona el boton consultar.
            if(buscar){
                if(cbxTipoDoc.equals("...") && txtNumDocumento.equals("")){
                    mensaje = "Debe ingresar el número de documento y seleccionar el tipo de documento.";
                }else{
                    Conexion con;
                    con = new Conexion();
                    
                    AsignarPerfil usuario;
                    usuario = con.obtenerUsuarioPerf(new Integer(txtNumDocumento), new Integer(cbxTipoDoc));
                    
                    if(usuario == null){
                        mensaje = "Usuario no existe.";
                    }else{
                        cbxTipoDoc = String.valueOf(usuario.gettDoc());
                        txtNumDocumento = String.valueOf(usuario.getNumDoc());
                        txtNombre = usuario.getNombresApell();
                        cbxListPerfil = String.valueOf(usuario.getPerf());
                        txtNomUsuario = usuario.getNombreUser();
                        txtContrasena = usuario.getPass();
                        txtConfContrasena = "";
                        mensaje = "Usuario Consultado...";
                    }
                }
            }
       
    %>
    <header>		
        <h1>Asignar Perfiles</h2>
            <figure>
                <img src="../images/Logo.jpg" alt="Granja Porcicola Wilbur">
            </figure>
    </header>
    <section>
        <form action="AsignarPerfil.jsp" class="frmAsignarPerfil" name="formAsignarPerfil" id="formAsignarPerfil">
            <div class="inputs">
                <select name="cbxTipoDoc" onChange="combo(this, 'docUser')" onMouseOut="comboInit(this, 'docUser')" placeholder="Tipo Documento" id="cbxTipoDoc">
                    <option value="0" <%=(cbxTipoDoc.equals("") ? "selected": "")%>>...</option>
                    <%
                        int i = 0;                        
                        Conexion con = new Conexion();
                        ResultSet tDoc = con.obtenerTipoDocumento();                        
                        while(tDoc.next()){
                            i++;                            
                    %>
                    <option value="<%=i%>" dir=""><%=tDoc.getString("NOM_TDOC")%></option>                    
                    <%
                        }
                    %>
                </select>
                <input type="text" name="txtNumDocumento" placeholder="Número de Documento" id="txtNumDocumento" value="<%=txtNumDocumento%>">
                <input type="text" name="txtNombre" placeholder="Nombres y Apellidos" id="txtNombre" value="<%=txtNombre%>">
                <select name="cbxListPerfil" onChange="combo(this, 'perfilUser')" onMouseOut="comboInit(this, 'perfilUser')" placeholder="Perfil" id="cbxListPerfil">
                    <option value="0" <%=(cbxListPerfil.equals("") ? "selected": "")%>>...</option>
                    <%
                        int j = 0;              
                        ResultSet perfil = con.obtenerPerfiles();                        
                        while(perfil.next()){
                            j++;                            
                    %>
                    <option value="<%=j%>" <%=(cbxListPerfil != "" ? "selected": cbxListPerfil)%>><%=perfil.getString("NOM_PERFIL")%></option>                    
                    <%
                        }
                    %>	
                </select>
                    <input type="text" name="txtNomUsuario" placeholder="Nombre de Usuario" id="txtNomUsuario" value="<%=txtNomUsuario%>">
                    <input type="password" name="txtContrasena" placeholder="Contraseña" id="txtContrasena" value="<%=txtContrasena%>">
                    <input type="password" name="txtConfContrasena" placeholder="Confirmar Contraseña" id="txtConfContrasena">
            </div>
                <div class="botones"> 
                    <input type="submit" id="guardar" name="guardar" class="boton" value="Guardar">
                    <input type="submit" id="buscar" name="buscar" class="boton" value="Buscar">
                    <input type="submit" id="editar" name="editar" class="boton" value="Editar">
                    <input type="submit" id="eliminar" name="eliminar" class="boton" value="Eliminar">
                </div>
                <div class="dere"> 
                    <input type="submit" id="nuevo" name="nuevo" class="boton" value="Nuevo">
                    <input type="submit" id="listar" name="listar" class="boton" value="Listar">
                    <input type="submit" id="limpiar" name="limpiar" class="boton" value="Limpiar">
                    <input type="submit" id="volver" name="volver" class="boton" value="Volver">
                </div>
        </form>

    </section>
                <h1><%=mensaje%></h1>
</body>
</html>
