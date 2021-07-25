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

  user: Cadastro = new Cadastro
  service : CadastroService 
  cadastro: Cadastro;

  constructor(
    private alert: AlertasService
  ) { }

  ngOnInit(): void {
  }

enviar(){
  
    this.service.postCadastro(this.cadastro).subscribe((resp: Cadastro) => {
      this.cadastro = resp
      this.alert.showAlertSuccess('Usuário cadastrado com sucesso!')
    })
  
}


}
