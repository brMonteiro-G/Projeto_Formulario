import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Cadastro } from '../model/Cadastro';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CadastroService {

  constructor(private http: HttpClient) { }

  postCadastro(cadastro : Cadastro):Observable<Cadastro>{
    return this.http.post<Cadastro>("http://localhost:8080/cadastro",cadastro)
  }

}
