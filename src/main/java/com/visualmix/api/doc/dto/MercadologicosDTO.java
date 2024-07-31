package com.visualmix.api.doc.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações do usuário")
@Data
@Builder
public class MercadologicosDTO {
	
	@ApiModelProperty(value = " ", example = " ")
	private int codigoDepartamento;

	@ApiModelProperty(value = " ", example = " ")
	private int codigoSecao;

	@ApiModelProperty(value = " ", example = " ")
	private int codigoLinha;

	@ApiModelProperty(value = " ", example = " ")
	private int codigoSubLinha;

	@ApiModelProperty(value = " ", example = " ")
	private int codigoSubSubLinha;

	@ApiModelProperty(value = " ", example = " ")
	private String descricao;

	@ApiModelProperty(value = " ", example = " ")
	private int nivel;

	
}
