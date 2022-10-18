package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Decorator para informar que a classe responde à requisição
@RequestMapping("/api/Saudacao")
public class SaudacaoController {
	// Vamos criar uma API que responde pela requisição
	
	@GetMapping	
	public String bomDia() {
		return "Tenha um bom dia!";
	}
	
	@GetMapping("/{nome}")
	public String bomDiaNome(@PathVariable String nome) {
		return "Tenha um bom dia, " + nome + "!";
	}
}
