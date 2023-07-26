//package com.july.springcrud.controller;
//
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import com.july.springcrud.model.Categories;
//
//public class CategoryController {
//	  // Add/Edit Categories - Show form
//    @GetMapping("/addCategory")
//    public String showCategoryForm(Model model) {
//        model.addAttribute("category",new Categories());
//        return "addCategory"; // The view name "addCategory" refers to addCategory.jsp
//    }
//    
//    // Add/Edit Categories - Process form submission
//    @PostMapping("/addCategory")
//    public String addCategory(@ModelAttribute("category") Categories category) {
//        productService.saveCategory(category); // Save the category to the database using the service
//        return "redirect:/products"; // Redirect to the product list page after successful submission
//    }
//}
