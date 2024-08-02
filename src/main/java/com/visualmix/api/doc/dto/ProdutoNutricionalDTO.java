package com.visualmix.api.doc.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações  Nutricional", value="Nutricional")
@Data
@Builder
public class  ProdutoNutricionalDTO {
	
	@ApiModelProperty(value = "Código Interno:\r\n"
			+ "Código interno do produto.\r\n"
			+ "O valor informado nesse campo deverá existir como registro na tabela PRODUTO.", example = " ")
	@JsonIgnore
	private int produtoId;

	@ApiModelProperty(value = "Descrição da Porção:\r\n"
			+ "Descrição da porção\r\n"
			+ "Ex.: 30g (3 unidades)", example = "30g (3 unidades)")
	private String descPorcao;

	@ApiModelProperty(value = "Tipo da Informação nutricional - Valor Energético:\r\n"
			+ "0 - Normal\r\n"
			+ "1 – Menor que\r\n"
			+ "2 – Quantidade não significativa\r\n"
			+ "3 – Não Disponível\n", example = " ")
	private int tipo01;

	@ApiModelProperty(value = "Onde 01 - Valor Energético", example = " ")
	private Float qtde01;

	@ApiModelProperty(value = "Tipo da Quantidade - Valor Energético\r\n"
			+ "0 – gr\r\n"
			+ "1 – mg\r\n"
			+ "2 – kg\r\n"
			+ "3 – ml\r\n"
			+ "4 – lt\r\n"
			+ "5 - kcal\r\n", example = " ")
	private int tipoQtde01;

	@ApiModelProperty(value = "Valor em porcentagem referente ao valor diário de nutrientes\r\n"
			+ "Obs.: Onde 01 - Valor Energético", example = " ")
	private Float vd01;

	@ApiModelProperty(value = "Tipo da Informação nutricional - Carboidratos\r\n"
			+ "0 - Normal\r\n"
			+ "1 – Menor que\r\n"
			+ "2 – Quantidade não significativa\r\n"
			+ "3 – Não Disponível\n"
			, example = " ")
	private int tipo02;

	@ApiModelProperty(value = "Onde 02 - Carboidratos", example = " ")
	private Float qtde02;

	@ApiModelProperty(value = "Tipo da Quantidade - Carboidratos\r\n"
			+ "0 – gr\r\n"
			+ "1 – mg\r\n"
			+ "2 – kg\r\n"
			+ "3 – ml\r\n"
			+ "4 – lt\r\n"
			+ "5 - kcal\r\n", example = " ")
	private int tipoQtde02;

	@ApiModelProperty(value = "Valor em porcentagem referente ao valor diário de nutrientes\r\n"
			+ "Obs.: Onde 02 - Carboidratos", example = " ")
	private Float vd02;

	@ApiModelProperty(value = "Tipo da Informação nutricional - Proteínas\r\n"
			+ "0 - Normal\r\n"
			+ "1 – Menor que\r\n"
			+ "2 – Quantidade não significativa\r\n"
			+ "3 – Não Disponível\n", example = " ")
	private int tipo03;

	@ApiModelProperty(value = "Onde 03 - Proteínas", example = " ")
	private Float qtde03;

	@ApiModelProperty(value = "Tipo da Quantidade - Proteínas\r\n"
			+ "0 – gr\r\n"
			+ "1 – mg\r\n"
			+ "2 – kg\r\n"
			+ "3 – ml\r\n"
			+ "4 – lt\r\n"
			+ "5 - kcal\r\n", example = " ")
	private int tipoQtde03;

	@ApiModelProperty(value = "Valor em porcentagem referente ao valor diário de nutrientes\r\n"
			+ "Obs.: Onde 03 - Proteínas", example = " ")
	private Float vd03;

	@ApiModelProperty(value = "Tipo da Informação nutricional - Gorduras Totais\r\n"
			+ "0 - Normal\r\n"
			+ "1 – Menor que\r\n"
			+ "2 – Quantidade não significativa\r\n"
			+ "3 – Não Disponível\n", example = " ")
	private int tipo04;

	@ApiModelProperty(value = "Onde 04 - Gorduras Totais", example = " ")
	private Float qtde04;

	@ApiModelProperty(value = "Tipo da Quantidade - Gorduras Totais\r\n"
			+ "0 – gr\r\n"
			+ "1 – mg\r\n"
			+ "2 – kg\r\n"
			+ "3 – ml\r\n"
			+ "4 – lt\r\n"
			+ "5 - kcal\r\n", example = " ")
	private int tipoQtde04;

	@ApiModelProperty(value = "Valor em porcentagem referente ao valor diário de nutrientes\r\n"
			+ "Obs.: Onde 04 - Gorduras Totais", example = " ")
	private Float vd04;

