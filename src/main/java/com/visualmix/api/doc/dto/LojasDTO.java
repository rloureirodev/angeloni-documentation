package com.visualmix.api.doc.dto;

import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações dos Lojas" , value="Lojas")
@Data
@Builder
public class LojasDTO {
	
	@ApiModelProperty(value = "Código:\r\n"
			+ "Código que identifica a loja", example = " ")
	private Integer codigo;

	@ApiModelProperty(value = "Razão Social:\r\n"
			+ "Razão Social da loja", example = " ")
	private String razaoSocial;

	@ApiModelProperty(value = "Descrição:\r\n"
			+ "Descrição da loja", example = " ")
	private String descricao;

	@ApiModelProperty(value = "Endereço:\r\n"
			+ "Endereço", example = " ")
	private String endereco;

	@ApiModelProperty(value = "Número:\r\n"
			+ "Número", example = " ")
	private String numeroEndereco;

	@ApiModelProperty(value = "Complemento:\r\n"
			+ "Complemento do Endereço", example = " ")
	private String complemento;

	@ApiModelProperty(value = "Bairro:\r\n"
			+ "Bairro de localização da loja", example = " ")
	private String bairro;

	@ApiModelProperty(value = "Cidade:\r\n"
			+ "Cidade de localização da loja", example = " ")
	private String cidade;

	@ApiModelProperty(value = "Estado:\r\n"
			+ "Estado de localização da loja", example = " ")
	private String uf;

	@ApiModelProperty(value = "CEP:\r\n"
			+ "CEP", example = " ")
	private String cep;

	@ApiModelProperty(value = "CNPJ:\r\n"
			+ "CNPJ da loja", example = "11111111/1111-11")
	private String cnpj;

	@ApiModelProperty(value = "Inscrição Estadual:\r\n"
			+ "Inscrição estadual da loja", example = "1111111111")
	private String inscricaoEstadual;

	@ApiModelProperty(value = "Inscrição Municipal:\r\n"
			+ "Inscrição municipal da loja", example = "1111111111")
	private String inscricaoMunicipal;

	@ApiModelProperty(value = "DDD:\r\n"
			+ "Código do DDD", example = "11")
	private String ddd;

	@ApiModelProperty(value = "Telefone:\r\n"
			+ "Telefone da loja", example = "1234-1234")
	private String telefone;

	@ApiModelProperty(value = "Fax:\r\n"
			+ "Fax", example = "1234-1234")
	private String fax;

	@ApiModelProperty(value = "Data de Abertura:\r\n"
			+ "Data de abertura da loja", example = "dd/MM/yyyy HH:mm:ss")
	private LocalDateTime dataAbertura;

	@ApiModelProperty(value = "Tipo Balança:\r\n"
			+ "Tipo da balança existente na loja, podendo assumir os valores:\r\n"
			+ "10 - Filizola\r\n"
			+ "12 - Toledo\r\n"
			+ "13 - Dibal", example = "10")
	private Integer tipoBalanca;

	@ApiModelProperty(value = "Tipo Balança 2:\r\n"
			+ "Tipo da balança existente na loja (somente para casos de lojas com balanças diferentes), podendo assumir os valores:\r\n"
			+ "10 - Filizola\r\n"
			+ "12 - Toledo\r\n"
			+ "13 - Dibal", example = "10 ")
	private Integer tipoBalanca2;

	@ApiModelProperty(value = "Área:\r\n"
			+ "Metragem da loja", example = "12345")
	private Integer area;

	@ApiModelProperty(value = "Qtde. Funcionários:\r\n"
			+ "Quantidade de funcionários da loja", example = "12345")
	private Integer quantidadeFuncionarios;

	@ApiModelProperty(value = "Gerente:\r\n"
			+ "Nome do Gerente", example = "Nome do Gerente")
	private String gerente;

	@ApiModelProperty(value = "Situação:\r\n"
			+ "Situação da loja, podendo assumir os valores:\r\n"
			+ "0 - Inativa\r\n"
			+ "1 - Ativa", example = "1")
	private Integer situacao;

	@ApiModelProperty(value = "Tipo:\r\n"
			+ "Tipo da loja, podendo assumir os valores:\r\n"
			+ "0 - Escritório\r\n"
			+ "1 - Varejo\r\n"
			+ "2 - Atacado\r\n"
			+ "3 - Fábrica\r\n"
			+ "4 - CD\r\n"
			+ "5 - VAN", example = "0")
	private Integer tipoLoja;

	@ApiModelProperty(value = "CNAE:\r\n"
			+ "Código Nacional de Atividades Econômicas", example = "1")
	private String cnae;

	@ApiModelProperty(value = "CRT:\r\n"
			+ "Código de regime tributário, podendo assumir os valores:"
			+ "1 - Simples Nacional\r\n"
			+ "2 - Simples Nacional - Excesso de Sublimite de Receita Bruta\r\n"
			+ "3 - Regime Normal\r\n", example = "1")
	private Integer crt;

	@ApiModelProperty(value = "NFCE / SAT:\r\n"
			+ "Código indicativo se a loja possuir NFCE / SAT, podendo assumir os valores:\r\n"
			+ "0 - Não\r\n"
			+ "1 - Sim", example = "0")
	private Byte usaNfce;



	@ApiModelProperty(value = "CAE:\r\n"
			+ "Campo desativado, enviar zero", example = "0")
	private int cae;

	@ApiModelProperty(value = "ICMS Seção:\r\n"
			+ "Campo desativado, enviar zero", example = "0")
	private int icmsSecao;


}
