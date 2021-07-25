package com.projeto.calcme.service;



import org.springframework.stereotype.Service;

import com.projeto.calcme.model.Cadastro;

@Service
public interface CadastroService {

		
	public abstract Cadastro create(Cadastro cadastro);
	
}
