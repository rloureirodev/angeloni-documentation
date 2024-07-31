package com.visualmix.api.doc.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações do usuário")
@Data
@Builder
public class KitLojasDTO {
	
	@ApiModelProperty(value = " ", example = " ")
	private Integer codigo;

	@ApiModelProperty(value = " ", example = " ")
	private Integer loja;

	@ApiModelProperty(value = " ", example = " ")
	private Integer lojaCapa;
}
