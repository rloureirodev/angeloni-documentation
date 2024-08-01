package com.visualmix.api.doc.dto;

import java.time.LocalDateTime;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações dos Pack Virtual" , value="Pack Virtual")
@Data
@Builder
public class PackVirtualDTO {
	
	@ApiModelProperty(value = "Código:\r\n"
			+ "Código que identifica a casadinha", example = "1")
	private Integer codigo;
	
	@ApiModelProperty(value = "Descrição:\r\n"
			+ "Descrição da casadinha", example = "Casadinha")
	private String descricao;

	@ApiModelProperty(value = "Data Início:\r\n"
			+ "Data de início da promoção", example = "dd/MM/yyyy HH:mm:ss")
	private LocalDateTime dataInicial;

	@ApiModelProperty(value = "Data Fim:\r\n"
			+ "Data fim da promoção", example = "dd/MM/yyyy HH:mm:ss")
	private LocalDateTime dataFinal;

	@ApiModelProperty(value = "Tipo Origem:\r\n"
			+ "Tipo da Promoção, podendo assumir os valores:\r\n"
			+ "1 – Origem OU Origem: Para a promoção ser ativada é necessário levar qualquer um d os produtos de origem, verificando a quantidade por produto\r\n"
			+ "2 - Origem E Origem: Para a promoção ser ativada é necessário levar todos os produtos de origem, verificando a quantidade por produto.\r\n"
			+ "3 – Quantidade do Origem: Para a promoção ser ativada é necessário levar x unidades de qualquer produto de origem\r\n"
			+ "4 – Quantidade do Origem Obrigatória: Para a promoção ser ativada é necessário levar x unidades de qualquer produto de origem, sendo verificado a quantidade mínima por produto", example = "1")
	private int tipo;

	@ApiModelProperty(value = "Quantidade:\r\n"
			+ "Quantidade mínima para que a promoção seja ativada para as casadinhas com tipo Origem 3 e 4", example = "1")
	private double quantidade;

	@ApiModelProperty(value = "Tipo Promovido:\r\n"
			+ "Indica quais produtos receberão o desconto, podendo assumir os valores:\r\n"
			+ "1 – Desconto em um único item promovido\r\n"
			+ "2 – Desconto em todos dos itens promovidos", example = "1")
	private int tipoPromovido;
	
	@ApiModelProperty(value = "Qtde. Promovido:\r\n"
			+ "Quantidade limite dos promovidos para receber o desconto", example = "1")
	private double quantidadePromovida;

	@ApiModelProperty(value = "Tipo Desconto:\r\n"
			+ "Tipo do Desconto que será dado, podendo assumir os valores:\r\n"
			+ "1 – Desconto no Item\r\n"
			+ "2 – Desconto no Total do Cupom\r\n"
			+ "3 – Recebimento em Finalizadora", example = "1")
	private int tipoDesconto;

	@ApiModelProperty(value = "Finalizadora:\r\n"
			+ "Código da finalizadora que será utilizada para o recebimento do desconto", example = " ")
	private int finalizadora;

	@ApiModelProperty(value = "Cuponagem:\r\n"
			+ "Condição para a validação do cupom.", example = "1")
	private int cuponagem;

	@ApiModelProperty(value = "Unidade de Medida:\r\n"
			+ "Tipo da unidade de medida, podendo assumir os valores:\r\n"
			+ "0 – Quantidade\r\n"
			+ "1 – Peso", example = "0")
	private int unidadeMedida;

	@ApiModelProperty(value = "Situação:\r\n"
			+ "Situação da campanha, podendo assumir os valores:\r\n"
			+ "0 – Ativa\r\n"
			+ "1 – Inativa", example = "0")
	private int situacao;

	@ApiModelProperty(value = "Tipo Preço:\r\n"
			+ "Tipo de preço que será ativada a campanha, podendo assumir os valores:\r\n"
			+ "0 – Preço Venda\r\n"
			+ "1 – Private Label", example = "0")
	private int tipoPreco;
	
	
	private List<PackVirtualProdutosDTO> packVirtualProdutos ;
	
	
	private List<PackVirtualLojasDTO> packVirtualLojas ;


}
