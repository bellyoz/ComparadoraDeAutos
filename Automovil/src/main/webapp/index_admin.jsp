<%@page import="java.util.List"%>
<%@page import="Entidades.Usuario"%>
<%@page import="Crud.UsuarioCrud"%>
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
                <a class="navbar-brand" href="index_admin.jsp">Tu Vehiculo</a>
            </div>
            <ul class="nav navbar-right top-nav">
                <li>
                        <a href="http://localhost:8080/AutomovilWeb/comparar.jsp">Comparar</a>
                    </li>
                    <li>
                        <a href="index_admin.jsp">Administrar</a>
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
         
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav side-nav">
                     <li class="active">
                        <a href="index_admin.jsp"><i class="fa fa-fw fa-user"></i> Usuario</a>
                    </li>
                    <li>
                        <a href="http://localhost:8080/AutomovilWeb/Controlador?session=${sessionScope.usuario}"><i class="fa fa-fw fa-dashboard"></i> Vehiculo</a>
                    </li>
                    <li >
                        <a href="http://localhost:8080/AutomovilWeb/caracteristicas.jsp"><i class="fa fa-fw fa-edit"></i> Caracteristicas</a>
                    </li>
                    <li  >
                        <a href="http://localhost:8080/AutomovilWeb/detallevehiculo.jsp"><i class="fa fa-fw fa-wrench"></i> Detalle vehiculo</a>
                    </li>
                    <li>
                        <a href="http://localhost:8080/AutomovilWeb/reportes.jsp"><i class="fa fa-fw fa-desktop"></i> Reportes</a>
                    </li>
                    
                    
                </ul>
            </div>
     
        </nav>

        <div id="page-wrapper">

            <div class="container-fluid">

               
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">
                            Usuarios <small>Crud Usuarios</small>
                        </h1>
                        
                        <div class="table-responsive">
                            <table class="table table-bordered table-hover table-striped">
                                <thead>
                                    <tr>
                                        
                                        <th>usuario</th>
                                        <th>password</th>
                                        <th>crud</th>
                                    </tr>
                                </thead>
                                
                                
                                <tbody>
                                 <%
                                  UsuarioCrud user = new UsuarioCrud();
                                  List<Usuario> dato = user.usuarios();
                          
                                for (Usuario us : dato) {
                                    if(!us.getUsuario().equals("")){
                                %>
                        
                                    <tr>

                                        <td><%=us.getUsuario()%></td>
                                        <td><%=us.getPass()%></td>
                                        
                                        <td>
                                        <button type="submit"><a href="modificarusuario.jsp?id=<%=us.getUsuario()%>">Modificar</a></button>
                                        <button type="submit"><a href="Session?id=<%=us.getUsuario()%>&val=eliminar">Eliminar</a></button>
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
