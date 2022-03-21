import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 




public class signin {
        protected static Connection initializeDatabase() 
        throws SQLException, ClassNotFoundException 
    { 
        // Initialize all the information regarding 
        // Database Connection 
        String dbDriver = "com.mysql.jdbc.Driver"; 
        String dbURL = "jdbc:mysql:// localhost:3306/"; 
        // Database name to access 
        String dbName = "userdata"; 
        String disableSSL="?useSSL=false&allowPublicKeyRetrieval=true";
        String dbUsername = "root"; 
        String dbPassword = "Akhilarrv@123"; 
  
        Class.forName(dbDriver); 
        Connection con = DriverManager.getConnection(dbURL + dbName + disableSSL, dbUsername, dbPassword); 
        return con; 
    } 
}

  