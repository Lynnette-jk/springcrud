package com.july.springcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.july.springcrud.model.Product;
import com.july.springcrud.service.ProductService;

@Controller

public class ProductController {
	private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @Autowired 
	  ProductService productservice;
	  
	  @RequestMapping(value = "/test", method = RequestMethod.GET)
	  
	  @ResponseBody 
	  public String test() { 
		  return "test";
	  
	  }
	  
	  
	 
	  @GetMapping("/products")
		 public String getallProducts(Model model) {
		        List<Product> products = productService.allProducts();
		        model.addAttribute("products", products);
		        return "products";
		    }
	 
	  @RequestMapping( value ="/total-price" ,method=RequestMethod.GET)
	  @ResponseBody
	    public int CalctotalPrice() {
	    	int totalPrice =productservice.calculateTotalPrice();
			return totalPrice;
	    }


}
