package com.visualmix.api.doc.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações dos Kit Lojas" , value="Kit Lojas")
@Data
@Builder
public class KitLojasDTO {
	
	@ApiModelProperty(value = "Código:\r\n"
			+ "Código do Produto Pai do Kit.", example = " ")
	@JsonIgnore
	private Integer codigo;

	@ApiModelProperty(value = "Loja:\r\n"
			+ "Loja que poderá vender o Kit.", example = " ")
	private Integer loja;

	@ApiModelProperty(value = "Loja Capa:\r\n"
			+ "Número da Loja de cadastro do kit", example = " ")
	private Integer lojaCapa;
}
