/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlockChain;

import MenuPrincipal.MenuPrincipal;
import static edd_proyecto2.EDD_Proyecto2.*;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author raul4
 */
public class formViajes extends javax.swing.JFrame {

    /**
     * Creates new form formViajes
     */
    public formViajes() {
        initComponents();
        setLocationRelativeTo(null);
        recarga();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    void recarga() {
        cClientes.removeAllItems();
        cConductores.removeAllItems();
        cOrigenes.removeAllItems();
        cDestinos.removeAllItems();
        cVehiculos.removeAllItems();
        tablita.cargarCombobox(cClientes);
        lista.cargaCombobox(cConductores);
        ListaRutas.cargarOrigenesCombobox(ListaRutas.inicio, cOrigenes);
        ListaRutas.cargarOrigenesCombobox(ListaRutas.inicio, cDestinos);
        t.cargaVehiculos1(cVehiculos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cVehiculos = new javax.swing.JComboBox<>();
        cClientes = new javax.swing.JComboBox<>();
        cConductores = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        cDestinos = new javax.swing.JComboBox<>();
        cOrigenes = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Crear Viajes");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(207, 11, 102, 34);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Origen");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 70, 52, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Vehiculo");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 270, 70, 22);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Crear Viaje");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(380, 130, 110, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Destino");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 120, 59, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Cliente");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 170, 53, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Conductor");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 220, 90, 22);

        cVehiculos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(cVehiculos);
        cVehiculos.setBounds(170, 270, 110, 28);

        cClientes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(cClientes);
        cClientes.setBounds(170, 170, 110, 28);

        cConductores.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(cConductores);
        cConductores.setBounds(170, 220, 110, 28);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Ver Rutas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(380, 70, 110, 40);

        jButton3.setText("Atras");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(30, 10, 90, 23);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Ver Viajes");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(380, 190, 110, 40);

        jPanel1.add(cDestinos);
        cDestinos.setBounds(170, 120, 110, 30);

        jPanel1.add(cOrigenes);
        cOrigenes.setBounds(170, 70, 110, 30);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setText("Top's");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(380, 250, 110, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        File imagen = new File("rutas.png");
        if (imagen.exists()) {
            Desktop abrir = Desktop.getDesktop();
            try {
                abrir.open(imagen);
            } catch (IOException ex) {
                Logger.getLogger(formViajes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (cClientes.getItemCount() == 0 || cConductores.getItemCount() == 0 || cOrigenes.getItemCount() == 0 || cDestinos.getItemCount() == 0 || cVehiculos.getItemCount() == 0) {
            JOptionPane.showMessageDialog(null, "Campos Vacios");
        } else {
            ListaViajes.insertarViaje(cOrigenes.getSelectedItem().toString(), cDestinos.getSelectedItem().toString(), cClientes.getSelectedItem().toString(), cConductores.getSelectedItem().toString(), cVehiculos.getSelectedItem().toString());
            File imagen = new File("rutaActual.png");
            if (imagen.exists()) {
                Desktop abrir = Desktop.getDesktop();
                try {
                    abrir.open(imagen);
                } catch (IOException ex) {
                    Logger.getLogger(formViajes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            recarga();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        File imagen = new File("blockChain.png");
        if (imagen.exists()) {
            Desktop abrir = Desktop.getDesktop();
            try {
                abrir.open(imagen);
            } catch (IOException ex) {
                Logger.getLogger(formViajes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        dispose();
        TopBlockChain menu = new TopBlockChain();
        menu.setVisible(true);

    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cClientes;
    private javax.swing.JComboBox<String> cConductores;
    private javax.swing.JComboBox<String> cDestinos;
    private javax.swing.JComboBox<String> cOrigenes;
    private javax.swing.JComboBox<String> cVehiculos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}