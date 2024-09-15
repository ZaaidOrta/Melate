/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.sql.ResultSet;
/**
 *
 * @author david
 */
public class ControlRecuperacion {
    
    public String usuario;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public ResultSet RecuperacionCorreo(){
        Recuperacion rc = new Recuperacion();
        return rc.RecuperacionCorreo(usuario);
    }
    
    
}
