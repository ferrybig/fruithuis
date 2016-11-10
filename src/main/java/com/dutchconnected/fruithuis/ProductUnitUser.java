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
@Table(name = "PRODUCT_UNIT_USER")

public class ProductUnitUser {
    @Id @GeneratedValue
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product productId;

    @ManyToOne
    @JoinColumn(name = "unit_id")
    private Unit unitId;
    
    @ManyToOne
    @JoinColumn(name = "klant_id")
    private User userId;
    
    @Column(name = "basis_prijs")
    private double basisPrice;
    
    @Column(name = "aantal_prijs")
    private double amountPrice;
    
    @Column(name = "minimum_aantal")
    private int minAmount;

    public ProductUnitUser() {
    }

    public ProductUnitUser(int id, Product productId, Unit unitId, User userId, double basisPrice, double amountPrice, int minAmount) {
        this.id = id;
        this.productId = productId;
        this.unitId = unitId;
        this.userId = userId;
        this.basisPrice = basisPrice;
        this.amountPrice = amountPrice;
        this.minAmount = minAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public Unit getUnitId() {
        return unitId;
    }

    public void setUnitId(Unit unitId) {
        this.unitId = unitId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public double getBasisPrice() {
        return basisPrice;
    }

    public void setBasisPrice(double basisPrice) {
        this.basisPrice = basisPrice;
    }

    public double getAmountPrice() {
        return amountPrice;
    }

    public void setAmountPrice(double amountPrice) {
        this.amountPrice = amountPrice;
    }

    public int getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(int minAmount) {
        this.minAmount = minAmount;
    }
    
    public double getPriceForAmountOfProduct(int total) {
        return (this.getBasisPrice() + total * this.getAmountPrice());
    }

    @Override
    public String toString() {
        return "ProductUnitUser{" + "id=" + id + ", productId=" + productId + ", unitId=" + unitId + ", userId=" + userId + ", basisPrice=" + basisPrice + ", amountPrice=" + amountPrice + ", minAmount=" + minAmount + '}';
    }
    
    

}
