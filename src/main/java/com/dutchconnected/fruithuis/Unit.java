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
@Table(name = "UNIT")

public class Unit {
    @Id @GeneratedValue
    @Column(name = "id")
    private int id;  
    
    
    @Column(name = "naam_enkel", nullable = false)
    private String small;
    
    @Column(name = "naam_meervoud", nullable = false)
    private String large;
    

    public Unit() {
    }

    public Unit(int id, String small, String large) {
        this.id = id;
        this.small = small;
        this.large = large;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }   

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }
    
    
    
    
    
}
