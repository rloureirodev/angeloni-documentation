package com.visualmix.api.doc.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações do Fabricante" , value="Fabricante")
@Data
@Builder
public class FabricantesDTO {
	
	@ApiModelProperty(value = "Código:\r\n"
			+ "Código do fabricante.", example = "1")
	private Integer codigo;

	@ApiModelProperty(value = "Código de Integração:\r\n"
			+ "Código do fabricante na retaguarda.", example = "Texto")
	private String codigoIntegracao;

	@ApiModelProperty(value = "Razão Social:\r\n"
			+ "Nome da empresa do fornecedor.", example = "Razão Social")
	private String razaoSocial;

	@ApiModelProperty(value = "Nome Fantasia:\r\n"
			+ "Nome do nome fantasia do fornecedor.", example = "Nome Fantasia")
	private String nomeFantasia;

	@ApiModelProperty(value = "CNPJ / CPF:\r\n"
			+ "Número de CNPJ/CPF do fornecedor. ", example = "000.000.000.0000.00")
	private Float cgc;

	
}
