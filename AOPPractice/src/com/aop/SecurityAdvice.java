/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aop;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

/**
 *
 * @author user
 */
public class SecurityAdvice implements MethodBeforeAdvice{

    private SecuirityManager securityManager;

    public SecurityAdvice() {
        this.securityManager = new SecuirityManager();
    }

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        
        UserInfo user = securityManager.getLoggedOnUser();
        
        if (user==null) {
            System.out.println("No user authenticate");
            throw new SecurityException(
            "You must login before attempting to invoke the method: " + method.getName()
            );
            
        }else if("akter".equals(user.getUserName())){
            System.out.println("Logged in user is akter -okey!");
        }else{
            System.out.println("Logged in user is " + user.getUserName() + " Not Good :(");
            throw new SecurityException("User " + user.getUserName() + "is not allowed access tomethod " + method.getName());
            
        }
    }
    
    
    
}
