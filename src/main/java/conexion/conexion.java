/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author usuario
 */
public class conexion {
    private static String url = "jdbc:postgresql://proyectoemsa.postgres.database.azure.com:5432/postgres";
    private static String user = "vlopez29";
    private static String password = "Julian2023";
    
   
    public static Connection getConection(){
       try{
           Connection connection = DriverManager.getConnection(url,user,password);            
           System.out.println("conexion exitosa");
           return connection;
       }
       catch (SQLException e) {
           System.out.println(e.toString());
           return null;
       }
    }
    
}
