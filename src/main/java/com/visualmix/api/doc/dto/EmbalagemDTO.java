package com.visualmix.api.doc.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações do usuário")
@Data
@Builder
public class EmbalagemDTO {
	
	@ApiModelProperty(value = " ", example = " ")
	private double produtoId;

	@ApiModelProperty(value = " ", example = " ")
	private Integer sequencia;

	@ApiModelProperty(value = " ", example = " ")
	private String descricao;

	@ApiModelProperty(value = " ", example = " ")
	private double qtdProduto;

	@ApiModelProperty(value = " ", example = " ")
	private Integer tipoEtiquetaProduto;

	@ApiModelProperty(value = " ", example = " ")
	private Integer tipoEtiquetaGondola;

	@ApiModelProperty(value = " ", example = " ")
	private Integer tipoPrazoValidade;

	@ApiModelProperty(value = " ", example = " ")
	private Integer prazoValidade;

	@ApiModelProperty(value = " ", example = " ")
	private double qtdeMultiplo;

	@ApiModelProperty(value = " ", example = " ")
	private Integer digitaPreco;

	@ApiModelProperty(value = " ", example = " ")
	private double embalagemPeso;

	@ApiModelProperty(value = " ", example = " ")
	private double pesoMinimo;

	@ApiModelProperty(value = " ", example = " ")
	private double pesoMaximo;

	@ApiModelProperty(value = " ", example = " ")
	private int cestaBasica;

	@ApiModelProperty(value = " ", example = " ")
	private double taraMinima;

	@ApiModelProperty(value = " ", example = " ")
	private double taraMaxima;

	@ApiModelProperty(value = " ", example = " ")
	private int emiteVale;


}