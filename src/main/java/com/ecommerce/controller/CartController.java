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

import com.ecommerce.model.Cart;
import com.ecommerce.service.CartService;

@Controller
public class CartController {
	@Autowired
private CartService cartService;
	
	public CartController() {
		super();
	}
	@RequestMapping(value="/carts",method=RequestMethod.GET)
	public ModelAndView getAllCart(){
	return new ModelAndView("cartList", "carts", cartService.findAllCart());	
	}
	
	
	@RequestMapping(value="/edit/{id}",method=RequestMethod.GET)
	public String editCart(@PathVariable("id") int cartId,ModelMap map){
		System.out.println("In editCart "+cartId);
		
		map.addAttribute("cart",cartService.findCart(cartId));
		map.addAttribute("carts",cartService.findAllCart());
			
	return  "editCart";			
	}
	
	
	@RequestMapping(value="/deleteCart",method=RequestMethod.GET)
	public String deleteCart(@RequestParam("cartId") int cartId,ModelMap map){
	
		System.out.println("In deletecart "+cartId);
		
		
		cartService.deleteCart(cartId);
	
		map.addAttribute("carts",cartService.findAllCart());
		
		
	     return  "cartList";
			
	}
	
	
	@RequestMapping(value="/newCart",method=RequestMethod.GET)
	public String newCart(ModelMap map){
	
		map.addAttribute("cart",new Cart());
		map.addAttribute("carts",cartService.findAllCart());
	
	   return  "addCart";
			
	}
	
	
	@RequestMapping(value="/addCart",method=RequestMethod.POST)
	public String addCart(@ModelAttribute("cart") Cart cart,ModelMap map){
	
		cartService.addCart(cart);
		
		map.addAttribute("carts",cartService.findAllCart());
	
	   return  "cartList";
			
	}
	
	
	@RequestMapping(value="/updateCart",method=RequestMethod.POST)
	
	public String updateCart(@ModelAttribute("cart") Cart cart,ModelMap map){
	
		cartService.updateCart(cart);
		
		map.addAttribute("carts",cartService.findAllCart());
	
	   return  "cartList";
			
	}
	
	
}
