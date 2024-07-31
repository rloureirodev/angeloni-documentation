package com.visualmix.api.doc.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações do usuário")
@Data
@Builder
public class OperadoresPerfilDTO {	
	
	@ApiModelProperty(value = " ", example = " ")
	private Integer operador;

	@ApiModelProperty(value = " ", example = " ")
	private Integer perfil;

	@ApiModelProperty(value = " ", example = " ")
	private Float chave;
}
