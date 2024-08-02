package com.visualmix.api.doc.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações dos Operadores Loja" , value="Operadores Loja")
@Data
@Builder
public class OperadoresLojasDTO {
	
	@ApiModelProperty(value = "Código:\r\n"
			+ "Código que identifica o operador", example = " ")
	@JsonIgnore
	private Float codigo;

	@ApiModelProperty(value = "Tipo:\r\n"
			+ "Código indicativo de loja ou grupo (sempre 1 – loja).", example = " ")
	private int tipo;

	@ApiModelProperty(value = "Loja:\r\n"
			+ "Código da loja na qual o operador tem acesso", example = " ")
	private Integer loja;


	@ApiModelProperty(value = "Tipo de Ação:\r\n"
			+ "Indica qual a ação a integração irá executar.\r\n"
			+ "0 – Inclusão / Alteração\r\n"
			+ "1 - Exclusão", example = " ")
	private int tipoAcao;


}
