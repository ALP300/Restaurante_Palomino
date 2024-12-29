package com.fia.sem3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping("/")
	public String hola(Model model) {
		model.addAttribute("titulo", "CSS");
		model.addAttribute("mensaje", "Hola a todos hoy vamos a usar estilos y @Value en mensajeria");
		return "index";
	}

}
