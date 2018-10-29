package br.up.edu.arquitetura.biblioteca.modelo.negocio;

import java.util.ArrayList;

import br.up.edu.arquitetura.biblioteca.modelo.dominio.Autor; 
import br.up.edu.arquitetura.biblioteca.modelo.persistencia.AutorPersistencia;
 

public class AutorNegocio {

	private AutorPersistencia persit = new AutorPersistencia();
	
	 public ArrayList<Autor> listarTodos(){
		return persit.List();
	 }
	  
	 public void Load() {
		 persit.load();
	 }

	 public Autor cadastra(Autor autor){
		 return persit.insert(autor);
	 }
	 
	 public Autor findByKey(int id) {
		 return persit.find(id);
	 }
	 
	 public Autor Atualizar(Autor autor) {
		 return persit.update(autor);
	 }

}
