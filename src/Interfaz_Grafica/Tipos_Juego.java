/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz_Grafica;

import Datos.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Datos.obtenerSorteo;

/**
 *
 * @author 
 */
public class Tipos_Juego extends javax.swing.JFrame {

    String boleto_melate = "$50.00";
    String boleto_revancha = "$60.00";
    String boleto_revanchita = "$70.00";
    
    Conexion conn;
    public Tipos_Juego() {
        initComponents();
        conn = new Conexion();
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
        jbnMelate = new javax.swing.JButton();
        jbnRevancha = new javax.swing.JButton();
        JbnRevanchita = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(27, 0, 75));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tipos de Juego");

        jbnMelate.setBackground(new java.awt.Color(132, 84, 199));
        jbnMelate.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jbnMelate.setForeground(new java.awt.Color(255, 255, 255));
        jbnMelate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/melate.png"))); // NOI18N
        jbnMelate.setText("Presiona Aquí para Jugar Melate");
        jbnMelate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnMelateActionPerformed(evt);
            }
        });

        jbnRevancha.setBackground(new java.awt.Color(132, 84, 199));
        jbnRevancha.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jbnRevancha.setForeground(new java.awt.Color(255, 255, 255));
        jbnRevancha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/revancha.png"))); // NOI18N
        jbnRevancha.setText("Presiona Aquí para Jugar Revancha");
        jbnRevancha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnRevanchaActionPerformed(evt);
            }
        });

        JbnRevanchita.setBackground(new java.awt.Color(132, 84, 199));
        JbnRevanchita.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        JbnRevanchita.setForeground(new java.awt.Color(255, 255, 255));
        JbnRevanchita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/revanchita.png"))); // NOI18N
        JbnRevanchita.setText("Presiona Aquí para Jugar Revanchita");
        JbnRevanchita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbnRevanchitaActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(132, 84, 199));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(JbnRevanchita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbnRevancha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbnMelate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jbnMelate, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jbnRevancha, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(JbnRevanchita, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(27, 0, 75));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N

        jMenu1.setBackground(new java.awt.Color(27, 0, 75));
        jMenu1.setBorder(null);
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Resulltados");
        jMenu1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N

        jMenuItem1.setBackground(new java.awt.Color(27, 0, 75));
        jMenuItem1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/resultado.png"))); // NOI18N
        jMenuItem1.setText("Ver Melate");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setBackground(new java.awt.Color(27, 0, 75));
        jMenuItem2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/resultado.png"))); // NOI18N
        jMenuItem2.setText("Ver Revancha");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setBackground(new java.awt.Color(27, 0, 75));
        jMenuItem3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/resultado.png"))); // NOI18N
        jMenuItem3.setText("Ver Revanchita");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(27, 0, 75));
        jMenu2.setBorder(null);
        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("Consultar");
        jMenu2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N

        jMenuItem4.setBackground(new java.awt.Color(27, 0, 75));
        jMenuItem4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jMenuItem4.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sorteo.png"))); // NOI18N
        jMenuItem4.setText("Sorteos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbnMelateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnMelateActionPerformed
        try {
            String query = "SELECT id_sorteo from sorteo where id_sorteo = 1";
            Statement st = conn.conectar().createStatement();
            ResultSet rs = st.executeQuery(query);
            
            if(rs.next()){
                int idsorteo = rs.getInt("id_sorteo");
                obtenerSorteo.setSorteoId(idsorteo);
            }
            
        } catch (Exception e) {
        }

    
    int response = JOptionPane.showConfirmDialog(null, "El costo del juego es" + " " + boleto_melate + ". ¿Seguro de continuar?", "Confirmación", JOptionPane.YES_NO_OPTION);

    if (response == JOptionPane.YES_OPTION) {
    dispose();
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Generacion_Numeros_Melate().setVisible(true);
        }
    });
} else {
    // Aquí puedes manejar el caso en que el usuario elige "No"
   JOptionPane.showMessageDialog(null, "El usuario ha cancelado la operación.", "Información", JOptionPane.INFORMATION_MESSAGE);

}
       
    }//GEN-LAST:event_jbnMelateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Iniciar_Sesion().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Tipos_Juego.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });                 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbnRevanchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnRevanchaActionPerformed
         try {
            String query = "SELECT id_sorteo from sorteo where id_sorteo = 2";
            Statement st = conn.conectar().createStatement();
            ResultSet rs = st.executeQuery(query);
            
            if(rs.next()){
                int idsorteo = rs.getInt("id_sorteo");
                obtenerSorteo.setSorteoId(idsorteo);
            }
            
        } catch (Exception e) {
        }

        int response = JOptionPane.showConfirmDialog(null, "El costo del juego es" + " " + boleto_revancha + ". ¿Seguro de continuar?", "Confirmación", JOptionPane.YES_NO_OPTION);

    if (response == JOptionPane.YES_OPTION) {
    dispose();
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Generacion_Numeros_Revancha().setVisible(true);
        }
    });
} else {
    // Aquí puedes manejar el caso en que el usuario elige "No"
    JOptionPane.showMessageDialog(null, "El usuario ha cancelado la operación.", "Información", JOptionPane.INFORMATION_MESSAGE);

}
    }//GEN-LAST:event_jbnRevanchaActionPerformed

    private void JbnRevanchitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbnRevanchitaActionPerformed
         try {
            String query = "SELECT id_sorteo from sorteo where id_sorteo = 3";
            Statement st = conn.conectar().createStatement();
            ResultSet rs = st.executeQuery(query);
            
            if(rs.next()){
                int idsorteo = rs.getInt("id_sorteo");
                obtenerSorteo.setSorteoId(idsorteo);
            }
            
        } catch (Exception e) {
        }

        int response = JOptionPane.showConfirmDialog(null, "El costo del juego es" + " " + boleto_revanchita + ". ¿Seguro de continuar?", "Confirmación", JOptionPane.YES_NO_OPTION);

        if (response == JOptionPane.YES_OPTION) {
        dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new Generacion_Numeros_Revanchita().setVisible(true);
        }
    });
} else {
    // Aquí puedes manejar el caso en que el usuario elige "No"
    JOptionPane.showMessageDialog(null, "El usuario ha cancelado la operación.", "Información", JOptionPane.INFORMATION_MESSAGE);

}
    }//GEN-LAST:event_JbnRevanchitaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resultados_Melate().setVisible(true);
            }
        });
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resultados_Revancha().setVisible(true);
            }
        });
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resultados_Revanchita().setVisible(true);
            }
        });
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultar().setVisible(true);
            }
        });    
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(Tipos_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tipos_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tipos_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tipos_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tipos_Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbnRevanchita;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbnMelate;
    private javax.swing.JButton jbnRevancha;
    // End of variables declaration//GEN-END:variables
}
