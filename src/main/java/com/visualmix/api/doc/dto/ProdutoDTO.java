package com.visualmix.api.doc.dto;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações do Produto", value="Produto")
@Data
@Builder
public class ProdutoDTO {
	
	@ApiModelProperty(value = "Código Interno:\"\r\n"
			+ "Número que identifica o produto como único na base de dados.", example = "12345")
	private int produtoId;
	
	@ApiModelProperty(value = "Digito do produto:\"\r\n"
			+ "Digito do código interno do produto.", example = "1")
	private int digitoId;
	
	@ApiModelProperty(value = "Descrição Completa:\"\r\n"
			+ "Descrição mais detalhada do produto.", example = "Produto de limpeza multiuso")
	private String descricaoCompleta;
	
	@ApiModelProperty(value = "Descrição Reduzida:\"\r\n"
			+ "Descrição geralmente usada no cupom fiscal.", example = "Multiuso")
	private String descricaoReduzida;
	
	@ApiModelProperty(value = "Código Vasilhame:\"\r\n"
			+ "Código do vasilhame associado ao produto", example = "67890")
	private double vasProdutoId;
	
	@ApiModelProperty(value = "Dígito Vasilhame:\"\r\n"
			+ "Dígito do vasilhame associado ao produto", example = "2")
	private int vasSequencia;
	
	@ApiModelProperty(value = "Peso Variável:\r\n"
			+ "0 - Produto não é tratado como peso variável\r\n"
			+ "1 - Indica se o cadastro do produto deve ser enviado para o sistema de gerenciamento das balanças de loja.", example = "1")
	private int pesoVariavel;
	
	@ApiModelProperty(value = "Pré Pesado:\r\n"
			+ "0 - Produto não é tratado como pré-pesado\r\n"
			+ "1 - Indica que o produto pode ser exposto para venda em embalagem etiquetada após ser pesado na balança de loja. Todo o produto pré pesado deve ser indicado como peso variável.", example = "0")
	private int prePesado;
	
	@ApiModelProperty(value = "Venda Fracionada:\r\n"
			+ "0 - Produto só pode ser vendido em quantidades inteiras.\r\n"
			+ "1 - Produto pode ser vendido em quantidades fracionárias.", example = "3")
	private int qtdDecimal;	
	
	@ApiModelProperty(value = "Código do Departamento:\r\n"
			+ "Indica o código do departamento ao qual o produto pertence na estrutura mercadológica da loja. Deve existir um registro correspondente ao código indicado na tabela DEPARTAMENTO.", example = "10")
	private int mercadologico1;
	
	@ApiModelProperty(value = "Código da Seção:\r\n"
			+ "Indica o código da seção ao qual o produto pertence na estrutura mercadológica da loja. Deve existir um registro correspondente ao código indicado na tabela SECAO.", example = "20")
	private int mercadologico2;
	
	@ApiModelProperty(value = "Código da Linha:\r\n"
			+ "Indica o código da linha ao qual o produto pertence na estrutura mercadológica da loja. Deve existir um registro correspondente ao código indicado na tabela LINHA.", example = "30")
	private int mercadologico3;
	
	@ApiModelProperty(value = "Código da Sub-Linha:\r\n"
			+ "Indica o código da sub-linha ao qual o produto pertence na estrutura mercadológica da loja. Deve existir um registro correspondente ao código indicado na tabela SUB-LINHA.", example = "40")
	private int mercadologico4;
	
	@ApiModelProperty(value = "Código da Sub-Sub-Linha:\r\n"
			+ "Indica o código da sub-sub-linha ao qual o produto pertence na estrutura mercadológica da loja. Deve existir um registro correspondente ao código indicado na tabela SUB-SUB-LINHA.\r\n"
			+ "Obs.: Chamamos o agrupamento dos níveis departamento, seção, linha, sub-linha e sub-sub-linha de Níveis Mercadológicos. O cadastro deve operar com uma quantidade de níveis predefinida, com as possibilidades de 1 até no máximo 5 níveis. Não é obrigatório trabalhar com todos os cinco níveis. Enviar zeros nos campos dos níveis que não serão usados na estrutura mercadológica.\r\n"
			+ "Exemplo: Se operar com 3 (três) níveis mercadológicos, enviar valores somente nos campos Código do Departamento, Código da Seção e Código da Linha, enviando zeros nos campos Código da Sub-Linha e Código da Sub-Sub-Linha. Nesse exemplo, não deverão ser disponibilizadas informações nas tabelas SUB_LINHA e SUB_SUB_LINHA.", example = "50")
	private int mercadologico5;
	
