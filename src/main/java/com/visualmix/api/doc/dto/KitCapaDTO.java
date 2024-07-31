package com.visualmix.api.doc.dto;

import java.time.LocalDateTime;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações do usuário")
@Data
@Builder
public class KitCapaDTO {
	
	@ApiModelProperty(value = " ", example = " ")
	private Integer loja;

	@ApiModelProperty(value = " ", example = " ")
	private Float codigo;

	@ApiModelProperty(value = " ", example = " ")
	private String descricao;

	@ApiModelProperty(value = " ", example = " ")
	private LocalDateTime dataAlteracao;
	
	@ApiModelProperty(value = " ", example = " ")
	private List<KitItensDTO> kitItens ;
	
	@ApiModelProperty(value = " ", example = " ")
	private List<KitLojasDTO> kitLojas ;

}
