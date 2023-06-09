/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDateTime;

/**
 *
 * @author usuario
 */
public class eventos {
    private int idevento;
    private String nombre;
    private String sinopsis;
    private LocalDateTime fechainicio;
    private LocalDateTime fechafin;
    private String foto;
    private boolean visible;
    private LocalDateTime fechavisile;
    private LocalDateTime fechaoculto;
    private String idresponsable;
    private float vip;
    private float planta_a;
    private float planta_b;
    private float vip_mg;
    private boolean estado;

    public int getIdevento() {
        return idevento;
    }

    public void setIdevento(int idevento) {
        this.idevento = idevento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public LocalDateTime getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(LocalDateTime fechainicio) {
        this.fechainicio = fechainicio;
    }

    public LocalDateTime getFechafin() {
        return fechafin;
    }

    public void setFechafin(LocalDateTime fechafin) {
        this.fechafin = fechafin;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public LocalDateTime getFechavisile() {
        return fechavisile;
    }

    public void setFechavisile(LocalDateTime fechavisile) {
        this.fechavisile = fechavisile;
    }

    public LocalDateTime getFechaoculto() {
        return fechaoculto;
    }

    public void setFechaoculto(LocalDateTime fechaoculto) {
        this.fechaoculto = fechaoculto;
    }

    public String getIdresponsable() {
        return idresponsable;
    }

    public void setIdresponsable(String idresponsable) {
        this.idresponsable = idresponsable;
    }

    public float getVip() {
        return vip;
    }

    public void setVip(float vip) {
        this.vip = vip;
    }

    public float getPlanta_a() {
        return planta_a;
    }

    public void setPlanta_a(float planta_a) {
        this.planta_a = planta_a;
    }

    public float getPlanta_b() {
        return planta_b;
    }

    public void setPlanta_b(float planta_b) {
        this.planta_b = planta_b;
    }

    public float getVip_mg() {
        return vip_mg;
    }

    public void setVip_mg(float vip_mg) {
        this.vip_mg = vip_mg;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
      
    
}
