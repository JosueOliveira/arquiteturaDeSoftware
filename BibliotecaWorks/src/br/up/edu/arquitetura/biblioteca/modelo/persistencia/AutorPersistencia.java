package br.up.edu.arquitetura.biblioteca.modelo.persistencia;

import java.util.ArrayList;

import br.up.edu.arquitetura.biblioteca.modelo.dominio.Autor;

public class AutorPersistencia {

	private static ArrayList <Autor> autores = new ArrayList<Autor>();
	
	public AutorPersistencia() {
		// TODO Auto-generated constructor stub
	}
	
	public void load() {
	   if(autores.size()==0) {    
	       insert(new Autor("Julio Verne", "França"));
	  	   insert(new Autor("J.R.R Tolkien", "Africa do sul"));
	 }	     
	}
	
	public Autor insert(Autor autor){
		
		autor.setId(autores.size());
		autores.add(autor);
		System.out.println("chegou autor persistencia" + autor.getNome() + autores.size());
		return autores.get(autor.getId()); 
	}
	
	public ArrayList<Autor> List(){
		return autores;
	}
	 
	public Autor find(int id)
	{
		return autores.get(id);
	}
	
	public Autor update(Autor autor)
	{ 
		Autor aux = autores.get(autor.getId());
		aux.setId(autor.getId());
		aux.setNacionalidade(autor.getNacionalidade());
		aux.setNome(autor.getNome());
		aux = autor;
		return aux;
	}
	
}
