package com.visualmix.api.doc.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações das Familias" , value="Familias")
@Data
@Builder
public class FamiliasDTO {
	
	@ApiModelProperty(value = "Código do Família:\r\n"
			+ "Código que identifica a família", example = " ")
	private String codigoFamilia;

	@ApiModelProperty(value = "Descrição:\r\n"
			+ "Descrição da família", example = " ")
	private String descricao;
}
