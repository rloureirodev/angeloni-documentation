package com.visualmix.api.doc.dto;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações do usuário")
@Data
@Builder
public class OperadoresDTO {
	
	@ApiModelProperty(value = " ", example = " ")
	private Float codigo;

	@ApiModelProperty(value = " ", example = " ")
	private String nome;

	@ApiModelProperty(value = " ", example = " ")
	private String senha;

	@ApiModelProperty(value = " ", example = " ")
	private String login;

	@ApiModelProperty(value = " ", example = " ")
	private String senhaMd5;

	@ApiModelProperty(value = " ", example = " ")
	private Float identificacao;

	@ApiModelProperty(value = " ", example = " ")
	private int nivel;

	@ApiModelProperty(value = " ", example = " ")
	private int vendedor;

	@ApiModelProperty(value = " ", example = " ")
	private double comissao;

	@ApiModelProperty(value = " ", example = " ")
	private String codigoIntegracao;

	@ApiModelProperty(value = " ", example = " ")
	private Integer loja;

	@ApiModelProperty(value = " ", example = " ")
	private int situacao;

	@ApiModelProperty(value = " ", example = " ")
	private Float tipoOperador;
	
	@ApiModelProperty(value = " ", example = " ")
	private Float cpf;

	@ApiModelProperty(value = " ", example = " ")
	private List<OperadoresLojasDTO> operadoresLoja ;
	
	@ApiModelProperty(value = " ", example = " ")
	private List<OperadoresPerfilDTO> operadoresPerfil ;
}
