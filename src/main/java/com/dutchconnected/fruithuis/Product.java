/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dutchconnected.fruithuis;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author P_jaz
 */
@Entity
@Table(name = "PRODUCT")

public class Product {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "naam")
    private String name;

    @Column(name = "image")
    private byte[] image;
    
    @ManyToOne
    @JoinColumn(name = "productsoort_id")
    private Category categoryId;
    
    @OneToMany
    @JoinColumn (name = "product_id")
    private Set<ProductUnitUser> price;

    public Product() {
    }

    public Product(int id, String name, byte[] image, Category categoryId, Set<ProductUnitUser> price) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.categoryId = categoryId;
        this.price = price;
    }    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Category getCategory_id() {
        return categoryId;
    }

    public void setCategory_id(Category category_id) {
        this.categoryId = category_id;
    }

    public Category getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Category categoryId) {
        this.categoryId = categoryId;
    }

    public Set<ProductUnitUser> getPrice() {
        return price;
    }

    public void setPrice(Set<ProductUnitUser> price) {
        this.price = price;
    }
    
    

    
    

}
