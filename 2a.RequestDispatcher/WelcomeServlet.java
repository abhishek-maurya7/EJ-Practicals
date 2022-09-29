import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class WelcomeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        response.setContentType("text/html");
        try ( PrintWriter out = response.getWriter()) {
            String s2username = (String)request.getAttribute("s1username"); 
            String s2password = (String)request.getAttribute("s2password"); 
            out.println("Welcome "+s2username);
        }
    }
}
