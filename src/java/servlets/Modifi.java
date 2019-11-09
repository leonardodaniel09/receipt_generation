/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import Controlador.Consultas;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author trabajo
 */
public class Modifi extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
      Consultas co=new Consultas();
        
        String folio =request.getParameter("folio");
        String fecha =request.getParameter("fecha");
        String apellidos =request.getParameter("apellidos");
        String nombre =request.getParameter("nombre");
        String monto =request.getParameter("monto");
        String curso =request.getParameter("curso");
        String modulos =request.getParameter("modulos");
        String instructor =request.getParameter("instructor");
        String clave =request.getParameter("clave del curso o diplomado");
        String deposito =request.getParameter("deposito referencia");
        String correo =request.getParameter("correo");
        String telefono =request.getParameter("telefono");
        String comentario =request.getParameter("comentario");
        
        if (co.ventas(folio, fecha, apellidos, nombre,monto, curso, modulos, instructor, clave, deposito, correo, telefono, comentario)){
        response.sendRedirect("index.jsp");
        
        }else{
        response.sendRedirect("cuentauser.jsp");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
