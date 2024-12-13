/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clientes;

import Conductores.*;
import javax.swing.JOptionPane;
import static edd_proyecto2.EDD_Proyecto2.*;
/**
 *
 * @author josed
 */
public class MostrarCLie extends javax.swing.JPanel {

    /**
     * Creates new form MostrarCL
     */
    
    public MostrarCLie() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dpi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        mostrar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setText("Mostra Conductor ");

        jLabel2.setText("DPI");

        dpi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dpiKeyTyped(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setText("Buscar DPI");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        mostrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mostrar.setAutoscrolls(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(dpi, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(68, 68, 68)
                .addComponent(mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dpiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dpiKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car < ',' || car > '.'))
            evt.consume();
    }//GEN-LAST:event_dpiKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        NodoH nuevo = tablita.Busqueda(dpi.getText());
        if (nuevo != null) {
            mostrar.setText("Dpi: "+nuevo.getDato().getDpi()+"; Nombre:"+nuevo.getDato().getNombre()+" "+nuevo.getDato().getApellido()+"; Telefono: "+nuevo.getDato().getTelefono()+ "; Direcion: "+nuevo.getDato().getDireccion()+"; ");
            dpi.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Conductor no encontrado!!!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dpi;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel mostrar;
    // End of variables declaration//GEN-END:variables
}
