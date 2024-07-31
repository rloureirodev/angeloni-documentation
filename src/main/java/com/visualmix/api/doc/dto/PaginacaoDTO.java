package com.visualmix.api.doc.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaginacaoDTO<T> {
	
	
  private static final long serialVersionUID = 1L;
  private Integer pagina;
  private Integer registrosPagina;
  private LocalDateTime dataAlteracao;

  private List<T> dados;
  
  
}

