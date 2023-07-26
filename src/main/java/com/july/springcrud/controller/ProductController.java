package com.july.springcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.july.springcrud.model.Categories;
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
	  
	
	 
	  @GetMapping("/products/{productid}")
	    public String getProductById(@PathVariable int productid, Model model) {
	        Product product = productService.getProductById(productid);
	        model.addAttribute("product", product);
	        return "product-details";
	    }

	    @GetMapping("/addProduct")
	    public String showAddProductForm(Model model) {
	        model.addAttribute("product", new Product());
	        return "addProduct";
	    }

	    @PostMapping("/addProduct")
	    public String addProduct(@ModelAttribute("product") Product product) {
	        productService.addProduct(product);
	        return "redirect:/products";
	    }

	    @GetMapping("/products/editProduct/{productid}")
	    public String showEditProductForm(@PathVariable("productid") int productid, Model model) {
	        Product product = productService.getProductById(productid);
	        model.addAttribute("product", product);
	        return "editProduct";
	    }

	    @PostMapping("/products/editProduct/{productid}")
	    public String editProduct(@PathVariable("productid") int productid, @ModelAttribute("product") Product product) {
	        product.setProductid(productid);
	        productService.editProduct(productid);
	        return "redirect:/products";
	    }

	    @GetMapping("/deleteProduct/{productid}")
	    public String showDeleteProductConfirmation(@PathVariable int productid, Model model) {
	        Product product = productService.getProductById(productid);
	        model.addAttribute("product", product);
	        return "deleteProduct";
	    }

	    @PostMapping("/deleteProduct/{productid}")
	    public String deleteProduct(@PathVariable int productid) {
	        productService.deleteProduct(productid);
	        return "redirect:/products";
	    }

}
