<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2><u>Student log activity:</u></h2>
            
            <b> Student: </b> <p>Akhil </p>
            <u><b> Log Status: </b></u><br/><br/>
            
            <%@page import="java.sql.DriverManager"%>
            <%@page import="java.sql.ResultSet"%>
            <%@page import="java.sql.Statement"%>
            <%@page import="java.sql.Connection"%>
            
            <%
            String id = request.getParameter("b1");
            String dbDriver = "com.mysql.jdbc.Driver"; 
            String dbURL = "jdbc:mysql:// localhost:3306/"; 
            String dbName = "userdata"; 
            String disableSSL="?useSSL=false&allowPublicKeyRetrieval=true";
            String dbUsername = "root"; 
            String dbPassword = "Akhilarrv@123"; 
            Class.forName(dbDriver); 
            Connection con = DriverManager.getConnection(dbURL + dbName + disableSSL, dbUsername, dbPassword); 
            
            try {
            Class.forName(dbDriver);
            Statement st = con.createStatement();
            String query = "SELECT action,time FROM windowevent3 where status='True';";
            //SELECT * FROM windowevent1 ORDER BY action,time LIMIT 20;
            ResultSet rs = st.executeQuery(query);
            Result rs2;
            
            int i=0;
            
            for (i=0;i<15;i++)
            {
            if (rs.next())
            {
                out.println(rs.getString("action")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Time:"+rs.getString("time"));
                
            %><br/><%
                if (i==14)
                {
                    String query2;
                    String a1 = "False";
                    String b1 = "True";
                    query2 = "UPDATE studentdetails2 SET status='"+a1+"' where status='"+b1+"'";
                    rs2 = st.executeUpdate(query2);
                }
                
            }
            
            else
            {
                out.println("No Data Found");
            }
            }
            } 
            catch (ClassNotFoundException e) 
            {
            e.printStackTrace();
            }
            %>  

            
    </body>
</html>
