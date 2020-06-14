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

import com.ecommerce.model.Customer;
import com.ecommerce.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerService;

	public CustomerController() {
		super();
	}
	@RequestMapping(value="/customers",method=RequestMethod.GET)
	public ModelAndView getAllCustomer(){
		return new ModelAndView("customerList", "customers", customerService.findAllCustomer());	
	}


	@RequestMapping(value="/edit/{id}",method=RequestMethod.GET)
	public String editCustomer(@PathVariable("id") int customerId,ModelMap map){
		System.out.println("In editCustomer "+customerId);

		map.addAttribute("customer",customerService.findCustomer(customerId));
		map.addAttribute("customers",customerService.findAllCustomer());

		return  "editCustomer";			
	}


	@RequestMapping(value="/deleteCustomer",method=RequestMethod.GET)
	public String deleteCustomer(@RequestParam("customerId") int customerId,ModelMap map){

		System.out.println("In deletecustomer "+customerId);


		customerService.deleteCustomer(customerId);

		map.addAttribute("customers",customerService.findAllCustomer());


		return  "customerList";

	}


	@RequestMapping(value="/newCustomer",method=RequestMethod.GET)
	public String newCustomer(ModelMap map){

		map.addAttribute("customer",new Customer());
		map.addAttribute("customers",customerService.findAllCustomer());

		return  "addCustomer";

	}


	@RequestMapping(value="/addCustomer",method=RequestMethod.POST)
	public String addCustomer(@ModelAttribute("customer") Customer customer,ModelMap map){

		customerService.addCustomer(customer);

		map.addAttribute("categories",customerService.findAllCustomer());

		return  "customerList";

	}


	@RequestMapping(value="/updateCustomer",method=RequestMethod.POST)

	public String updateCustomer(@ModelAttribute("customer") Customer customer,ModelMap map){

		customerService.updateCustomer(customer);

		map.addAttribute("customers",customerService.findAllCustomer());

		return  "customerList";

	}


}
