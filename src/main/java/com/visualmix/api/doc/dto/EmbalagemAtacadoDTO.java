package com.visualmix.api.doc.dto;

import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações do usuário")
@Data
@Builder
public class EmbalagemAtacadoDTO {
	@ApiModelProperty(value = " ", example = " ")
	private double produtoId;

	@ApiModelProperty(value = " ", example = " ")
	private int sequencia;

	@ApiModelProperty(value = " ", example = " ")
	private Integer loja;

	@ApiModelProperty(value = " ", example = " ")
	private Float qtde01;

	@ApiModelProperty(value = " ", example = " ")
	private int tipo01;

	@ApiModelProperty(value = " ", example = " ")
	private double valor01;

	@ApiModelProperty(value = " ", example = " ")
	private Float qtde02;

	@ApiModelProperty(value = " ", example = " ")
	private int tipo02;

	@ApiModelProperty(value = " ", example = " ")
	private double valor02;

	@ApiModelProperty(value = " ", example = " ")
	private Float qtde03;

	@ApiModelProperty(value = " ", example = " ")
	private int tipo03;

	@ApiModelProperty(value = " ", example = " ")
	private double valor03;

	@ApiModelProperty(value = " ", example = " ")
	private Float qtde04;

	@ApiModelProperty(value = " ", example = " ")
	private int tipo04;

	@ApiModelProperty(value = " ", example = " ")
	private double valor04;

	@ApiModelProperty(value = " ", example = " ")
	private Float qtde05;

	@ApiModelProperty(value = " ", example = " ")
	private int tipo05;

	@ApiModelProperty(value = " ", example = " ")
	private double valor05;

	@ApiModelProperty(value = " ", example = " ")
	private LocalDateTime dtInicio;

	@ApiModelProperty(value = " ", example = " ")
	private LocalDateTime dtFim;

	@ApiModelProperty(value = " ", example = " ")
	private int tipoVenda;

	@ApiModelProperty(value = " ", example = " ")
	private int tipoPreco;

	@ApiModelProperty(value = " ", example = " ")
	private Float paiProdutoId;

	@ApiModelProperty(value = " ", example = " ")
	private int paiSequencia;

	@ApiModelProperty(value = " ", example = " ")
	private int multiplo;

	@ApiModelProperty(value = " ", example = " ")
	private Float qtdeMaxima;

}
