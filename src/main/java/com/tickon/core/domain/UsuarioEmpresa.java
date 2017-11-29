package com.tickon.core.domain;

import javax.persistence.Column;  
import javax.persistence.DiscriminatorValue;  
import javax.persistence.Entity;  

@Entity  
@DiscriminatorValue(value="usuarioEmpresa")  
public class UsuarioEmpresa extends Usuario{
	
	@Column(name="identificacion_fiscal")
	private String identificacion_fiscal;
	@Column(name="tipo_empresa")
    private String tipo_empresa;
    
    public UsuarioEmpresa(){
    	super();
    }

	public String getIdentificacion_fiscal() {
		return identificacion_fiscal;
	}

	public void setIdentificacion_fiscal(String identificacion_fiscal) {
		this.identificacion_fiscal = identificacion_fiscal;
	}

	public String getTipo_empresa() {
		return tipo_empresa;
	}

	public void setTipo_empresa(String tipo_empresa) {
		this.tipo_empresa = tipo_empresa;
	}


	

}
