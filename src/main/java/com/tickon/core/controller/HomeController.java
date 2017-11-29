package com.tickon.core.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.support.WebApplicationContextUtils;

@Controller
public class HomeController {
	
	
	@Autowired private ServletContext servletContext;
	
    @RequestMapping(value="/welcome",method=RequestMethod.GET)
    public String welcome(Model model){
    	ApplicationContext appContext = WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext);
		String [] temp_s = appContext.getBeanDefinitionNames();
		String message = "";
		for(Integer i=0;i<temp_s.length;i++){
		   //PilaContenedorLanzadorTicketexCore.logger.info("Beans creados: "+temp_s[i]);
			message = message+"<br>"+temp_s[i];
	    }
        model.addAttribute("message1", message);
        return "home";
    }
    
}
