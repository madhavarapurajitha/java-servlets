import jakarta.servlet.*;
import java.io.*;
public class Babu extends GenericServlet{
    public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException{
        String uname=req.getParameter("username");
        String pwd=req.getParameter("password");
        if(uname.equals("RAM")&&pwd.equals("12345")){
            res.getWriter().print("<h1>"+uname+"</h1>");
        }else{
            res.getWriter().print("<h1>Invalid UserId</h1>");
        }
    }
}