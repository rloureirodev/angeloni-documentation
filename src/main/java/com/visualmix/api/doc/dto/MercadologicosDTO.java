package com.visualmix.api.doc.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações dos Mercadologicos" , value="Mercadologicos")
@Data
@Builder
public class MercadologicosDTO {
	
	@ApiModelProperty(value = "Código do Departamento:\r\n"
			+ "Deverá conter um valor que identifica como único o departamento na base de dados.", example = "1")
	private int codigoDepartamento;

	@ApiModelProperty(value = "Código da Seção:\r\n"
			+ "Deverá conter um valor que identifica como única a seção na base de dados.\r\n"
			+ "Essa seção será associada ao departamento informado no campo Código do Departamento (registro de nível 1).", example = "1")
	private int codigoSecao;

	@ApiModelProperty(value = "Código da Linha:\r\n"
			+ "Deverá conter um valor que identifica como única a linha na base de dados.\r\n"
			+ "Essa linha será associada à seção indicada no campo Código da Seção e ao departamento indicado no campo Código do Departamento (registro de nível 2).", example = "1")
	private int codigoLinha;

	@ApiModelProperty(value = "Código da Sub-Linha:\r\n"
			+ "Deverá conter um valor que identifica como única a sub-linha na base de dados.\r\n"
			+ "Essa linha será associada à sub-linha indicada no campo Código da Linha, a seção indicada no campo Código da Seção e ao departamento indicado no campo Código do Departamento (registro de nível 3).", example = "1")
	private int codigoSubLinha;

	@ApiModelProperty(value = "Código da Sub-Sub-Linha:\r\n"
			+ "Deverá conter um valor que identifica como única a sub-sub-linha na base de dados.\r\n"
			+ "Essa sub-sub-linha será associada à sub-linha indicada no campo Código da Sub-Linha à linha indicada no campo Código da Linha, à seção indicada no campo Código da Seção e ao departamento indicado no campo Código do Departamento (registro de nível 4).", example = "1")
	private int codigoSubSubLinha;

	@ApiModelProperty(value = "Descrição:\r\n"
			+ "Descrição do nível Mercadológico.", example = "Descrição Mercadológico.")
	private String descricao;

	@ApiModelProperty(value = "Nível:\r\n"
			+ "Nível do Mercadológico", example = "1")
	private int nivel;

	
}
