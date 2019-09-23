/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author Java
 */
class ProductDao implements ProductService{
     private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    
    public ProductDao() throws Exception{
        super();
    }
  
    @Override
    public List<Product> getProducts()  {
          List<Product> lists = new ArrayList<>();
        try{
            Connection connection = dataSource.getConnection();
            Statement stm = connection.createStatement();
            ResultSet rst= stm.executeQuery("select * from product");
            while(rst.next()){
                lists.add(new Product(rst.getInt(1),rst.getString(2), 50, 10));
            }
        }catch(SQLException e){
              System.out.println("Error "+e);
        }
      return lists;
    }
    
}
