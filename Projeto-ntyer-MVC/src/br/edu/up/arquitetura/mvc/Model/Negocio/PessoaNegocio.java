package br.edu.up.arquitetura.mvc.Model.Negocio;

import java.util.ArrayList;

import br.edu.up.arquitetura.mvc.Model.Dominio.Pessoa;
import br.edu.up.arquitetura.mvc.Model.Persistencia.PessoaPersistencia;

public class PessoaNegocio {
	
	private PessoaPersistencia persistencia = new PessoaPersistencia();
	String Mensagem;
	public PessoaNegocio() {
		 
	}

	public String Cadastrar(Pessoa pessoa) throws Exception
	{  
		if(validarPessoa(pessoa)){
			Mensagem = "Usuario cadastraro com matriocula n " +
			Integer.toString(persistencia.save(pessoa)) + "\n";
		}else{
			throw new Exception(Mensagem);
		}
		
		return Mensagem;
	}
	
	private boolean validarPessoa(Pessoa pessoa)
	{		 
		if(pessoa.getIdade() < 18){
			Mensagem = "não foi possível cadastrar";
		   return false;	
		}  
		return true;
	}	
	
	public String ListarTodos(){
		String retorno = "";
		ArrayList<Pessoa> pessoas = persistencia.FindAll();
		if(pessoas.size() == 0){ return "Nenhum usuário cadastrado"; }
		
		for(int i = 0; i < pessoas.size(); i++) {
            retorno += "\nNome: " + pessoas.get(i).getNome()+
            		  "\n" + "Idade:" + pessoas.get(i).getIdade() + "\n";
        }
		return retorno;
	}

}
