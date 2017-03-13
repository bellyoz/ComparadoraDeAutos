/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.ReporteCrud;
import modelo.VehiculoCrud;

/**
 *
 * @author bellyoz
 */
@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
     public  HttpSession sesion;
     public static int entero = 0;
     public static int entero1 = 0;
     public static int entero2 = 0;
     public static int entero3 = 0;
     public static int entero4 = 0;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            sesion = request.getSession(); 
             if(request.getParameter("session") != null ){
                 sesion.setAttribute("usuario", request.getParameter("session"));
                 response.sendRedirect("vehiculo.jsp");
             }
             
                if("Modificar Vehiculo".equals(request.getParameter("boton"))){
                    VehiculoCrud vehi = new VehiculoCrud();
                    
                    vehi.actualizarVehiculo(vehi.id,request.getParameter("modelo"),request.getParameter("marca"),request.getParameter("serie"));
                    response.sendRedirect("vehiculo.jsp");
                }
                if("Crear Vehiculo".equals(request.getParameter("boton"))){
                    VehiculoCrud vehi = new VehiculoCrud();
                    
                    vehi.insertarVehiculo(request.getParameter("modelo"),request.getParameter("marca"),request.getParameter("serie"));
                    response.sendRedirect("vehiculo.jsp");
                }
                System.out.println("elimi"+request.getParameter("val"));
                if("eliminar".equals(request.getParameter("val"))){
                    VehiculoCrud vehi = new VehiculoCrud();
                    System.out.println(""+request.getParameter("id"));
                    vehi.borrarVehiculo(Integer.parseInt(request.getParameter("id")));
                    response.sendRedirect("vehiculo.jsp");
                }
                 if("eliminarC".equals(request.getParameter("val"))){
                    VehiculoCrud vehi = new VehiculoCrud();
                    System.out.println("elimi"+request.getParameter("id"));
                    vehi.borrarCaracteristica(Integer.parseInt(request.getParameter("id")));
                    response.sendRedirect("caracteristicas.jsp");
                }
                 if("Crear caracteristica".equals(request.getParameter("boton"))){
                    VehiculoCrud vehi = new VehiculoCrud();
                    
                    vehi.insertarCaracteristica(request.getParameter("version"),request.getParameter("combustible"),Integer.parseInt(request.getParameter("Potenciamax")),Integer.parseInt(request.getParameter("Nocilindros")),request.getParameter("traccion"),Integer.parseInt(request.getParameter("cajacambios")),Integer.parseInt(request.getParameter("NoPuertas")),Integer.parseInt(request.getParameter("maletero")),Integer.parseInt(request.getParameter("capdeposito")),Integer.parseInt(request.getParameter("aceleracion")),Integer.parseInt(request.getParameter("Velmax")),Integer.parseInt(request.getParameter("consumou")),Integer.parseInt(request.getParameter("consumoe")),Integer.parseInt(request.getParameter("consumomo")),Integer.parseInt(request.getParameter("consumoex")),Integer.parseInt(request.getParameter("emosionesco")));
                    response.sendRedirect("caracteristicas.jsp");
                }
                 if("Modificar Caracteristica".equals(request.getParameter("boton"))){
                    VehiculoCrud vehi = new VehiculoCrud();
                    
                    vehi.actualizarCaracteristicas(entero,
                            request.getParameter("version"),request.getParameter("combustible"),
                            Integer.parseInt(request.getParameter("Potenciamax")),
                            Integer.parseInt(request.getParameter("Nocilindros")),
                            request.getParameter("traccion"),Integer.parseInt(request.getParameter("cajacambios")),
                            Integer.parseInt(request.getParameter("NoPuertas")),
                            Integer.parseInt(request.getParameter("maletero")),
                            Integer.parseInt(request.getParameter("capdeposito")),
                            Integer.parseInt(request.getParameter("aceleracion")),
                            Integer.parseInt(request.getParameter("Velmax")),
                            Integer.parseInt(request.getParameter("consumou")),
                            Integer.parseInt(request.getParameter("consumoe")),
                            Integer.parseInt(request.getParameter("consumomo")),
                            Integer.parseInt(request.getParameter("consumoex")),
                            Integer.parseInt(request.getParameter("emosionesco")));
                    response.sendRedirect("caracteristicas.jsp");
                }
                 if("Modificar Detalle Vehiculo".equals(request.getParameter("boton"))){
                     VehiculoCrud vehi = new VehiculoCrud();
                     System.out.println("opc 1 "+Integer.parseInt(request.getParameter("opc2")));
                     vehi.actualizarDetalleVehiculo(entero, Integer.parseInt(request.getParameter("opc1")), Integer.parseInt(request.getParameter("opc2")));
                     response.sendRedirect("detallevehiculo.jsp");
                 }
                 if("eliminarD".equals(request.getParameter("val"))){
                     VehiculoCrud vehi = new VehiculoCrud();
                     vehi.borrardDetalleVehiculo(Integer.parseInt(request.getParameter("id")));
                     response.sendRedirect("detallevehiculo.jsp");
                 }
                 if("Crear Detalle Vehiculo".equals(request.getParameter("boton"))){
                     VehiculoCrud vehi = new VehiculoCrud();
                     vehi.insertarDetalleVehiculo(Integer.parseInt(request.getParameter("opc1")), Integer.parseInt(request.getParameter("opc2")));
                     response.sendRedirect("detallevehiculo.jsp");
                 }
                 if("Comparar".equals(request.getParameter("boton"))){
                     entero1=0;
                     entero2=0;
                             entero3=0;
                             entero4 = 0;
                             int indice = 0;
                              ReporteCrud re = new ReporteCrud();
                              indice = re.indice();
                     if(!request.getParameter("opc1").equals("Elegir")  ){
                     entero1 = Integer.parseInt(request.getParameter("opc1"));
                     System.out.println("entero 1 :"+entero1);
                         System.out.println(" indice "+re.indice());
                     re.insertarReporte(entero1,sesion.getAttribute("usuario").toString(),indice, 0);
                     }
                     if(!request.getParameter("opc2").equals("Elegir")) {
                         entero2 = Integer.parseInt(request.getParameter("opc2"));
                         System.out.println("entero 2 :"+entero2);
                       re.insertarReporte(entero2,sesion.getAttribute("usuario").toString(),indice, 0);
                     } 
                     
                     if(!request.getParameter("opc3").equals("Elegir")) {
                       entero3 = Integer.parseInt(request.getParameter("opc3"));
                     System.out.println("entero 3:"+entero3);
                        re.insertarReporte(entero3,sesion.getAttribute("usuario").toString(),indice, 0);
                     }
                     if(!request.getParameter("opc4").equals("Elegir")) {
                        entero4 = Integer.parseInt(request.getParameter("opc4"));
                     System.out.println("entero 4:"+entero4);
                     re.insertarReporte(entero4,sesion.getAttribute("usuario").toString(),indice, 0);
                     }
                    
                     System.out.println("indice : "+re.indice());
                     
                     response.sendRedirect("generarcomparar.jsp");
                 }
                 if("Calificar".equals(request.getParameter("boton"))){
                     
                             int indice = 0;
                              ReporteCrud re = new ReporteCrud();
                              indice = re.indice();
                     ArrayList<Integer> id = new ArrayList<>();
                     id = re.ids();
                     
                     if(!request.getParameter("opc1").equals("Elegir")  ){
                     
                     System.out.println("entero 1 :"+entero1);
                         System.out.println(" indice "+re.indice());
                         
                         System.out.println("i "+id.get(0));
                         re.actualizarCalificacion(id.get(0),entero1, sesion.getAttribute("usuario").toString(), indice-1, Integer.parseInt(request.getParameter("opc1")));
                    
                        // re.actualizarCalificacion(indice, entero1);
                     //re.insertarReporte(entero1,sesion.getAttribute("usuario").toString(),indice, 0);
                     }
                     if(!request.getParameter("opc2").equals("Elegir")) {
                         entero2 = Integer.parseInt(request.getParameter("opc2"));
                         System.out.println("entero 2 :"+entero2);
                         
                         System.out.println("i "+id.get(1));
                         re.actualizarCalificacion(id.get(1),entero2, sesion.getAttribute("usuario").toString(), indice-1, Integer.parseInt(request.getParameter("opc2")));
                     
                      // re.insertarReporte(entero2,sesion.getAttribute("usuario").toString(),indice, 0);
                     } 
                     
                     if(!request.getParameter("opc3").equals("Elegir")) {
                       entero3 = Integer.parseInt(request.getParameter("opc3"));
                     System.out.println("entero 3:"+entero3);
                     System.out.println("i "+id.get(2));
                         re.actualizarCalificacion(id.get(2),entero3, sesion.getAttribute("usuario").toString(), indice-1, Integer.parseInt(request.getParameter("opc3")));
                     
                     //   re.insertarReporte(entero3,sesion.getAttribute("usuario").toString(),indice, 0);
                     }
                     if(!request.getParameter("opc4").equals("Elegir")) {
                        entero4 = Integer.parseInt(request.getParameter("opc4"));
                     System.out.println("entero 4:"+entero4);
                     System.out.println("i "+id.get(3));
                         re.actualizarCalificacion(id.get(3),entero4, sesion.getAttribute("usuario").toString(), indice-1, Integer.parseInt(request.getParameter("opc4")));
                     
                     //re.insertarReporte(entero4,sesion.getAttribute("usuario").toString(),indice, 0);
                     }
                    
                     response.sendRedirect("comparar.jsp");
                 }
                 if("ver".equals(request.getParameter("boton"))){
                     
                     response.sendRedirect("reportes.jsp");
                 }
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
