/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jboss.logging.Logger;
import org.json.JSONObject;
import org.json.JSONException;
import sun.util.logging.PlatformLogger;
/**
 *
 * @author zeus
 */
@WebServlet(urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    int array;
    boolean intgreso=false;
    Alumno[]arrayNue=new Alumno[10];
    JSONObject temp= new JSONObject();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, JSONException {
        response.setContentType("text/html;charset=UTF-8");
        
        //int noCarne = Integer.parseInt(request.getParameter("nocarne")) ;
        //String nombreAlum = request.getParameter("nombre") ;
        //Alumno traer = new Alumno();
         //traer.setCarne (request.getParameter("nocarne"));
       
        try (PrintWriter out = response.getWriter()) {
           
          
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
            array = Integer.parseInt(request.getParameter("pControl"));
            log("Hi");
            if (intgreso == false) {
                try {
                    temp.put("nocarne","No Ingresado");
                    temp.put("nombre","No Ingresado");
                    temp.put("correo","No Ingresado");
                    temp.put("cel","No Ingresado");
                    temp.put("diric","No Ingresado");
                    log("No secuencia");
                    response.getWriter().write(temp.toString());
                
                } catch (JSONException ex){
                   
                    java.util.logging.Logger.getLogger(NewServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            }else{
                try {
                    temp.put("nocarne", arrayNue[array].getCarne());
                    temp.put("nombre", arrayNue[array].getNombre());
                    temp.put("correo", arrayNue[array].getCorreo());
                    temp.put("cel", arrayNue[array].getNumero());
                    temp.put("diric", arrayNue[array].getDireccion());
                    log("secuencia");
                    response.getWriter().write(temp.toString());
                
                
                }catch (JSONException ex){
                   
                    java.util.logging.Logger.getLogger(NewServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            
            }
    
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
        intgreso = true;
        log ("hacer");
        array = Integer.parseInt(request.getParameter("pControlReg"));
        arrayNue[array] = new Alumno();
        log(request.getParameter("pControlReg"));
        arrayNue[array].setCarne(request.getParameter("nocarne"));
        arrayNue[array].setNombre(request.getParameter("nombre"));
        arrayNue[array].setCorreo(request.getParameter("correo"));
        arrayNue[array].setNumero(request.getParameter("cel"));
        arrayNue[array].setDireccion(request.getParameter("diric"));
       
        
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

   

}