	@ApiModelProperty(value = "Tipo da Informação nutricional - Gorduras /Saturadas\r\n"
			+ "0 - Normal\r\n"
			+ "1 – Menor que\r\n"
			+ "2 – Quantidade não significativa\r\n"
			+ "3 – Não Disponível\n", example = " ")
	private int tipo05;

	@ApiModelProperty(value = "Onde 05 - Gorduras /Saturadas", example = " ")
	private Float qtde05;

	@ApiModelProperty(value = "Tipo da Quantidade - Gorduras /Saturadas\r\n"
			+ "0 – gr\r\n"
			+ "1 – mg\r\n"
			+ "2 – kg\r\n"
			+ "3 – ml\r\n"
			+ "4 – lt\r\n"
			+ "5 - kcal\r\n", example = " ")
	private int tipoQtde05;

	@ApiModelProperty(value = "Valor em porcentagem referente ao valor diário de nutrientes\r\n"
			+ "Obs.: Onde 05 - Gorduras /Saturadas", example = " ")
	private Float vd05;

	@ApiModelProperty(value = "Tipo da Informação nutricional - Gorduras Trans\r\n"
			+ "0 - Normal\r\n"
			+ "1 – Menor que\r\n"
			+ "2 – Quantidade não significativa\r\n"
			+ "3 – Não Disponível\n", example = " ")
	private int tipo06;

	@ApiModelProperty(value = "Onde 06 - Gorduras Trans", example = " ")
	private Float qtde06;

	@ApiModelProperty(value = "Tipo da Quantidade - Gorduras Trans\r\n"
			+ "0 – gr\r\n"
			+ "1 – mg\r\n"
			+ "2 – kg\r\n"
			+ "3 – ml\r\n"
			+ "4 – lt\r\n"
			+ "5 - kcal\r\n", example = " ")
	private int tipoQtde06;

	@ApiModelProperty(value = "Valor em porcentagem referente ao valor diário de nutrientes\r\n"
			+ "Obs.: Onde 06 - Gorduras Trans", example = " ")
	private Float vd06;

	@ApiModelProperty(value = "Tipo da Informação nutricional - Fibra Alimentar\r\n"
			+ "0 - Normal\r\n"
			+ "1 – Menor que\r\n"
			+ "2 – Quantidade não significativa\r\n"
			+ "3 – Não Disponível\n", example = " ")
	private int tipo07;

	@ApiModelProperty(value = "Onde 07 - Fibra Alimentar", example = " ")
	private Float qtde07;

	@ApiModelProperty(value = "Tipo da Quantidade - Fibra Alimentar\r\n"
			+ "0 – gr\r\n"
			+ "1 – mg\r\n"
			+ "2 – kg\r\n"
			+ "3 – ml\r\n"
			+ "4 – lt\r\n"
			+ "5 - kcal\r\n", example = " ")
	private int tipoQtde07;

	@ApiModelProperty(value = "Valor em porcentagem referente ao valor diário de nutrientes\r\n"
			+ "Obs.: Onde 07 - Fibra Alimentar", example = " ")
	private Float vd07;

	@ApiModelProperty(value = "Tipo da Informação nutricional - Sódio\r\n"
			+ "0 - Normal\r\n"
			+ "1 – Menor que\r\n"
			+ "2 – Quantidade não significativa\r\n"
			+ "3 – Não Disponível\n", example = " ")
	private int tipo08;

	@ApiModelProperty(value = "Onde 08 - Sódio", example = " ")
	private Float qtde08;

	@ApiModelProperty(value = "Tipo da Quantidade - Sódio\r\n"
			+ "0 – gr\r\n"
			+ "1 – mg\r\n"
			+ "2 – kg\r\n"
			+ "3 – ml\r\n"
			+ "4 – lt\r\n"
			+ "5 - kcal\r\n", example = " ")
	private int tipoQtde08;

	@ApiModelProperty(value = "Valor em porcentagem referente ao valor diário de nutrientes\r\n"
			+ "Obs.: Onde 08 - Sódio", example = " ")
	private Float vd08;
	///////////////////////////////////
	@ApiModelProperty(value = "Tipo da Informação nutricional - Açucares Totais\r\n"
			+ "0 - Normal\r\n"
			+ "1 – Menor que\r\n"
			+ "2 – Quantidade não significativa\r\n"
			+ "3 – Não Disponível\n", example = " ")
	private int tipo09;

	@ApiModelProperty(value = "Onde 09 - Açucares Totais", example = " ")
	private Float qtde09;

