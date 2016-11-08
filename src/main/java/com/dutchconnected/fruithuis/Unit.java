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
    private int small;
    
    @Column(name = "naam_meervoud", nullable = false)
    private int large;
    

    public Unit() {
    }

    public Unit(int id, int small, int large) {
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

    public int getSmall() {
        return small;
    }

    public void setSmall(int small) {
        this.small = small;
    }

    public int getLarge() {
        return large;
    }

    public void setLarge(int large) {
        this.large = large;
    }
    
    
    
    
    
}
