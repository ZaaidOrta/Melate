/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
       public static String url = "jdbc:mysql://localhost:3306/sorteo_tipo_melate";
       public static  String user = "root";
       public static String pass = "root";
       public static Connection conn;
       public static PreparedStatement sentencia;
       
       public Connection conectar() 
       {
           try{
               conn = DriverManager.getConnection(url, user,pass);
            //   if(conn != null){
              //     JOptionPane.showMessageDialog(null, "Conexion Exitosa");
              // }
           }catch(Exception e){
               JOptionPane.showMessageDialog(null, "Hubo un erro al cargar la base de datos");
           }
           return conn;
       }
//    public static void main(String[] args) throws SQLException{
//         Conexion conexion = new Conexion();
//         conexion.conectar();
//}
       
}

