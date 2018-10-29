package br.up.edu.arquitetura.biblioteca.modelo.negocio;

import java.util.ArrayList;

 
import br.up.edu.arquitetura.biblioteca.modelo.dominio.Emprestimo;
import br.up.edu.arquitetura.biblioteca.modelo.persistencia.EmprestimoPersistencia;

public class EmprestimoNegocio {

	EmprestimoPersistencia persit = new EmprestimoPersistencia();
	LivroNegocio livroNG = new LivroNegocio();
	MutuarioNegocio mutuarioNG = new MutuarioNegocio();
	
	public EmprestimoNegocio() {
		
	}
	
	 public ArrayList<Emprestimo> listarTodos(){
			return persit.List();
	 }
	 
	 public Emprestimo findByKey(int id) {
		 return persit.find(id);
	 }
	 
	 public Emprestimo emprestar(Emprestimo emprestimo){
		 emprestimo.setLivro(livroNG.findByKey(emprestimo.getLivro().getId()));
		 emprestimo.setMutuario(mutuarioNG.findByKey(emprestimo.getMutuario().getId()));
		 return persit.insert(emprestimo);
	 }
	 
	 public Emprestimo renovarEmprestimo(Emprestimo emprestimo) {
		 return persit.update(emprestimo);		 
	 }
	 
	 public Emprestimo devolverLivro(Emprestimo emprestimo) {
		 return persit.update(emprestimo);
	 }
}
