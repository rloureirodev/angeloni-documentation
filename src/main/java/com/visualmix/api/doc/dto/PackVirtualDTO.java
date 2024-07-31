package com.visualmix.api.doc.dto;

import java.time.LocalDateTime;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações do usuário")
@Data
@Builder
public class PackVirtualDTO {
	
	@ApiModelProperty(value = " ", example = " ")
	private Integer codigo;
	
	@ApiModelProperty(value = " ", example = " ")
	private String descricao;

	@ApiModelProperty(value = " ", example = " ")
	private LocalDateTime dataInicial;

	@ApiModelProperty(value = " ", example = " ")
	private LocalDateTime dataFinal;

	@ApiModelProperty(value = " ", example = " ")
	private int tipo;

	@ApiModelProperty(value = " ", example = " ")
	private double quantidade;

	@ApiModelProperty(value = " ", example = " ")
	private int tipoPromovido;
	
	@ApiModelProperty(value = " ", example = " ")
	private double quantidadePromovida;

	@ApiModelProperty(value = " ", example = " ")
	private int tipoDesconto;

	@ApiModelProperty(value = " ", example = " ")
	private int finalizadora;

	@ApiModelProperty(value = " ", example = " ")
	private int cuponagem;

	@ApiModelProperty(value = " ", example = " ")
	private int unidadeMedida;

	@ApiModelProperty(value = " ", example = " ")
	private int situacao;

	@ApiModelProperty(value = " ", example = " ")
	private int tipoPreco;
	
	@ApiModelProperty(value = " ", example = " ")
	private List<PackVirtualProdutosDTO> packVirtualProdutos ;
	
	@ApiModelProperty(value = " ", example = " ")
	private List<PackVirtualLojasDTO> packVirtualLojas ;


}
