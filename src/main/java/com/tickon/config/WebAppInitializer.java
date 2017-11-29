package com.tickon.config;

import javax.servlet.Filter;


import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import  org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
	
	@Override
	protected String[] getServletMappings(){ //asignamos DispatcherServlet a/ 
		return new String[]{"/"};
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses(){
		return new Class<?>[] { RootConfig.class};
	}
	
	@Override
	protected Class<?>[] getServletConfigClasses(){
		//Especificar clase de configuracion
		return new Class<?>[] {WebConfig.class};
	}
	
    @Override
    protected Filter[] getServletFilters() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true); // you USUALLY want this
        config.addAllowedOrigin("*");
        config.addAllowedHeader("*");
        config.addAllowedMethod("GET");
        config.addAllowedMethod("PUT");
        source.registerCorsConfiguration("/**", config);
        
    	return new Filter[] { new CorsFilter(source) };
    }

}
