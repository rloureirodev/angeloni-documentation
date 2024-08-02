package com.visualmix.api.doc.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações da Embalagem" , value="Embalagem")
@Data
@Builder
public class EmbalagemDTO {
	
	@ApiModelProperty(value = "Código Interno:\r\n"
			+ "Deverá existir um registro correspondente na tabela PRODUTO ", example = " ")
	@JsonIgnore
	private double produtoId;

	@ApiModelProperty(value = "Sequência:\r\n"
			+ "Sequencial de embalagem de venda do produto.\r\n"
			+ "A embalagem 1 é tratada como unidade, devendo sempre existir para todos os produtos."
			+ "\nExemplos: \n1 - Unidade\n2 - Caixa com 12 Unidades\n3 - Pacote com 48 Unidades.  ", example = "1")
	private Integer sequencia;

	@ApiModelProperty(value = " Descrição da Embalagem:\r\n"
			+ "Descrição da embalagem.", example = "Exemplos: Un, Cx, PCT, ...")
	private String descricao;

	@ApiModelProperty(value = "Quantidade da Embalagem:\r\n"
			+ "Quantidade de unidades presentes na embalagem. ", example = "1.01")
	private double qtdProduto;

	@ApiModelProperty(value = "Tipo de Etiqueta de Produto:\r\n"
			+ "Código que identifica o layout da etiqueta de produto.\r\n"
			+ "Esse tipo de etiqueta é usado para codificar o produto.\r\n"
			+ "Deverá existir um registro correspondente no cadastro de etiquetas, no módulo de parâmetros. ", example = " ")
	private Integer tipoEtiquetaProduto;

	@ApiModelProperty(value = "Tipo de Etiqueta de Gôndola:\r\n"
			+ "Código que identifica o layout da etiqueta de gôndola do produto.\r\n"
			+ "Esse tipo de etiqueta é usado para identificar o produto na prateleira de exposição.\r\n"
			+ "Deverá existir um registro correspondente no cadastro de etiquetas, no módulo de parâmetros. ", example = " ")
	private Integer tipoEtiquetaGondola;

	@ApiModelProperty(value = "Tipo Prazo de Validade:\r\n"
			+ "Indica a unidade de tempo do valor informado no campo Prazo de Validade.\r\n"
			+ "As possibilidades são:\n 1 – Dias\n 2 – Meses\n 3 – Anos ", example = "1")
	private Integer tipoPrazoValidade;

	@ApiModelProperty(value = "Prazo de Validade:\r\n"
			+ "Tempo de validade dos produtos pesados na balança.\r\n"
			+ "Esse valor será impresso na etiqueta de balança. ", example = "1")
	private Integer prazoValidade;

	@ApiModelProperty(value = "Quantidade Múltipla:\r\n"
			+ "Indica a quantidade mínima de venda, o produto só pode ser vendido em valores múltiplos. ", example = "0.01")
	private double qtdeMultiplo;

	@ApiModelProperty(value = "Digita Preço:\r\n"
			+ "Indicativo se permite a digitação de preço no Assistente de Vendas (AV)\r\n"
			+ "0 – Não permite\r\n"
			+ "1 – Permite a digitação do preço (tintas)", example = " ")
	private Integer digitaPreco;

	@ApiModelProperty(value = "Peso da Embalagem para desconto no PDV", example = "0.01")
	private double embalagemPeso;

	@ApiModelProperty(value = "Peso Mínimo da Embalagem:\r\n"
			+ "Peso Mínimo da Embalagem", example = "0.01")
	private double pesoMinimo;

	@ApiModelProperty(value = "Peso Máximo da Embalagem:\r\n"
			+ "Peso Máximo da Embalagem ", example = "0.01")
	private double pesoMaximo;

	@ApiModelProperty(value = "Cesta Básica:\r\n"
			+ "Indica se o produto faz parte da cesta básica, pode ser vendido como convenio:\r\n"
			+ "0 – Não\r\n"
			+ "1 – Sim ", example = "1")
	private int cestaBasica;
	
	@JsonIgnore
	@ApiModelProperty(value = "Tara Mínima da Embalagem:\r\n"
			+ "Tara Mínima Embalagem para desconto no PDV ", example = "0.01")
	private double taraMinima;

	@ApiModelProperty(value = "Tara Máxima da Embalagem:\r\n"
			+ "Tara Máxima da Embalagem ", example = "0.01 ")
	private double taraMaxima;

	@ApiModelProperty(value = "Código Vale:\r\n"
			+ "Código do Vale ou termo que será impresso no PDV ", example = " ")
	private int emiteVale;


}