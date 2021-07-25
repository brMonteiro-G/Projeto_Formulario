package com.projeto.calcme.repository;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.projeto.calcme.model.Cadastro;

@Repository
public interface CadastroRepository extends MongoRepository<Cadastro, String> {


	
}
