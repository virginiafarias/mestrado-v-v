package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("/home")
public class JenkinsController {
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("contato", new Contato());
		return "index";
	}
	
	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public String cadastrarContato(@RequestParam("nome") String nome, @RequestParam("email") String email, Model model) {
		Contato contato = new Contato(nome, email);
		Respository repository = new RepositoryImpl();
		repository.salvar(contato);
		model.addAttribute("contato", contato);
		return "index";
	}

}
