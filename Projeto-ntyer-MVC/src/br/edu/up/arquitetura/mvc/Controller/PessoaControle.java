package br.edu.up.arquitetura.mvc.Controller;

import br.edu.up.arquitetura.mvc.Model.Dominio.Pessoa;
import br.edu.up.arquitetura.mvc.Model.Negocio.PessoaNegocio;

public class PessoaControle {
	private Pessoa pessoa;
	private String mensagem;
	private PessoaNegocio pessoaNegocio = new PessoaNegocio();
	
	public PessoaControle() {
		 
	}

	public String cadastrarPessoa(String nome, int idade)
	{
		pessoa = new Pessoa();
		pessoa.setNome(nome);
		pessoa.setIdade(idade);
		try {
			return pessoaNegocio.Cadastrar(pessoa);
			
		} catch (Exception e) {
			return "redireciona para a tela de erro com a seguinte mensagem "+
			e.getMessage();
		}		 
	}
	
	public String Listar(){
		return pessoaNegocio.ListarTodos();
	}

}
