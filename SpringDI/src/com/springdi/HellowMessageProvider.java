/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springdi;

import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service("messageProvider")
public class HellowMessageProvider implements MessageProvider{

    @Override
    public String getMessage() {
      
        return "Hellow";
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
