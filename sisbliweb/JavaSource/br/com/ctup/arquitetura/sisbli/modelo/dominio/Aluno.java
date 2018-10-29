package br.com.ctup.arquitetura.sisbli.modelo.dominio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class Aluno extends Mutuario {
	
	@Column(name = "dataMatricula")
	private Date dataMatricula;

	public Date getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(Date dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	
	
	
	

}
