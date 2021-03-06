package com.igt.customer;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration  
public class WebConfiguration extends WebMvcConfigurerAdapter {  
  
    @Override  
    public void addViewControllers(ViewControllerRegistry registry) {  
        registry.addViewController("/myapp").setViewName("hello.html");  
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);  
    }  
  

}