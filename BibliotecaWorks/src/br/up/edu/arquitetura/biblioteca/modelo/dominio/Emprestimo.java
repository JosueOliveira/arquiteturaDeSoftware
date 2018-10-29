package br.up.edu.arquitetura.biblioteca.modelo.dominio;

import java.sql.Date;
import java.time.LocalDate;

public class Emprestimo {
	private int id;
	private Date dataEmprestimo;
	private Date dataDevolucao;
	private Date dataPrevistaDevolucao;
	private Mutuario mutuario;
	private Livro livro;
	private Boolean devolucao;
	
	public Emprestimo() {
		
	}

	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public Date getDataPrevistaDevolucao() {
		return dataPrevistaDevolucao;
	}

	public void setDataPrevistaDevolucao(Date dataPrevistaDevolucao) {
		this.dataPrevistaDevolucao = dataPrevistaDevolucao;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Mutuario getMutuario() {
		return mutuario;
	}

	public void setMutuario(Mutuario mutuario) {
		this.mutuario = mutuario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Boolean getDevolucao() {
		return devolucao;
	}

	public void setDevolucao(Boolean devolucao) {
		this.devolucao = devolucao;
	}

}
