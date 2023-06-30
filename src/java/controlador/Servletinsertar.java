/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import modelo.Eleccion;
import modelo.EleccionDAO;
import com.google.gson.Gson;

/**
 *
 * @author PERSONAL
 */
@WebServlet(name = "Servletinsertar", urlPatterns = {"/Servletinsertar"})

public class Servletinsertar extends HttpServlet {
    
      EleccionDAO eledao = new EleccionDAO();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         PrintWriter out = response.getWriter();
    
         if(request.getParameter("btnins")!=null){
             this.insertar(request, response);
         }
         //if(request.getParameter("btnact")!=null){
              //this.actualizar(request, response);
        // }
    
    
    
    
    
    }
    protected void insertar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
             
         String c;
         int y;
         
        String aStr = request.getParameter("ano");
        String dStr = request.getParameter("demo");
        String rStr = request.getParameter("rep");
        String oStr = request.getParameter("otro");
        String icStr=request.getParameter("idco");

        
        int a = Integer.parseInt(aStr);
        int d = Integer.parseInt(dStr);
        int r = Integer.parseInt(rStr);
        int o = Integer.parseInt(oStr);
        int ic = Integer.parseInt(icStr);
        c=request.getParameter("con");
         
         Eleccion eleccion=new Eleccion( a, d, r, o, c, ic );
         EleccionDAO usudao=new EleccionDAO();
         y=usudao.insertareleccion(eleccion);
         
         if(y>0){
            
             JOptionPane.showMessageDialog(null,"Los datos han sido guardados exitosamente");
           response.sendRedirect("Formeleccion.jsp");

         }
         else{
             
             JOptionPane.showMessageDialog(null, "Ha ocurrido un error al guardar los datos");
             response.sendRedirect("Formeleccion.jsp");
         }
    
    
    }
        
    
    
//    protected ArrayList<Usuario> consultar(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//            return usdao.consultageneralusuarios();
//    
//    }

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
