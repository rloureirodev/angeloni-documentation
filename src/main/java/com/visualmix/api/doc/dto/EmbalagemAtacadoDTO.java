package com.visualmix.api.doc.dto;

import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações da Embalagem Atacado", value="Embalagem Atacado")
@Data
@Builder
public class EmbalagemAtacadoDTO {
	@ApiModelProperty(value = "Código Interno:\r\n"
			+ "Código interno do produto.\r\n"
			+ "O valor informado nesse campo deverá existir como registro na tabela PRODUTOS", example = "12345")
	private Float produtoId;

	@ApiModelProperty(value = " Embalagem:\r\n"
			+ "Indica o código da embalagem do produto.\r\n"
			+ "O valor informado nesse campo deverá existir como registro na tabela EMBALAGEM em combinação com o campo Código Interno.", example = "12345")
	private Integer sequencia;

	@ApiModelProperty(value = "Número da Loja:\r\n"
			+ "Indica para qual loja vale o registro\r\n"
			+ "O código informado nesse campo deve existir como registro na tabela LOJAS.", example = "12345")
	private Integer loja;

	@ApiModelProperty(value = "Quantidade a partir de–01:\r\n"
			+ "Quantidade de produtos necessários para o desconto ", example = "1.01")
	private Float qtde01;

	@ApiModelProperty(value = " Tipo do Desconto–01, Tipo do Desconto–02, Tipo do Desconto–03, Tipo do Desconto–04, Tipo do Desconto–05:\r\n"
			+ "Tipo do Desconto, podendo assumir os valores:\r\n"
			+ "1 - Preço de Venda\r\n"
			+ "2 - Percentual Desconto\r\n"
			+ "3 - Valor do Desconto\r\n"
			+ "4 - Preço Venda Cx.\r\n"
			+ "5 - Bônus Cx.\r\n"
			+ "6 - Valor do Desconto Cx.", example = "1")
	private int tipo01;

	@ApiModelProperty(value = "Valor do Desconto-01: ", example = "99.99")
	private double valor01;

	@ApiModelProperty(value = "Quantidade a partir de–02:\r\n"
			+ "Quantidade de produtos necessários para o desconto ", example = "1.01")
	private Float qtde02;

	@ApiModelProperty(value = " Tipo do Desconto–01, Tipo do Desconto–02, Tipo do Desconto–03, Tipo do Desconto–04, Tipo do Desconto–05:\r\n"
			+ "Tipo do Desconto, podendo assumir os valores:\r\n"
			+ "1 - Preço de Venda\r\n"
			+ "2 - Percentual Desconto\r\n"
			+ "3 - Valor do Desconto\r\n"
			+ "4 - Preço Venda Cx.\r\n"
			+ "5 - Bônus Cx.\r\n"
			+ "6 - Valor do Desconto Cx.", example = "1")
	private int tipo02;

	@ApiModelProperty(value = "Valor do Desconto-02: ", example = "99.99")
	private double valor02;

	@ApiModelProperty(value = "Quantidade a partir de–03:\r\n"
			+ "Quantidade de produtos necessários para o desconto ", example = "1.01")
	private Float qtde03;

	@ApiModelProperty(value = " Tipo do Desconto–01, Tipo do Desconto–02, Tipo do Desconto–03, Tipo do Desconto–04, Tipo do Desconto–05:\r\n"
			+ "Tipo do Desconto, podendo assumir os valores:\r\n"
			+ "1 - Preço de Venda\r\n"
			+ "2 - Percentual Desconto\r\n"
			+ "3 - Valor do Desconto\r\n"
			+ "4 - Preço Venda Cx.\r\n"
			+ "5 - Bônus Cx.\r\n"
			+ "6 - Valor do Desconto Cx.", example = "1")
	private int tipo03;

	@ApiModelProperty(value = "Valor do Desconto-03:", example = "99.99")
	private double valor03;

	@ApiModelProperty(value = "Quantidade a partir de–04:\r\n"
			+ "Quantidade de produtos necessários para o desconto ", example = "1.01")
	private Float qtde04;

	@ApiModelProperty(value = " Tipo do Desconto–01, Tipo do Desconto–02, Tipo do Desconto–03, Tipo do Desconto–04, Tipo do Desconto–05:\r\n"
			+ "Tipo do Desconto, podendo assumir os valores:\r\n"
			+ "1 - Preço de Venda\r\n"
			+ "2 - Percentual Desconto\r\n"
			+ "3 - Valor do Desconto\r\n"
			+ "4 - Preço Venda Cx.\r\n"
			+ "5 - Bônus Cx.\r\n"
			+ "6 - Valor do Desconto Cx.", example = "1")
	private int tipo04;

	@ApiModelProperty(value = "Valor do Desconto-04: ", example = "99.99 ")
	private double valor04;

	@ApiModelProperty(value = "Quantidade a partir de-05:\r\n"
			+ "Quantidade de produtos necessários para o desconto ", example = "1.01")
	private Float qtde05;

	@ApiModelProperty(value = " Tipo do Desconto–01, Tipo do Desconto–02, Tipo do Desconto–03, Tipo do Desconto–04, Tipo do Desconto–05:\r\n"
			+ "Tipo do Desconto, podendo assumir os valores:\r\n"
			+ "1 - Preço de Venda\r\n"
			+ "2 - Percentual Desconto\r\n"
			+ "3 - Valor do Desconto\r\n"
			+ "4 - Preço Venda Cx.\r\n"
			+ "5 - Bônus Cx.\r\n"
			+ "6 - Valor do Desconto Cx.", example = "1")
	private int tipo05;

	@ApiModelProperty(value = "Valor do Desconto-05: ", example = "99.99")
	private double valor05;

	@ApiModelProperty(value = "Data Início:\r\n"
			+ "Data de início da promoção ", example = "dd/MM/yyyy HH:mm:ss")
	private LocalDateTime dtInicio;

	@ApiModelProperty(value = "Data Fim:\r\n"
			+ "Data de fim da promoção ", example = "dd/MM/yyyy HH:mm:ss")
	private LocalDateTime dtFim;

	@ApiModelProperty(value = "Tipo de Venda:\r\n"
			+ "Tipo de venda que participa da promoção a partir de (parametrizado conforme a necessidade do cliente)\r\n"
			+ "1 - Venda a Vista\r\n"
			+ "2 - Cartão Cliente ", example = "1")
	private int tipoVenda;

	@ApiModelProperty(value = "Tipo Preço:\r\n"
			+ "Preço que participa da promoção a partir de, podendo assumir os valores:\r\n"
			+ "0 - Preço de Venda\r\n"
			+ "1 - Preço Promoção ", example = "1")
	private int tipoPreco;

	@ApiModelProperty(value = "Código Interno do Produto Associado:\r\n"
			+ "Código Interno do produto pai, caso o produto esteja associado à promoção de outro produto.", example = "1.01")
	private Float paiProdutoId;

	@ApiModelProperty(value = "Embalagem do Produto Associado:\r\n"
			+ "Embalagem do produto pai, caso o produto esteja associado à promoção de outro produto. ", example = "1")
	private int paiSequencia;

	@ApiModelProperty(value = "Múltiplo:\r\n"
			+ "Indica se o desconto será dado a cada x unidades ou a partir de x unidades\r\n"
			+ "0 - O desconto será dado a partir de x unidades\r\n"
			+ "1 - O desconto será dado a cada x unidades ", example = "1")
	private int multiplo;

	@ApiModelProperty(value = "Quantidade Máxima:\r\n"
			+ "Quantidade máxima com o preço a partir de. ", example = "1.01")
	private Float qtdeMaxima;

}
