package com.visualmix.api.doc.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações Automação" , value="Automação")
@Data
@Builder
public class AutomacaoDTO {
	
	@ApiModelProperty(value = " Código de Automação:\r\n"
			+ "Código que será utilizado para vender o produto no PDV.", example = "12345")	
	private int codigoAutomacao;

	@ApiModelProperty(value = " Dígito de Automação:\r\n"
			+ "Dígito verificador do código de automação.", example = " 123")
	private int digitoAutomacao;

	@ApiModelProperty(value = "Código Interno:\r\n"
			+ "Indica o código interno do produto que o código de automação está associado. ", example = "12345")
	@JsonIgnore
	private int produtoId;

	@ApiModelProperty(value = "Sequência:\r\n"
			+ "Indica a sequência da embalagem que o código de automação está associado. ", example = "12345")
	private int sequencia;

	@ApiModelProperty(value = "Tipo de Código:\r\n"
			+ "Indica qual a classificação do código de automação, sendo as possibilidades.\r\n"
			+ "1 - Produto não marcado, que não possui área para ser etiquetado ou não possui código vindo da indústria.\r\n"
			+ "2 - Peso variável, produto vendido através de pesagem.\r\n"
			+ "3 - Padrão EAN13 ou DUN14, código de indústria.\r\n"
			+ "4 – Sem Gtin ", example = "1 ")
	private int tipoCodigo;

	@ApiModelProperty(value = "Tipo Ação:\r\n"
			+ "Indica qual a ação a integração irá executar.\r\n"
			+ "0 – Inclusão / Alteração\r\n"
			+ "1 - Exclusão", example = "0")
	private int tipoAcao;

	@ApiModelProperty(value = " Quantidade da Embalagem:\r\n"
			+ "Quantidade de unidades presentes na embalagem, esse campo deve ser enviado somente quando o campo SEQUENCIA não for enviado", example = "1.01")
	private double qtdProduto;

}
