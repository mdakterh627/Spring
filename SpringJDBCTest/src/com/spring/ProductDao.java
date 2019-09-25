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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Java
 */
class ProductDao implements ProductService{

    static String findNameById(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     private DataSource dataSource;
     private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
      this.jdbcTemplate=new JdbcTemplate(dataSource); 
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

  
    
    @Override
    public Product mapRow(ResultSet rs, int rowNum) {
          Product products = new Product();
        try {
          
            products.setId(rs.getInt("id"));
         products.setName(rs.getString("name"));
         products.setQty(rs.getInt("qty"));
         products.setPrice(rs.getDouble("price"));
        } catch (SQLException ex) {
//            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }  
        return products;
    }

    @Override
    public String findFirstNameById(int id) {
         String sql="select name from producr where id= :pid";
        Map<String,Object> namedParameters = new HashMap<String,Object>();
        namedParameters.put("pid",id);



        return null;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
       
}
