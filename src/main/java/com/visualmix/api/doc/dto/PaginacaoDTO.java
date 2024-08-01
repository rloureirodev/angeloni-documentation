package com.visualmix.api.doc.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
//@ApiModel(description = "Informações da Paginacao" , value="Paginacao")
@Schema(hidden = true)
public class PaginacaoDTO<T> {
	
	
  private static final long serialVersionUID = 1L;
  private Integer pagina;
  private Integer registrosPagina;
  private LocalDateTime dataAlteracao;

  private List<T> dados;
  
  
}

