/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dutchconnected.fruithuis;

import com.dutchconnected.fruithuis.frames.Crud;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author P_jaz
 */
@Entity
@Table(name = "BESTELLING")

public class Order implements Serializable {
	public static final Crud<Order> CRUD = new Crud<>(Order.class)
			.addField("id", Order::getId, null, Integer.TYPE)
			.addField("horecaklant", Order::getUserId, Order::setUserId, User.class)
			.addField("prijs", Order::getPrice, Order::setPrice, Integer.class);
	private static final long serialVersionUID = -4914856071375611612L;
	
    @Id @GeneratedValue
    @Column(name = "id")
    private int id;
    
    @ManyToOne
    @JoinColumn(name = "horecaklant_id")
    private User userId;
    
    @Column(name = "prijs")
    private int price;

    public Order() {
    }

    public Order(int id, User userId, int price) {
        this.id = id;
        this.userId = userId;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order {"  + id + price + '}';
    }
    
    
    
    
    
}
