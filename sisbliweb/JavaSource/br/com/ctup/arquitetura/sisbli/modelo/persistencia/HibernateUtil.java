package br.com.ctup.arquitetura.sisbli.modelo.persistencia;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
public class HibernateUtil {
	private static SessionFactory factory;
	static {
		//Bloco estático que inicializa o Hibernate
		try {
			//factory = new Configuration().configure().buildSessionFactory();
			factory = new AnnotationConfiguration().configure().buildSessionFactory(); 
			
		} catch (Exception e) {
			e.printStackTrace();
			factory = null;
		}
	}
	public static Session getSession() {
		//Retorna a sessão aberta
		return factory.openSession();
	}
}
