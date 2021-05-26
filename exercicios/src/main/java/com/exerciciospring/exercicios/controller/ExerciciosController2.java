package com.exerciciospring.exercicios.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercicios")
public class ExerciciosController2 {

	@GetMapping
	public String exercicio2() {
		return "Me tornar ninja do Spring";
	}
}
