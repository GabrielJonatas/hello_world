package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World!!";
	}
	
	@GetMapping("/bsms-generation")
	public String[] bsmGeneration() {
		String[] bsms = {
		"Orientação ao futuro", "Responsabilidade pessoal", 
		"Mentalidade de crescimento", "Persistência",
		"Trabalho em equipe", "Atenção aos detalhes", 
		"Proatividade", "Comunicação"
		};
		
		return bsms;
	}
	
	@GetMapping("/objetivos-aprendizagem")
	public String[] objetivosAprendizagem() {
		String[] objetivosAprendizagem = {
		"Revisar MySQL", "Aprofundar os conhecimentos em Spring Boot",
		"Finalizar a task extra do projeto final do bloco 1 e publicar o projeto no Linkedin"
		};
		
		return objetivosAprendizagem;
	}
	
}
