/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dutchconnected.fruithuis.frames;

import com.dutchconnected.fruithuis.Category;
import com.dutchconnected.fruithuis.Product;
import com.dutchconnected.fruithuis.User;
import org.hibernate.SessionFactory;

/**
 *
 * @author sha_y_000
 */
public class Administrator extends javax.swing.JFrame {

	private final SessionFactory connection;

    /**
     * Creates new form Administrator
     */
    public Administrator(SessionFactory connection) {
        initComponents();
		this.connection = connection;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jButton7 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        categorieShow = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        productShow = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        customerShow = new javax.swing.JButton();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));

        jButton7.setText("Verwijderen");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Categorie"));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        categorieShow.setText("Bekijken");
        categorieShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categorieShowActionPerformed(evt);
            }
        });
        jPanel4.add(categorieShow, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel4, gridBagConstraints);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Product"));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        productShow.setText("Bekijken");
        productShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productShowActionPerformed(evt);
            }
        });
        jPanel5.add(productShow, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel5, gridBagConstraints);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Bestelling"));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        jButton3.setText("Facturen");
        jPanel6.add(jButton3, new java.awt.GridBagConstraints());

        jButton5.setText("Voorraad");
        jPanel6.add(jButton5, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel6, gridBagConstraints);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Klant"));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        customerShow.setText("Bekijken");
        customerShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerShowActionPerformed(evt);
            }
        });
        jPanel7.add(customerShow, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel7, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.3;
        getContentPane().add(filler6, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.4;
        getContentPane().add(filler7, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(filler8, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(filler9, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void categorieShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categorieShowActionPerformed
	Category.CRUD.listAction().apply(this, connection).setVisible(true);
    }//GEN-LAST:event_categorieShowActionPerformed

    private void productShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productShowActionPerformed
        Product.CRUD.listAction().apply(this, connection).setVisible(true);
    }//GEN-LAST:event_productShowActionPerformed

    private void customerShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerShowActionPerformed
        User.CRUD.listAction().apply(this, connection).setVisible(true);
    }//GEN-LAST:event_customerShowActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton categorieShow;
    private javax.swing.JButton customerShow;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton productShow;
    // End of variables declaration//GEN-END:variables
}
