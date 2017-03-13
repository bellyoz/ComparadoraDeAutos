<%@page import="com.webservice.Caracteristicas"%>
<%@page import="com.webservice.Vehiculo"%>
<%@page import="com.webservice.DetalleVehiculoPK"%>
<%@page import="modelo.VehiculoCrud"%>
<%@page import="web.service.Calificacion"%>
<%@page import="java.util.List"%>
<%@page import="modelo.ReporteCrud"%>
<!DOCTYPE html>
<html >

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Tu Automovil</title>

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
                    <li  >
                        <a href="vehiculo.jsp"><i class="fa fa-fw fa-dashboard"></i> Vehiculo</a>
                    </li>
                    <li >
                        <a href="caracteristicas.jsp"><i class="fa fa-fw fa-edit"></i> Caracteristicas</a>
                    </li>
                    <li >
                        <a href="detallevehiculo.jsp"><i class="fa fa-fw fa-wrench"></i> Detalle vehiculo</a>
                    </li>
                    <li class="active">
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
                            Reportes  <small> Comparaciones </small>
                        </h1>
                        <h3>Selecionar Usuario</h3>
                        <div class="form-group">
                            <form action="Controlador" method="post">
                            
                            
                            <select class="form-control">
                                <%
                                ReporteCrud re = new ReporteCrud();
                                List<Calificacion> dato = re.listadeCalificacion();
                                for(int i = 0 ; i < dato.size() ; i++){
                                    for(int j = 0; j< dato.size() ; j++){
                                String user = dato.get(i).getIdUsuario();
                                
                               if(user.equals(dato.get(j).getIdUsuario())){
                                
                            %>
                                <option><%=user %></option>
                                <%  break;}
                                    }
                                    }
                                 %>
                         </select>
                         <input type="submit" id="btn-submit" name ="boton" value="ver">
                            </form>
                        </div>
                                 <%
                                     VehiculoCrud vehi = new VehiculoCrud();
                                     for(int i = 0 ; i < dato.size() ; i++){
                                         
                                         System.out.println("dato : "+dato.get(i).getIdVehiculo());
                                         List<DetalleVehiculoPK> dato1 = vehi.DetalleVehiculo(dato.get(i).getIdVehiculo());
                                         
                                             
                                         
                                       
                                    %>
                        <div class="table-responsive">
                            <table class="table table-bordered table-hover table-striped">
                                <thead>
                                    <tr>
                                        
                                        <th>id</th>
                                        <th>Marca</th>
                                        <th>version</th>
                                        <th>Calificacion</th>
                                        
                                    </tr>
                                </thead>
                                <tbody>
                                    <%
                                         for(int j = 0 ; j < dato1.size() ; j++){
                                            System.out.println("dato1 : "+dato1.get(j).getCodigoVehiculo());
                                        
                                             List<Vehiculo> dato2  = vehi.vehiculo(dato1.get(0).getCodigoVehiculo());
                                             List<Caracteristicas> dato3 = vehi.caracteristica(dato1.get(0).getCodigoCaracteristicas());
                                        %>
                                    <tr>
                                        <td><%=dato.get(i).getIdComparacion()%></td>
                                        <td><%=dato2.get(0).getMarca()%></td>
                                        <td><%= dato3.get(0).getVersion()%></td>
                                        <td><%= dato.get(i).getComparacion()%></td>
                                        
                                    </tr>
                                    
                                </tbody>
                            </table>
                            <%
                                
                                
                                }
                                }
                                %>
                        </div>
                          <a class="btn btn-primary" href=""> Generar pdf </a>
                        <p><br/></p>
                        
                        
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
