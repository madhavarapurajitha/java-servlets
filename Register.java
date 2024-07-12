import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.*;
import java.sql.*;
public class Register extends GenericServlet{
    public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException{
        res.setContentType("text/html");
         PrintWriter out=res.getWriter();
         out.print("Register Servlet Response");
        String email=req.getParameter("email");
        String password=req.getParameter("password");
        String mobile=req.getParameter("mobile");
        String address=req.getParameter("address");
        /*res.getWriter().print("<h1>"+email+"</h1>");
        res.getWriter().print("<h1>"+password+"</h1>");
        res.getWriter().print("<h1>"+mobile+"</h1>");
        res.getWriter().print("<h1>"+address+"</h1>");*/
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3333/gecdb2", "root", "rajitha");
            PreparedStatement pstmt=con.prepareStatement("insert into register values(?,?,?,?)");
            pstmt.setString(1, email);
            pstmt.setString(2, password);
            pstmt.setString(3, mobile);
            pstmt.setString(4, address);
            int r=pstmt.executeUpdate();
            if(r==1){
                 ((HttpServletResponse)res).sendRedirect("index.html");
            }else{
                ((HttpServletResponse)res).sendRedirect("register.html");
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
