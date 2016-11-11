/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dutchconnected.fruithuis;

import com.dutchconnected.fruithuis.frames.Crud;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Type;

/**
 *
 * @author P_jaz
 */
@Entity
@Table(name = "PRODUCTSOORT")
public class Category implements Serializable {
	
	public static final Crud<Category> CRUD = new Crud<>(Category.class)
			.addField("id", Category::getId, null, Integer.TYPE)
			.addField("naam", Category::getName, Category::setName, String.class)
			.addField("image", Category::getImage, Category::setImage, byte[].class);
	private static final long serialVersionUID = 3715900176843151243L;
	
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "naam")
    private String name;

	//@Type(type="org.hibernate.type.PrimitiveByteArrayBlobType") 
    @Lob
    @Column(name = "image")
    private byte[] image;
    
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn (name = "productsoort_id")
    private Set<Product> products;

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

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Category{" + "id=" + id + ", name=" + name + ", image=" + image + '}';
    }
    

}
