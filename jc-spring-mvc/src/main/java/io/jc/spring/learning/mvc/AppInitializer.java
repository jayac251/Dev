/**
 * 
 */
package io.jc.spring.learning.mvc;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;

/**
 * @author Dell
 *
 */
public class AppInitializer implements WebApplicationInitializer {

	/* (non-Javadoc)
	 * @see org.springframework.web.WebApplicationInitializer#onStartup(javax.servlet.ServletContext)
	 */
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("HelloWorld");
	}

}
