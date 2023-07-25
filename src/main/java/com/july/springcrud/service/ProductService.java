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

	public int calculateTotalPrice() {
		List<Product> products = allProducts();
		int totalPrice = 0;
		for (Product product : products) {
			totalPrice += product.getPrice();
		}
		return totalPrice;
	}


}
