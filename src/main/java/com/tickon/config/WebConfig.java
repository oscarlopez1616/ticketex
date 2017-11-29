package com.tickon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@Import(RepositoryRestMvcConfiguration.class)//habilitar RestRepository
@EnableWebMvc //habilitar Spring MVC
@ComponentScan("com.tickon.core.controller") //habilitar analisis de componentes
public class WebConfig extends WebMvcConfigurerAdapter{

	
	@Bean
	public ViewResolver viewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();// configurar solucionador de vistas JSP
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		//resolver.setViewClass(org.springframework.web.servlet.view.JstlView.class);
		resolver.setExposeContextBeansAsAttributes(true);
		return resolver;
	}
	
	@Override
	public void configureDefaultServletHandling (DefaultServletHandlerConfigurer configurer){//configurar procesamiento de contenido estatico
		configurer.enable(); 
	}
	


}
