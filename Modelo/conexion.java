
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
   Connection connection;

    public conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/reto1_g56_db","root", "");
            if(connection != null){
                System.out.println("coneccion exitosa");
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("coneccion fallida");
        }
    }
   
    public Connection getConnection(){
        return connection;
    }
}
