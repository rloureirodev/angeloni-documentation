package com.visualmix.api.doc.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações do usuário")
@Data
@Builder
public class FabricantesDTO {
	
	@ApiModelProperty(value = " ", example = " ")
	private Integer codigo;

	@ApiModelProperty(value = " ", example = " ")
	private String codigoIntegracao;

	@ApiModelProperty(value = " ", example = " ")
	private String razaoSocial;

	@ApiModelProperty(value = " ", example = " ")
	private String nomeFantasia;

	@ApiModelProperty(value = " ", example = " ")
	private Float cgc;

	
}
