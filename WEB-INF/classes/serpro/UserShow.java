package serpro;
import java.io.*;   
import javax.servlet.*;

import javax.servlet.http.*;
public class UserShow extends HttpServlet{
    public void service(HttpServletRequest request,
    HttpServletResponse response)
    throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
  
   out.println("User show");
  
  }
  }