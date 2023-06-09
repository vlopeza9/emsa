/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class duser {
    public ArrayList <users> MostrarUsuarios(){
       ArrayList <users> listausers = new ArrayList <>();
       try(Statement sql = conexion.getConection().createStatement()){
       String query = "select * from tbl_users";
       ResultSet respuestas = sql.executeQuery(query);
       while (respuestas.next()){
       users objuser = new users();
       objuser.setId(respuestas.getInt("IdCliente"));
       objuser.setNombre(respuestas.getString("Nombre"));
       objuser.setCorreo(respuestas.getString("Correo"));
       objuser.setPassword(respuestas.getString("Contrasena"));
       objuser.setActive(respuestas.getBoolean("Activo"));
       objuser.setReset(respuestas.getBoolean("Reestablecer"));
       objuser.setCreateAt(respuestas.getString("FechaRegistro"));
       objuser.setIdRoll(respuestas.getInt("idRol"));
       objuser.setNumeroTelefono(respuestas.getString("numero"));
       objuser.setConfirm(respuestas.getBoolean("confirmada"));
       objuser.setInitialToken(respuestas.getString("tokenInicio"));   
       listausers.add(objuser);
       
      
       }
      
       
       } catch(SQLException ex){
       System.out.println ("hubo un error");
       
       }
       return listausers;
       
    }

    public users UserByPasswordAndEmail(String email, String password) {
                 users model = null;
         
         try (Connection conn = conexion.getConection()) {
             String query = "SELECT * FROM usuarios where correo = ? and clave = ? and activo = true LIMIT 1";
             PreparedStatement sql = conn.prepareStatement(query);
             sql.setString(1, email);
             sql.setString(2,password);
             ResultSet resultado = sql.executeQuery();
             
             while(resultado.next()){;
                 users usuario = new users();
                 usuario.setId(resultado.getInt("idcliente"));
                 usuario.setNombre(resultado.getString("nombre"));  
                 usuario.setCorreo(resultado.getString("correo"));
                 usuario.setPassword(resultado.getString("clave"));
                 usuario.setActive(resultado.getBoolean("activo"));
                 usuario.setIdRoll(resultado.getInt("idrol"));
                 model = usuario;
             }
             
         } catch (SQLException ex) { 
             System.out.println("hubo un error "+ex.toString());
         }      
         
         return model;
    }        
}
