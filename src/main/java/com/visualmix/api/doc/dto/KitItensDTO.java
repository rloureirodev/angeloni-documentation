package com.visualmix.api.doc.dto;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações dos Kit Itens" , value="Kit Itens")
@Data
@Builder
public class KitItensDTO {
	@ApiModelProperty(value = "Loja:\r\n"
			+ "Número da Loja de cadastro do kit", example = "1")
	private Integer loja;

	@ApiModelProperty(value = "Código do Kit:\r\n"
			+ "Código do Produto Pai da capa do Kit. ", example = " ")
	@JsonIgnore
	private Float codigo;

	@ApiModelProperty(value = "Código do Produto Filho:\r\n"
			+ "Código dos Produtos que irão compor o Kit. ", example = " ")
	private Float produtoId;

	@ApiModelProperty(value = "Embalagem do Produto Filho:\r\n"
			+ "Embalagem dos Produtos que irão compor o Kit.", example = "1")
	private Integer sequencia;

	@ApiModelProperty(value = "Quantidade:\r\n"
			+ "Quantidade do Produto que está compondo o Kit.", example = "0.01")
	private Float quantidade;

	@ApiModelProperty(value = "Preço Venda:\r\n"
			+ "Preço de Venda do Produto que está compondo o Kit.", example = "0.01")
	private double precoVenda;

	@ApiModelProperty(value = "Preço Custo:\r\n"
			+ "Valor de Custo do Produto dentro do Kit.", example = "0.01")
	private double precoCusto;

	@ApiModelProperty(value = "Tipo Preço (1 – Preço Kit / 2 – Preço Cadastro):\r\n"
			+ "Valor que o produto irá assumir no Kit, podendo ser o preço de venda no kit ou o preço de cadastro (enviado na tabela EMBALAGEM_LOJA).", example = " ")
	private Integer tipoPreco;

	@ApiModelProperty(value = "Fator Preço Venda:\r\n"
			+ "Fator sobre o preço de venda do Produto que está compondo o Kit.", example = "0.01")
	private Float fatorPrecoVenda;

	@ApiModelProperty(value = "Fator Preço Custo:\r\n"
			+ "Fator sobre o preço de custo do Produto dentro do Kit.", example = "0.01")
	private Float fatorPrecoCusto;

	@ApiModelProperty(value = "Data de Alteração:\r\n"
			+ "Data de Alteração do kit", example = "dd/MM/yyyy HH:mm:ss")
	private LocalDateTime dataAlteracao;

	@ApiModelProperty(value = "Quantidade da Embalagem:\r\n"
			+ "Quantidade de unidades presentes na embalagem, esse campo deve ser enviado somente quando o campo SEQUENCIA não for enviado", example = " ")
	private Double qtdProduto;

	@ApiModelProperty(value = "Preço Clube:\r\n"
			+ "Preço de Venda para o clube do produto que está compondo o Kit.", example = "0.01")
	private Double precoClube;

	@ApiModelProperty(value = "Data Início Clube:\r\n"
			+ "Data de início para o preço clube", example = "dd/MM/yyyy HH:mm:ss")
	private LocalDateTime dataInicioClube;

	@ApiModelProperty(value = "Data Início Clube:\r\n"
			+ "Data de início para o preço clube", example = "dd/MM/yyyy HH:mm:ss")
	private LocalDateTime dataFimClube;

}
