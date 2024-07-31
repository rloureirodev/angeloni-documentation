package com.visualmix.api.doc.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações do usuário")
@Data
@Builder
public class OperadoresLojasDTO {
	
	@ApiModelProperty(value = " ", example = " ")
	@JsonIgnore
	private Float codigo;

	@ApiModelProperty(value = " ", example = " ")
	private int tipo;

	@ApiModelProperty(value = " ", example = " ")
	private Integer loja;

	@ApiModelProperty(value = " ", example = " ")
	private String codigoIntegracao;

	@ApiModelProperty(value = " ", example = " ")
	private int tipoAcao;


}
