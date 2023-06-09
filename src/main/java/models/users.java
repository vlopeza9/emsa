/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author usuario
 */
public class users {

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the active
     */
    public boolean isActive() {
        return active;
    }

    /**
     * @param active the active to set
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * @return the reset
     */
    public boolean isReset() {
        return reset;
    }

    /**
     * @param reset the reset to set
     */
    public void setReset(boolean reset) {
        this.reset = reset;
    }

    /**
     * @return the createAt
     */
    public String getCreateAt() {
        return createAt;
    }

    /**
     * @param createAt the createAt to set
     */
    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    /**
     * @return the idRoll
     */
    public int getIdRoll() {
        return idRoll;
    }

    /**
     * @param idRoll the idRoll to set
     */
    public void setIdRoll(int idRoll) {
        this.idRoll = idRoll;
    }

    /**
     * @return the numeroTelefono
     */
    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    /**
     * @param numeroTelefono the numeroTelefono to set
     */
    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    /**
     * @return the confirm
     */
    public boolean isConfirm() {
        return confirm;
    }

    /**
     * @param confirm the confirm to set
     */
    public void setConfirm(boolean confirm) {
        this.confirm = confirm;
    }

    /**
     * @return the initialToken
     */
    public String getInitialToken() {
        return initialToken;
    }

    /**
     * @param initialToken the initialToken to set
     */
    public void setInitialToken(String initialToken) {
        this.initialToken = initialToken;
    }
    private int id;
    private String nombre;
    private String correo;
    private String password;
    private boolean active;
    private boolean reset;
    private String createAt;
    private int idRoll;
    private String numeroTelefono;
    private boolean confirm;
    private String initialToken;
    
    public void verUsuario(){
        System.out.println(String.format("nombre: %s, Email: %s", this.nombre, this.correo));
        
    
    }

    public int getidRol() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
