import { Component, OnInit } from '@angular/core';
import { Cadastro } from '../model/Cadastro';
import { AlertasService } from '../service/alertasService';
import { CadastroService } from '../service/cadastro.service';


@Component({
  selector: 'app-cadastro',
  templateUrl: './cadastro.component.html',
  styleUrls: ['./cadastro.component.css']
})
export class CadastroComponent implements OnInit {

  cadastro: Cadastro = new Cadastro
 


  constructor(private alert: AlertasService,
    private cadastroService: CadastroService) {}

  ngOnInit(){}
  

enviar(){

  let email: boolean = true 

  if(this.cadastro.email == null || this.cadastro.telefone == null || this.cadastro.nome ==null ){
    this.alert.showAlertDanger("Todos os campos são obrigatórios")
  }
  if (this.cadastro.email.indexOf('@')  == -1 || this.cadastro.email.indexOf('.com') == -1 ){
    email = false 
    this.alert.showAlertDanger('Email inválido! Formato: name@example.com') 
    if(this.cadastro.telefone.length < 8 || this.cadastro.telefone.length > 10  ){
      this.alert.showAlertDanger("Número de telefone inválido")
    }
  }
  else {
        this.cadastroService.postCadastro(this.cadastro).subscribe((resp: Cadastro) => {
        this.cadastro = resp
        this.alert.showAlertSuccess('Usuário cadastrado com sucesso!')}) 
    }

       
}
}
