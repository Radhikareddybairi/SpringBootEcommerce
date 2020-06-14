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

import com.ecommerce.model.Category;
import com.ecommerce.service.CategoryService;

@Controller
public class CategroyController {
	
	@Autowired
	private CategoryService categoryService;
	
	public CategroyController() {
		super();
	}
	@RequestMapping(value="/categories",method=RequestMethod.GET)
	public ModelAndView getAllCategory(){
	return new ModelAndView("categoryList", "categories", categoryService.findAllCategory());	
	}
	
	
	@RequestMapping(value="/edit/{id}",method=RequestMethod.GET)
	public String editCategory(@PathVariable("id") int categoryId,ModelMap map){
		System.out.println("In editCategory "+categoryId);
		
		map.addAttribute("category",categoryService.findCategory(categoryId));
		map.addAttribute("categories",categoryService.findAllCategory());
			
	return  "editCategory";			
	}
	
	
	@RequestMapping(value="/deleteCategory",method=RequestMethod.GET)
	public String deleteCategory(@RequestParam("categoryId") int categoryId,ModelMap map){
	
		System.out.println("In deletecategory "+categoryId);
		
		
		categoryService.deleteCategory(categoryId);
	
		map.addAttribute("categories",categoryService.findAllCategory());
		
		
	     return  "categoryList";
			
	}
	
	
	@RequestMapping(value="/newCategory",method=RequestMethod.GET)
	public String newCategory(ModelMap map){
	
		map.addAttribute("category",new Category());
		map.addAttribute("categories",categoryService.findAllCategory());
	
	   return  "addCategory";
			
	}
	
	
	@RequestMapping(value="/addCategory",method=RequestMethod.POST)
	public String addCategory(@ModelAttribute("category") Category category,ModelMap map){
	
		categoryService.addCategory(category);
		
		map.addAttribute("categories",categoryService.findAllCategory());
	
	   return  "categoryList";
			
	}
	
	
	@RequestMapping(value="/updateCategory",method=RequestMethod.POST)
	
	public String updateCategory(@ModelAttribute("category") Category category,ModelMap map){
	
		categoryService.updateCategory(category);
		
		map.addAttribute("categories",categoryService.findAllCategory());
	
	   return  "categoryList";
			
	}
	
	

}
