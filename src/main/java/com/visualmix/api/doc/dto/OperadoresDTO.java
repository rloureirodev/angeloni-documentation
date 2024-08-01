package com.visualmix.api.doc.dto;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações dos Operadores" , value="Operadores")
@Data
@Builder
public class OperadoresDTO {
	
	@ApiModelProperty(value = "Código:\r\n"
			+ "Código que identifica o operador na retaguarda", example = " ")
	private Float codigo;

	@ApiModelProperty(value = "Nome:\r\n"
			+ "Nome do operador", example = " ")
	private String nome;

	@ApiModelProperty(value = "Senha:\r\n"
			+ "Senha sem criptografia (não obrigatório)", example = " ")
	private String senha;

	@ApiModelProperty(value = "Login:\r\n"
			+ "Login que será usado no Visual Store", example = " ")
	private String login;

	@ApiModelProperty(value = "Senha MD5:\r\n"
			+ "Senha com criptografia", example = " ")
	private String senhaMd5;

	@ApiModelProperty(value = "Identificação:\r\n"
			+ "Login que será usado no PDV", example = " ")
	private Float identificacao;

	@ApiModelProperty(value = "Nível:\r\n"
			+ "0 – Nenhum\r\n"
			+ "1 – Operador\r\n"
			+ "2 – Fiscal\r\n"
			+ "3 - Gerente\r\n"
			+ "Obs: Valores sugeridos como exemplo", example = "0")
	private int nivel;

	@ApiModelProperty(value = "Vendedor:\r\n"
			+ "Indicativo de o operador é usuário ou não, podendo assumir os valores:\r\n"
			+ "0 – Não\r\n"
			+ "1 – sim", example = "0")
	private int vendedor;

	@ApiModelProperty(value = "Comissão:\r\n"
			+ "Percentual de comissão para os vendedores", example = " ")
	private double comissao;

	@ApiModelProperty(value = "Código de Integração:\r\n"
			+ "Código de integração do operador (caso alfanumérico)", example = " ")
	private String codigoIntegracao;

	@ApiModelProperty(value = "Loja:\r\n"
			+ "Número da loja.", example = " ")
	private Integer loja;

	@ApiModelProperty(value = "Situação:\r\n"
			+ "Campo para verificar se o Operador esta ativo ou não.", example = " ")
	private int situacao;

	@ApiModelProperty(value = "Tipo de Operador:\r\n"
			+ "Tipo do operador, podendo assumir os valores:\r\n"
			+ "0 - Normal\r\n"
			+ "1 - Apoio\r\n"
			+ "2 - M & D", example = "0")
	private Float tipoOperador;
	
	@ApiModelProperty(value = "CPF:\r\n"
			+ "Numero do CPF do Operador.", example = " ")
	private Float cpf;

	
	private List<OperadoresLojasDTO> operadoresLoja ;
	
	private List<OperadoresPerfilDTO> operadoresPerfil ;
}
