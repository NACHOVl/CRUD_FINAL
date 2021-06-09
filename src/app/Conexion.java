
package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection getConexion(){
    
            String url = "jdbc:sqlserver://localhost:1433;"
                    + "database=escuela;"
                    + "user=sa;"
                    + "password=1234;";
            
            try{
                Connection con = DriverManager.getConnection(url);
                return con;
            } catch(SQLException e){
                System.out.println(e.toString());
                return null;
            }
    }
}
