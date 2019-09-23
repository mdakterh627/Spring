/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


/**
 *
 * @author Java
 */
public class JDBCUtil {
    
    static{
        try {
            Class.forName("com.jdbc.mysql.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
//            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public static Connection getConnection() throws SQLException{
            
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/evidence", "root", "root");
     
    
    }
    
}
