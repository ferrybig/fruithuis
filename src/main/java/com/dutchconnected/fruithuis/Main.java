/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dutchconnected.fruithuis;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author P_jaz
 */
public class Main {

    private static SessionFactory factory;

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            factory = new Configuration().
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
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }

        
    }
}