	@ApiModelProperty(value = "Código do Fornecedor:\r\n"
			+ "Indica o código do fabricante do produto, que deve existir na tabela FABRICANTE", example = "1001")
	private int fornecedor;
	
	@ApiModelProperty(value = "Indica se o produto é de fabricação própria", example = "1") // TODO
	private int fabricacaoPropria;
	
	@ApiModelProperty(value = "Situação do cadastro:\r\n"
			+ "A - Ativo: produto em linha, que é comprado pela empresa.\r\n"
			+ "D - Descontinuado: produto fora de linha ou que não é comprado pela empresa, mas ainda possui quantidade em estoque.\r\n"
			+ "E - Excluído: Produto fora de linha ou que não é mais comprado pela empresa e não tem mais quantidade em estoque", example = "Ativo")
	private String situacao;
	

	
	@ApiModelProperty(value = "Produto Complementar:\r\n"
			+ "Código Interno do produto com venda associada", example = "54321")
	private double compProdutoId;
	
	@ApiModelProperty(value = "Sequência do Complementar:\r\n"
			+ "Sequência da embalagem do produto com venda associada", example = "1")
	private int compSequencia;
	
	@ApiModelProperty(value = "Percentual PIS:\r\n"
			+ "Percentual da Tributação do PIS", example = "1.65")
	private double percPis;
	
	@ApiModelProperty(value = "Situação Tributária PIS:\r\n"
			+ "Situação Tributária do PIS", example = "50")
	private int stPis;
	
	@ApiModelProperty(value = "Percentual COFINS:\r\n"
			+ "Percentual de Tributação do PIS", example = "7.60")
	private double percCofins;	
		
	@ApiModelProperty(value = "Situação Tributária COFINS:\r\n"
			+ "Situação Tributária do COFINS", example = "60")
	private int stCofins;
	
	@ApiModelProperty(value = "Código NCM:\r\n"
			+ "Código NCM", example = "12345678")
	private double codigoNcm;
	
	@ApiModelProperty(value = "Tipo PIS:\r\n"
			+ "Tipo da tributação do PIS\r\n"
			+ "T – Tributado\r\n"
			+ "I – Isento\r\n"
			+ "N – Não Tributado", example = "Cumulativo")
	private String tipoPis;
	
	@ApiModelProperty(value = "Código de Referência:\r\n"
			+ "Código de referência do produto", example = "XYZ789")
	private String referencia;
	
	@ApiModelProperty(value = "Tipo de Venda:\r\n"
			+ "Tipo de Venda permitido para o produto\r\n"
			+ "0 – Venda Liberada\r\n"
			+ "1 – Venda Somente AV\r\n"
			+ "2 – Bloqueado Reserva\r\n"
			+ "3 – Venda Controlada", example = "1")
	private int tipoVenda;
	
	@ApiModelProperty(value = "Bebida Alcoólica:\r\n"
			+ "0 - Bebida não Alcoólica, não solicita o RG na venda\r\n"
			+ "1 - Bebida Alcoólica, solicita o RG na venda", example = "0")
	private int bebidaalcoolica;
	
	@ApiModelProperty(value = "Descrição da Especificação Unitária:\r\n"
			+ "Descrição da especificação unitária, utilizado na emissão de etiqueta por kg, m, l.", example = "Responsável pela unidade de embalagem")
	private String descrespunit;
	
	@ApiModelProperty(value = "Fator da Especificação Unitária:\r\n"
			+ "Fator da especificação unitária, utilizado na emissão de etiqueta por kg, m, l.", example = "1.25")
	private double fatorespunit;
	
	@ApiModelProperty(value = "Margem teórica:\r\n"
			+ "Margem teórica do produto", example = "15.0")
	private double margemteorica;
	
	@ApiModelProperty(value = "Indica se retira tag", example = "1") // TODO
	private int retiraTag;
	
	@ApiModelProperty(value = "Código CEST\r\n"
			+ "Código especificador da substituição tributária da mercadoria", example = "1000")
	private Integer codigoCest;
	
	@ApiModelProperty(value = "Código TIPI\r\n"
			+ "Código TIPI da mercadoria", example = "123")
	private int extipi;
	
	@ApiModelProperty(value = "KIT\r\n"
			+ "Indicativo se o produto é kit ou não, podendo assumir os valores:\r\n"
			+ "0 - Não\r\n"
			+ "10 - Kit Normal\r\n"
			+ "11 - Convênio\r\n"
			+ "12 - Composto", example = "1")
	private int kit;
	
	/////////////////
	
	@ApiModelProperty(value = "Descrição balança:\r\n"
			+ "Descrição a ser enviada para a balança", example = "Produto pesável")
	private String descricaoBalanca;

