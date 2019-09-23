/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring;

import java.util.List;

/**
 *
 * @author Java
 */
public interface ContactDao {
    public List<Contact> findAll();
    public  List<Contact> findByFirstName(String firstName);
    public void insert(Contact contact);
    public void update(Contact contact);
    public void delete(int contactId);
    
}