	@ApiModelProperty(value = "Tipo da Quantidade - Açucares Totais\r\n"
			+ "0 – gr\r\n"
			+ "1 – mg\r\n"
			+ "2 – kg\r\n"
			+ "3 – ml\r\n"
			+ "4 – lt\r\n"
			+ "5 - kcal\r\n", example = " ")
	private int tipoQtde09;

	@ApiModelProperty(value = "Valor em porcentagem referente ao valor diário de nutrientes\r\n"
			+ "Obs.: Onde 09 - Açucares Totais", example = " ")
	private Float vd09;
////////////////////////////////////////////////////
	@ApiModelProperty(value = "Tipo da Informação nutricional - Açucares Adicionados\r\n"
			+ "0 - Normal\r\n"
			+ "1 – Menor que\r\n"
			+ "2 – Quantidade não significativa\r\n"
			+ "3 – Não Disponível\n", example = " ")
	private int tipo10;

	@ApiModelProperty(value = "Onde 10 - Açucares Adicionados", example = " ")
	private Float qtde10;

	@ApiModelProperty(value = "Tipo da Quantidade - Açucares Adicionados\r\n"
			+ "0 – gr\r\n"
			+ "1 – mg\r\n"
			+ "2 – kg\r\n"
			+ "3 – ml\r\n"
			+ "4 – lt\r\n"
			+ "5 - kcal\r\n", example = " ")
	private int tipoQtde10;

	@ApiModelProperty(value = "Valor em porcentagem referente ao valor diário de nutrientes\r\n"
			+ "Obs.: Onde 10 - Açucares Adicionados", example = " ")
	private Float vd10;
//////////######################################
	@ApiModelProperty(value = "Tipo da Informação nutricional - Lactose\r\n"
			+ "0 - Normal\r\n"
			+ "1 – Menor que\r\n"
			+ "2 – Quantidade não significativa\r\n"
			+ "3 – Não Disponível\n", example = " ")
	private int tipo11;

	@ApiModelProperty(value = "Onde 11 - Lactose", example = " ")
	private Float qtde11;

	@ApiModelProperty(value = "Tipo da Quantidade - Lactose\r\n"
			+ "0 – gr\r\n"
			+ "1 – mg\r\n"
			+ "2 – kg\r\n"
			+ "3 – ml\r\n"
			+ "4 – lt\r\n"
			+ "5 - kcal\r\n", example = " ")
	private int tipoQtde11;

	@ApiModelProperty(value = "Valor em porcentagem referente ao valor diário de nutrientes\r\n"
			+ "Obs.: Onde 11 - Lactose", example = " ")
	private Float vd11;
//////////######################################

	@ApiModelProperty(value = "Tipo da Informação nutricional - Galactose\r\n"
			+ "0 - Normal\r\n"
			+ "1 – Menor que\r\n"
			+ "2 – Quantidade não significativa\r\n"
			+ "3 – Não Disponível\n", example = " ")
	private int tipo12;

	@ApiModelProperty(value = "Onde 11 - Galactose", example = " ")
	private Float qtde12;

	@ApiModelProperty(value = "Tipo da Quantidade - Galactose\r\n"
			+ "0 – gr\r\n"
			+ "1 – mg\r\n"
			+ "2 – kg\r\n"
			+ "3 – ml\r\n"
			+ "4 – lt\r\n"
			+ "5 - kcal\r\n", example = " ")
	private int tipoQtde12;

	@ApiModelProperty(value = "Valor em porcentagem referente ao valor diário de nutrientes\r\n"
			+ "Obs.: Onde 11 - Galactose", example = " ")
	private Float vd12;
//////////######################################
	@ApiModelProperty(value = "Receita 1:\r\n"
			+ "Descrição da receita", example = " ")
	private String linha01;

	@ApiModelProperty(value = "Receita 2:\r\n"
			+ "Descrição da receita", example = " ")
	private String linha02;

	@ApiModelProperty(value = "Receita 3:\r\n"
			+ "Descrição da receita", example = " ")
	private String linha03;

	@ApiModelProperty(value = "Receita 4:\r\n"
			+ "Descrição da receita", example = " ")
	private String linha04;

	@ApiModelProperty(value = "Receita 5:\r\n"
			+ "Descrição da receita", example = " ")
	private String linha05;

	@ApiModelProperty(value = "Receita 6:\r\n"
			+ "Descrição da receita", example = " ")
	private String linha06;

	@ApiModelProperty(value = "Receita 7:\r\n"
			+ "Descrição da receita", example = " ")
	private String linha07;

	@ApiModelProperty(value = "Receita 8:\r\n"
			+ "Descrição da receita", example = " ")
	private String linha08;

