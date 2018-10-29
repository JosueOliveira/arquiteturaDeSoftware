package br.com.ctup.arquitetura.sisbli.modelo.dominio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="emprestimo")
public class Emprestimo {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "dataEmprestimo")
	private Date dataEmprestimo;
	
	@Column(name = "dataDevolucao")
	private Date dataDevolucao;
	
	@Column(name = "dataPrevistaDevolucao")
	private Date dataPrevistaDevolucao;
	
	@OneToOne
	private Livro livro;
	
	@OneToOne
	private Multa multa;
	
	@OneToOne
	private Mutuario mutuario;
	
	
	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}
	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Multa getMulta() {
		return multa;
	}
	public void setMulta(Multa multa) {
		this.multa = multa;
	}
	public Mutuario getMutuario() {
		return mutuario;
	}
	public void setMutuario(Mutuario mutuario) {
		this.mutuario = mutuario;
	}
	
	
	
	

}
