package com.july.springcrud.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;

import com.july.springcrud.config.MyBatisConfig;
import com.july.springcrud.model.Product;

@Service

public class ProductService {
	private static SqlSessionFactory sf;

	// constructor will receive a myBatis sessionFactory object
	public ProductService() {

		sf = MyBatisConfig.getSqlSessionFactory();
	}

	public List<Product> allProducts() {
		SqlSession session = sf.openSession();
		@SuppressWarnings("unchecked")
		List<Product> allproducts = session.selectList("com.july.springcrud.mapper.ProductMapper.getAllProducts");
		session.close();

		return allproducts;

	}


    public Product getProductById(int productid) {
    	SqlSession session = sf.openSession();
		Object getProductById = session.selectOne("com.july.springcrud.mapper.ProductMapper.getProductById");
		session.close();
		return getProductById(productid);
    }

    public void addProduct(Product product) {
    	SqlSession session = sf.openSession();
    	try {session.insert("com.july.springcrud.mapper.ProductMapper.addProduct", product);
    		session.commit();
    	}finally {
    		session.close();
    	}
    }

    public void editProduct(int productid) {
    	SqlSession session = sf.openSession();
    	try {session.update("com.july.springcrud.mapper.ProductMapper.editProduct", productid);
    		session.commit();
    	}finally {
    		session.close();
    	}
    }

    public void deleteProduct(int productid) {
    	SqlSession session = sf.openSession();
    	try {session.delete("com.july.springcrud.mapper.ProductMapper.deleteProduct", productid);
    		session.commit();
    	}finally {
    		session.close();
    	}
    }
	


}
