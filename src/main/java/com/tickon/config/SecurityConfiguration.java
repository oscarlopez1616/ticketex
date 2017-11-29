package com.tickon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {


   @Bean(name="myAuthenticationManager") 
   @Override 
   public AuthenticationManager authenticationManagerBean() throws Exception {  
	    return super.authenticationManagerBean(); 
   }
	
	
  @Override
  public void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.inMemoryAuthentication()
      .withUser("user").password("user").roles("USER").and()
      .withUser("admin").password("admin").roles("USER", "ADMIN");
  }


  @Override
  protected void configure(HttpSecurity http) throws Exception {
    /*http
      .httpBasic().and()
      .authorizeRequests()
        .antMatchers(HttpMethod.GET, "/usuarios/**").access("hasRole('ADMIN')")
      	.antMatchers(HttpMethod.POST, "/usuarios").hasRole("ADMIN")
        .antMatchers(HttpMethod.PUT, "/usuarios/**").hasRole("ADMIN")
        .antMatchers(HttpMethod.PATCH, "/usuarios/**").hasRole("ADMIN");
        */
  }
}