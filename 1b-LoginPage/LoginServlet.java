public class LoginServlet extends HttpServlet {
      protected void doPost(HttpServletRequest request, HttpServletResponse response)
              throws ServletException, IOException {
          processRequest(request, response);
          response.setContentType("text/html");
          try ( PrintWriter out = response.getWriter()) {
              String username = request.getParameter("username");
              String password = request.getParameter("password");
              String msg = "";
              if(username.equals("admin") && password.equals("admin123")) {
                  msg = "Hello " + username;
              } else {
                  msg = "Login Failed";
              }
              out.println(msg);
          }
      }
}
