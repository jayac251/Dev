package io.jc.spring.learning.mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@ComponentScan("io.jc.spring.learning.mvc.controllers")
public class WebConfig {
	
	@Bean
	public InternalResourceViewResolver  viewResolver() {
		InternalResourceViewResolver viewResolverBean = new  InternalResourceViewResolver();
		viewResolverBean.setPrefix("/WEB-INF/views/");
		viewResolverBean.setSuffix(".jsp");		
		return viewResolverBean;
		
	}
	

}
