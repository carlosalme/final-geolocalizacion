/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.hdp;

import java.util.ArrayList;

/**
 *
 * @author T-107
 */
public class Usuario {
    private String id;
    private String nickname;
    private String email;
    private String password;
    private ArrayList<Mensaje> mensaje;

    public Usuario(String id, String email, String password, ArrayList<Mensaje> mensaje, Posicion posicion) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.mensaje = mensaje;
        this.posicion = posicion;
    }

    public Usuario() {
    }
    private Posicion posicion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Mensaje> getMensaje() {
        return mensaje;
    }

    public void setMensaje(ArrayList<Mensaje> mensaje) {
        this.mensaje = mensaje;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }
}
