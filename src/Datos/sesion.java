/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author david
 */
public class sesion {
    private static int userId;

    // Método para establecer el ID del usuario
    public static void setUserId(int id) {
        userId = id;
    }

    // Método para obtener el ID del usuario
    public static int getUserId() {
        return userId;
    }
}
