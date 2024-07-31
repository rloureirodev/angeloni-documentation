package com.visualmix.api.doc.dto;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações do usuário")
@Data
@Builder
public class CasadinhaProdutosDTO {
	
	@ApiModelProperty(value = " ", example = " ")
	private Integer codigoCasadinha;

	@ApiModelProperty(value = " ", example = " ")
	private Float codigoProduto;

	@ApiModelProperty(value = " ", example = " ")
	private int sequencia;

	@ApiModelProperty(value = " ", example = " ")
	private int tipo;

	@ApiModelProperty(value = " ", example = " ")
	private double quantidade;

	@ApiModelProperty(value = " ", example = " ")
	private double valor;

	@ApiModelProperty(value = " ", example = " ")
	private int tipoDesconto;

	@ApiModelProperty(value = " ", example = " ")
	private double fator;

	@ApiModelProperty(value = " ", example = " ")
	private Float produtoPai;

	@ApiModelProperty(value = " ", example = " ")
	private int sequenciaPai;


}
