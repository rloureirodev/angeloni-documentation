package com.visualmix.api.doc.dto;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações do usuário")
@Data
@Builder
public class KitItensDTO {
	@ApiModelProperty(value = " ", example = " ")
	private Integer loja;

	@ApiModelProperty(value = " ", example = " ")
	@JsonIgnore
	private Float codigo;

	@ApiModelProperty(value = " ", example = " ")
	private Float produtoId;

	@ApiModelProperty(value = " ", example = " ")
	private Integer sequencia;

	@ApiModelProperty(value = " ", example = " ")
	private Float quantidade;

	@ApiModelProperty(value = " ", example = " ")
	private double precoVenda;

	@ApiModelProperty(value = " ", example = " ")
	private double precoCusto;

	@ApiModelProperty(value = " ", example = " ")
	private Byte tipoPreco;

	@ApiModelProperty(value = " ", example = " ")
	private Float fatorPrecoVenda;

	@ApiModelProperty(value = " ", example = " ")
	private Float fatorPrecoCusto;

	@ApiModelProperty(value = " ", example = " ")
	private LocalDateTime dataAlteracao;

	@ApiModelProperty(value = " ", example = " ")
	private Double qtdProduto;

	@ApiModelProperty(value = " ", example = " ")
	private Double precoClube;

	@ApiModelProperty(value = " ", example = " ")
	private LocalDateTime dataInicioClube;

	@ApiModelProperty(value = " ", example = " ")
	private LocalDateTime dataFimClube;

}
