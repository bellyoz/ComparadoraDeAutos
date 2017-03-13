package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.webservice.Caracteristicas;
import com.webservice.Vehiculo;
import com.webservice.DetalleVehiculoPK;
import java.util.List;
import java.util.List;
import modelo.VehiculoCrud;

public final class detallevehiculo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html >\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>Tu Vehiculo</title>\n");
      out.write("\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <link href=\"css/sb-admin.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <link href=\"css/plugins/morris.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("       \n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex1-collapse\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"index_2.html\">Tu Vehiculo</a>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"nav navbar-right top-nav\">\n");
      out.write("                <li>\n");
      out.write("                        <a href=\"comparar.html\">Comparar</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"index_admin.html\">Administrar</a>\n");
      out.write("                    </li>\n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-user\"></i> John Smith <b class=\"caret\"></b></a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                       \n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-fw fa-power-off\"></i> Log Out</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            \n");
      out.write("            <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\n");
      out.write("                <ul class=\"nav navbar-nav side-nav\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"index_admin.html\"><i class=\"fa fa-fw fa-user\"></i> Usuario</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"vehiculo.html\"><i class=\"fa fa-fw fa-dashboard\"></i> Vehiculo</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li >\n");
      out.write("                        <a href=\"caracteristicas.html\"><i class=\"fa fa-fw fa-edit\"></i> Caracteristicas</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li  class=\"active\">\n");
      out.write("                        <a href=\"detallevehiculo.html\"><i class=\"fa fa-fw fa-wrench\"></i> Detalle vehiculo</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"reportes.html\"><i class=\"fa fa-fw fa-desktop\"></i> Reportes</a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                   \n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div id=\"page-wrapper\">\n");
      out.write("\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("               \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <h1 class=\"page-header\">\n");
      out.write("                            Detalle Vehiculo <small>Crud DetalleVehiculo</small>\n");
      out.write("                        </h1>\n");
      out.write("                        <a class=\"btn btn-primary\" href=\"creardetallevehiculo.html\"> Crear detallevehiculo </a>\n");
      out.write("                        <p><br/></p>\n");
      out.write("                        \n");
      out.write("                        <div class=\"table-responsive\">\n");
      out.write("                            <table class=\"table table-bordered table-hover table-striped\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        \n");
      out.write("                                        <th>id</th>\n");
      out.write("                                        <th>modelo</th>\n");
      out.write("                                        <th>marca</th>\n");
      out.write("                                        <th>serie</th>\n");
      out.write("                                        <th>Crud</th>\n");
      out.write("                                        <th>version</th>\n");
      out.write("                                        <th>Combustible</th>\n");
      out.write("                                        <th>Potencia Max</th>\n");
      out.write("                                        <th>Traccion</th>\n");
      out.write("                                        <th>caja Cambios</th>\n");
      out.write("                                        <th>No Puertas</th>\n");
      out.write("                                        <th>maletero</th>\n");
      out.write("                                        <th>deposito</th>\n");
      out.write("                                        <th>aceleracion</th>\n");
      out.write("                                        <th>potencia max</th>\n");
      out.write("                                        <th>Consumo Urbano</th>\n");
      out.write("                                        <th>Consumo extraurbano</th>\n");
      out.write("                                        <th>Consumo Medio</th>\n");
      out.write("                                        <th>Emisiones Co2</th>\n");
      out.write("                                        <th>Crud</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                      ");

                                       VehiculoCrud vehi = new VehiculoCrud();
                                       List<DetalleVehiculoPK> dato = vehi.listaDeDetalleVehiculo();
                                      
                                    for (int i = 0; i < dato.size() ; i++) {
                                       List<Vehiculo> dato2 = vehi.vehiculo(dato.get(i).getCodigoVehiculo());
                                       List<Caracteristicas> dato3 = vehi.caracteristica(id);
                                            
                                
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td></td>\n");
      out.write("                                        <td>1265</td>\n");
      out.write("                                        <td>1265</td>\n");
      out.write("                                        <td>1265</td>\n");
      out.write("                                        <td>1265</td>\n");
      out.write("                                        <td>1265</td>\n");
      out.write("                                        <td>1265</td>\n");
      out.write("                                        <td>1265</td>\n");
      out.write("                                        <td>1265</td>\n");
      out.write("                                        <td>1265</td>\n");
      out.write("                                        <td>1265</td>\n");
      out.write("                                        <td>1265</td>\n");
      out.write("                                        <td>1265</td>\n");
      out.write("                                        <td>1265</td>\n");
      out.write("                                        <td>1265</td>\n");
      out.write("                                        <td>1265</td>\n");
      out.write("                                        <td>1265</td>\n");
      out.write("                                        <td>1265</td>\n");
      out.write("                                        <td>1265</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <button type=\"submit\"><a href=\"modificardetallevehiculo.html\">Modificar</a></button>\n");
      out.write("                                        <button type=\"submit\">Eliminar</button>\n");
      out.write("                                        </td>\n");
      out.write("                                        \n");
      out.write("                                    </tr>\n");
      out.write("                                    ");
}
                                        }
                                        
      out.write("\n");
      out.write("                                        \n");
      out.write("                                    \n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script src=\"js/jquery.js\"></script>\n");
      out.write("\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <script src=\"js/plugins/morris/raphael.min.js\"></script>\n");
      out.write("    <script src=\"js/plugins/morris/morris.min.js\"></script>\n");
      out.write("    <script src=\"js/plugins/morris/morris-data.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
