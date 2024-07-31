package com.visualmix.api.doc.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações do usuário")
@Data
@Builder
public class EmbalagemLojaDTO {
	
	@ApiModelProperty(value = " ", example = " ")
	private double produtoId;

	@ApiModelProperty(value = " ", example = " ")
	private int sequencia;

	@ApiModelProperty(value = " ", example = " ")
	private int loja;

	@ApiModelProperty(value = " ", example = " ")
	private int qtdEtiquetaGondola;

	@ApiModelProperty(value = " ", example = " ")
	private int frente;

	@ApiModelProperty(value = " ", example = " ")
	private int empilhamento;

	@ApiModelProperty(value = " ", example = " ")
	private int profundidade;

	@ApiModelProperty(value = " ", example = " ")
	private int qtdeMaxDigitacao;

	@ApiModelProperty(value = " ", example = " ")
	private double precoVenda;

	@ApiModelProperty(value = " ", example = " ")
	private double custoUltimaEntradaSemIcms;

	@ApiModelProperty(value = " ", example = " ")
	private LocalDateTime dataInicioProm;

	@ApiModelProperty(value = " ", example = " ")
	private LocalDateTime dataFimProm;

	@ApiModelProperty(value = " ", example = " ")
	private double precoPromocao;

	@ApiModelProperty(value = " ", example = " ")
	private int qtdMaxPromocao;

	@ApiModelProperty(value = " ", example = " ")
	private LocalDateTime dataInicioClube;

	@ApiModelProperty(value = " ", example = " ")
	private LocalDateTime dataFimClube;

	@ApiModelProperty(value = " ", example = " ")
	private double precoClube;

	@ApiModelProperty(value = " ", example = " ")
	private Float percMaxDesconto;

	@ApiModelProperty(value = " ", example = " ")
	private int precoPromTabela;

	@ApiModelProperty(value = " ", example = " ")
	private Float percDespesas;

	@ApiModelProperty(value = " ", example = " ")
	private int entrega;

	@ApiModelProperty(value = " ", example = " ")
	private int tipoAcao;	

	@ApiModelProperty(value = " ", example = " ")
	private double qtdProduto;

	@ApiModelProperty(value = " ", example = " ")
	private double precoMontagem;	

	@ApiModelProperty(value = " ", example = " ")
	private String descricaoAux;	
	
	@ApiModelProperty(value = " ", example = " ")
	private List<EmbalagemAtacadoDTO> embalagemAtacado ;
	
	@ApiModelProperty(value = " ", example = " ")
	private List<PromocaoRelampagoDTO> promocaoRelampago ;

}
