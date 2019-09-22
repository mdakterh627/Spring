/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
/**
 *
 * @author user
 */
public class SpringDI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-annotate.xml");
        MessageRenderer mr = (MessageRenderer) context.getBean("renderer");
        mr.render();
    }
    
}
