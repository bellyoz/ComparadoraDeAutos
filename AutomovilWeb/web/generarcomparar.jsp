<%@page import="com.webservice.Caracteristicas"%>
<%@page import="com.webservice.Vehiculo"%>
<%@page import="com.webservice.DetalleVehiculoPK"%>
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
                    <label>Califica</label>
                    <select class="form-control" name="opc1">
                        <option>Elegir</option>
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                        
                 </select>
                </div>
                
                <div class="form-group">
                 <div class="table-responsive">
                            <table class="table table-bordered table-hover table-striped">
                                <thead>
                                    <tr>
                                        
                                        <th>Caracteristicas</th>
                                        <th></th>
                                        
                                    </tr>
                                </thead>
                                <tbody>
                                    <%
                                        VehiculoCrud vehi = new VehiculoCrud();
                                        if(Controladores.Controlador.entero1 != 0){
                                        List<DetalleVehiculoPK> dato = vehi.DetalleVehiculo(Controladores.Controlador.entero1);
                                            System.out.println("Entro 1");
                                             List<Vehiculo> dato2 = vehi.vehiculo(dato.get(0).getCodigoVehiculo());
                                             List<Caracteristicas> dato3 = vehi.caracteristica(dato.get(0).getCodigoCaracteristicas());
                                    %>
                                                                    <tr>
                                        <th>modelo</th>
                                        <th><%= dato2.get(0).getModelo()%></th>
                                </tr>

                                <tr>
                                        <th>marca</th><%= dato2.get(0).getMarca()%></tr>

                                <tr>       <th>serie</th><th><%= dato2.get(0).getSerie()%></th></tr>
                                 
                                 <tr>       <th>version</th><th><%= dato3.get(0).getVersion()%></th></tr>
                                 <tr>       <th>Combustible</th><%= dato3.get(0).getCombustible()%><th></th></tr>
                                 <tr>       <th>Potencia Max</th><th><%= dato3.get(0).getPotencimax()%></th></tr>
                                 <tr>       <th>Traccion</th><th></th><%= dato3.get(0).getTraccion()%></tr>
                                 <tr>       <th>caja Cambios</th><th><%= dato3.get(0).getCajacambios()%></th></tr>
                                 <tr>       <th>No Puertas</th><th><%= dato3.get(0).getNopuertas()%></th></tr>
                                 <tr>       <th>maletero</th><th><%= dato3.get(0).getVolumenmaletero()%></th></tr>
                                 <tr>       <th>deposito</th><th><%= dato3.get(0).getCapdeposito()%></th></tr>
                                 <tr>       <th>aceleracion</th><th><%= dato3.get(0).getAceleracion()%></th></tr>
                                 <tr>       <th>vel max</th><th><%= dato3.get(0).getVelmax()%></th></tr>
                                 <tr>       <th>Consumo Urbano</th><th><%= dato3.get(0).getConsumou()%></th></tr>
                                  <tr>       <th>Consumo </th><th><%= dato3.get(0).getConsumom()%></th></tr>
                                 <tr>       <th>Consumo extraurbano</th><%= dato3.get(0).getConsumeex()%><th></th></tr>
                                 <tr>       <th>Consumo Medio</th><th><%= dato3.get(0).getConsumem()%></th></tr>
                                 
                                 <tr>       <th>Emisiones Co2</th><th><%= dato3.get(0).getVersion()%></th></tr>
                                
                                 <%
                                     }
                                 %>
                                </tbody>
                            </table>
                        </div>  
                  
                </div>
                </div>
                <div class="col-lg-3">
                 <h3>Vehiculo 2</h3> 
                      <div class="form-group">
                    <label>Califica</label>
                    <select class="form-control" name="opc2">
                        <option>Elegir</option>
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                        
                 </select>
                </div>
                    <div class="form-group">
                 <div class="table-responsive">
                            <table class="table table-bordered table-hover table-striped">
                                <thead>
                                    <tr>
                                        
                                        <th>Caracteristicas</th>
                                        <th></th>
                                        
                                    </tr>
                                </thead>
                                <tbody>
                                    <%
                                       if(Controladores.Controlador.entero2 != 0){
                                        List<DetalleVehiculoPK> dato1 = vehi.DetalleVehiculo(Controladores.Controlador.entero2);
                                        System.out.println("Entro 2");
                                            List<Vehiculo>  dato2 = vehi.vehiculo(dato1.get(0).getCodigoVehiculo());
                                            List<Caracteristicas> dato3 = vehi.caracteristica(dato1.get(0).getCodigoCaracteristicas());
                                    %>
                                                                    <tr>
                                        <th>modelo</th>
                                        <th><%= dato2.get(0).getModelo()%></th>
                                </tr>

                                <tr>
                                        <th>marca</th><%= dato2.get(0).getMarca()%></tr>

                                <tr>       <th>serie</th><th><%= dato2.get(0).getSerie()%></th></tr>
                                 
                                 <tr>       <th>version</th><th><%= dato3.get(0).getVersion()%></th></tr>
                                 <tr>       <th>Combustible</th><%= dato3.get(0).getCombustible()%><th></th></tr>
                                 <tr>       <th>Potencia Max</th><th><%= dato3.get(0).getPotencimax()%></th></tr>
                                 <tr>       <th>Traccion</th><th></th><%= dato3.get(0).getTraccion()%></tr>
                                 <tr>       <th>caja Cambios</th><th><%= dato3.get(0).getCajacambios()%></th></tr>
                                 <tr>       <th>No Puertas</th><th><%= dato3.get(0).getNopuertas()%></th></tr>
                                 <tr>       <th>maletero</th><th><%= dato3.get(0).getVolumenmaletero()%></th></tr>
                                 <tr>       <th>deposito</th><th><%= dato3.get(0).getCapdeposito()%></th></tr>
                                 <tr>       <th>aceleracion</th><th><%= dato3.get(0).getAceleracion()%></th></tr>
                                 <tr>       <th>vel max</th><th><%= dato3.get(0).getVelmax()%></th></tr>
                                 <tr>       <th>Consumo Urbano</th><th><%= dato3.get(0).getConsumou()%></th></tr>
                                  <tr>       <th>Consumo </th><th><%= dato3.get(0).getConsumom()%></th></tr>
                                 <tr>       <th>Consumo extraurbano</th><%= dato3.get(0).getConsumeex()%><th></th></tr>
                                 <tr>       <th>Consumo Medio</th><th><%= dato3.get(0).getConsumem()%></th></tr>
                                 
                                 <tr>       <th>Emisiones Co2</th><th><%= dato3.get(0).getVersion()%></th></tr>
                                 <%
                                     }
                                 %>
                                </tbody>
                            </table>
                        </div>  
                  
                </div>
                    
                </div>
                <div class="col-lg-3">
                 <h3>Vehiculo 3</h3> 
                      <div class="form-group">
                    <label>Califica</label>
                    <select class="form-control" name="opc3">
                        <option>Elegir</option>
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                        
                 </select>
                </div>
                    <div class="form-group">
                 <div class="table-responsive">
                            <table class="table table-bordered table-hover table-striped">
                                <thead>
                                    <tr>
                                        
                                        <th>Caracteristicas</th>
                                        <th></th>
                                        
                                    </tr>
                                </thead>
                                <tbody>
                                    <%
                                        System.out.println("entero 3 "+Controladores.Controlador.entero3);
                                        if(Controladores.Controlador.entero3 != 0){
                                        List<DetalleVehiculoPK> dato4 = vehi.DetalleVehiculo(Controladores.Controlador.entero3);
                                        System.out.println("Entro 3");
                                            List<Vehiculo>  dato2 = vehi.vehiculo(dato4.get(0).getCodigoVehiculo());
                                            List<Caracteristicas> dato3 = vehi.caracteristica(dato4.get(0).getCodigoCaracteristicas());
                                    %>
                                                                    <tr>
                                        <th>modelo</th>
                                        <th><%= dato2.get(0).getModelo()%></th>
                                </tr>

                                <tr>
                                        <th>marca</th><%= dato2.get(0).getMarca()%></tr>

                                <tr>       <th>serie</th><th><%= dato2.get(0).getSerie()%></th></tr>
                                 
                                 <tr>       <th>version</th><th><%= dato3.get(0).getVersion()%></th></tr>
                                 <tr>       <th>Combustible</th><%= dato3.get(0).getCombustible()%><th></th></tr>
                                 <tr>       <th>Potencia Max</th><th><%= dato3.get(0).getPotencimax()%></th></tr>
                                 <tr>       <th>Traccion</th><th></th><%= dato3.get(0).getTraccion()%></tr>
                                 <tr>       <th>caja Cambios</th><th><%= dato3.get(0).getCajacambios()%></th></tr>
                                 <tr>       <th>No Puertas</th><th><%= dato3.get(0).getNopuertas()%></th></tr>
                                 <tr>       <th>maletero</th><th><%= dato3.get(0).getVolumenmaletero()%></th></tr>
                                 <tr>       <th>deposito</th><th><%= dato3.get(0).getCapdeposito()%></th></tr>
                                 <tr>       <th>aceleracion</th><th><%= dato3.get(0).getAceleracion()%></th></tr>
                                 <tr>       <th>vel max</th><th><%= dato3.get(0).getVelmax()%></th></tr>
                                 <tr>       <th>Consumo Urbano</th><th><%= dato3.get(0).getConsumou()%></th></tr>
                                  <tr>       <th>Consumo </th><th><%= dato3.get(0).getConsumom()%></th></tr>
                                 <tr>       <th>Consumo extraurbano</th><%= dato3.get(0).getConsumeex()%><th></th></tr>
                                 <tr>       <th>Consumo Medio</th><th><%= dato3.get(0).getConsumem()%></th></tr>
                                 
                                 <tr>       <th>Emisiones Co2</th><th><%= dato3.get(0).getVersion()%></th></tr>
                                
                                 <%
                                     }
                                     %>
                                </tbody>
                            </table>
                        </div>  
                  
                </div>
                </div>
                <div class="col-lg-3">
                  <h3>Vehiculo 4</h3>  
                      <div class="form-group">
                    <label>califica</label>
                    <select class="form-control" name="opc4">
                         <option>Elegir</option>
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                        
                 </select>
                </div>
                    <div class="form-group">
                 <div class="table-responsive">
                            <table class="table table-bordered table-hover table-striped">
                                <thead>
                                    <tr>
                                        
                                        <th>Caracteristicas</th>
                                        <th></th>
                                        
                                    </tr>
                                </thead>
                                <tbody>
                                    <%
                                        if(Controladores.Controlador.entero4 != 0){
                                        List<DetalleVehiculoPK> dato5 = vehi.DetalleVehiculo(Controladores.Controlador.entero4);
                                        System.out.println("Entro 4");
                                             List<Vehiculo>  dato2 = vehi.vehiculo(dato5.get(0).getCodigoVehiculo());
                                            List<Caracteristicas> dato3 = vehi.caracteristica(dato5.get(0).getCodigoCaracteristicas());
                                    %>
                                                                    <tr>
                                        <th>modelo</th>
                                        <th><%= dato2.get(0).getModelo()%></th>
                                </tr>

                                <tr>
                                        <th>marca</th><%= dato2.get(0).getMarca()%></tr>

                                <tr>       <th>serie</th><th><%= dato2.get(0).getSerie()%></th></tr>
                                 
                                 <tr>       <th>version</th><th><%= dato3.get(0).getVersion()%></th></tr>
                                 <tr>       <th>Combustible</th><%= dato3.get(0).getCombustible()%><th></th></tr>
                                 <tr>       <th>Potencia Max</th><th><%= dato3.get(0).getPotencimax()%></th></tr>
                                 <tr>       <th>Traccion</th><th></th><%= dato3.get(0).getTraccion()%></tr>
                                 <tr>       <th>caja Cambios</th><th><%= dato3.get(0).getCajacambios()%></th></tr>
                                 <tr>       <th>No Puertas</th><th><%= dato3.get(0).getNopuertas()%></th></tr>
                                 <tr>       <th>maletero</th><th><%= dato3.get(0).getVolumenmaletero()%></th></tr>
                                 <tr>       <th>deposito</th><th><%= dato3.get(0).getCapdeposito()%></th></tr>
                                 <tr>       <th>aceleracion</th><th><%= dato3.get(0).getAceleracion()%></th></tr>
                                 <tr>       <th>vel max</th><th><%= dato3.get(0).getVelmax()%></th></tr>
                                 <tr>       <th>Consumo Urbano</th><th><%= dato3.get(0).getConsumou()%></th></tr>
                                  <tr>       <th>Consumo </th><th><%= dato3.get(0).getConsumom()%></th></tr>
                                 <tr>       <th>Consumo extraurbano</th><%= dato3.get(0).getConsumeex()%><th></th></tr>
                                 <tr>       <th>Consumo Medio</th><th><%= dato3.get(0).getConsumem()%></th></tr>
                                 
                                 <tr>       <th>Emisiones Co2</th><th><%= dato3.get(0).getVersion()%></th></tr>
                                 <%
                                     }
                                     %>
                                </tbody>
                            </table>
                        </div>  
                  
                </div>
                </div>
            </div>
            <input type="submit" id="btn-submit center-block" name="boton" value="Calificar">
            </from>
        </div>
    </header>

    <script src="js/jquery.js"></script>

    <script src="js/bootstrap.min.js"></script>

   

</body>

</html>
