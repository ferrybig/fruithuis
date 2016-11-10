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
@Table(name = "HORECAKLANT")

public class User {
    @Id @GeneratedValue
    @Column(name = "id")
    private int id;
    
    @Column(name = "naam")
    private String name;
    
    @Column(name = "adres")
    private String address;
    
    @Column(name = "woonplaats")
    private String city;
    
    @Column(name = "postcode")
    private String zipcode;
    
    @Column(name = "telefoonnummer")
    private String phone;
    
    @Column (name = "klantnummer")
    private int klantnummer;

    public User() {
    }

    public User(int id, String name, String address, String city, String zipcode, String phone, int klantnummer) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.city = city;
        this.zipcode = zipcode;
        this.phone = phone;
        this.klantnummer = klantnummer;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getKlantnummer() {
        return klantnummer;
    }

    public void setKlantnummer(int klantnummer) {
        this.klantnummer = klantnummer;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", address=" + address + ", city=" + city + ", zipcode=" + zipcode + ", phone=" + phone + ", klantnummer=" + klantnummer + '}';
    }
    
    
    
    
    
    
}
