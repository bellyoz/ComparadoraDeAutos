/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Crud.UsuarioCrud;
import Entidades.Usuario;
import com.webservice.AutomovilWS_Service;
import com.webservice.Vehiculo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author bellyoz
 */
@WebServlet(name = "Session", urlPatterns = {"/Session"})
public class Session extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public static HttpSession sesion;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Session</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Session at " + request.getContextPath() + "</h1>");
             
               
                
                if("Entrar".equals(request.getParameter("boton"))){
                   
                sesion = request.getSession(true);
                
                UsuarioCrud user = new UsuarioCrud();
                Usuario u = new Usuario();
                u = user.usuario(request.getParameter("nombre"));
                
                if(u != null && request.getParameter("nombre").equals(u.getUsuario()) && request.getParameter("pass").equals(u.getPass()) && sesion.getAttribute("usuario") == null){
                  
                    sesion.setAttribute("usuario",request.getParameter("nombre"));
                   
                    response.sendRedirect("index_2.jsp");
                }else{
                    response.sendRedirect("index.jsp");
                }
                   
                   
            }
               
                
                if( "1".equals(request.getParameter("sc"))  && request.getParameter("sc") != null){
                    sesion.invalidate();
//                  System.out.println("session : "+sesion.getAttribute("usuario").toString());
                    response.sendRedirect("index.jsp");
                }
                
               if("eliminar".equals(request.getParameter("val")) && request.getParameter("val") != null){
                   UsuarioCrud user = new UsuarioCrud();
                   user.eliminarUsuario(request.getParameter("id"));
                   response.sendRedirect("index_admin.jsp");
               }
               if("Modificar Usuario".equals(request.getParameter("boton"))){
                   UsuarioCrud user = new UsuarioCrud();
                  
                   user.editarUsuario(request.getParameter("id"),request.getParameter("pass"));
                   response.sendRedirect("index_admin.jsp");
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
