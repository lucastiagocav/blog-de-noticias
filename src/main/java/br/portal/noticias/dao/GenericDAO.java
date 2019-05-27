package br.portal.noticias.dao;

import javax.persistence.EntityManager;

import br.portal.noticias.connection.ConnectionFactory;

public class GenericDAO<T> {
	
	private static EntityManager manager = ConnectionFactory.getEntityManager();

}
