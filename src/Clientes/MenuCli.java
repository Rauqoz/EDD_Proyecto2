/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clientes;

import Clientes.*;

/**
 *
 * @author josed
 */
public class MenuCli extends javax.swing.JFrame {
    /**
     * Creates new form MenuC
     */
    public MenuCli() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones = new javax.swing.JPanel();
        Btnatras = new javax.swing.JButton();
        BTNcarga = new javax.swing.JButton();
        Btnagregar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        BTNeliminar = new javax.swing.JButton();
        BTNcllave = new javax.swing.JButton();
        BTNestructura = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Opciones = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botones.setBackground(new java.awt.Color(153, 153, 153));

        Btnatras.setBackground(new java.awt.Color(153, 153, 153));
        Btnatras.setText("Atras");

        BTNcarga.setBackground(new java.awt.Color(153, 153, 153));
        BTNcarga.setText("Carga masiva");
        BTNcarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNcargaActionPerformed(evt);
            }
        });

        Btnagregar.setBackground(new java.awt.Color(153, 153, 153));
        Btnagregar.setText("Agregar");
        Btnagregar.setToolTipText("");
        Btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnagregarActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setText("Modificar ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        BTNeliminar.setBackground(new java.awt.Color(153, 153, 153));
        BTNeliminar.setText("Eliminar ");
        BTNeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNeliminarActionPerformed(evt);
            }
        });

        BTNcllave.setBackground(new java.awt.Color(153, 153, 153));
        BTNcllave.setText("Mostrar Con Llave");
        BTNcllave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNcllaveActionPerformed(evt);
            }
        });

        BTNestructura.setBackground(new java.awt.Color(153, 153, 153));
        BTNestructura.setText("Mostra Estructura");
        BTNestructura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNestructuraActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Menu Clinetes");

        javax.swing.GroupLayout botonesLayout = new javax.swing.GroupLayout(botones);
        botones.setLayout(botonesLayout);
        botonesLayout.setHorizontalGroup(
            botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonesLayout.createSequentialGroup()
                .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(botonesLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(BTNcarga)
                        .addGap(35, 35, 35)
                        .addComponent(Btnagregar))
                    .addGroup(botonesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Btnatras, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(botonesLayout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(BTNeliminar)
                        .addGap(18, 18, 18)
                        .addComponent(BTNcllave)
                        .addGap(18, 18, 18)
                        .addComponent(BTNestructura))
                    .addGroup(botonesLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        botonesLayout.setVerticalGroup(
            botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btnatras)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNcarga)
                    .addComponent(Btnagregar)
                    .addComponent(jButton4)
                    .addComponent(BTNeliminar)
                    .addComponent(BTNcllave)
                    .addComponent(BTNestructura))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        Opciones.setBackground(new java.awt.Color(102, 102, 102));
        Opciones.setAutoscrolls(true);
        Opciones.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Opciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Opciones, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNcargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNcargaActionPerformed
        // TODO add your handling code here:
        

      
    }//GEN-LAST:event_BTNcargaActionPerformed

    private void BtnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnagregarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_BtnagregarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jButton4ActionPerformed

    private void BTNeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNeliminarActionPerformed
        // TODO add your handling code here:
;
    }//GEN-LAST:event_BTNeliminarActionPerformed

    private void BTNcllaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNcllaveActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_BTNcllaveActionPerformed

    private void BTNestructuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNestructuraActionPerformed
        // TODO add your handling code here:
  
    }//GEN-LAST:event_BTNestructuraActionPerformed

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
            java.util.logging.Logger.getLogger(MenuCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCli().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNcarga;
    private javax.swing.JButton BTNcllave;
    private javax.swing.JButton BTNeliminar;
    private javax.swing.JButton BTNestructura;
    private javax.swing.JButton Btnagregar;
    private javax.swing.JButton Btnatras;
    private javax.swing.JPanel Opciones;
    private javax.swing.JPanel botones;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}