package com.visualmix.api.doc.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel(description = "Informações do usuário")
@Data
@Builder
public class ImpostoLojasDTO {
	
	@ApiModelProperty(value = " ", example = " ")
	private double produtoId;

	@ApiModelProperty(value = " ", example = " ")
	private int sequencia;

	@ApiModelProperty(value = " ", example = " ")
	private int loja;
	
	///////////////copia da embalagem loja abaixo//
	
	@ApiModelProperty(value = " ", example = " ")
	private String tipoAliquota;

	@ApiModelProperty(value = " ", example = " ")
	private Float percImposto;

	@ApiModelProperty(value = " ", example = " ")
	private String situacaoTributaria;

	@ApiModelProperty(value = " ", example = " ")
	private Float ipi;

	@ApiModelProperty(value = " ", example = " ")
	private double impostoTotal;

	@ApiModelProperty(value = " ", example = " ")
	private int cfopCfe;
	
	@ApiModelProperty(value = " ", example = " ")
	private double impostoMunicipal;

	@ApiModelProperty(value = " ", example = " ")
	private double impostoEstadual;

	@ApiModelProperty(value = " ", example = " ")
	private double impostoFederal;
	
	@ApiModelProperty(value = " ", example = " ")
	private double percArrec;
	
	@ApiModelProperty(value = " ", example = " ")
	private String codBenFis;
	
	@ApiModelProperty(value = " ", example = " ")
	private double aliquotaReducao;
	
	@ApiModelProperty(value = " ", example = " ")
	private double percReducaoBase;
	
	@ApiModelProperty(value = " ", example = " ")
	private double picmsEfet;
	
	@ApiModelProperty(value = " ", example = " ")
	private int motDescIcms;
	
	@ApiModelProperty(value = " ", example = " ")
	private double adremicmsret;



}
