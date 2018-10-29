package br.com.ctup.arquitetura.sisbli.visao;



import org.hibernate.Session;
import org.hibernate.Transaction;


import br.com.ctup.arquitetura.sisbli.modelo.dominio.Mutuario;
import br.com.ctup.arquitetura.sisbli.modelo.persistencia.HibernateUtil;

public class ImprimirCarteirinhaVisao {

	public static void main(String[] args) {
		Mutuario mutuario = (Mutuario) ImprimirCarteirinhaVisao.recuperarMutuario(1);	
		String mensagem = "#####################\n" + "Nome Mutuário: " + mutuario.getNome();
		System.out.println(mensagem);

	}
	
	public static Mutuario recuperarMutuario(int matricula){
		
		Session sessao = HibernateUtil.getSession(); //Abrindo uma sessão
		Transaction transaction = sessao.beginTransaction(); //Iniciando uma transação
		//Aqui ficara as operações CRUD	
		Mutuario mutuario;
		mutuario = (Mutuario) sessao.get(Mutuario.class, matricula);	
		transaction.commit();
		return mutuario;
		
	}
	

}
