/* 
package com.visualpathit.account.utils;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;

@Configuration
public class MyWebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.setConfigLocation("com.visualpathit.account"); 

        DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
        servletContext.addServlet("dispatcher", dispatcherServlet).addMapping("/");
		
	}

} 
*/
