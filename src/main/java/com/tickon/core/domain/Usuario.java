package com.tickon.core.domain;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name="usuario")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE) 
@DiscriminatorColumn  
(  
 name="Discriminator",  
 discriminatorType=DiscriminatorType.STRING  
)   
public abstract class  Usuario  {

	@Id
	@Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;  
	 
	@Column(name="api_Key")
	private String api_Key;
	
	//@OneToMany(cascade=CascadeType.ALL)
    //private List<Rol> roles ;
    
	@Column(name="nombre")
    protected String nombre;
    
	@Column(name="email")
	protected String email;
	
	@Column(name="password")
	protected String password;

	@Column(name="telefono_fijo")
	protected String telefono_fijo;

	@Column(name="telefono_movil")
	protected String telefono_movil;
    
	@Column(name="nacionalidad")
	protected String nacionalidad;
    
	@Column(name="provincia")
	protected String provincia;
    
	@Column(name="poblacion")
	protected String poblacion;

	@Column(name="codigo_postal")
	protected String codigo_postal;


    protected Usuario(){}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getApi_Key() {
		return api_Key;
	}


	public void setApi_Key(String api_Key) {
		this.api_Key = api_Key;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getTelefono_fijo() {
		return telefono_fijo;
	}


	public void setTelefono_fijo(String telefono_fijo) {
		this.telefono_fijo = telefono_fijo;
	}


	public String getTelefono_movil() {
		return telefono_movil;
	}


	public void setTelefono_movil(String telefono_movil) {
		this.telefono_movil = telefono_movil;
	}


	public String getNacionalidad() {
		return nacionalidad;
	}


	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	public String getPoblacion() {
		return poblacion;
	}


	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}


	public String getCodigo_postal() {
		return codigo_postal;
	}


	public void setCodigo_postal(String codigo_postal) {
		this.codigo_postal = codigo_postal;
	}
    

  

	/*public List<Rol> getRoles() {
		return roles;
	}

	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}*/

}
