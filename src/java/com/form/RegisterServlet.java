
package com.form;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String name=req.getParameter("uname");
       String pass=req.getParameter("pass");
       String email=req.getParameter("email");
       String gen=req.getParameter("gen");
       String course=req.getParameter("course");
        
       resp.setContentType("text/html");
       PrintWriter out=resp.getWriter();
       out.println("<h1>Welcome "+ name+" your information:</h1>");
       out.println("<h3>Email: "+ email+"</h3>");
       out.println("<h3>Password: "+ pass+"</h3>");
       out.println("<h3>Course: "+ course+"</h3>");
       
    }
    
}
