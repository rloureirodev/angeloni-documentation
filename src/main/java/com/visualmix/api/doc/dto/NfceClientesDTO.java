package com.visualmix.api.doc.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações do Nfce Cliente" , value="Nfce Cliente")
@Data
@Builder
public class NfceClientesDTO {
	
	@ApiModelProperty(value = "CPF:\r\n"
			+ "CPF ou CNPJ do Cliente", example = " ")
	private Float cpf;

	@ApiModelProperty(value = "Código do Cliente:\r\n"
			+ "Código do Cliente", example = " ")
	private Integer codigoCliente;

	@ApiModelProperty(value = "Tipo do Cliente:\r\n"
			+ "Indicativo do tipo de Cliente, podendo assumir os valores:\r\n"
			+ "0 – CPF\r\n"
			+ "1 – CNPJ\r\n"
			+ "2 – Estrangeiro", example = "0")
	private Integer tipoCliente;

	@ApiModelProperty(value = "Nome:\r\n"
			+ "Nome do Cliente", example = " ")
	private String nome;

	@ApiModelProperty(value = "Endereço:\r\n"
			+ "Endereço do Cliente", example = " ")
	private String endereco;

	@ApiModelProperty(value = "Número:\r\n"
			+ "Número do endereço do cliente", example = " ")
	private Integer numero;

	@ApiModelProperty(value = "Complemento:\r\n"
			+ "Complemento do endereço", example = " ")
	private String complemento;

	@ApiModelProperty(value = "Bairro:\r\n"
			+ "Bairro", example = " ")
	private String bairro;

	@ApiModelProperty(value = "Código IBGE:\r\n"
			+ "Código da cidade no IBGE", example = " ")
	private Float codigoIbge;

	@ApiModelProperty(value = "Cidade:\r\n"
			+ "Cidade", example = " ")
	private String cidade;

	@ApiModelProperty(value = "Estado:\r\n"
			+ "Estado", example = " ")
	private String estado;

	@ApiModelProperty(value = "CEP:\r\n"
			+ "CEP", example = " ")
	private String cep;

	@ApiModelProperty(value = "Código do País:\r\n"
			+ "Código do País para NFCE", example = " ")
	private Integer codigoPais;

	@ApiModelProperty(value = "País", example = " ")
	private String pais;

	@ApiModelProperty(value = "DDD Telefone:\r\n"
			+ "DDD do telefone de cadastro do cliente", example = " ")
	private String dddTelefone;

	@ApiModelProperty(value = "Telefone:\r\n"
			+ "Telefone de cadastro do cliente", example = " ")
	private String telefone;

	@ApiModelProperty(value = "Inscrição Municipal:\r\n"
			+ "Inscrição Municipal do Cliente", example = " ")
	private String inscricaoMunicipal;

	@ApiModelProperty(value = "Inscrição Estadual:\r\n"
			+ "Inscrição Estadual do Cliente", example = " ")
	private String inscricaoEstadual;

	@ApiModelProperty(value = "Inscrição SUFRAMA:\r\n"
			+ "Inscrição SUFRAMA do Cliente", example = " ")
	private String inscricaoSuframa;

	@ApiModelProperty(value = "eMail:\r\n"
			+ "eMail de cadastro do Cliente", example = " ")
	private String email;

}
