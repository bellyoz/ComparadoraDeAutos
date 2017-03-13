<%@page import="com.webservice.Caracteristicas"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="modelo.VehiculoCrud"%>
<!DOCTYPE html>
<html >

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Tu automovil</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">

    <link href="css/sb-admin.css" rel="stylesheet">

    <link href="css/plugins/morris.css" rel="stylesheet">

    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">



</head>

<body>

    <div id="wrapper">

        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
       
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="http://localhost:8080/Automovil/index_admin.jsp">Tu Vehiculo</a>
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
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav side-nav">
                    <li>
                        <a href="http://localhost:8080/Automovil/index_admin.jsp"><i class="fa fa-fw fa-user"></i> Usuario</a>
                    </li>
                    <li>
                        <a href="vehiculo.jsp"><i class="fa fa-fw fa-dashboard"></i> Vehiculo</a>
                    </li>
                    <li class="active" >
                        <a href="caracteristicas.jsp"><i class="fa fa-fw fa-edit"></i> Caracteristicas</a>
                    </li>
                    <li  >
                        <a href="detallevehiculo.jsp"><i class="fa fa-fw fa-wrench"></i> Detalle vehiculo</a>
                    </li>
                    <li>
                        <a href="reportes.jsp"><i class="fa fa-fw fa-desktop"></i> Reportes</a>
                    </li>
                    
                   
                </ul>
            </div>
            
        </nav>

        <div id="page-wrapper">

            <div class="container-fluid">

               
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">
                            Caracteristicas <small>Crud Caracteristicas</small>
                        </h1>
                        <a class="btn btn-primary" href="crearcaracteristicas.jsp"> Crear caracteristicas </a>
                        <p><br/></p>
                        
                        <div class="table-responsive">
                            <table class="table table-bordered table-hover table-striped">
                                <thead>
                                    <tr>
                                        
                                        <th>id</th>
                                        <th>version</th>
                                        <th>Combustible</th>
                                        <th>Potencia Max</th>
                                        <th>Traccion</th>
                                        <th>caja Cambios</th>
                                        <th>No Puertas</th>
                                        <th>maletero</th>
                                        <th>deposito</th>
                                        <th>aceleracion</th>
                                        <th>vel max</th>
                                        <th>Consumo Urbano</th>
                                        <th>Consumo extraurbano</th>
                                        <th>Consumo Medio</th>
                                         <th>Consumo extra</th>
                                        <th>Emisiones Co2</th>
                                        <th>Crud</th>
                                    </tr>
                                </thead>
                                <tbody>
                                     <%
                                       VehiculoCrud vehi = new VehiculoCrud();
                                       List<Caracteristicas> dato = vehi.listaDeCaracteristicas();
                                  
                          
                                    for (Caracteristicas us : dato) {
                                        if(!us.getVersion().equals("")){
                                        
                                %>
                                    <tr>
                                        <td><%= us.getIdCaracteristicas()%></td>
                                        <td><%= us.getVersion()%></td>
                                        <td><%= us.getCombustible()%></td>
                                        <td><%= us.getPotencimax()%></td>
                                        <td><%= us.getTraccion()%></td>
                                        <td><%= us.getCajacambios()%></td>
                                        <td><%= us.getNopuertas()%></td>
                                        <td><%= us.getVolumenmaletero()%></td>
                                        <td><%= us.getCapdeposito()%></td>
                                        <td><%= us.getAceleracion()%></td>
                                        <td><%= us.getVelmax()%></td>
                                        <td><%= us.getConsumou()%></td>
                                        <td><%= us.getConsumom()%></td>
                                        <td><%= us.getConsumeex()%></td>
                                        <td><%= us.getConsumem()%></td>
                              
                                        <td><%= us.getEmisionesco2()%></td>
                                        <td>
                                            <button type="submit"><a href="modificarcaracteristica.jsp?id=<%= us.getIdCaracteristicas()%>">Modificar</a></button>
                                            <button type="submit"><a href="Controlador?id=<%= us.getIdCaracteristicas()%>&val=eliminarC">Eliminar</a></button>
                                        </td>
                                        
                                    </tr>
                                    <%
                                    }
                                    }
                                %>
                                    
                                </tbody>
                            </table>
                        </div>
                        
                    </div>
                </div>
            </div>
        </div>
    </div>

    <script src="js/jquery.js"></script>

    <script src="js/bootstrap.min.js"></script>

    <script src="js/plugins/morris/raphael.min.js"></script>
    <script src="js/plugins/morris/morris.min.js"></script>
    <script src="js/plugins/morris/morris-data.js"></script>

</body>

</html>
