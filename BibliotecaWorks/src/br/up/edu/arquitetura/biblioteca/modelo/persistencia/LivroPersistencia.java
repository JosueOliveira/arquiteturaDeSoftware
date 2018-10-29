package br.up.edu.arquitetura.biblioteca.modelo.persistencia;

import java.util.ArrayList;

 
import br.up.edu.arquitetura.biblioteca.modelo.dominio.Livro;
import br.up.edu.arquitetura.biblioteca.modelo.negocio.AutorNegocio; 
import br.up.edu.arquitetura.biblioteca.modelo.dominio.Autor;

public class LivroPersistencia { 

	private static ArrayList <Livro> livros = new ArrayList<Livro>();
	private AutorNegocio an = new AutorNegocio();
	
	public LivroPersistencia() {
		// TODO Auto-generated constructor stub
	}
	
	 public void load() {
		 if(livros.size() == 0) {
         an.Load();
         Autor a1 = an.findByKey(0);	
         Autor a2 = an.findByKey(1);
         insert(new Livro("Viagem ao Centro da Terra", 200, "A história de jovens que viajam ao centro da terra.", a1));
         insert(new Livro("A Volta ao Mundo em 80 dias", 320, "Uma competiçao ao redor do mundo", a1));
         insert(new Livro("O Hobbit", 295, "o livro segue a busca do hobbit caseiro Bilbo Bolseiro para conquistar uma parte do tesouro guardado pelo dragão Smaug.", a2));
         insert(new Livro("O Senhor dos Anéis", 1200, "Uma jornada éppica contra o mal.", a2));
		 }
    }
	 
	public Livro insert(Livro livro){
		livro.setId(livros.size());
		livros.add(livro);
		return livros.get(livro.getId()); 
	}
	
	public ArrayList<Livro> List(){
		return livros;
	}
	 
	public Livro find(int id)
	{
		return livros.get(id);
	}
	
	public Livro update(Livro livro)
	{
		livros.remove(livro.getId());		 
		livros.add(livro.getId(), livro);		
		 
		return livro;
	}

}
