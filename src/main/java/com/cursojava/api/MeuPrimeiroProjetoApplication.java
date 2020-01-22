package com.cursojava.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cursojava.api.utils.SenhaUtils;

@SpringBootApplication
public class MeuPrimeiroProjetoApplication {

	@Value("${paginacao.qtd_por_pagina}")
	private int qtdPorPagina;
	
	public static void main(String[] args) {
		SpringApplication.run(MeuPrimeiroProjetoApplication.class, args);
		//System.out.println("Meu primeiro projeto");
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			
			/*Criptografia
			 * String senhaEncoded = SenhaUtils.geraBCrypt("teste");
			System.out.println("Senha encoded: " + senhaEncoded);
			
			senhaEncoded = SenhaUtils.geraBCrypt("teste");
			System.out.println("Senha encoded novamente: "+senhaEncoded);
			
			System.out.println("Senha válida: " + SenhaUtils.senhaValida("teste", senhaEncoded));*/
			
		};
	}
	
}

