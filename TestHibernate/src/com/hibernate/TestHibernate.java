/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Java
 */
public class TestHibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		ProductService productService =applicationContext.getBean("productService", ProductServiceImpl.class);
		System.out.println("-----------"+productService.getProducts().get(1).getName());
    }
    
}
