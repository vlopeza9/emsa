/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import conexion.conexion;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Datoseventos {
    public ArrayList<eventos> Listado_de_eventos(){
        ArrayList<eventos> TemporalList = new ArrayList<>();
        try(Statement sql = conexion.getConection().createStatement()) {
            String Query = "select * from eventos";
            ResultSet Resultado = sql.executeQuery(Query);
            while (Resultado.next()) {
            eventos eventoObj = new eventos();
            eventoObj.setIdevento(Resultado.getInt("idevento"));
            eventoObj.setNombre(Resultado.getString("nombre"));
            eventoObj.setSinopsis(Resultado.getString("sinopsis"));
            eventoObj.setFechainicio(Resultado.getTimestamp("fechainicio").toLocalDateTime());
            eventoObj.setFechafin(Resultado.getTimestamp("fechafin").toLocalDateTime());
            eventoObj.setFoto(Resultado.getString("foto"));
            eventoObj.setVisible(Resultado.getBoolean("visile"));
            eventoObj.setFechavisile(Resultado.getTimestamp("fechavisible").toLocalDateTime());
            eventoObj.setFechaoculto(Resultado.getTimestamp("fechaoculto").toLocalDateTime());
            eventoObj.setIdresponsable(Resultado.getString("idresponsable"));
            eventoObj.setVip(Resultado.getFloat("vip"));
            eventoObj.setPlanta_a(Resultado.getFloat("planta_a"));
            eventoObj.setPlanta_b(Resultado.getFloat("planta_"));
            eventoObj.setVip_mg(Resultado.getFloat("vip_mg"));
            eventoObj.setEstado(Resultado.getBoolean("estado"));
            TemporalList.add(eventoObj);
                 
                
            }
        } catch (Exception e) {
        }
        
        return TemporalList;
             
    }
        
    }
