<%@page import="com.webservice.Caracteristicas"%>
<%@page import="com.webservice.Vehiculo"%>
<%@page import="com.webservice.DetalleVehiculoPK"%>
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

    <title>Tu Vehiculo</title>

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
                    <li >
                        <a href="caracteristicas.jsp"><i class="fa fa-fw fa-edit"></i> Caracteristicas</a>
                    </li>
                    <li  class="active">
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
                            Detalle Vehiculo <small>Crud DetalleVehiculo</small>
                        </h1>
                        <a class="btn btn-primary" href="creardetallevehiculo.jsp"> Crear detallevehiculo </a>
                        <p><br/></p>
                        
                        <div class="table-responsive">
                            <table class="table table-bordered table-hover table-striped">
                                <thead>
                                    <tr>
                                        
                                        <th>id</th>
                                        <th>modelo</th>
                                        <th>marca</th>
                                        <th>serie</th>
                                        <th>Crud</th>
                                        <th>version</th>
                                        <th>Combustible</th>
                                        <th>Potencia Max</th>
                                        <th>Traccion</th>
                                        <th>caja Cambios</th>
                                        <th>No Puertas</th>
                                        <th>maletero</th>
                                        <th>deposito</th>
                                        <th>aceleracion</th>
                                        <th>potencia max</th>
                                        <th>Consumo Urbano</th>
                                        <th>Consumo extraurbano</th>
                                        <th>Consumo Medio</th>
                                        <th>Emisiones Co2</th>
                                        <th>Crud</th>
                                    </tr>
                                </thead>
                                <tbody>
                                      <%
                                       VehiculoCrud vehi = new VehiculoCrud();
                                       List<DetalleVehiculoPK> dato = vehi.listaDeDetalleVehiculo();
                                      
                                    for (int i = 0; i < dato.size() ; i++) {
                                       List<Vehiculo> dato2 = vehi.vehiculo(dato.get(i).getCodigoVehiculo());
                                       List<Caracteristicas> dato3 = vehi.caracteristica(dato.get(i).getCodigoCaracteristicas());
                                            
                                %>
                                    <tr>
                                        <td><%= dato.get(i).getIdDetalleVehiculo()%></td>
                                        <td><%= dato2.get(0).getModelo()%></td>
                                        <td><%= dato2.get(0).getMarca()%></td>
                                        <td><%= dato2.get(0).getSerie()%></td>
                                        <td><%= dato3.get(0).getVersion()%></td>
                                        <td><%= dato3.get(0).getCombustible()%></td>
                                        <td><%= dato3.get(0).getPotencimax()%></td>
                                        <td><%= dato3.get(0).getTraccion()%></td>
                                        <td><%= dato3.get(0).getCajacambios()%></td>
                                        <td><%= dato3.get(0).getNopuertas()%></td>
                                        <td><%= dato3.get(0).getVolumenmaletero()%></td>
                                        <td><%= dato3.get(0).getCapdeposito()%></td>
                                        <td><%= dato3.get(0).getAceleracion()%></td>
                                        <td><%= dato3.get(0).getVelmax()%></td>
                                        <td><%= dato3.get(0).getConsumou()%></td>
                                        <td><%= dato3.get(0).getConsumom()%></td>
                                        <td><%= dato3.get(0).getConsumeex()%></td>
                                        <td><%= dato3.get(0).getConsumem()%></td>
                                        <td><%= dato3.get(0).getEmisionesco2()%></td>
                                        <td>
                                            <button type="submit"><a href="modificardetallevehiculo.jsp?id=<%= dato.get(i).getIdDetalleVehiculo()%>">Modificar</a></button>
                                            <button type="submit"><a href="Controlador?id=<%= dato.get(i).getIdDetalleVehiculo()%>&val=eliminarD">Eliminar</a></button>
                                        </td>
                                        
                                    </tr>
                                    <%
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
