package br.up.edu.arquitetura.biblioteca.modelo.dominio;

public class Mutuario {
    private int id;
	private String nome;
	private String endereco;
	private String telefone;
	
	public Mutuario() {}
	
	public Mutuario(String nome, String endereco, String telefone) 
	{
		this.setNome(nome);
		this.setEndereco(endereco);
		this.setTelefone(telefone);		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
