package com.visualmix.api.doc.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações da Embalagem Preço" , value="Embalagem Preço")
@Data
@Builder
public class EmbalagemPrecoDTO {
	
	@ApiModelProperty(value = "Código Interno:\r\n"
			+ "Código interno do produto.\r\n"
			+ "O valor informado nesse campo deverá existir como registro na tabela PRODUTO.", example = " ")
	private double produtoId;

	@ApiModelProperty(value = "Embalagem:\r\n"
			+ "Indica o código da embalagem do produto.\r\n"
			+ "O valor informado nesse campo deverá existir como registro na tabela EMBALAGEM em combinação com o campo Código Interno.", example = "1")
	private int sequencia;

	@ApiModelProperty(value = "Loja:\r\n"
			+ "Indica para qual loja vale o registro\r\n"
			+ "O código informado nesse campo deve existir como registro na tabela LOJAS.", example = "1")
	private Integer loja;

	@ApiModelProperty(value = "Código da tabela de preço diferenciado, esse código deve existir na tabela TIPO_TABELA_PRECO do banco VM_DATABSP (tabela configurada internamente)", example = "1")
	private Integer tabela;

	@ApiModelProperty(value = "Preço de Venda:\r\n"
			+ "Preço de venda que será praticado para o produto quando utilizado a tabela de preço diferenciado.", example = "0.01")
	private Double precoVenda;

	@ApiModelProperty(value = "Quantidade da Embalagem:\r\n"
			+ "Quantidade de unidades presentes na embalagem, esse campo deve ser enviado somente quando o campo SEQUENCIA não for enviado", example = "0.01")
	private Double qtdProduto;


}
