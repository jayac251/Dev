/**
 * 
 */
package io.jc.spring.learning.mvc.services;

import org.springframework.stereotype.Service;

/**
 * @author Dell
 *
 */
@Service
public class GreetingService {
	
	public String greet() {
		return "GreetingService: Hello World";
	}

}
