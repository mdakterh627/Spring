package com.j2ee.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;


import com.J2ee.model.Product;
import org.springframework.stereotype.Repository;

@Repository("productService")
//@Transactional
public class ProductServiceImpl implements ProductService  {
	
	private SessionFactory sessionFactory;
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	@Resource(name = "sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}



//	@Transactional(readOnly = true)
	public List<Product> getProducts() {
		
		
		return sessionFactory.openSession().createQuery("From Product p").list();
	}

}
