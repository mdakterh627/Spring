/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate;

import java.io.Serializable;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

/**
 *
 * @author Java
 */
@Entity
@Table(name="product")
public class Product implements Serializable {
    private int id;
    private String name;
    private int Qty;
    private Double price;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "Id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="Qty")
    public int getQty() {
        return Qty;
    }

    public void setQty(int Qty) {
        this.Qty = Qty;
    }

    @Column(name="price")
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", Qty=" + Qty + ", price=" + price + '}';
    }
    
    
}
