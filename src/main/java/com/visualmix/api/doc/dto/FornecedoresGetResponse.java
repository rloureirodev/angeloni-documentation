package com.visualmix.api.doc.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações do usuário")
@Data
@Builder
public class FornecedoresGetResponse {

	@ApiModelProperty(value = "Nome do fornecedor", example = "Coca Cola")
	private String nome;
	private int numero;
	private String nomeFantasia;
}
