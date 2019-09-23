/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Java
 */
public class Connection implements ContactDao{
    
    static{
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException ex){
            System.out.println("Message "+ ex.getMessage());
        
        }
    }
   
    
    private java.sql.Connection getConnection() throws SQLException{
    return DriverManager.getConnection("jdbc:mysql://localhost:3306/spring", "root", "root");
    }
    private void closeConnection(java.sql.Connection con){
        if (con == null) return;
            
            try{
            con.close();
            
            }catch(SQLException ex){
                
                System.out.println("Message "+ ex.getMessage());
            }
            
        }

    @Override
    public List<Contact> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Contact> findByFirstName(String firstName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(Contact contact) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Contact contact) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int contactId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
