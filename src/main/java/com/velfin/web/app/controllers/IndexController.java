package com.velfin.web.app.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.velfin.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {

	@GetMapping({ "/index", "/", "home", "" })
	public String index(Model model) {
		model.addAttribute("titulo", "Spring boot");
		return "index";
	}
	
	@GetMapping({ "/perfil"})
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Velfin");
		usuario.setApellido("Velasquez");
		
		model.addAttribute("nombre", usuario.getNombre());
		model.addAttribute("apellido", usuario.getApellido());
		model.addAttribute("titulo","Perfil");
		return "perfil";
	}
}
