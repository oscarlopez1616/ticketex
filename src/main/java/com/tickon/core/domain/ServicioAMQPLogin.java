package com.tickon.core.domain;

import org.springframework.beans.factory.annotation.Autowired;

import com.tickon.core.repository.UsuarioRepository;

public class ServicioAMQPLogin extends ServicioAMQPTicketex {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	public ServicioAMQPLogin(String host_amqp,int id_involucrado){
		super( host_amqp,  id_involucrado);
	}
	
	public Usuario findUsuarioById(long id){
		Usuario usuario = usuarioRepository.findOne(id);
		return usuario;
	}
	
	public Usuario saveUsuario(Usuario usuario){
		return usuarioRepository.save(usuario);
	}
	
	
}
