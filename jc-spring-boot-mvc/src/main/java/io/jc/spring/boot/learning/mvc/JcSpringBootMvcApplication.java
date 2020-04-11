package io.jc.spring.boot.learning.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JcSpringBootMvcApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(JcSpringBootMvcApplication.class, args);
	}

}
