import java.io.IOException; 
import java.io.PrintWriter; 
import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.Statement; 
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 



@WebServlet("/InsertData") 

public class fLogin extends HttpServlet {

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        try { 
            
            response.setContentType("text/html;charset=UTF-8");
            
           
            String s1 = request.getParameter("user1");
            String s2 = request.getParameter("pass1");
            
                   
            // Initialize the database 
            Connection con = signin.initializeDatabase(); 
       
            // Create a SQL query to insert data into demo table 
            // demo table consists of two columns, so two '?' is used 
            Statement st = con.createStatement();
            
            
            String query = "SELECT * FROM facultydetails WHERE user = '" +s1+"' && passwd = '" +s2+ "'";
           
            ResultSet rs = st.executeQuery(query);
                 
            
            if (rs.next())
            {
                              
                String location = "Facultyportal.html";
                response.sendRedirect(location);
 
            }
            else{
                out.println("<html><body><b>Invalid login!!!   not found"
                        + "</b></body></html>"); 
            }
 
            st.close(); 
            con.close(); 
              
        } 
       
        catch (Exception e) { 
            e.printStackTrace();
            out.println(e);
        
    }



}


}


