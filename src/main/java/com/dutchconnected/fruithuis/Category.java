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
import javax.persistence.Table;

/**
 *
 * @author P_jaz
 */
@Entity
@Table(name = "PRODUCTSOORT")
public class Category {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "naam")
    private String name;

    @Column(name = "image")
    private byte[] image;

    public Category() {
    }

    public Category(int id, String name, byte[] image) {
        this.id = id;
        this.name = name;
        this.image = image;
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

    @Override
    public String toString() {
        return "Category{" + "id=" + id + ", name=" + name + ", image=" + image + '}';
    }
    

}
