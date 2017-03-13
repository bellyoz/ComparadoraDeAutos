<%@page import="Entidades.Usuario"%>
<%@page import="Crud.UsuarioCrud"%>
<!DOCTYPE html>
<html >

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
     <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Tu Automovil</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/sb-admin.css" rel="stylesheet">
  
    <link href="css/modern-business.css" rel="stylesheet">
   
	<link href='https://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'>
	<link rel="stylesheet" href="css/style.css">

</head>

<body>

   <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index_2.html">Tu Automovil</a>
            </div>
     
            <ul class="nav navbar-right top-nav">
                <li>
                        <a href="http://localhost:8080/AutomovilWeb/comparar.jsp">Comparar</a>
                    </li>
                    <li>
                        <a href="index_admin.html">Administrar</a>
                    </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> ${sessionScope.usuario} <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                       
                        <li class="divider"></li>
                        <li>
                            <a href="Session?sc=1" ><i class="fa fa-fw fa-power-off"></i> Log Out</a>
                        </li>
                    </ul>
                </li>
            </ul>
            
        </nav>
    
    	<div class="contenedor-formulario">
  <div class="wrap">
    <form action="Session?id=<%=request.getParameter("id")%>" class="formulario" name="formulario_registro" method="post">
      <div>
          <%
              UsuarioCrud user = new UsuarioCrud();
              Usuario data = new Usuario();
             
              data = user.usuario(request.getParameter("id"));
             
              
          %>
        <div class="input-group">
            <input type="text" id="nombre" name="nombre" value="<%=data.getUsuario()%>">
          <label class="label" for="nombre">Nombre:</label>
        </div>
        <div class="input-group">
          <input type="password" id="pass" name="pass" value="<%=data.getPass()%>">
          <label class="label" for="pass">Contraseña:</label>
        </div>        
        <input type="submit" name="boton" id="btn-submit" value="Modificar Usuario">
      </div>
    </form>
  </div>
</div>
	<script src="js/formulario.js"></script>

    <script src="js/jquery.js"></script>

    <script src="js/bootstrap.min.js"></script>

   

</body>

</html>
