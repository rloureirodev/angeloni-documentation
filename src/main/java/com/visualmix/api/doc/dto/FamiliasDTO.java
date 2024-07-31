package com.visualmix.api.doc.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações do usuário")
@Data
@Builder
public class FamiliasDTO {
	
	@ApiModelProperty(value = " ", example = " ")
	private String codigoFamilia;

	@ApiModelProperty(value = " ", example = " ")
	private String descricao;
}