	@ApiModelProperty(value = "Receita 9:\r\n"
			+ "Descrição da receita", example = " ")
	private String linha09;

	@ApiModelProperty(value = "Receita 10:\r\n"
			+ "Descrição da receita", example = " ")
	private String linha10;

	@ApiModelProperty(value = "Receita 11:\r\n"
			+ "Descrição da receita", example = " ")
	private String linha11;

	@ApiModelProperty(value = "Receita 12:\r\n"
			+ "Descrição da receita", example = " ")
	private String linha12;

	@ApiModelProperty(value = "Receita 13:\r\n"
			+ "Descrição da receita", example = " ")
	private String linha13;

	@ApiModelProperty(value = "Receita 14:\r\n"
			+ "Descrição da receita", example = " ")
	private String linha14;

	@ApiModelProperty(value = "Receita 15:\r\n"
			+ "Descrição da receita", example = " ")
	private String linha15;

	@ApiModelProperty(value = "Receita 16:\r\n"
			+ "Descrição da receita", example = " ")
	private String linha16;

	@ApiModelProperty(value = "Receita 17:\r\n"
			+ "Descrição da receita", example = " ")
	private String linha17;

	@ApiModelProperty(value = "Receita 18:\r\n"
			+ "Descrição da receita", example = " ")
	private String linha18;

	@ApiModelProperty(value = "Receita 19:\r\n"
			+ "Descrição da receita", example = " ")
	private String linha19;

	@ApiModelProperty(value = "Receita 20:\r\n"
			+ "Descrição da receita", example = " ")
	private String linha20;

	@ApiModelProperty(value = "Layout:\r\n"
			+ "Descrição do Layout\r\n"
			+ "Obs.: Campo não utilizado ", example = " ")
	private String layout;

	@ApiModelProperty(value = "Porção:\r\n"
			+ "Quantidade referente a porção\r\n"
			+ "Ex.: 30 ", example = "30")
	private Float porcao;

	@ApiModelProperty(value = "Tipo Porção:\r\n"
			+ "Unidade de medida referente a porção, podendo assumir os valores:\r\n"
			+ "0 – gr\r\n"
			+ "1 – mg\r\n"
			+ "2 – kg\r\n"
			+ "3 – ml\r\n"
			+ "4 – lt\r\n"
			+ "5 - kcal", example = "0")
	private int tipoPorcao;

	@ApiModelProperty(value = "Medida Caseira:\r\n"
			+ "Quantidade da porção referente a porção em medida caseira\r\n"
			+ "Ex.: 3 (unidades)", example = "3")
	private Integer medidaCaseira;

	@ApiModelProperty(value = "Decimal Medida Caseira:\r\n"
			+ "Parte decimal da medida caseira referente a porção, podendo assumir os valores:\r\n"
			+ "00 - 0\r\n"
			+ "01 - 1/4\r\n"
			+ "02 - 1/3\r\n"
			+ "03 - 1/2\r\n"
			+ "04 - 2/3\r\n"
			+ "05 - 3/4", example = "0")
	private int decimalMedidaCaseira;

	@ApiModelProperty(value = "Tipo Medida Caseira:\r\n"
			+ "Unidade de medida em medida caseira, referente a porção, podendo assumir os valores:\r\n"
			+ "00 - Colher(es) de Sopa\r\n"
			+ "01 - Colher(es) de Café\r\n"
			+ "02 - Colher(es) de Chá\r\n"
			+ "03 - Xícara(s)\r\n"
			+ "04 - De Xícara(s)\r\n"
			+ "05 - Unidade(s)\r\n"
			+ "06 - Pacote(s)\r\n"
			+ "07 - Fatia(s)\r\n"
			+ "08 - Fatia(s) fina(s)\r\n"
			+ "09 - Pedaço(s)\r\n"
			+ "10 - Folha(s)\r\n"
			+ "11 - Pão(ões)\r\n"
			+ "12 - Biscoito(s)\r\n"
			+ "13 - Bisnaguinha(s)\r\n"
			+ "14 - Disco(s)\r\n"
			+ "15 - Copo(s)\r\n"
			+ "16 - Porção(ões)\r\n"
			+ "17 - Tablete(s)\r\n"
			+ "18 - Sachê(s)\r\n"
			+ "19 - Almôndega(s)\r\n"
			+ "20 - Bife(s)\r\n"
			+ "21 - Filé(s)\r\n"
			+ "22 - Concha(s)\r\n"
			+ "23 - Bala(s)\r\n"
			+ "24 - Prato(s) Fundo(s)\r\n"
			+ "25 - Pitada(s)\r\n"
			+ "26 - Lata(s)Ex.: 5 (unidades) ", example = "0")
	private int tipoMedidaCaseira;

}
