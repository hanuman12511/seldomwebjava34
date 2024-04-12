package serpro;
import javax.servlet.*;

import javax.servlet.http.*;
import java.io.*;
public class OrderView extends HttpServlet{
    public void service(HttpServletRequest request,
    HttpServletResponse response)
    throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
  
   out.println("Order View");
      
  }
  }