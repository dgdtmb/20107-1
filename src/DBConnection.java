package src;

import java.sql.Connection;
import java.sql.DriverManager;



public class DBConnection {
    public static Connection gConnection() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection
            ("jdbc:mysql:10.26.143.57:3306", "smc07", "20107");

        
        return con;
    }
}
