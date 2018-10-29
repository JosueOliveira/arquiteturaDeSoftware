package br.edu.up.arquitetura.mvc.Model.Persistencia;

import java.util.ArrayList;

import br.edu.up.arquitetura.mvc.Model.Dominio.Pessoa;

public class PessoaPersistencia {
	
private static  ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public int save(Pessoa p){
		 
			pessoas.add(p);
			 return pessoas.size();			 
	} 
	
	public ArrayList<Pessoa> FindAll()
	{		 
		return pessoas;
	}

}
