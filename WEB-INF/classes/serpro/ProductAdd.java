package serpro;
import java.io.*;
import javax.servlet.*;

import javax.servlet.http.*;
public class ProductAdd extends HttpServlet{
    public void service(HttpServletRequest request,
    HttpServletResponse response)
    throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
  
   out.println("Product add");
   String productname= request.getParameter("productname");
   String productrate= request.getParameter("productrate");
      
   out.println(productname);
   out.println(productrate);
  }
  }