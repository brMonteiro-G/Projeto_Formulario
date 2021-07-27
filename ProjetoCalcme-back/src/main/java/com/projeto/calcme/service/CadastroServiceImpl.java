package com.projeto.calcme.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.calcme.model.Cadastro;
import com.projeto.calcme.repository.CadastroRepository;

import Exceptions.CadastroException;

@Service
public class CadastroServiceImpl implements CadastroService {
	
	@Autowired
	private CadastroRepository cadastroRepository; 


	@Override
	public Cadastro create(Cadastro cadastro) {
		
		try{
		return this.cadastroRepository.save(cadastro);
		}catch(Exception e) {
			throw new CadastroException("Cadastro inválido --> " 
					+ e.getMessage());
		}
		
		
	}
	
	


}
