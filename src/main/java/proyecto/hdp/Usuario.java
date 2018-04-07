/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.hdp;

import java.util.ArrayList;
import org.springframework.data.annotation.Id;

/**
 *
 * @author T-107
 */
public class Usuario {
    
    @Id
    private String id;
    
    private String nickname;
    private String email;
    private String password;
    private ArrayList<Mensaje> mensaje;
    private Posicion posicion;
    
    public Usuario(String email, String password, ArrayList<Mensaje> mensaje, Posicion posicion) {
        this.email = email;
        this.password = password;
        this.mensaje = mensaje;
        this.posicion = posicion;
    }

    public Usuario(String id) {
        this.id = id;
    }
    
    
    public Usuario() {
    }
    
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
