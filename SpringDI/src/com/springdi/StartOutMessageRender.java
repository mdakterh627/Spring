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
@Service("renderer")
public class StartOutMessageRender implements MessageRenderer{
    private MessageProvider messageProvider;

    @Override
    public void render() {
        if(messageProvider==null){
            System.out.println("Null reference");
        }else{
            System.out.println("Message "+ messageProvider.getMessage());
        }
       
        
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMessageProvider(MessageProvider provider) {
       
       this.messageProvider = provider; 
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MessageProvider getMessageProvider() {
        
     return messageProvider;   
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
