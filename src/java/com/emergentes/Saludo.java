
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gaelito
 */
@WebServlet(name = "Saludo", urlPatterns = {"/Saludo"})
public class Saludo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        ///////////estilo css//////// no funciona, porque?
        //out.println("<style type='text/css'>*{background: #000;color: #fff}</style>");
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hola Mundo</title>");
        out.println("<body>");
            out.println("<h1>Bienvenido<h1>");
            
            out.println("<form action='' method='post'>");
            out.println("Nombre:");
            out.println("<input type='text' name='nombre'>");
            out.println("<input type='submit'>");
            out.println("</form>");
            
        out.println("</body>");
        out.println("</head>");
        out.println("</html>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Saludo</title>");
        out.println("<body>");
        out.println("<h1>Beinvenido<h1>");
        out.println("<p>Tu nombre es : "+nombre+"</p>");
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
