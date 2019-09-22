/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aop;

/**
 *
 * @author user
 */
public class SecuirityManager {
    private static ThreadLocal<UserInfo> threadlocal = new ThreadLocal<UserInfo>();
    public void login(String userName, String password){
        threadlocal.set(new UserInfo(userName, password));
    }
    
    public void logout(){
        threadlocal.set(null);
    }
    public UserInfo getLoggedOnUser(){
        return threadlocal.get();
    }
}
