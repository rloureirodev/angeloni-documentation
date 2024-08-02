package com.visualmix.api.doc.controller;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.visualmix.api.doc.dto.EmbalagemLojaDTO;
import com.visualmix.api.doc.dto.FabricantesDTO;
import com.visualmix.api.doc.dto.FornecedoresGetResponse;
import com.visualmix.api.doc.dto.KitCapaDTO;
import com.visualmix.api.doc.dto.LojasDTO;
import com.visualmix.api.doc.dto.MercadologicosDTO;
import com.visualmix.api.doc.dto.PaginacaoDTO;
import com.visualmix.api.doc.dto.ProdutoDTO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "Lojas", description = "Consulta de Lojas.")
@RequestMapping("/cadastro")
@RestController
public class LojasController {

	@ApiOperation(value = "Obter Lojas", notes = "Retorna todos as Lojas")
	@GetMapping("/lojas")
	public PaginacaoDTO<LojasDTO> get(
			HttpServletRequest request, 
			@ApiParam(value = "ID do usuário", required = true) 
			@RequestParam(value = "pagina", required = true) Integer pagina, 
			@RequestParam(value = "registrosPagina", required = false) Integer registrosPagina, 
			@RequestParam(value = "dataAlteracao", required = false) LocalDateTime dataAlteracao) {
			
		return new PaginacaoDTO<LojasDTO>();
	}
	
}
