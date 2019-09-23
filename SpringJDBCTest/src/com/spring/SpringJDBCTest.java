/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Java
 */
public class SpringJDBCTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
           ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
          ProductService dao = context.getBean("productDao",ProductDao.class);
          System.out.println(dao.getProducts().get(0).getName());
        } catch (Exception ex) {
//            Logger.getLogger(SpringJDBC.class.getName()).log(Level.SEVERE, null, ex);
  System.out.println("Message "+ ex.getMessage());
        }
    }
    
}
