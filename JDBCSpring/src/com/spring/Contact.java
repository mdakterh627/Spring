/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Java
 */
public class Contact implements Serializable{
    private int id;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private List<ContactDetail> contact;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public List<ContactDetail> getContact() {
        return contact;
    }

    public void setContact(List<ContactDetail> contact) {
        this.contact = contact;
    }
    
    
    
    @Override
    public String toString(){
       return "Contact -Id: "+ id + ",First name: "+ firstName + ", Last name: " +lastName+ "Birthday: " + birthDate;
   
   
   }
    
}
