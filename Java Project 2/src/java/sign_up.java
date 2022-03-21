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
public class sign_up extends HttpServlet { 
    @Override
  
    protected void doPost(HttpServletRequest request,HttpServletResponse response)  
        throws ServletException, IOException 
    { 
        PrintWriter out = response.getWriter();
        try { 
  
            
            Connection con = signin.initializeDatabase(); 
            PreparedStatement st = con.prepareStatement("insert into studentdetails2 (name,regno,age,number,gender,department,user,passwd) values(? ,? ,? ,? ,? ,? ,? ,?)"); 
            //
            st.setString(1, request.getParameter("Name"));
            st.setString(2, request.getParameter("Regno")); 
            st.setString(3, request.getParameter("Age"));
            st.setString(4, request.getParameter("Phoneno"));
            st.setString(5, request.getParameter("Gender"));
            st.setString(6, request.getParameter("Department"));
            st.setString(7, request.getParameter("user1"));
            st.setString(8, request.getParameter("pass1"));
            
            
            st.executeUpdate(); 
            st.close(); 
            con.close(); 
            out.println("<html><body><center><h3>Successfully Inserted!!!"
                        + "</h3>"
                        + "<a href='Studentlogin.html'><button>Go BACK</button></a>"
                        + "</center></body></html>"); 
        } 
       
        catch (Exception e) { 
            e.printStackTrace();
            out.println(e);
        } 
         
    } 
}