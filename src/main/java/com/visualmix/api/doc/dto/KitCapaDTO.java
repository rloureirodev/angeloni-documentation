package com.visualmix.api.doc.dto;

import java.time.LocalDateTime;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações dos Kit Capa" , value = "Kit Capa")
@Data
@Builder
public class KitCapaDTO {
	
	@ApiModelProperty(value = " Loja:\r\n"
			+ "Número da Loja de cadastro do kit", example = " ")
	private Integer loja;

	@ApiModelProperty(value = " Código do Kit:\r\n"
			+ "Código do Produto Pai da capa do Kit.", example = " ")
	private Float codigo;

	@ApiModelProperty(value = "Descrição do Kit:\r\n"
			+ "Descrição do Produto Pai da capa do Kit. ", example = " ")
	private String descricao;

	@ApiModelProperty(value = "Data de alteração:\r\n"
			+ "Data de Alteração do kit", example = "dd/MM/yyyy HH:mm:ss")
	private LocalDateTime dataAlteracao;
	
	@ApiModelProperty(value = " ", example = " ")
	private List<KitItensDTO> kitItens ;
	
	@ApiModelProperty(value = " ", example = " ")
	private List<KitLojasDTO> kitLojas ;

}
