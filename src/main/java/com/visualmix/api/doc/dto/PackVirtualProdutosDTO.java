package com.visualmix.api.doc.dto;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações dos Pack Virtual Produtos" , value="Pack Virtual Produtos")
@Data
@Builder
public class PackVirtualProdutosDTO {
	
	@ApiModelProperty(value = "Código da Casadinha:\r\n"
			+ "Código que identifica a casadinha", example = "1")
	@JsonIgnore
	private Integer codigoCasadinha;

	@ApiModelProperty(value = "Código do Produto:\r\n"
			+ "Código Interno do Produto pertencente à casadinha", example = "1")
	private Float codigoProduto;

	@ApiModelProperty(value = "Embalagem:\r\n"
			+ "Código da Embalagem pertencente à casadinha", example = "1")
	private int sequencia;

	@ApiModelProperty(value = "Tipo:\r\n"
			+ "Indica se o produto é origem ou promovido, podendo assumir os valores:\r\n"
			+ "1 – Origem\r\n"
			+ "2 - Promovido", example = "1")
	private int tipo;

	@ApiModelProperty(value = "Quantidade:\r\n"
			+ "Quantidade mínima do produto para que a promoção seja ativada para as casadinhas com tipo Origem 1, 2 e 4", example = "1.01")
	private double quantidade;

	@ApiModelProperty(value = "Valor:\r\n"
			+ "Valor do desconto a ser aplicado para os itens promovidos, conforme o tipo do desconto", example = "1.01")
	private double valor;

	@ApiModelProperty(value = "Tipo Desconto:\r\n"
			+ "Tipo do Desconto que será dado, podendo assumir os valores:\r\n"
			+ "1 – Valor do Desconto\r\n"
			+ "2 – Percentual\r\n"
			+ "3 – Preço de Venda", example = "2")
	private int tipoDesconto;

	@ApiModelProperty(value = "Fator:\r\n"
			+ "Fator a ser aplicado na quantidade comprada para que se chegue a quantidade do promovido\r\n"
			+ "Ex: para um fator de 2, comprando 1 unidade equivale a ter comprado 2 unidades", example = "")
	private double fator;

	@ApiModelProperty(value = "Produto Pai:\r\n"
			+ "Código Interno do Produto do produto pai", example = "1")
	private Float produtoPai;

	@ApiModelProperty(value = "Embalagem Pai:\r\n"
			+ "Código da Embalagem pertencente ao produto pai", example = "1")
	private int sequenciaPai;


}
