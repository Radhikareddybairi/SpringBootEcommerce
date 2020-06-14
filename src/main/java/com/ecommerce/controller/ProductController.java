package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ecommerce.model.Product;
import com.ecommerce.service.ProductService;

@Controller
public class ProductController {
	@Autowired
private ProductService productService;
	
	public ProductController() {
		super();
	}
	@RequestMapping(value="/products",method=RequestMethod.GET)
	public ModelAndView getAllProduct(){
	return new ModelAndView("productList", "products", productService.findAllProduct());	
	}
	
	
	@RequestMapping(value="/edit/{id}",method=RequestMethod.GET)
	public String editProduct(@PathVariable("id") int productId,ModelMap map){
		System.out.println("In editproduct "+productId);
		
		map.addAttribute("product",productService.findProduct(productId));
		map.addAttribute("products",productService.findAllProduct());
			
	return  "editProduct";			
	}
	
	
	@RequestMapping(value="/deleteProduct",method=RequestMethod.GET)
	public String deleteProduct(@RequestParam("productId") int productId,ModelMap map){
	
		System.out.println("In deleteproduct "+productId);
		
		
		productService.deleteProduct(productId);
	
		map.addAttribute("products",productService.findAllProduct());
		
		
	     return  "productList";
			
	}
	
	
	@RequestMapping(value="/newProduct",method=RequestMethod.GET)
	public String newProduct(ModelMap map){
	
		map.addAttribute("product",new Product());
		map.addAttribute("products",productService.findAllProduct());
	
	   return  "addProduct";
			
	}
	
	
	@RequestMapping(value="/addProduct",method=RequestMethod.POST)
	public String addProduct(@ModelAttribute("product")Product product,ModelMap map){
	
		productService.addProduct(product);
		
		map.addAttribute("products",productService.findAllProduct());
	
	   return  "productList";
			
	}
	
	
	@RequestMapping(value="/updateProduct",method=RequestMethod.POST)
	
	public String updateProduct(@ModelAttribute("product")Product product,ModelMap map){
	
		productService.updateProduct(product);
		
		map.addAttribute("products",productService.findAllProduct());
	
	   return  "productList";
			
	}
	
}
