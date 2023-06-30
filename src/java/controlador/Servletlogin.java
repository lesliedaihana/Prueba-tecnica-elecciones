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
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;
import modelo.Coordinador;
import modelo.CoordinadorDAO;


/**
 *
 * @author PERSONAL
 */
@WebServlet(name = "Servletlogin", urlPatterns = {"/Servletlogin"})
public class Servletlogin extends HttpServlet {

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
        
        
        
        if(request.getParameter("btnlogin")!=null){
            ArrayList<Coordinador> lista=new ArrayList<>();
            String e,p,n;
            int id;
            e=request.getParameter("email");
            p=request.getParameter("password");
            
            
            Coordinador lo=new Coordinador(e, p);
            Coordinador datlo=new Coordinador();
            CoordinadorDAO ld=new CoordinadorDAO();
            lista=ld.coordinadordao(lo);
//            JOptionPane.showMessageDialog(null, lista.size());
           
               
            if(lista.size()>0){
                    for(int i =0; i<lista.size(); i++){
                    datlo=lista.get(i);


                    }
//                     JOptionPane.showMessageDialog(null, lo.getEmailCoor()+"  "+ lo.getContraCoor());

                      if(datlo.getEmailCoor().equals(e) && datlo.getContraCoor().equals(p)){
                           e=(String)datlo.getEmailCoor();   
                            p=(String)datlo.getContraCoor(); 
                            id=(int)datlo.getIdCoordinador();
                            n=(String)datlo.getNomCoor(); 
                            
                          
//                         response.setContentType("text/plain");
//                            PrintWriter out = response.getWriter();
//                            out.print("success");

                         //   request.setAttribute("msje","¡Bienvenido!");
                      // JOptionPane.showMessageDialog(null, "Datos correctos");
                        response.sendRedirect("Formeleccion.jsp");
                          HttpSession sesion=request.getSession();
                          sesion.setAttribute("varsesion", id );
                          sesion.setAttribute("varsesion2", "Bienvenido coordinador"+" "+n );
                         
//                               JOptionPane.showMessageDialog(null, e+p);
                
                             
                          
                    }  else{
//                          response.setContentType("text/plain");
//                            PrintWriter out = response.getWriter();
//                            out.print("error");

                          //request.setAttribute("msje","Datos incorrectos");
                        JOptionPane.showMessageDialog(null, "Datos incorrectos");
                        //response.sendRedirect("index.jsp");
                         response.sendRedirect("seetalertguardados.js");
                     }
                      
            }        
            else{
//                response.setContentType("text/plain");
//                PrintWriter out = response.getWriter();
//                out.print("error");

                //request.setAttribute("msje","Error de login");
              JOptionPane.showMessageDialog(null, "Datos incorrectos");
               response.sendRedirect("index.jsp");
            }
            
            
            
            }
        
        
        
        
        
        
        
        
        
        
        
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
