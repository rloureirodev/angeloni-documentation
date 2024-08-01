package com.visualmix.api.doc.dto;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações da Promoção Relampago", value="Promoção Relampago")
@Data
@Builder
public class PromocaoRelampagoDTO {
	
	@ApiModelProperty(value = "Número da Loja:\r\n"
			+ "Indica para qual loja vale o registro\r\n"
			+ "O código informado nesse campo deve existir como registro na tabela LOJAS.", example = " ")
	private Integer loja;

	@ApiModelProperty(value = "Código de Automação:\r\n"
			+ "Código que será utilizado para vender o produto no PDV.", example = " ")
	private Float codigoAutomacao;

	@ApiModelProperty(value = "Dígito de Automação:\r\n"
			+ "Dígito verificador do código de automação.", example = " ")
	private Byte digitoAutomacao;

	@ApiModelProperty(value = "Código Interno:\r\n"
			+ "Código interno do produto.\r\n"
			+ "O valor informado nesse campo deverá existir como registro na tabela PRODUTOS.", example = " ")
	private Integer produtoId;

	@ApiModelProperty(value = "Embalagem:\r\n"
			+ "Indica o código da embalagem do produto.\r\n"
			+ "O valor informado nesse campo deverá existir como registro na tabela EMBALAGEM em combinação com o campo Código Interno.", example = " ")
	private Byte sequencia;

	@ApiModelProperty(value = "Data Início:\r\n"
			+ "Data de início da vigência do preço de promoção relâmpago.", example = " ")
	private LocalDateTime dataInicio;

	@ApiModelProperty(value = "Data Fim:\r\n"
			+ "Data de final da vigência do preço de promoção relâmpago.", example = " ")
	private LocalDateTime dataFim;

	@ApiModelProperty(value = "Preço de Promoção:\r\n"
			+ "Valor do preço a ser praticado para o produto na loja no período dos campos data de início e fim da promoção.", example = " ")
	private double preco;

	@ApiModelProperty(value = "Quantidade Máxima da Promoção:\r\n"
			+ "Quantidade máxima do produto que pode ser vendida pela promoção.", example = " ")
	private Float quantidadeMaxima;


}
