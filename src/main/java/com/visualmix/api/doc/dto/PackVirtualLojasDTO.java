package com.visualmix.api.doc.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações do usuário")
@Data
@Builder
public class PackVirtualLojasDTO {
	
	@ApiModelProperty(value = " ", example = " ")
	private Integer codigoCasadinha;

	@ApiModelProperty(value = " ", example = " ")
	private int tipo;

	@ApiModelProperty(value = " ", example = " ")
	private Integer codigoLoja;
}
