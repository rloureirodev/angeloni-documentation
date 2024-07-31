package com.visualmix.api.doc.dto;

import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações do usuário")
@Data
@Builder
public class LojasDTO {
	
	@ApiModelProperty(value = " ", example = " ")
	private Integer codigo;

	@ApiModelProperty(value = " ", example = " ")
	private String razaoSocial;

	@ApiModelProperty(value = " ", example = " ")
	private String descricao;

	@ApiModelProperty(value = " ", example = " ")
	private String endereco;

	@ApiModelProperty(value = " ", example = " ")
	private String numeroEndereco;

	@ApiModelProperty(value = " ", example = " ")
	private String complemento;

	@ApiModelProperty(value = " ", example = " ")
	private String bairro;

	@ApiModelProperty(value = " ", example = " ")
	private String cidade;

	@ApiModelProperty(value = " ", example = " ")
	private String uf;

	@ApiModelProperty(value = " ", example = " ")
	private String cep;

	@ApiModelProperty(value = " ", example = " ")
	private String cnpj;

	@ApiModelProperty(value = " ", example = " ")
	private String inscricaoEstadual;

	@ApiModelProperty(value = " ", example = " ")
	private String inscricaoMunicipal;

	@ApiModelProperty(value = " ", example = " ")
	private String ddd;

	@ApiModelProperty(value = " ", example = " ")
	private String telefone;

	@ApiModelProperty(value = " ", example = " ")
	private String fax;

	@ApiModelProperty(value = " ", example = " ")
	private LocalDateTime dataAbertura;

	@ApiModelProperty(value = " ", example = " ")
	private Integer tipoBalanca;

	@ApiModelProperty(value = " ", example = " ")
	private Integer tipoBalanca2;

	@ApiModelProperty(value = " ", example = " ")
	private Integer area;

	@ApiModelProperty(value = " ", example = " ")
	private Integer quantidadeFuncionarios;

	@ApiModelProperty(value = " ", example = " ")
	private String gerente;

	@ApiModelProperty(value = " ", example = " ")
	private Integer situacao;

	@ApiModelProperty(value = " ", example = " ")
	private Integer tipoLoja;

	@ApiModelProperty(value = " ", example = " ")
	private String cnae;

	@ApiModelProperty(value = " ", example = " ")
	private Integer crt;

	@ApiModelProperty(value = " ", example = " ")
	private Byte usaNfce;

	@ApiModelProperty(value = " ", example = " ")
	private String codigoIntegracao;

	@ApiModelProperty(value = " ", example = " ")
	private int cae;

	@ApiModelProperty(value = " ", example = " ")
	private int icmsSecao;


}
