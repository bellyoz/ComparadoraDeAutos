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
                            <a href="Controlador?sc=1" ><i class="fa fa-fw fa-power-off"></i> Log Out</a>
                        </li>
                    </ul>
                </li>
            </ul>
            
        </nav>
    
    	<div class="contenedor-formulario">
  <div class="wrap">
    <form action="Controlador" class="formulario" name="formulario_registro" method="post">
      <div>
        <div class="input-group">
          <input type="text" id="version" name="version">
          <label class="label" for="version">version:</label>
        </div>
        <div class="input-group">
          <input type="text" id="combustible" name="combustible">
          <label class="label" for="combustible">combustible:</label>
        </div>
          <div class="input-group">
          <input type="text" id="Potenciamax" name="Potenciamax">
          <label class="label" for="Potenciamax">Potencia max:</label>
          </div>
              <div class="input-group">
          <input type="text" id="Nocilindros" name="Nocilindros">
          <label class="label" for="Nocilindros">No cilindros:</label>
        </div>
              <div class="input-group">
          <input type="text" id="traccion" name="traccion">
          <label class="label" for="traccion">traccion:</label>
        </div>
              <div class="input-group">
          <input type="text" id="cajacambios" name="cajacambios">
          <label class="label" for="cajacambios">cajacambios:</label>
        </div>
              <div class="input-group">
          <input type="text" id="NoPuertas" name="NoPuertas">
          <label class="label" for="NoPuertas">No Puertas:</label>
        </div>
              <div class="input-group">
          <input type="text" id="maletero" name="maletero">
          <label class="label" for="maletero">maletero:</label>
        </div>
              <div class="input-group">
          <input type="text" id="capdeposito" name="capdeposito">
          <label class="label" for="capdeposito">cap deposito:</label>
        </div>
              <div class="input-group">
          <input type="text" id="aceleracion" name="aceleracion">
          <label class="label" for="aceleracion">aceleracion:</label>
        </div>
              <div class="input-group">
          <input type="text" id="Velmax" name="Velmax">
          <label class="label" for="Velmax">Velmax:</label>
        </div>
              <div class="input-group">
          <input type="text" id="consumou" name="consumou">
          <label class="label" for="consumou">Consumo Urbano:</label>
        </div>
              <div class="input-group">
          <input type="text" id="consumoe" name="consumoe">
          <label class="label" for="consumoe">Consumo extraurbano:</label>
        </div>
              <div class="input-group">
          <input type="text" id="consumomo" name="consumomo">
          <label class="label" for="consumom">Consumo Medio:</label>
        </div>
              <div class="input-group">
          <input type="text" id="consumoex" name="consumoex">
          <label class="label" for="consumoex">Consumo extra:</label>
        </div>
              <div class="input-group">
          <input type="text" id="emosionesco" name="emosionesco">
                  <label class="label" for="emosionesco">Emisiones co2</label>
        </div>
        </div>
        <input type="submit" id="btn-submit" name ="boton" value="Crear caracteristica">
      </div>
    </form>
  </div>
</div>
	<script src="js/formulario.js"></script>

    <script src="js/jquery.js"></script>

    <script src="js/bootstrap.min.js"></script>

  

</body>

</html>
