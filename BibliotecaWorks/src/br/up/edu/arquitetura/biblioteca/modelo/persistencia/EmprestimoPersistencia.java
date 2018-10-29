package br.up.edu.arquitetura.biblioteca.modelo.persistencia;

import java.util.ArrayList;

 
import br.up.edu.arquitetura.biblioteca.modelo.dominio.Emprestimo;

public class EmprestimoPersistencia {
	
	private static ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
	
	public EmprestimoPersistencia() {
		
	}
	
	public Emprestimo insert(Emprestimo emprestimo){	
		
		emprestimo.setId(emprestimos.size());
		emprestimos.add(emprestimo);		 
		return emprestimos.get(emprestimo.getId()); 
	}
	
	public ArrayList<Emprestimo> List(){
		return emprestimos;
	}
	
	public Emprestimo find(int id) {
		return emprestimos.get(id);
	}
	
	public Emprestimo update(Emprestimo emprestimo) {
		emprestimos.remove(emprestimo.getId());		 
		emprestimos.add(emprestimo.getId(), emprestimo);
		 
		return emprestimo;
	} 
	
	public void remove(int id) {
		emprestimos.remove(id); 
	}

}
