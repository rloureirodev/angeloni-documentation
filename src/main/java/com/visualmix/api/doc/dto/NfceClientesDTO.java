package com.visualmix.api.doc.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações do usuário")
@Data
@Builder
public class NfceClientesDTO {
	
	@ApiModelProperty(value = " ", example = " ")
	private Float cpf;

	@ApiModelProperty(value = " ", example = " ")
	private Integer codigoCliente;

	@ApiModelProperty(value = " ", example = " ")
	private Integer tipoCliente;

	@ApiModelProperty(value = " ", example = " ")
	private String nome;

	@ApiModelProperty(value = " ", example = " ")
	private String endereco;

	@ApiModelProperty(value = " ", example = " ")
	private Integer numero;

	@ApiModelProperty(value = " ", example = " ")
	private String complemento;

	@ApiModelProperty(value = " ", example = " ")
	private String bairro;

	@ApiModelProperty(value = " ", example = " ")
	private Float codigoIbge;

	@ApiModelProperty(value = " ", example = " ")
	private String cidade;

	@ApiModelProperty(value = " ", example = " ")
	private String estado;

	@ApiModelProperty(value = " ", example = " ")
	private String cep;

	@ApiModelProperty(value = " ", example = " ")
	private Integer codigoPais;

	@ApiModelProperty(value = " ", example = " ")
	private String pais;

	@ApiModelProperty(value = " ", example = " ")
	private String dddTelefone;

	@ApiModelProperty(value = " ", example = " ")
	private String telefone;

	@ApiModelProperty(value = " ", example = " ")
	private String inscricaoMunicipal;

	@ApiModelProperty(value = " ", example = " ")
	private String inscricaoEstadual;

	@ApiModelProperty(value = " ", example = " ")
	private String inscricaoSuframa;

	@ApiModelProperty(value = " ", example = " ")
	private String email;

}
