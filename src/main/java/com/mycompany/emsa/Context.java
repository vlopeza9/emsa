/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.emsa;

import models.eventos;
import models.users;

/**
 *
 * @author usuario
 */
public class Context {
    private static users user = null;
    private static boolean isLogIn = false;
    private static eventos event = null;

    private static double total = 0.00;
    
     /**
     * Constructor predeterminado de la clase Context.
     * Este constructor inicializa el contexto de la aplicación.
     */
    public Context() {
        // Código del constructor
    }

    /**
     * Obtiene el usuario logeado
     * 
     * @return the user
     */
    public static users getUser() {
        return user;
    }

    /**
     * Obtiene si ya iniciamos sesion
     * 
     * @return the isLogIN
     */
    public static boolean isIsLogIn() {
        return isLogIn;
    }

    /**
     * Asigna el valor a si estamos logeados
     * 
     * @param aIsLogIN the isLogIN to set
     */
    public static void setIsLogIN(boolean aIsLogIN) {
        isLogIn = aIsLogIN;
    }    
    
    /**
     * metodo que nos deja ver el boton del Dashboar
     * si en dado caso somos administradores
     * @return true or false
     */
    public static boolean isVisibleDashboard(){
        
        if (!isLogIn) {
            return false;
        }
        
        return user.getIdRoll() == 1;
        
    }
    
    /**
     * metodo que nos redirije al dashboard
     * 
     */
    public static void redirectToDashboard(){
        App.setRoot("Home", "Dashboard");
    }
    
     /**
     * Método para iniciar sesión.
     * Permite iniciar sesión con el usuario proporcionado.
     * @param model El objeto de usuario para iniciar sesión.
     */
    public static void LogIn(users model){
        user = model;
        setIsLogIN(true);
    }
    
     /**
     * Método para cerrar sesión.
     * Permite iniciar sesión con el usuario proporcionado.
     */
    public static void LogOut(){
        user = null;
        setIsLogIN(false);
        App.setRoot("Auth");
    }    

    /**
     * @return the event
     */
    public static eventos getEvent() {
        return event;
    }

    /**
     * @param aEvent the event to set
     */
    public static void setEvent(eventos aEvent) {
        event = aEvent;
    }

    /**
     * @return the date
     */
    
    }

    /**
     * @param aDate the date to set
     */
    
    

