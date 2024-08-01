package com.visualmix.api.doc.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações do Imposto Loja", value="Imposto Loja")
@Data
@Builder
public class ImpostoLojasDTO {
	
	@ApiModelProperty(value = "Código Interno:\r\n"
			+ "Código interno do produto.\r\n"
			+ "O valor informado nesse campo deverá existir como registro na tabela PRODUTO.", example = "1")
	private double produtoId;

	@ApiModelProperty(value = "Embalagem:\r\n"
			+ "Indica o código da embalagem do produto.\r\n"
			+ "O valor informado nesse campo deverá existir como registro na tabela EMBALAGEM em combinação com o campo Código Interno. ", example = "1")
	private int sequencia;

	@ApiModelProperty(value = "Número da Loja:\r\n"
			+ "Indica para qual loja vale o registro\r\n"
			+ "O código informado nesse campo deve existir como registro na tabela LOJAS. ", example = "1")
	private int loja;
	
	///////////////copia da embalagem loja abaixo//
	
	@ApiModelProperty(value = "Tipo de Alíquota:\r\n"
			+ "Indica se o produto é ou não tributado."
			+ "\nAs possibilidades principais são:\nT – Tributado, \nF – Fonte (substituído), \nI – Isento, \nN – Não tributado, \nS – Serviços (ISS).", example = "F")
	private String tipoAliquota;

	@ApiModelProperty(value = "Percentual de Imposto:\r\n"
			+ "Quando produto tributado, ou seja, quando o campo anterior Tipo de Alíquota for ‘T’, indica o percentual do imposto a ser praticado na venda do produto no cupom fiscal para a loja.", example = " ")
	private Float percImposto;

	@ApiModelProperty(value = "Situação Tributária\r\n"
			+ "Indica o código da situação tributária a que pertence o produto.", example = "Texto")
	private String situacaoTributaria;

	@ApiModelProperty(value = "Isento de PIS / COFINS\r\n"
			+ "Indica se o produto é isento de PIS / COFINS, podendo assumir os valores:\r\n"
			+ "0 - Não Isento\r\n"
			+ "99 - Isento", example = "0")
	private Float ipi;

	@ApiModelProperty(value = "Percentual Total de Impostos\r\n"
			+ "Percentual total dos tributos federais, estaduais e municipais, cuja incidência influi na formação do respectivo preço de venda. (Lei Federal 12.741/2012)", example = "0.01")
	private double impostoTotal;

	@ApiModelProperty(value = "CFOP\r\n"
			+ "Código Fiscal de Operações e Prestações, código numérico que identifica a natureza de circulação da mercadoria ou a prestação de serviço de transportes.", example = "1010")
	private int cfopCfe;
	
	@ApiModelProperty(value = "Percentual Total de Impostos Municipais\r\n"
			+ "Percentual total dos tributos municipais, cuja incidência influi na formação do respectivo preço de venda.", example = "0.01")
	private double impostoMunicipal;

	@ApiModelProperty(value = "Percentual Total de Impostos Estaduais\r\n"
			+ "Percentual total dos tributos estaduais, cuja incidência influi na formação do respectivo preço de venda.", example = "0.01")
	private double impostoEstadual;

	@ApiModelProperty(value = "Percentual Total de Impostos Federais\r\n"
			+ "Percentual total dos tributos federais, cuja incidência influi na formação do respectivo preço de venda.", example = "0.01")
	private double impostoFederal;
	
	@ApiModelProperty(value = "Percentual de Arrecadação:\r\n"
			+ "Percentual de arrecadação de tributos ", example = "0.01")
	private double percArrec;
	
	@ApiModelProperty(value = "Código de Benefício Fiscal\r\n"
			+ "Código do Benefício Fiscal concedido ao Produto", example = "Texto")
	private String codBenFis;
	
	@ApiModelProperty(value = "Alíquota Redução: Percentual com que um tributo incide sobre o valor de algo tributado.", example = "0.01")
	private double aliquotaReducao;
	
	@ApiModelProperty(value = "Percentual de redução base:\r\n"
			+ "Percentual de redução de tributos.", example = "0.01")
	private double percReducaoBase;
	
	@ApiModelProperty(value = "Percentual de ICMS Efetivo:\r\n"
			+ "Percentual de ICMS efetivo", example = "0.01")
	private double picmsEfet;
	
	@ApiModelProperty(value = "Motivo da Desoneração:\r\n"
			+ "Código do motivo da desoneração", example = "1")
	private int motDescIcms;
	
	@ApiModelProperty(value = "Percentual do adRem Retido:\r\n"
			+ "Percentual do adRem Retido", example = "0.01")
	private double adremicmsret;	

	@ApiModelProperty(value = "Código Integração (Imposto)\r\n"
			+ "Código do imposto do produto na retaguarda", example = " ")
	private String codIntegracao;
	
	


}
