/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Recuperacion {
    
    public ResultSet RecuperacionCorreo(String usuario){
     
        Conexion con = new Conexion();
        Connection cn = con.conectar();
        
        PreparedStatement ps;
         
        try {
            String query = "SELECT correo, password FROM usuarios WHERE correo = ?";
            ps = cn.prepareStatement(query);
            ps.setString(1, usuario);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error");
            return null;
        }
        
    
    }
    
    
}
