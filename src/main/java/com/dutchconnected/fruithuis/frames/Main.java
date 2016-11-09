/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dutchconnected.fruithuis.frames;

import com.dutchconnected.fruithuis.Category;
import com.dutchconnected.fruithuis.Order;
import com.dutchconnected.fruithuis.Product;
import com.dutchconnected.fruithuis.ProductOrder;
import com.dutchconnected.fruithuis.ProductUnitUser;
import com.dutchconnected.fruithuis.Unit;
import com.dutchconnected.fruithuis.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author admin
 */
public class Main {
	/**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException {
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
            java.util.logging.Logger.getLogger(Loginforum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loginforum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loginforum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loginforum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        Class.forName("oracle.jdbc.driver.OracleDriver");
          SessionFactory factory = new Configuration().
                    configure().
                    //addPackage("com.xyz") //add package if used.
                    addAnnotatedClass(Category.class).
                    addAnnotatedClass(Order.class).
                    addAnnotatedClass(Product.class).
                    addAnnotatedClass(ProductOrder.class).
                    addAnnotatedClass(ProductUnitUser.class).
                    addAnnotatedClass(Unit.class).
                    addAnnotatedClass(User.class).
                    buildSessionFactory();
            
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Categorie(factory).setVisible(true);
            }
        });
    }
}
