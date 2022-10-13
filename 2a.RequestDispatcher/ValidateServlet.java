import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ValidateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        try ( PrintWriter out = response.getWriter()) {
            String username=request.getParameter("un");
            String password=request.getParameter("pw");
            if(password.equals("Servlet")) {
                request.setAttribute("s1username",username);
                request.setAttribute("s1password",password); 
                RequestDispatcher rd= request.getRequestDispatcher("/WelcomeServlet");
                rd.forward(request, response);
            } else {
                out.print("Incorrect password");
                RequestDispatcher rd= request.getRequestDispatcher("/index.html");
                rd.include(request, response);
            }
        }
    }
}
}
