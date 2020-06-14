package com.ecommerce;


  
  import org.springframework.context.annotation.ComponentScan; import
  org.springframework.context.annotation.Configuration;
  
  @ComponentScan(basePackages={"com.ecommerce.controller"})
  
  @Configuration 
  public class SpringConfig {
  
  public SpringConfig() { System.out.println("Spring Config created..."); }
  
  }
 