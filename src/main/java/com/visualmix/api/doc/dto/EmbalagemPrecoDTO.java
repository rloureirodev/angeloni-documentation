package com.visualmix.api.doc.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações do usuário")
@Data
@Builder
public class EmbalagemPrecoDTO {
	
	@ApiModelProperty(value = " ", example = " ")
	private double produtoId;

	@ApiModelProperty(value = " ", example = " ")
	private int sequencia;

	@ApiModelProperty(value = " ", example = " ")
	private Integer loja;

	@ApiModelProperty(value = " ", example = " ")
	private Integer tabela;

	@ApiModelProperty(value = " ", example = " ")
	private Double precoVenda;

	@ApiModelProperty(value = " ", example = " ")
	private Double qtdProduto;


}
