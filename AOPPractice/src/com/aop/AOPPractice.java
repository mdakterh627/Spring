/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aop;

import org.springframework.aop.framework.ProxyFactory;
import sun.security.jca.JCAUtil;


/**
 *
 * @author user
 */
public class AOPPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SecuirityManager mgr = new SecuirityManager();
        SecureBean bean = getSecureBean();
        mgr.login("akter", "1234");
        bean.writeSecuremessage();
        mgr.logout();
        try{
            mgr.login("hossain", "12345");
            bean.writeSecuremessage();
            
        }catch(SecurityException ex){
            System.out.println("Exception caught: " + ex.getMessage());
        }
       finally{
        mgr.logout();
        }
        try{
         bean.writeSecuremessage();
            
        }catch(SecurityException ex){
            System.out.println("Exception caught: " + ex.getMessage());
        }
    }

    private static SecureBean getSecureBean() {
        
        SecureBean target = new SecureBean();
        SecurityAdvice advice = new SecurityAdvice();
        ProxyFactory factory = new ProxyFactory();
        factory.setTarget(target);
        factory.addAdvice(advice);
        SecureBean proxy = (SecureBean)factory.getProxy();
        return  proxy;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
