/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package mypack;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.ejb.EJB;
import mybeans.CCBeanLocal;
public class CCServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    @EJB CCBeanLocal obj;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        double amt = Double.parseDouble(request.getParameter("amt"));
        if(request.getParameter("type").equals("r2d"))
        {
        out.println("<h1>"+amt+ " Rupees = "+obj.r2Dollar(amt)+" Dollars</h1>");
        }
        if(request.getParameter("type").equals("d2r"))
        {
        out.println("<h1>"+amt+ " Dollars = "+obj.d2Rupees(amt)+" Rupees</h1>");
        }
    }
}
