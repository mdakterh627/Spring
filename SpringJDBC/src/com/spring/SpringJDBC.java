/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author user
 */
public class SpringJDBC {

    /**
     * @param args the command line arguments
     */
    private static  ContactDao contactDao = new PlainContactDao();
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Listing Initial contact data: ");
        listAllContact();
        
        System.out.println();
        
        System.out.println("Insert a new contact");
        Contact contact = new Contact();
        contact.setFirstName("Jack");
        contact.setLastName("Jhon");
        contact.setBirthDate(new Date());
        contactDao.insert(contact);
        System.out.println("Listing contact data after new contact created: ");
        listAllContact();
        System.out.println();
        
        System.out.println("Deleting The previous Created Contact");
        contactDao.delete(contact.getId());
        System.out.println("Listing contact data after new contact deleted");
        listAllContact();
    }

    private static void listAllContact() {
        List<Contact> contacts = contactDao.findAll();
        for (Contact contact: contacts){
            System.out.println(contact);
            
        }
    }
    
}
