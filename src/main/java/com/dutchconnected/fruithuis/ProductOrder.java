/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dutchconnected.fruithuis;

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
@Table(name = "PRODUCT_BESTELLING")

public class ProductOrder {
    @Id @GeneratedValue
    @Column(name = "id")
    private int id;
    
    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductUnitUser productId;
    
    @ManyToOne
    @JoinColumn(name = "bestelling_id")
    private Order orderId;
    
    @Column(name = "aantal")
    private float amount;
    
    @Column(name = "datum")
    private long date;

    public ProductOrder() {
    }

    public ProductOrder(int id, ProductUnitUser productId, Order orderId, float amount, long date) {
        this.id = id;
        this.productId = productId;
        this.orderId = orderId;
        this.amount = amount;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ProductUnitUser getProductId() {
        return productId;
    }

    public void setProductId(ProductUnitUser productId) {
        this.productId = productId;
    }

    public Order getOrderId() {
        return orderId;
    }

    public void setOrderId(Order orderId) {
        this.orderId = orderId;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ProductOrder{" + "id=" + id + ", productId=" + productId + ", orderId=" + orderId + ", amount=" + amount + ", date=" + date + '}';
    }
    
    
    
    
    
    
    
}
