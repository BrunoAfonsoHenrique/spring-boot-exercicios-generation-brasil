package com.exerciciospring.exercicios.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercicios/BSM")
public class ExerciciosController {
	
	@GetMapping
	public String exercicio1() {
		return "Atenção aos detalhes e persistência";
	}
	

}




