/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring;

import java.sql.*;
import java.util.*;



/**
 *
 * @author user
 */
public class PlainContactDao implements ContactDao{
   
    static{
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException ex){
            System.out.println("Message "+ ex.getMessage());
        
        }
    }
   
    
    private Connection getConnection() throws SQLException{
    return DriverManager.getConnection("jdbc:mysql://localhost:3306/spring", "root", "root");
    }
    private void closeConnection(Connection con){
        if (con == null) return;
            
            try{
            con.close();
            
            }catch(SQLException ex){
                
                System.out.println("Message "+ ex.getMessage());
            }
            
        }
    
    

    
    @Override
    public List<Contact> findAll() {
     List<Contact> result = new ArrayList<>();
     
     Connection con = null;
     try{
     con = getConnection();
         PreparedStatement pst =con.prepareStatement("select * from contact)");
         ResultSet rst = pst.executeQuery();
         while(rst.next()){
             Contact contact = new Contact();
             contact.setId(rst.getInt(id));
             contact.setFirstName(rst.getString("First_name"));
             contact.setLastName(rst.getString("Last_Name"));
             contact.setBirthDate(rst.getDate("Birth_Date"));
             result.add(contact);
         }
     }catch(SQLException ex){
         System.out.println("Message "+ ex.getMessage());
     
     }finally{
         closeConnection(con);
     }
    return result;
    }

   
    @Override
    public List<Contact> findByFirstName(String firstName) {
     return null;
    }

   
    @Override
    public void insert(Contact contact) {
        Connection con = null;
        try{
            con = getConnection();
            PreparedStatement pst = con.prepareStatement("insert into Contact(First_name, Last_Name, Birth_Date) Values(?,?,?)",
            Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, contact.getFirstName());
            pst.setString(2, contact.getLastName());
            pst.setDate(3,(Date) contact.getBirthDate();
            pst.execute();
            
            ResultSet generatedKeys = pst.getGeneratedKeys();
            if (generatedKeys.next()) {
                contact.setId(generatedKeys.getInt(1));
                
            }
            
        }catch(SQLException ex){
            System.out.println("Message "+ ex.getMessage());
        }finally{
            closeConnection(con);
        }
    }


    @Override
    public void update(Contact contact) {

    }

    @Override
    public void delete(int contactId) {
        Connection con = null;
        try{
            con = getConnection();
            PreparedStatement pst = con.prepareStatement("delete from contact where id=?");
            pst.setInt(1, contactId);
            pst.execute();
            
        }catch(SQLException ex){
            System.out.println("Message "+ ex.getMessage());
        }finally{
            closeConnection(con);
        }
        
    }

}
