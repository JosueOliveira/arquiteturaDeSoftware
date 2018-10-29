	package br.com.ctup.arquitetura.sisbli.testes;

import static org.junit.Assert.*;

import java.util.Date;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.ctup.arquitetura.sisbli.modelo.dominio.*;
import br.com.ctup.arquitetura.sisbli.modelo.persistencia.HibernateUtil;

public class HibernateUtilTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void testaConexaoHibernate() {
	Session sessao = HibernateUtil.getSession(); //Abrindo uma sessão
	Transaction transaction = sessao.beginTransaction(); //Iniciando uma transação
	//Aqui ficara as operações CRUD
	Integer mutuarioID = null;
	Professor mutuario = new Professor();
	mutuario.setNome("Nome teste Professor");
	mutuario.setEndereco("Endereco Professor");
	mutuario.setTelefone("123455");
	mutuario.setDataContratacao(new Date());
	mutuarioID = (Integer) sessao.save(mutuario); 
	transaction.commit();
	boolean isInserido = false;
	if(mutuarioID != null)
		isInserido = true;
	sessao.close();
	assertTrue(isInserido);
	}

}
