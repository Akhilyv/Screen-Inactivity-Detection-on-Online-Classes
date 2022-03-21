import java.io.IOException; 
import java.io.PrintWriter; 
import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.Statement; 
import java.sql.ResultSet;
import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 

@WebServlet("/InsertData") 
public class sign_up2 extends HttpServlet { 
    @Override
  
    protected void doPost(HttpServletRequest request,HttpServletResponse response)  
        throws ServletException, IOException 
    { 
        PrintWriter out = response.getWriter();
        try { 
  
     
            Connection con = signin.initializeDatabase(); 
            PreparedStatement st = con.prepareStatement("insert into facultydetails values(? ,? ,? ,? ,? ,?)"); 
   
            st.setString(1, request.getParameter("Name"));
            st.setString(2, request.getParameter("Course")); 
            st.setString(3, request.getParameter("Number"));
            st.setString(4, request.getParameter("G-mail"));
            st.setString(5, request.getParameter("User"));
            st.setString(6, request.getParameter("password"));
                        
            st.executeUpdate(); 
  
            // Close all the connections 
            st.close(); 
            con.close(); 
  
            // Get a writer pointer  
            // to display the successful result 
             
            out.println("<html><body><center><h3>Successfully Inserted!!!"
                        + "</h3>"
                    + "<a href='Facultylogin.html'><button>Go BACK</button></a>"
                    + "</center></body></html>"); 
        } 
       
        catch (Exception e) { 
            e.printStackTrace();
            out.println(e);
        } 
         
    } 
}