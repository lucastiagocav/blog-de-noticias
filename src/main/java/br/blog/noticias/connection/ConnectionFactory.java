package br.blog.noticias.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {

	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("blogdenoticias");

	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
	

}