package com.visualmix.api.doc.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações do usuário")
@Data
@Builder
public class AutomacaoDTO {
	
	@ApiModelProperty(value = " ", example = " ")
	private int codigoAutomacao;

	@ApiModelProperty(value = " ", example = " ")
	private int digitoAutomacao;

	@ApiModelProperty(value = " ", example = " ")
	private int produtoId;

	@ApiModelProperty(value = " ", example = " ")
	private int sequencia;

	@ApiModelProperty(value = " ", example = " ")
	private int tipoCodigo;

	@ApiModelProperty(value = " ", example = " ")
	private int tipoAcao;

	@ApiModelProperty(value = " ", example = " ")
	private double qtdProduto;

}
