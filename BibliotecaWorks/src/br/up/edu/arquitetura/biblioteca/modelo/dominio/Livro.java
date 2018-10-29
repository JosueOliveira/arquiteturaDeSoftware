package br.up.edu.arquitetura.biblioteca.modelo.dominio;

public class Livro {

	private int id;
	private String titulo;
	private Integer paginas;
	private String resumo;
	private Autor autor;
	
	public Livro(String titulo, Integer paginas, String resumo, Autor autor){
		this.setTitulo(titulo);
		this.setPaginas(paginas);
		this.setResumo(resumo);
		this.setAutor(autor);		
	}
	
	public Livro() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Integer getPaginas() {
		return paginas;
	}
	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}

}
