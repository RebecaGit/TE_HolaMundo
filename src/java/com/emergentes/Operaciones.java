/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
@WebServlet(name = "Operaciones", urlPatterns = {"/Operaciones"})
public class Operaciones extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>OperacionesHola Mundo</title>");
        out.println("<body>");
            out.println("<h1>Ingrese 2 números<h1>");
            
            out.println("<form action='' method='post'>");            
            out.println("<input type='text' name='xString'>");
            out.println("<input type='text' name='yString'>");
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
                ///////////estilo css//////// no funciona, porque?
        //out.println("<style type='text/css'>*{background: #000;color: #fff}</style>");

        
        String xString = request.getParameter("xString");
        String yString = request.getParameter("yString");
        int x = Integer.parseInt(xString);
        int y = Integer.parseInt(yString);
        
        int ResulSum, ResulRes, ResulMul, ResulDiv;
        
        if(x>y){
            ResulRes = x - y;
            ResulDiv = x / y;
        }else{
            ResulRes = y - x;
            ResulDiv = y / x;
        }
        
        ResulSum = x + y;        
        ResulMul = x * y;
        
        
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Resultados</title>");
        out.println("<body><br>");        
        out.println("<h3>El resultado de la suma es : "+ResulSum+"</h3>");
        out.println("<h3>El resultado de la Resta es : "+ResulRes+"</h3>");
        out.println("<h3>El resultado de la multiplicaión es : "+ResulMul+"</h3>");
        out.println("<h3>El resultado de la division es : "+ResulDiv+"</h3>");
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
