import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookieServlet extends HttpServlet {    
    private int i=1;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            String k=String.valueOf(i);
            Cookie c = new Cookie("visit",k);
            response.addCookie(c);
            int j=Integer.parseInt(c.getValue());
            if(j==1) {
                out.println("This is the first time you are visiting this page");
            } else { 
                synchronized(CookieServlet.this) { 
                    out.println("You visited this page "+i+" times");
                }
            }
            i++; 
        }
    }
}
