
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gaelito
 */
@WebServlet(name = "Edad", urlPatterns = {"/Edad"})
public class Edad extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Edad</title>");
        out.println("<body>");
            out.println("<h1>Ingrese su nombre y su fehca de nacimiento<h1>");
            
            out.println("<form action='' method='post'>");
            out.println("<h3>Nombre: </h3>");            
            out.println("<input type='text' name='nombre'>");
            out.println("<br>");
            out.println("<h3>Fecha de Nacimiento: </h3>");
            out.println("<input type='text' name='nacimiento'>");
            out.println("<br>");
            out.println("<input type='submit'>");
            out.println("</form>");
            
        out.println("</body>");
        out.println("</head>");
        out.println("</html>");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String nombre = request.getParameter("nombre");
        String nacString = request.getParameter("nacimiento");
        int nac = Integer.parseInt(nacString);
        
        Calendar fecha = new GregorianCalendar();
        int año = fecha.get(Calendar.YEAR);
        
        int edad = año - nac;
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Resultados</title>");
        out.println("<body><br>");        
        out.println("<h3>Nombre: "+nombre+"</h3>");
        out.println("<h3>Edad: "+edad+"</h3>");        
        out.println("</body>");
        out.println("</head>");
        out.println("</html>");
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
