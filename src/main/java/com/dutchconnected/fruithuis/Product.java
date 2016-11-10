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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Type;

/**
 *
 * @author P_jaz
 */
@Entity
@Table(name = "PRODUCT")

public class Product implements Serializable {
	public static final Crud<Product> CRUD = new Crud<>(Product.class)
			.addField("id", Product::getId, null, Integer.TYPE)
			.addField("naam", Product::getName, Product::setName, String.class)
			.addField("image", Product::getImage, Product::setImage, byte[].class)
			.addField("categorie", Product::getCategoryId, Product::setCategoryId, Category.class);
	private static final long serialVersionUID = -2353462766190146423L;
	
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "naam")
    private String name;

	//@Type(type="org.hibernate.type.PrimitiveByteArrayBlobType") 
    @Column(name = "image")
    private byte[] image;
    
    @ManyToOne
    @JoinColumn(name = "productsoort_id")
    private Category categoryId;
    
    @OneToMany(fetch = FetchType.EAGER)
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

    @Override
    public String toString() {
        return "Product{" + name + price + '}';
    }
    
    
    
    

    
    

}
