/**
 * 
 */
package io.jc.spring.learning.mvc;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

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
		AnnotationConfigWebApplicationContext dispatcherContext=new AnnotationConfigWebApplicationContext();
		dispatcherContext.register(WebConfig.class);
		
		DispatcherServlet dispatcherServlet=new DispatcherServlet(dispatcherContext);
		ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcher", dispatcherServlet);
		registration.addMapping("/");
		registration.setLoadOnStartup(1);
		
	}

}
