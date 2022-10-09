package servlet;

package servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
@WebServlet(name= "ServletClient", urlPatterns={"/ServletClient"})
public class ServletClient extends HttpServlet {
    @EJB CounterServletHitsBean CounterBean;
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletClient</title>");           
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Number of times this servlet is accessed:" + CounterBean.incrementAndGetHitCount()+"</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
