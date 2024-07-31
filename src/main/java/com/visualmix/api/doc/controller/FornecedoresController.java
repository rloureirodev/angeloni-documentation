package com.visualmix.api.doc.controller;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.visualmix.api.doc.dto.FornecedoresGetResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "Fornecedores", description = "Consulta de fornecedores.")
@RequestMapping("/cadastro")
@RestController
public class FornecedoresController {

	@ApiOperation(value = "Obter um usuário por ID", notes = "Retorna um usuário específico baseado no ID")
//	@ApiResponses(value = {
//		    new ApiResponse(code = 201, message = "Usuário criado com sucesso"),
//		    new ApiResponse(code = 400, message = "Requisição inválida")
//		})
	@GetMapping("/fornecedores")
	public FornecedoresGetResponse get(
			HttpServletRequest request, 
			@ApiParam(value = "ID do usuário", required = true) @RequestParam(value = "pagina", required = false) Integer pagina, 
			@RequestParam(value = "registrosPagina", required = false) Integer registrosPagina, 
			@RequestParam(value = "dataAlteracao", required = false) LocalDateTime dataAlteracao) {
		
		return FornecedoresGetResponse.builder().nome("Fornecedor").nomeFantasia("fantasia").numero(10).build();
	}
	
}
