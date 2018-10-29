package br.up.edu.arquitetura.biblioteca.modelo.dominio;

public class Autor {

	private int id;
	private String nome;
	private String nacionalidade;
	public Autor() {
		// TODO Auto-generated constructor stub
	}
	
	public Autor(String nome, String nacionalidade){
		this.setNome(nome);
		this.setNacionalidade(nacionalidade);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

}
