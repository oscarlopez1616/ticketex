package com.tickon.core.domain;

import org.springframework.beans.factory.annotation.Autowired;

import com.tickon.virtualdeployment.domain.PilaContenedorLanzadorTicketexCore;


/**
 * The Class LanzadorTicketexCore.
 */
public class LanzadorTicketexCore{
	    
    	/** The id_involucrado. */
    	public int id_involucrado;
	    
    	/** The database_user. */
    	public String database_user;
	    
    	/** The database_host. */
    	public String database_host;
	    
    	/** The database_password. */
    	public String database_password;
	    
    	/** The database_host_port. */
    	public String database_host_port;
	    
    	/** The amqp_host. */
    	public String amqp_host;
	    
    	/** The servicio amqp ticketex planner. */
    	@Autowired
	    public ServicioAMQPTicketexPlanner servicioAMQPTicketexPlanner; 
	    
    	/** The servicio amqp login. */
    	@Autowired
	    public ServicioAMQPLogin servicioAMQPLogin;
	   
	    /**
    	 * Instantiates a new lanzador ticketex core.
    	 *
    	 * @param id_involucrado the id_involucrado
    	 * @param database_user the database_user
    	 * @param database_host the database_host
    	 * @param database_password the database_password
    	 * @param database_host_port the database_host_port
    	 * @param amqp_host the amqp_host
    	 * @param servicioAMQPTicketexPlanner the servicio amqp ticketex planner
    	 * @param servicioAMQPLogin the servicio amqp login
    	 */
    	public LanzadorTicketexCore(int id_involucrado, String database_user, String database_host, String database_password, String database_host_port, String amqp_host,ServicioAMQPTicketexPlanner servicioAMQPTicketexPlanner,ServicioAMQPLogin servicioAMQPLogin) {
	    	this.id_involucrado = id_involucrado; 
	    	this.database_user = database_user;
	    	this.database_host = database_host;
	    	this.database_password = database_password;
	    	this.database_host_port = database_host_port;
	    	this.amqp_host = amqp_host;
	    	this.servicioAMQPTicketexPlanner = servicioAMQPTicketexPlanner;
	    	this.servicioAMQPLogin = servicioAMQPLogin;
		}
		
		/**
		 * Arranca.
		 */
		public void arranca() {					
			Usuario usuario = servicioAMQPLogin.findUsuarioById(1);
			usuario.email="oscar.lopez@e-fbk.com";
			usuario.setApi_Key("cambio_hibernate");
			servicioAMQPLogin.saveUsuario(usuario);
			PilaContenedorLanzadorTicketexCore.logger.info("api_key"+usuario.getApi_Key());
		}
		
		
		/**
		 * Detiene.
		 */
		public void detiene() {
		}
		
		
		/**
		 * Reinicia.
		 */
		public void reinicia() {
		}
		
		/**
		 * Pausa.
		 */
		public void pausa() {
		}
	   
	   
}
