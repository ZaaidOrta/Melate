/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz_Grafica;

import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import Datos.sesion;
import Datos.obtenerSorteo;
import Datos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author david
 */
public class Aleatorios_Revancha extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn = con.conectar();
    
    /**
     * Creates new form Aleatorios_Revancha
     */
    public Aleatorios_Revancha() {
        initComponents();
        jTextField2.setEditable(false);
        txtPrecio_Revancha_Aleatorio.setEditable(false);
        agregarFechaActual(jTextField2);
    }
    
    private void agregarFechaActual(JTextField textField) {
        // Obtener la fecha actual
        Date fechaActual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd"); // Formato deseado para la fecha
        String fechaTexto = formato.format(fechaActual);
        
        // Establecer la fecha actual en el jTextField especificado
        textField.setText(fechaTexto);
    }
    
    
    
        private int[] generarNumerosAleatorios(int longitud) {
        int[] numeros = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            boolean numeroValido;
            do {
                numeros[i] = (int) (Math.random() * 56) + 1;
                numeroValido = true;

                for (int j = 0; j < i; j++) {
                    if (numeros[i] == numeros[j]) {
                        numeroValido = false;
                        break; // Salimos del bucle interno si encontramos un número repetido
                    }
                }
            } while (!numeroValido);
        }

        return numeros;
    }
     
    private void mostrarNumerosGenerados(int[] numeros) {
        StringBuilder sb = new StringBuilder();
        for (int numero : numeros) {
            sb.append(numero).append(" ");
        }
        lblresultados.setText(sb.toString());
    } 
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnaceptar1 = new javax.swing.JButton();
        lblresultados = new javax.swing.JTextField();
        btnaceptar2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblnum9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPrecio_Revancha_Aleatorio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(27, 0, 75));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Números Aleatorios Revancha");

        btnaceptar1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btnaceptar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aleatorio.png"))); // NOI18N
        btnaceptar1.setText("Generar Numeros");
        btnaceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptar1ActionPerformed(evt);
            }
        });

        lblresultados.setBackground(new java.awt.Color(132, 84, 199));
        lblresultados.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        lblresultados.setForeground(new java.awt.Color(255, 255, 255));
        lblresultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblresultadosActionPerformed(evt);
            }
        });

        btnaceptar2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btnaceptar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aceptar.png"))); // NOI18N
        btnaceptar2.setText("Validar");
        btnaceptar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptar2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/volver.png"))); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblnum9.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        lblnum9.setForeground(new java.awt.Color(255, 255, 255));
        lblnum9.setText("Fecha:");

        jTextField2.setBackground(new java.awt.Color(132, 84, 199));
        jTextField2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Precio:");

        txtPrecio_Revancha_Aleatorio.setBackground(new java.awt.Color(132, 84, 199));
        txtPrecio_Revancha_Aleatorio.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        txtPrecio_Revancha_Aleatorio.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecio_Revancha_Aleatorio.setText("$60.00");
        txtPrecio_Revancha_Aleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecio_Revancha_AleatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblnum9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPrecio_Revancha_Aleatorio, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnaceptar2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addComponent(lblresultados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnaceptar1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(58, 58, 58))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnum9)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtPrecio_Revancha_Aleatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnaceptar1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblresultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaceptar2)
                    .addComponent(jButton1))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptar1ActionPerformed
        if (evt.getSource() == btnaceptar1) {
            // Generar números aleatorios y mostrarlos en el área de texto
            int[] numerosAleatorios = generarNumerosAleatorios(7);
            Arrays.sort(numerosAleatorios); // Ordenamos los números generados
            mostrarNumerosGenerados(numerosAleatorios);
        } else if (evt.getSource() == jButton1) {
            // Regresar al frame Juego_Melate
            Generacion_Numeros_Melate juegoMelate = new Generacion_Numeros_Melate();
            juegoMelate.setVisible(true);
            this.dispose(); // Cerrar el frame actual
        }
    }//GEN-LAST:event_btnaceptar1ActionPerformed

    private void lblresultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblresultadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblresultadosActionPerformed

    private void btnaceptar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptar2ActionPerformed
        try{
            int idUsuario = sesion.getUserId();
            int idSorteo = obtenerSorteo.getSorteoId();
            
            String textoNumeros = lblresultados.getText();
            if (textoNumeros.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo de está vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Salir del método si el campo está vacío
        }
            String[] numeros = textoNumeros.split(" ");
            
           PreparedStatement ps = cn.prepareStatement("INSERT INTO revancha(num1,num2,num3,num4,num5,num6,adicional1,fechaSorteo,usuario,tipo_sorteo) VALUES (?,?,?,?,?,?,?,?,?,?)");
           for (int i = 0; i < numeros.length; i++) {
                ps.setInt(i + 1, Integer.parseInt(numeros[i]));
            }
           String fecha = jTextField2.getText();
           ps.setString(8, fecha);
           ps.setInt(9, idUsuario);
           ps.setInt(10, idSorteo);
           ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Numeros Guardados Corectamente");
        } catch (SQLException ex) {
            Logger.getLogger(Aleatorios_melate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnaceptar2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Generacion_Numeros_Melate().setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void txtPrecio_Revancha_AleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecio_Revancha_AleatorioActionPerformed
        txtPrecio_Revancha_Aleatorio.setEditable(false);
    }//GEN-LAST:event_txtPrecio_Revancha_AleatorioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Aleatorios_Revancha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aleatorios_Revancha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aleatorios_Revancha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aleatorios_Revancha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aleatorios_Revancha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaceptar1;
    private javax.swing.JButton btnaceptar2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblnum9;
    private javax.swing.JTextField lblresultados;
    private javax.swing.JTextField txtPrecio_Revancha_Aleatorio;
    // End of variables declaration//GEN-END:variables
}
