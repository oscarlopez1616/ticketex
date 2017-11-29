package com.tickon.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.access.prepost.PreAuthorize;

import com.tickon.core.domain.UsuarioEmpresa;



//@PreAuthorize("hasRole('ROLE_ADMIN')")
public interface UsuarioEmpresaRepository extends JpaRepository<UsuarioEmpresa,Long> {
	
	//String getEmailById(); 

}
