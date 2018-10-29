package br.up.edu.arquitetura.biblioteca.modelo.persistencia;

import java.util.ArrayList;

import br.up.edu.arquitetura.biblioteca.modelo.dominio.Autor;
import br.up.edu.arquitetura.biblioteca.modelo.dominio.Mutuario;

public class MutuarioPersistencia {

	private static ArrayList <Mutuario> mutuarios = new ArrayList<Mutuario>();
	
	public MutuarioPersistencia() {
		// TODO Auto-generated constructor stub
	}
	
	public Mutuario insert(Mutuario mutuario){
		
		mutuario.setId(mutuarios.size());
		mutuarios.add(mutuario);
		System.out.println("chegou mutuario persistencia" + mutuario.getNome() + mutuarios.size());
		return mutuarios.get(mutuario.getId()); 
	}
	
	public ArrayList<Mutuario> List(){
		return mutuarios;
	}
	 
	public Mutuario find(int id)
	{
		return mutuarios.get(id);
	}
	
	public Mutuario update(Mutuario mutuario)
	{ 
		Mutuario aux = mutuarios.get(mutuario.getId());
		aux.setId(mutuario.getId());
		aux.setNome(mutuario.getNome());
		aux.setEndereco(mutuario.getEndereco());
		aux.setTelefone(mutuario.getTelefone());
		aux = mutuario;
		return aux;
	}
	
	public void load() {
	 if(mutuarios.size()==0) {    
	      insert(new Mutuario("Renato Vieria", "Rua da Margura", "99986-0005"));
		  insert(new Mutuario("Juliana Roots", "Rua da paz", "8888-8852"));
	 }	     
	}
}
