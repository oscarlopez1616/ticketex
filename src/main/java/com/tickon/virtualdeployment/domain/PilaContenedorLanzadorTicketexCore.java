package com.tickon.virtualdeployment.domain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tickon.core.domain.LanzadorTicketexCore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//@Component
public class PilaContenedorLanzadorTicketexCore{
	public static final Logger logger = LoggerFactory.getLogger(PilaContenedorLanzadorTicketexCore.class);
	@Autowired
	public LanzadorTicketexCore lanzadorTicketexCore;
	
	public PilaContenedorLanzadorTicketexCore(){
		/*logger.info("Ticketex VirtualDeployment Start");
		appContext = WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext);
		String [] temp_s = appContext.getBeanDefinitionNames();
		for(Integer i=0;i<temp_s.length;i++){
		   PilaContenedorLanzadorTicketexCore.logger.info("Beans creados: "+temp_s[i]);
	    }
		lanzadorTicketexCore  = appContext.getBean("lanzadorTicketexCore",LanzadorTicketexCore.class);
		lanzadorTicketexCore.arranca();*/
		
		//context.close();
	}
	
	/*public static void main(String[] args) {
		   logger.info("Ticketex VirtualDeployment Start");
		   PilaContenedorLanzadorTicketexCore pilaContenedorLanzadorTicketexCore = new PilaContenedorLanzadorTicketexCore(0);
    }*/
	   
}
