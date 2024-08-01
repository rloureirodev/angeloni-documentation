package com.visualmix.api.doc.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações dos Pack Virtual Lojas" , value="Pack Virtual Lojas")
@Data
@Builder
public class PackVirtualLojasDTO {
	
	@ApiModelProperty(value = "Código Casadinha:\r\n"
			+ "Código da Casadinha.", example = "1")
	@JsonIgnore
	private Integer codigoCasadinha;

	@ApiModelProperty(value = "Tipo:\r\n"
			+ "Código indicativo de loja ou grupo (sempre 1 – loja).", example = "1")
	private int tipo;

	@ApiModelProperty(value = "Código:\r\n"
			+ "Código da loja ou grupo que a promoção estará ativa", example = "1")
	private Integer codigoLoja;
}
