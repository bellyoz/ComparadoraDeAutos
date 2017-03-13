<%@page import="com.webservice.Vehiculo"%>
<%@page import="java.util.List"%>
<%@page import="com.webservice.DetalleVehiculoPK"%>
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

    <link href="css/modern-business.css" rel="stylesheet">
    
    <link href="css/estilo.css" rel="stylesheet">

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
 
    <header>
        <div class="container">
            <div class="row">
                <form action="Controlador" method="post">
                <div class="col-lg-3">
                <h3>Vehiculo 1</h3>  
                <div class="form-group">
                    <label>Seleciona el vehiculo</label>
                    <select class="form-control" name ="opc1">
                <option>Elegir</option>
                <%
                    VehiculoCrud vehi = new VehiculoCrud();
                    List<DetalleVehiculoPK> dato = vehi.listaDeDetalleVehiculo();
                     for (int i = 0; i < dato.size() ; i++) {
                         List<Vehiculo> dato2 = vehi.vehiculo(dato.get(i).getCodigoVehiculo());
                     System.out.println(" id "+dato.get(i).getIdDetalleVehiculo());
                %>
                
                
                <option value ="<%= dato.get(i).getIdDetalleVehiculo()%>" ><%= dato.get(i).getIdDetalleVehiculo()%><%= dato2.get(0).getMarca()%> - <%= dato2.get(0).getModelo()%></option>
                
                 <%
                    }
                %>
                    </select>
                </div>
                </div>
                <div class="col-lg-3">
                 <h3>Vehiculo 2</h3> 
                    <div class="form-group">
                    <label>Seleciona el vehiculo</label>
                    <select class="form-control" name ="opc2">
                <option>Elegir</option>
                <%
                    
                     for (int i = 0; i < dato.size() ; i++) {
                         List<Vehiculo> dato2 = vehi.vehiculo(dato.get(i).getCodigoVehiculo());
                     
                %>
                
                
                <option value ="<%= dato.get(i).getIdDetalleVehiculo()%>" ><%= dato2.get(0).getMarca()%> - <%= dato2.get(0).getModelo()%></option>
                
                 <%
                    }
                %>
                    </select>
                </div>
                    
                </div>
                <div class="col-lg-3">
                 <h3>Vehiculo 3</h3> 
                    <div class="form-group">
                    <label>Seleciona el vehiculo</label>
                    <select class="form-control" name ="opc3">
                <option>Elegir</option>
                <%
                    
                     for (int i = 0; i < dato.size() ; i++) {
                         List<Vehiculo> dato2 = vehi.vehiculo(dato.get(i).getCodigoVehiculo());
                     
                %>
                
                
                <option value ="<%= dato.get(i).getIdDetalleVehiculo()%>" ><%= dato2.get(0).getMarca()%> - <%= dato2.get(0).getModelo()%></option>
                
                 <%
                    }
                %>
                    </select>
                </div>
                </div>
                <div class="col-lg-3">
                  <h3>Vehiculo 4</h3>  
                    <div class="form-group">
                    <label>Seleciona el vehiculo</label>
                    <select class="form-control" name ="opc4">
                <option>Elegir</option>
                <%
                    
                     for (int i = 0; i < dato.size() ; i++) {
                         List<Vehiculo> dato2 = vehi.vehiculo(dato.get(i).getCodigoVehiculo());
                     
                %>
                
                
                <option value ="<%= dato.get(i).getIdDetalleVehiculo()%>" ><%= dato2.get(0).getMarca()%> - <%= dato2.get(0).getModelo()%></option>
                
                 <%
                    }
                %>
                    </select>
                </div>
                </div>
            </div>
            <input type="submit" id="btn-submit center-block" name ="boton" value="Comparar">
    </form>
        </div>
    </header>

    <script src="js/jquery.js"></script>

    <script src="js/bootstrap.min.js"></script>

   

</body>

</html>
