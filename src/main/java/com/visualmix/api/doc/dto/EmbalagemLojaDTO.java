package com.visualmix.api.doc.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações do Embalagem Loja" , value="Embalagem Loja")
@Data
@Builder
public class EmbalagemLojaDTO {
	
	@ApiModelProperty(value = "Código Interno:\r\n"
			+ "Código interno do produto.\r\n"
			+ "O valor informado nesse campo deverá existir como registro na tabela PRODUTO.", example = " ")
	private double produtoId;

	@ApiModelProperty(value = "Embalagem:\r\n"
			+ "Indica o código da embalagem do produto.\r\n"
			+ "O valor informado nesse campo deverá existir como registro na tabela EMBALAGEM em combinação com o campo Código Interno. ", example = "1")
	private int sequencia;

	@ApiModelProperty(value = "Número da Loja:\r\n"
			+ "Indica para qual loja vale o registro\r\n"
			+ "O código informado nesse campo deve existir como registro na tabela LOJAS. ", example = "1")
	private int loja;

	@ApiModelProperty(value = "Quantidade de Etiqueta de Gôndola:\r\n"
			+ "Quantidade de etiquetas do tipo gôndola que serão impressas de forma automática quando houver alteração de preços nos processos de virada de dia de nosso sistema.\r\n"
			+ "Essa informação é usada pelo módulo emissor de etiquetas (Mata-Burro). ", example = "1")
	private int qtdEtiquetaGondola;

	@ApiModelProperty(value = "Número de Frentes:\r\n"
			+ "Número de frentes que o produto ocupa na prateleira de exposição para venda (gôndola).", example = "1")
	private int frente;

	@ApiModelProperty(value = "Empilhamento:\r\n"
			+ "Número de empilhamento de unidades ou caixas que o produto deve ser disposto na prateleira de exposição para venda.", example = "1")
	private int empilhamento;

	@ApiModelProperty(value = "Profundidade:\r\n"
			+ "Número de unidades ou caixas que o produto deve ser disposto da frente para o fundo na prateleira de exposição para venda.", example = "1")
	private int profundidade;

	@ApiModelProperty(value = "Quantidade máxima de digitação:\r\n"
			+ "Permite a multiplicação de até x unidades no PDV ", example = "1")
	private int qtdeMaxDigitacao;

	@ApiModelProperty(value = "Preço de Venda:\r\n"
			+ "Preço de venda que será praticado para o produto na loja.", example = "0.01")
	private double precoVenda;

	@ApiModelProperty(value = " [ VERIFICAR ] ", example = " ")
	private double custoUltimaEntradaSemIcms;

	@ApiModelProperty(value = "Data Início da Promoção:\r\n"
			+ "Data de início da vigência do preço de promoção do produto.", example = "dd/MM/yyyy HH:mm:ss")
	private LocalDateTime dataInicioProm;

	@ApiModelProperty(value = "Data Fim da Promoção:\r\n"
			+ "Data de final da vigência do preço de promoção do produto.\r\n"
			+ "Obs.: No período das datas de início e de fim da promoção, valerá no PDV o preço de promoção. Fora esse período, valerá o preço de venda do produto. ", example = "dd/MM/yyyy HH:mm:ss")
	private LocalDateTime dataFimProm;

	@ApiModelProperty(value = "Preço de Promoção:\r\n"
			+ "Valor do preço a ser praticado para o produto na loja no período dos campos data de início e fim da promoção.", example = "99.99")
	private double precoPromocao;

	@ApiModelProperty(value = "Quantidade Máxima da Promoção:\r\n"
			+ "Quantidade máxima do produto que pode ser vendida pela promoção.", example = "1")
	private int qtdMaxPromocao;

	@ApiModelProperty(value = "Data Início Clube:\r\n"
			+ "Data de início da vigência do preço de promoção do produto para clientes cadastrados no clube.", example = "1980-01-01 00:00:00.000")
	private LocalDateTime dataInicioClube;

	@ApiModelProperty(value = "Data Fim da Promoção:\r\n"
			+ "Data de final da vigência do preço de promoção do produto para clientes cadastrados no clube\r\n"
			+ "Obs.: No período das datas de início e de fim da promoção, valerá no pdv o preço de promoção. Fora esse período, valerá o preço de venda do produto.", example = "dd/MM/yyyy HH:mm:ss")
	private LocalDateTime dataFimClube;

	@ApiModelProperty(value = "Preço de Clube:\r\n"
			+ "Valor do preço a ser praticado para o produto na loja no período dos campos data de início e fim da promoção do clube para clientes cadastrados.", example = "99.99")
	private double precoClube;

	@ApiModelProperty(value = "Percentual máximo do Desconto:\r\n"
			+ "Percentual máximo do desconto que poderá ser dado na embalagem na loja.", example = "0.01")
	private Float percMaxDesconto;

	@ApiModelProperty(value = "Código da Promoção\r\n"
			+ "Código da Promoção na retaguarda", example = "1")
	private int precoPromTabela;

	@ApiModelProperty(value = "Percentual de Despesas\r\n"
			+ "Percentual de Despesas extras para cálculo da margem", example = "0.01")
	private Float percDespesas;

	@ApiModelProperty(value = "Entrega:\r\n"
			+ "0 – O produto não pode ser entregue\r\n"
			+ "1 – O produto é entregue (pelo CD)", example = "0")
	private int entrega;

	@ApiModelProperty(value = "Tipo Ação:\r\n"
			+ "Indica qual a ação a integração irá executar.\r\n"
			+ "0 – Inclusão / Alteração\r\n"
			+ "1 - Exclusão", example = "0")
	private int tipoAcao;	

	@ApiModelProperty(value = "Quantidade da Embalagem:\r\n"
			+ "Quantidade de unidades presentes na embalagem, esse campo deve ser enviado somente quando o campo SEQUENCIA não for enviado", example = "0.01")
	private double qtdProduto;

	@ApiModelProperty(value = "Preço Montagem:\r\n"
			+ "Preço de montagem para o produto", example = " ")
	private double precoMontagem;	

	@ApiModelProperty(value = " [ VERIFICAR ] ", example = "Texto")
	private String descricaoAux;	
	
	@ApiModelProperty(value = " ", example = " ")
	private List<EmbalagemAtacadoDTO> embalagemAtacado ;
	
	@ApiModelProperty(value = " ", example = " ")
	private List<PromocaoRelampagoDTO> promocaoRelampago ;	
	

}
