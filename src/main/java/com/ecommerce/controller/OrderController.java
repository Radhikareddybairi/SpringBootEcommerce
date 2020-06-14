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

import com.ecommerce.model.Order;
import com.ecommerce.service.OrderService;

@Controller
public class OrderController {
	@Autowired
private OrderService orderService;
	
	public OrderController() {
		super();
	}
	@RequestMapping(value="/orders",method=RequestMethod.GET)
	public ModelAndView getAllOrder(){
	return new ModelAndView("orderList", "orders", orderService.findAllOrder());	
	}
	
	
	@RequestMapping(value="/edit/{id}",method=RequestMethod.GET)
	public String editOrder(@PathVariable("id") int orderId,ModelMap map){
		System.out.println("In editorder "+orderId);
		
		map.addAttribute("order",orderService.findOrder(orderId));
		map.addAttribute("orders",orderService.findAllOrder());
			
	return  "editOrder";			
	}
	
	
	@RequestMapping(value="/deleteOrder",method=RequestMethod.GET)
	public String deleteOrder(@RequestParam("orderId") int orderId,ModelMap map){
	
		System.out.println("In deleteorder "+orderId);
		
		
		orderService.deleteOrder(orderId);
	
		map.addAttribute("orders",orderService.findAllOrder());
		
		
	     return  "orderList";
			
	}
	
	
	@RequestMapping(value="/newOrder",method=RequestMethod.GET)
	public String newOrder(ModelMap map){
	
		map.addAttribute("order",new Order());
		map.addAttribute("orders",orderService.findAllOrder());
	
	   return  "addOrder";
			
	}
	
	
	@RequestMapping(value="/addOrder",method=RequestMethod.POST)
	public String addOrder(@ModelAttribute("order") Order order,ModelMap map){
	
		orderService.addOrder(order);
		
		map.addAttribute("orders",orderService.findAllOrder());
	
	   return  "orderList";
			
	}
	
	
	@RequestMapping(value="/updateOrder",method=RequestMethod.POST)
	
	public String updateOrder(@ModelAttribute("order") Order order,ModelMap map){
	
		orderService.updateOrder(order);
		
		map.addAttribute("orders",orderService.findAllOrder());
	
	   return  "orderList";
			
	}
	
	
}
