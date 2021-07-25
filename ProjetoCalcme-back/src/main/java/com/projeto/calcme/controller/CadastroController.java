package com.projeto.calcme.controller;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.calcme.model.Cadastro;
import com.projeto.calcme.repository.CadastroRepository;
import com.projeto.calcme.service.CadastroServiceImpl;

@RestController
@RequestMapping("/cadastro")
@CrossOrigin("*")
public class CadastroController {

	//@Autowired
	//private CadastroRepository cadastroRepository; 
	
	@Autowired
	private CadastroServiceImpl cadastroServiceImpl; 
	
	
	@PostMapping
	public Cadastro postCadastro(@RequestBody @Valid Cadastro cadastro){
		return this.cadastroServiceImpl.create(cadastro);
	}
	
}
