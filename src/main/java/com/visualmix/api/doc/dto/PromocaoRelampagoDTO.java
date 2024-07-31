package com.visualmix.api.doc.dto;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações do usuário")
@Data
@Builder
public class PromocaoRelampagoDTO {
	
	@ApiModelProperty(value = " ", example = " ")
	private Integer loja;

	@ApiModelProperty(value = " ", example = " ")
	private Float codigoAutomacao;

	@ApiModelProperty(value = " ", example = " ")
	private Byte digitoAutomacao;

	@ApiModelProperty(value = " ", example = " ")
	private Integer produtoId;

	@ApiModelProperty(value = " ", example = " ")
	private Byte sequencia;

	@ApiModelProperty(value = " ", example = " ")
	private LocalDateTime dataInicio;

	@ApiModelProperty(value = " ", example = " ")
	private LocalDateTime dataFim;

	@ApiModelProperty(value = " ", example = " ")
	private double preco;

	@ApiModelProperty(value = " ", example = " ")
	private Float quantidadeMaxima;


}
