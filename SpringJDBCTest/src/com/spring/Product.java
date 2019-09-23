/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Java
 */
public class Product implements Serializable{
    int id;
    String Name;
    int Qty;
    double Price;

    public Product() {
    }

    public Product(int id, String Name, int Qty, double Price) {
        this.id = id;
        this.Name = Name;
        this.Qty = Qty;
        this.Price = Price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int Qty) {
        this.Qty = Qty;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

   
    
    
    
    
    
}
