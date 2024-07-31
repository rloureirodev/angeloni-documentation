package com.visualmix.api.doc.dto;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações do usuário")
@Data
@Builder
public class ProdutoDTO {
	
	@ApiModelProperty(value = " ", example = " ")
	private int produtoId;
	
	@ApiModelProperty(value = " ", example = " ")
	private int digitoId;
	
	@ApiModelProperty(value = " ", example = " ")
	private String descricaoCompleta;
	
	@ApiModelProperty(value = " ", example = " ")
	private String descricaoReduzida;
	
	@ApiModelProperty(value = " ", example = " ")
	private double vasProdutoId;
	
	@ApiModelProperty(value = " ", example = " ")
	private int vasSequencia;
	
	@ApiModelProperty(value = " ", example = " ")
	private int pesoVariavel;
	
	@ApiModelProperty(value = " ", example = " ")
	private int prePesado;
	
	@ApiModelProperty(value = " ", example = " ")
	private int qtdDecimal;	
	
	@ApiModelProperty(value = " ", example = " ")
	private int mercadologico1;
	
	@ApiModelProperty(value = " ", example = " ")
	private int mercadologico2;
	
	@ApiModelProperty(value = " ", example = " ")
	private int mercadologico3;
	
	@ApiModelProperty(value = " ", example = " ")
	private int mercadologico4;
	
	@ApiModelProperty(value = " ", example = " ")
	private int mercadologico5;
	
	@ApiModelProperty(value = " ", example = " ")
	private int fornecedor;
	
	@ApiModelProperty(value = " ", example = " ")
	private int fabricacaoPropria;
	
	@ApiModelProperty(value = " ", example = " ")
	private String situacao;
	
	@ApiModelProperty(value = " ", example = " ")
	private String codigoIntegracao;
	
	@ApiModelProperty(value = " ", example = " ")
	private double compProdutoId;
	
	@ApiModelProperty(value = " ", example = " ")
	private int compSequencia;
	
	@ApiModelProperty(value = " ", example = " ")
	private double percPis;
	
	@ApiModelProperty(value = " ", example = " ")
	private int stPis;
	
	@ApiModelProperty(value = " ", example = " ")
	private double percCofins;	
		
	@ApiModelProperty(value = " ", example = " ")
	private int stCofins;
	
	@ApiModelProperty(value = " ", example = " ")
	private double codigoNcm;
	
	@ApiModelProperty(value = " ", example = " ")
	private String tipoPis;
	
	@ApiModelProperty(value = " ", example = " ")
	private String referencia;
	
	@ApiModelProperty(value = " ", example = " ")
	private int tipoVenda;
	
	@ApiModelProperty(value = " ", example = " ")
	private int bebidaalcoolica;
	
	@ApiModelProperty(value = " ", example = " ")
	private String descrespunit;
	
	@ApiModelProperty(value = " ", example = " ")
	private double fatorespunit;
	
	@ApiModelProperty(value = " ", example = " ")
	private double margemteorica;
	
	@ApiModelProperty(value = " ", example = " ")
	private int retiraTag;
	
	@ApiModelProperty(value = " ", example = " ")
	private Integer codigoCest;
	
	@ApiModelProperty(value = " ", example = " ")
	private int extipi;
	
	@ApiModelProperty(value = " ", example = " ")
	private int kit;
	
	/////////////////
	
	@ApiModelProperty(value = " ", example = " ")
	private String descricaoBalanca;

	@ApiModelProperty(value = " ", example = " ")
	private String familia;

	@ApiModelProperty(value = " ", example = " ")
	private int tipoKit;

	@ApiModelProperty(value = " ", example = " ")
	private int tipoBaixa;

	@ApiModelProperty(value = " ", example = " ")
	private int tipoNroSerie;

	@ApiModelProperty(value = " ", example = " ")
	private int tipoServico;

	@ApiModelProperty(value = " ", example = " ")
	private Integer prazoValidade;

	@ApiModelProperty(value = " ", example = " ")
	private String obs;

	@ApiModelProperty(value = " ", example = " ")
	private String marca;

	@ApiModelProperty(value = " ", example = " ")
	private double pesoEspecifico;

	@ApiModelProperty(value = " ", example = " ")
	private Integer tipoVasilhame;
	
	@ApiModelProperty(value = " ", example = " ")
	private List<EmbalagemDTO> embalagens ;
	
	@ApiModelProperty(value = " ", example = " ")
	private List<ProdutoNutricionalDTO> produtoNutricional ;
	
	@ApiModelProperty(value = " ", example = " ")
	private List<AutomacaoDTO> promocaoRelampago ;
	

}