package com.algaworks.springmongo.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Funcionario {

	@Id
	private String codigo;

	private String nome;

	private Integer idade;

	private BigDecimal salario;

	@DBRef
	private Funcionario chefe;
}
