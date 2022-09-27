import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CalcServlet extends HttpServlet {  
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        try ( PrintWriter out = response.getWriter()) {
            int a = Integer.parseInt(request.getParameter("num1"));
            int b = Integer.parseInt(request.getParameter("num2"));
            int c = 0;
            String op = request.getParameter("btn");
            if (op.equals("+")) {
                c = a + b;
            } else if (op.equals("-")) {
                c = a - b;
            } else if (op.equals("*")) {
                c = a * b;
            } else {
                c = a / b;
            }
            out.println("<b>"+a+op+b+"="+c+"</b>");
        }
    }
}
