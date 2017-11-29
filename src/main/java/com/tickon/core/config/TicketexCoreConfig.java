package com.tickon.core.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;

import com.tickon.core.domain.LanzadorTicketexCore;
import com.tickon.core.domain.ServicioAMQPLogin;
import com.tickon.core.domain.ServicioAMQPTicketexPlanner;

@Configuration
@PropertySource("classpath:/com/tickon/config/app.properties")
public class TicketexCoreConfig{
	@Autowired
	Environment env;
	
	@Bean(name={"servicioAMQPTicketexPlanner"})
	@Scope("prototype")
	public ServicioAMQPTicketexPlanner  servicioAMQPTicketexPlanner(){
		ServicioAMQPTicketexPlanner servicioAMQPTicketexPlanner = new ServicioAMQPTicketexPlanner(env.getProperty("host_amqp"), env.getProperty("id_involucrado",Integer.class));
		return servicioAMQPTicketexPlanner;
	}
	
	@Bean(name={"servicioAMQPLogin"})
	@Scope("prototype")
	public ServicioAMQPLogin  servicioAMQPLogin(){
		ServicioAMQPLogin servicioAMQPLogin = new ServicioAMQPLogin(env.getProperty("host_amqp"), env.getProperty("id_involucrado",Integer.class));
		return servicioAMQPLogin;
	}

	
	@Bean(name={"lanzadorTicketexCore"})
	@Scope("singleton")
	public LanzadorTicketexCore  lanzadorTicketexCore(ServicioAMQPTicketexPlanner servicioAMQPTicketexPlanner,ServicioAMQPLogin servicioAMQPLogin){
		LanzadorTicketexCore lanzadorTicketexCore = new LanzadorTicketexCore(env.getProperty("id_involucrado",Integer.class), env.getProperty("database.user"),  env.getProperty("database.host"),  env.getProperty("database.password"),  env.getProperty("database.host.port"),  env.getProperty("amqp.host"),servicioAMQPTicketexPlanner,servicioAMQPLogin);
		return lanzadorTicketexCore;
	}
	
}
