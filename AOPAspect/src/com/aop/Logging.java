/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 *
 * @author user
 */
@Aspect
public class Logging {
 
@Before("execution(* com.aop.*.*())")  
public void beforeAdvice(){
     System.out.println("Before advice hit");

}
@After("execution(* com.aop.*.*())")  
public void afterAdvice(){
     System.out.println("After advice hit");

}
    
}
