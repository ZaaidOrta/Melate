/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz_Grafica;

import Datos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author deadp
 */
public class Numero_Ganador_Melate extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn = con.conectar();
    
    /**
     * Creates new form Numero_Ganador_Melate
     */
    public Numero_Ganador_Melate() {
        initComponents();
        jTextField1.setEditable(false);
        agregarFechaActual(jTextField1);
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
        lbl_resultados_melate.setText(sb.toString());
    } 
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_ganador_melate = new javax.swing.JButton();
        lbl_resultados_melate = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnaceptar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(27, 0, 75));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Numero Ganador Melate");

        btn_ganador_melate.setBackground(new java.awt.Color(132, 84, 199));
        btn_ganador_melate.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_ganador_melate.setForeground(new java.awt.Color(255, 255, 255));
        btn_ganador_melate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aleatorio.png"))); // NOI18N
        btn_ganador_melate.setText("Generar Número");
        btn_ganador_melate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ganador_melateActionPerformed(evt);
            }
        });

        lbl_resultados_melate.setBackground(new java.awt.Color(132, 84, 199));
        lbl_resultados_melate.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        lbl_resultados_melate.setForeground(new java.awt.Color(255, 255, 255));
        lbl_resultados_melate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_resultados_melateActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(132, 84, 199));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/volver.png"))); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnaceptar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btnaceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aceptar.png"))); // NOI18N
        btnaceptar.setText("Validar");
        btnaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fecha.png"))); // NOI18N
        jLabel2.setText("Fecha:  ");

        jTextField1.setBackground(new java.awt.Color(132, 84, 199));
        jTextField1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnaceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_ganador_melate)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_resultados_melate, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 82, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_ganador_melate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_resultados_melate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnaceptar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_resultados_melateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_resultados_melateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_resultados_melateActionPerformed

    private void btn_ganador_melateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ganador_melateActionPerformed
        if (evt.getSource() == btn_ganador_melate) {
            // Generar números aleatorios y mostrarlos en el área de texto
            int[] numerosAleatorios = generarNumerosAleatorios(6);
            Arrays.sort(numerosAleatorios); // Ordenamos los números generados
            mostrarNumerosGenerados(numerosAleatorios);
        } else if (evt.getSource() == btn_ganador_melate) {
            // Regresar al frame Juego_Melate
            Generacion_Numeros_Melate juegoMelate = new Generacion_Numeros_Melate();
            juegoMelate.setVisible(true);
            this.dispose(); // Cerrar el frame actual
        }
    }//GEN-LAST:event_btn_ganador_melateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Generar_Numero_Ganador_Admin().setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarActionPerformed
      try {
        String textoNumeros = lbl_resultados_melate.getText();
        
        // Verificar si el campo está vacío
        if (textoNumeros.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo de generacion de numero ganador está vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Salir del método si el campo está vacío
        }

        String[] numeros = textoNumeros.split(" ");
        
        PreparedStatement ps = cn.prepareStatement("INSERT INTO numganadores_melate(num1,num2,num3,num4,num5,num6,Fecha) VALUES (?,?,?,?,?,?,?)");
        for (int i = 0; i < numeros.length; i++) {
            ps.setInt(i + 1, Integer.parseInt(numeros[i]));
        }
        String fecha = jTextField1.getText();
        ps.setString(7, fecha);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Números Generados");
    } catch (Exception e) {
        e.printStackTrace(); // Imprimir el stack trace para depuración
        JOptionPane.showMessageDialog(null, "Ocurrió un error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnaceptarActionPerformed

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
            java.util.logging.Logger.getLogger(Numero_Ganador_Melate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Numero_Ganador_Melate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Numero_Ganador_Melate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Numero_Ganador_Melate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>btn_ganador_melate  /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Numero_Ganador_Melate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ganador_melate;
    private javax.swing.JButton btnaceptar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField lbl_resultados_melate;
    // End of variables declaration//GEN-END:variables
}
