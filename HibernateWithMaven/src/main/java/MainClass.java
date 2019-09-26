
import com.j2ee.dao.ProductService;
import com.j2ee.dao.ProductServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Java
 */
public class MainClass {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        ProductService productService =applicationContext.getBean("productService", ProductServiceImpl.class);
	
	System.out.println("-----------"+productService.getProducts().get(0).getName());
    }
    
}
