/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz_Grafica;

import Datos.Conexion;
import Datos.sesion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author deadp
 */
public class Resultados_Revancha extends javax.swing.JFrame {
    Conexion con = new Conexion();
    Connection cn = con.conectar();
    /**
     * Creates new form Resultados
     */
    public Resultados_Revancha() {
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
    public void mostrarTabla1() {
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("num1");
    model.addColumn("num2");
    model.addColumn("num3");
    model.addColumn("num4");
    model.addColumn("num5");
    model.addColumn("num6");
    model.addColumn("adicional1");
    jTable3.setModel(model);

    // Consulta SQL con una consulta preparada
    String query = "SELECT num1,num2,num3,num4,num5,num6,adicional1 FROM revancha WHERE fechaSorteo = ? and usuario = ?";
    String datos[] = new String[7];

    try {
        
        int idUsuario = sesion.getUserId();
        // Crear la consulta preparada
        PreparedStatement preparedStatement = cn.prepareStatement(query);
        
        // Obtener la fecha del JTextField
        String fechaTexto = jTextField1.getText();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha = formato.parse(fechaTexto);
        
        // Establecer el parámetro de fecha en la consulta preparada
        preparedStatement.setDate(1, new java.sql.Date(fecha.getTime()));
        preparedStatement.setInt(2,idUsuario);
        
        // Ejecutar la consulta
        ResultSet rs = preparedStatement.executeQuery();
        
        // Procesar los resultados
        while (rs.next()) {
            datos[0] = rs.getString(1);
            datos[1] = rs.getString(2);
            datos[2] = rs.getString(3);
            datos[3] = rs.getString(4);
            datos[4] = rs.getString(5);
            datos[5] = rs.getString(6);
            datos[6] = rs.getString(7);
            model.addRow(datos);
        }
        
        
        rs.close();
        preparedStatement.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    
    public void mostrarTabla2() {
    DefaultTableModel model2 = new DefaultTableModel();
    model2.addColumn("num1");
    model2.addColumn("num2");
    model2.addColumn("num3");
    model2.addColumn("num4");
    model2.addColumn("num5");
    model2.addColumn("num6");
    model2.addColumn("adicional1");
    jTable2.setModel(model2);

    // Consulta SQL con una consulta preparada
    String query2 = "SELECT num1,num2,num3,num4,num5,num6,adicional1 FROM numganadores_revancha WHERE fecha = ?";
    String datos2[] = new String[7];

    try {
        // Crear la consulta preparada
        PreparedStatement preparedStatement = cn.prepareStatement(query2);
        
        // Obtener la fecha del JTextField
        String fechaTexto = jTextField1.getText();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha = formato.parse(fechaTexto);
        
        // Establecer el parámetro de fecha en la consulta preparada
        preparedStatement.setDate(1, new java.sql.Date(fecha.getTime()));
        
        // Ejecutar la consulta
        ResultSet rs = preparedStatement.executeQuery();
        
        // Procesar los resultados
        while (rs.next()) {
            datos2[0] = rs.getString(1);
            datos2[1] = rs.getString(2);
            datos2[2] = rs.getString(3);
            datos2[3] = rs.getString(4);
            datos2[4] = rs.getString(5);
            datos2[5] = rs.getString(6);
            datos2[6] = rs.getString(7);
            model2.addRow(datos2);
        }
        
        
        rs.close();
        preparedStatement.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    
public String obtenerNumIdenticos() {
    String numIdenticos = null;

    // Consulta SQL con una consulta preparada
    String query = "SELECT " +
                   "(CASE WHEN revancha.num1 = numganadores_revancha.num1 THEN 1 ELSE 0 END + " +
                   " CASE WHEN revancha.num2 = numganadores_revancha.num2 THEN 1 ELSE 0 END + " +
                   " CASE WHEN revancha.num3 = numganadores_revancha.num3 THEN 1 ELSE 0 END + " +
                   " CASE WHEN revancha.num4 = numganadores_revancha.num4 THEN 1 ELSE 0 END + " +
                   " CASE WHEN revancha.num5 = numganadores_revancha.num5 THEN 1 ELSE 0 END + " +
                   " CASE WHEN revancha.num6 = numganadores_revancha.num6 THEN 1 ELSE 0 END + " +
                   " CASE WHEN revancha.adicional1 = numganadores_revancha.adicional1 THEN 1 ELSE 0 END) AS num_identicos " +
                   "FROM " +
                   "revancha " +
                   "JOIN " +
                   "numganadores_revancha " +
                   "WHERE " +
                   "revancha.fechaSorteo = ? AND numganadores_revancha.Fecha = ? and usuario = ? ";

    try {
        int idUsuario = sesion.getUserId();
        // Crear la consulta preparada
        PreparedStatement preparedStatement = cn.prepareStatement(query);

        // Obtener la fecha del JTextField
        String fechaTexto = jTextField1.getText();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha = formato.parse(fechaTexto);

        // Establecer los parámetros de fecha en la consulta preparada
        preparedStatement.setDate(1, new java.sql.Date(fecha.getTime()));
        preparedStatement.setDate(2, new java.sql.Date(fecha.getTime()));
        preparedStatement.setInt(3,idUsuario);

        // Ejecutar la consulta
        ResultSet rs = preparedStatement.executeQuery();

        // Procesar los resultados
        if (rs.next()) {
            // Obtener el valor de num_identicos
            numIdenticos = rs.getString("num_identicos");
        }

        // Cerrar los recursos
        rs.close();
        preparedStatement.close();
    } catch (Exception e) {
        e.printStackTrace();
    }

    return numIdenticos;
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtpremio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(27, 0, 75));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Resultados Revancha");

        jButton.setBackground(new java.awt.Color(132, 84, 199));
        jButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jButton.setForeground(new java.awt.Color(255, 255, 255));
        jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/volver.png"))); // NOI18N
        jButton.setText("Regresar");
        jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fecha.png"))); // NOI18N
        jLabel2.setText("Fecha del Sorte: ");

        jTextField1.setBackground(new java.awt.Color(132, 84, 199));
        jTextField1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(132, 84, 199));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/consulta.png"))); // NOI18N
        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Numero 1", "Numero 2", "Numero 3", "Numero 4", "Numero 5", "Numero 6", "Numero 7"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
            jTable2.getColumnModel().getColumn(5).setResizable(false);
            jTable2.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tu numero: ");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Numero Ganador:");

        jTable3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Numero 1", "Numero 2", "Numero 3", "Numero 4", "Numero 5", "Numero 6", "Numero 7"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(2).setResizable(false);
            jTable3.getColumnModel().getColumn(3).setResizable(false);
            jTable3.getColumnModel().getColumn(4).setResizable(false);
            jTable3.getColumnModel().getColumn(5).setResizable(false);
            jTable3.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tus Aciertos: ");

        jTextField2.setBackground(new java.awt.Color(132, 84, 199));
        jTextField2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Premio:");

        txtpremio.setBackground(new java.awt.Color(132, 84, 199));
        txtpremio.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        txtpremio.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(212, 212, 212))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtpremio, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                            .addComponent(jTextField2))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(165, 165, 165))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(166, 166, 166))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtpremio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActionPerformed
        dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tipos_Juego().setVisible(true);
            }
        });
    }//GEN-LAST:event_jButtonActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    mostrarTabla1();
    mostrarTabla2();
    String numIdenticos = obtenerNumIdenticos();
    jTextField2.setText(numIdenticos);
    // Determinar el premio en base a los aciertos
    int aciertos = Integer.parseInt(numIdenticos);
    String premio;
    switch (aciertos) {
        case 0:
            premio = "Aciertos: 0 - No obtuviste premio";
            break;
        case 1:
            premio = "Acierto: 1 - No obtuviste premio";
            break;
        case 2:
            premio = "Aciertos: 2 - Premio: $100 pesos";
            break;
        case 3:
            premio = "Aciertos: 3 - Premio: $500 pesos";
            break;
        case 4:
            premio = "Aciertos: 4 - Premio: $1,000 pesos";
            break;
        case 5:
            premio = "Aciertos: 5 - Premio: $500,000 pesos";
            break;
        case 6:
            premio = "Aciertos: 6 - Premio: $1,000,000 pesos";
            break;
        default:
            premio = "Error en el cálculo de aciertos";
            break;
    }
    
    // Establecer el texto del premio en jTextField3
    txtpremio.setText(premio);

    }//GEN-LAST:event_jButton1ActionPerformed
    
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
            java.util.logging.Logger.getLogger(Resultados_Revancha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resultados_Revancha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resultados_Revancha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resultados_Revancha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resultados_Revancha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField txtpremio;
    // End of variables declaration//GEN-END:variables
}
