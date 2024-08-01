package com.visualmix.api.doc.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações dos Operadores Perfil" , value="Operadores Perfil")
@Data
@Builder
public class OperadoresPerfilDTO {	
	
	@ApiModelProperty(value = "Operador:\r\n"
			+ "Código do operador.", example = "1")
	@JsonIgnore
	private Integer operador;

	@ApiModelProperty(value = "Perfil:\r\n"
			+ "Perfil do operador.", example = "1")
	private Integer perfil;

	@ApiModelProperty(value = "Chave:\r\n"
			+ "Chave de acesso do operador.", example = "0.01")
	private Float chave;
}
