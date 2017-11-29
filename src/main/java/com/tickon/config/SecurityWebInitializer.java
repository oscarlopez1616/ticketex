package com.tickon.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * 
 * @author oscar
 * 
 * esta clase es autodetectada por Spring, intercepta las peticiones entrantes
 * y las delega al bean con ID springSecurityFilterChain
 *
 */
public class SecurityWebInitializer extends AbstractSecurityWebApplicationInitializer{

}
