import jakarta.servlet.http.*;
import jakarta.servlet.*;
import java.io.*;
public class Httpservlet extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        String uname=req.getParameter("username");
        String pwd=req.getParameter("password");
        if(uname.equals("RAM")&&pwd.equals("12345")){
            res.getWriter().print("<h1>"+uname+"</h1>");
        }else{
            res.getWriter().print("<h1>Invalid UserId</h1>");
        }
    }
}

