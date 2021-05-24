package com.brillio.customerMS.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration // equivalent to xml based configuration
public class CustomerConfig {

	//Indicates that a method produces a bean to be managed by the Spring Container.
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}
	
	@Bean
	public void getInternalResourceViewResolver()
	{
		InternalResourceViewResolver resolver = new  InternalResourceViewResolver();
		resolver.setPrefix("WEB-INF/view");
		resolver.setSuffix(".*");
		
	}
	
}
