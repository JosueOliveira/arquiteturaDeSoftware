package br.up.edu.arquitetura.biblioteca.modelo.negocio;

import java.util.ArrayList;

import br.up.edu.arquitetura.biblioteca.modelo.dominio.Mutuario;
import br.up.edu.arquitetura.biblioteca.modelo.persistencia.MutuarioPersistencia;;

public class MutuarioNegocio {

	private MutuarioPersistencia persit = new MutuarioPersistencia();
	
	 public ArrayList<Mutuario> listarTodos(){
		return persit.List();
	 }

	 public Mutuario cadastra(Mutuario mutuario){
		 return persit.insert(mutuario);
	 }
	 
	 public Mutuario findByKey(int id) {
		 return persit.find(id);
	 }
	 
	 public Mutuario Atualizar(Mutuario mutuario) {
		 return persit.update(mutuario);
	 }
	 public void load() {
		 persit.load();
	 }
}
