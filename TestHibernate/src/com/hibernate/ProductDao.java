/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Java
 */
public class ProductDao implements ProductService{
    List<Product> products = new ArrayList<>();

    @Override
    public List<Product> getProduct() {
        
        return products;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
