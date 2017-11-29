package com.tickon.core.domain;


public abstract class ServicioAMQPTicketex {

    public String host_amqp;


    public int id_involucrado;


    //public CuerpoMensajeServicio mensajeServicio;

    
    public ServicioAMQPTicketex(String host_amqp, int id_involucrado) {
    	this.host_amqp= host_amqp;
    	this.id_involucrado= id_involucrado;
    }

}
