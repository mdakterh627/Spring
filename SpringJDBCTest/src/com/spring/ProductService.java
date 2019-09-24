/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring;

import java.sql.ResultSet;
import java.util.List;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Java
 */
public interface ProductService extends RowMapper<Product>{
    
     public List<Product> getProducts();
      public String findFirstNameById(int id);
     
     public Product mapRow(ResultSet rs, int rowNum);

    
    
}