	@ApiModelProperty(value = "Família\r\n"
			+ "Código da família a qual o produto pertence", example = "Família A")
	private String familia;

	@ApiModelProperty(value = "Tipo do Kit\r\n"
			+ "Tipo do kit, podendo assumir os valores:\r\n"
			+ "0 - Normal\r\n"
			+ "1 - Convênio (vendido apenas através da função de convênio)\r\n"
			+ "2 - Composto (os itens não podem ser vendidos separadamente)", example = "1")
	private int tipoKit;

	@ApiModelProperty(value = "Tipo Baixa Kit:\r\n"
			+ "Tipo de Baixa do kit, podendo assumir os valores:\r\n"
			+ "0 - Baixa por item\r\n"
			+ "1 - Baixa por kit (produto pai)", example = "0")
	private int tipoBaixa;

	@ApiModelProperty(value = "Número de Série:\r\n"
			+ "Indicativo se será solicitado o número de série na venda do produto, podendo assumir os valores:\r\n"
			+ "0 - Não informa\r\n"
			+ "1 - Informa\r\n"
			+ "2 - Informa e valida\r\n"
			+ "3 - Informa IMEI", example = "2")
	private int tipoNroSerie;

	@ApiModelProperty(value = "Tipo Serviço:\r\n"
			+ "Indica se é um produto ou serviço, podendo assumir os valores;\r\n"
			+ "0 - Produto\r\n"
			+ "1 - Garantia\r\n"
			+ "2 - Garantia Avulsa\r\n"
			+ "3 - Seguro Produto\r\n"
			+ "4 - Sorteio\r\n"
			+ "5 - Help Desk\r\n"
			+ "6 - Descarte Certo\r\n"
			+ "7 - Seguro Residencial\r\n"
			+ "8 - Seguro Financiamento\r\n"
			+ "9 - Curso\r\n"
			+ "10 - Cartelinha\r\n"
			+ "11 - Seguro Financiamento II\r\n"
			+ "12 - Seguro Financiamento III", example = "3")
	private int tipoServico;

	@ApiModelProperty(value = "Prazo de validade:\r\n"
			+ "Data de validade do produto.", example = "30")
	private Integer prazoValidade;

	@ApiModelProperty(value = "Observações:\r\n"
			+ "Observações a respeito do produto.", example = "Produto frágil, manusear com cuidado")
	private String obs;

	@ApiModelProperty(value = "Marca:\r\n"
			+ "Marca do produto.", example = "Marca X")
	private String marca;

	@ApiModelProperty(value = "Peso especifico:\r\n"
			+ "Peso do produto.", example = "1.2")
	private double pesoEspecifico;

	@ApiModelProperty(value = "Tipo Vasilhame:\r\n"
			+ "Tipo de embalagem que o produto possui.", example = "2")
	private Integer tipoVasilhame;
	
	@ApiModelProperty(value = "Gtin principal:\r\n"
			+ "Gtin principal do produto", example = "7891000100103")
	private Double gtinPrincipal;
	
	@ApiModelProperty(value = "Código ANP:\r\n"
			+ "Código do produto na Agência Nacional de Petróleo", example = "2")
	private Double codigoAnp;
	
	@ApiModelProperty(value = "Descrição ANP:\r\n"
			+ "Descrição do produto na Agência Nacional de Petróleo", example = "")
	private String descricaoAnp;
	
	@ApiModelProperty(value = "Origem:\r\n"
			+ "Origem do produto, podendo assumir os valores:\r\n"
			+ "0 – Nacional\r\n"
			+ "1 – Estrangeira (Importação Direta)\r\n"
			+ "2 – Estrangeira (Aquis. Merc. Interno)", example = "0")
	private Integer origem;
	
	@ApiModelProperty(value = "Consignado:\r\n"
			+ "Indica se é um produto é consignado ou não, podendo assumir os valores\r\n"
			+ "0 - Não\r\n"
			+ "1 - Sim", example = "0")
	private Integer consignado;
	
	@ApiModelProperty(value = "Código Marca:\r\n"
			+ "Código da marca do produto", example = "2")
	private Integer codigoMarca;
	
	@ApiModelProperty(value = "Lista de embalagens", example = "")
	private List<EmbalagemDTO> embalagens ;
	
	@ApiModelProperty(value = "Lista de informações nutricionais do produto", example = "")
	private List<ProdutoNutricionalDTO> produtoNutricional ;
	
	@ApiModelProperty(value = "Lista de promoções relâmpago", example = "")
	private List<AutomacaoDTO> promocaoRelampago ;
	

}