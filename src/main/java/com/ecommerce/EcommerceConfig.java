package com.ecommerce;

 
  
  import org.springframework.boot.web.servlet.ServletRegistrationBean; import
  org.springframework.context.annotation.Bean; import
  org.springframework.context.annotation.Configuration; import
  org.springframework.web.context.support.
  AnnotationConfigWebApplicationContext; import
  org.springframework.web.servlet.DispatcherServlet;
  
  @Configuration public class EcommerceConfig {
  
  public EcommerceConfig() { super(); }
  
  
  @Bean public ServletRegistrationBean spring() {
  
  
  System.out.println("Ecommerce registered.....");
  
  DispatcherServlet dispatcherServlet = new DispatcherServlet();
  
  AnnotationConfigWebApplicationContext applicationContext = new
  AnnotationConfigWebApplicationContext();
  
  applicationContext.register(SpringConfig.class);
  
  
  
  dispatcherServlet.setApplicationContext(applicationContext);
  
  ServletRegistrationBean servletRegistrationBean = new
  ServletRegistrationBean(dispatcherServlet, "/spring/*");
  
  servletRegistrationBean.setName("spring"); return servletRegistrationBean; }
  
  }
 