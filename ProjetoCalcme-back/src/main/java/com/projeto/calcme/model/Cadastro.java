package com.projeto.calcme.model;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="cadastros")
public class Cadastro {

	@Id
	private String id; 
	@Indexed(unique=true)
	@NotBlank(message="Campo obrigatório")
	private String nome; 
	
	@NotBlank(message="Campo obrigatório")
	@Indexed(unique=true)

	private String telefone;
	
	@Indexed(unique=true)
	@NotBlank(message="Campo obrigatório")
	private String email;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	} 
	
	

}
