<%@page import="java.util.List"%>
<%@page import="com.webservice.Vehiculo"%>
<%@page import="modelo.VehiculoCrud"%>
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
                <a class="navbar-brand" href="http://localhost:8080/Automovil/index_admin.jsp">Tu Automovil</a>
            </div>
        
            <ul class="nav navbar-right top-nav">
                <li>
                        <a href="comparar.jsp">Comparar</a>
                    </li>
                    <li>
                        <a href="http://localhost:8080/Automovil/index_admin.jsp">Administrar</a>
                    </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> ${sessionScope.usuario} <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                       
                        <li class="divider"></li>
                        <li>
                            <a href="#"><i class="fa fa-fw fa-power-off"></i> Log Out</a>
                        </li>
                    </ul>
                </li>
            </ul>
            
        </nav>
    
    	<div class="contenedor-formulario">
  <div class="wrap">
    <form action="Controlador" class="formulario" name="formulario_registro" method="post">
      <div>
          <%
              VehiculoCrud user = new VehiculoCrud();
              List<Vehiculo> data = user.vehiculo(Integer.parseInt(request.getParameter("id")));
              VehiculoCrud.id = Integer.parseInt(request.getParameter("id"));
              
          %>
        <div class="input-group">
            <input type="text" id="modelo" name="modelo" value="<%= data.get(0).getModelo()%>">
          <label class="label" for="modelo">modelo:</label>
        </div>
        <div class="input-group">
          <input type="text" id="marca" name="marca" value="<%= data.get(0).getMarca()%>">
          <label class="label" for="marca">marca:</label>
        </div>
          <div class="input-group">
          <input type="text" id="serie" name="serie" value="<%= data.get(0).getSerie()%>">
          <label class="label" for="serie">serie:</label>
        </div>
        <input type="submit" id="btn-submit" name ="boton" value="Modificar Vehiculo">
      </div>
    </form>
  </div>
</div>
	<script src="js/formulario2.js"></script>

    <script src="js/jquery.js"></script>

    <script src="js/bootstrap.min.js"></script>

    

</body>

</html>
