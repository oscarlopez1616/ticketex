package com.tickon.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.access.prepost.PreAuthorize;

import com.tickon.core.domain.Usuario;

//@PreAuthorize("hasRole('ROLE_ADMIN')")
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
	


}
