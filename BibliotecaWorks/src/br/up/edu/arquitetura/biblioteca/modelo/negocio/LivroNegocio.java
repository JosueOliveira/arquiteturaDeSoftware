package br.up.edu.arquitetura.biblioteca.modelo.negocio;

import java.util.ArrayList;

 
import br.up.edu.arquitetura.biblioteca.modelo.dominio.Livro;
import br.up.edu.arquitetura.biblioteca.modelo.persistencia.LivroPersistencia;

public class LivroNegocio {

	private LivroPersistencia persit = new LivroPersistencia();
	private AutorNegocio an = new AutorNegocio();
	
	 public ArrayList<Livro> listarTodos(){
		return persit.List();
	 }

	 public Livro cadastra(Livro livro){
		 livro.setAutor(an.findByKey(livro.getAutor().getId()));
		 return persit.insert(livro);
	 }
	 
	 public Livro findByKey(int id) {
		 return persit.find(id);
	 }
	 
	 public Livro Atualizar(Livro livro) {
		 livro.setAutor(an.findByKey(livro.getAutor().getId()));
		 return persit.update(livro);
	 }
	 
	 public void Load() {
		 persit.load();
	 }
}
