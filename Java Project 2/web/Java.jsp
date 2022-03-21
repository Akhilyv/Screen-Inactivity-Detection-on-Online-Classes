<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2><u>Student log activity:</u></h2>
        
            <%@page import="java.sql.DriverManager"%>
            <%@page import="java.sql.ResultSet"%>
            <%@page import="java.sql.Statement"%>
            <%@page import="java.sql.Connection"%>
            <%! String a1;
            %>
            <b> Student: </b> 
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
                PreparedStatement st = con.prepareStatement("SELECT name from studentdetails2 where status=0");
                
                Statement st1 = con.createStatement();
                String query = "SELECT * from studentdetails2 where status=0";
                ResultSet rs = st.executeQuery(query);
                if (rs.next())
                {
                out.println(rs.getString("name")+".");
                a1 = rs.getString("name");
                }
                }
                catch (ClassNotFoundException e) 
                {
                    e.printStackTrace();
                }
                

            %>
            
            <br/><br/>
            <u><b> Log Status: </b></u><br/><br/>
            
            <%
            /*String id = request.getParameter("b1");
            String dbDriver = "com.mysql.jdbc.Driver"; 
            String dbURL = "jdbc:mysql:// localhost:3306/"; 
            String dbName = "userdata"; 
            String disableSSL="?useSSL=false&allowPublicKeyRetrieval=true";
            String dbUsername = "root"; 
            String dbPassword = "Akhilarrv@123"; 
            Class.forName(dbDriver); 
            Connection con = DriverManager.getConnection(dbURL + dbName + disableSSL, dbUsername, dbPassword); */
            
            try {
            Class.forName(dbDriver);
            
            Statement st2 = con.createStatement();
            String query2 = "SELECT action,time FROM windowevent3 where status=0;";
            
            //SELECT * FROM windowevent1 ORDER BY action1,time LIMIT 20;
            //out.println(st.getString("name"));
            
            ResultSet rs2 = st2.executeQuery(query2);
            int i=0;
            
            for (i=0;i<15;i++)
            {
            if (rs2.next())
            {
                out.println(rs2.getString("action")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Time:"+rs2.getString("time"));
                
            %><br/><%    
                
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
            
            <%
                try
                {
                                 
                    Statement st = con.createStatement();
                    String query1 = "delete from windowevent3";
                    int rs1 = st.executeUpdate(query1);
                    st.close(); 
                    
                
                }
                     
                catch (Exception e) 
                { 
                    e.printStackTrace();
                    out.println(e);
                }
                
            %>
                

            <%
                try
                {
                
                    int s4 = 2;
                    Statement st4 = con.createStatement();
                    String query1 = "update studentdetails2 set status = '" +s4+ "' where name = '" +a1+ "' ";
                    int rs1 = st4.executeUpdate(query1);
                    st4.close(); 
                    con.close(); 
                
                }
                     
                catch (Exception e) 
                { 
                    e.printStackTrace();
                    out.println(e);
                }
            %>
    </body>
</html>
