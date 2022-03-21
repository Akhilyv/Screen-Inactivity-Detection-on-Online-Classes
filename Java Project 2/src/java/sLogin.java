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

public class sLogin extends HttpServlet {

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        try { 
            
            response.setContentType("text/html;charset=UTF-8");
            
           
            String s1 = request.getParameter("user1");
            String s2 = request.getParameter("pass1");
            int s4 = 0;
            
            
                   
            // Initialize the database 
            Connection con = signin.initializeDatabase(); 
       
            // Create a SQL query to insert data into demo table 
            // demo table consists of two columns, so two '?' is used 
            Statement st = con.createStatement();
            
            
            String query = "SELECT * FROM studentdetails2 WHERE user = '" +s1+ "' && passwd = '" +s2+ "'";
           
            ResultSet rs = st.executeQuery(query);
            
            
            
            
                 
            
            if (rs.next())
            {
                String query1 = "update studentdetails2 set status = '" +s4+ "' where user = '" +s1+ "' ";
                int rs1 = st.executeUpdate(query1);
                String location = "s1_portal.html";
                response.sendRedirect(location);   
                st.close(); 
                
                //}
                /*
                else if (s1=="tharun")
                {
                    String location2 = "s2_portal.html";
                    response.sendRedirect(location2);
                    String query2 = "insert into studentdetails2 (status) values('True')";
                    ResultSet rs2 = st.executeQuery(query2);
                }
                
                else if (s1=="suresh")
                {
                    String location3 = "s3_portal.html";
                    response.sendRedirect(location3);
                    String query3 = "insert into studentdetails2 (status) values('True')";
                    ResultSet rs3 = st.executeQuery(query3);
                }
                
                else if (s1=="harshit")
                {
                    String location4 = "s4_portal.html";
                    response.sendRedirect(location4);
                    String query4 = "insert into studentdetails2 (status) values('True')";
                    ResultSet rs4 = st.executeQuery(query4);
                }
                
                else if (s1=="nikhil")
                {
                    String location5 = "s5_portal.html";
                    response.sendRedirect(location5);
                    String query5 = "insert into studentdetails2 (status) values('True')";
                    ResultSet rs5 = st.executeQuery(query5);
                }
                
                else
                {
                    out.println("Reached final");
                }
                */

 
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


