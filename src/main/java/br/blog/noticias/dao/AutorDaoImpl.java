package br.blog.noticias.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.blog.noticias.connection.ConnectionFactory;
import br.blog.noticias.entity.Autor;

public class AutorDaoImpl implements GenericDAO<Autor> {

	private EntityManager entityManager = ConnectionFactory.getEntityManager();
	
	/**
	 * Persiste os dados de autor, alocando-os no Banco de dados estabelecido do arquivo persistense.xml
	 */
	public void persist(Autor autor) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(autor);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}	
	}
	
	/**
	 * Edita os dados do autor
	 */

	public void merge(Autor obj) {
		entityManager.getTransaction().begin();
		entityManager.merge(obj);
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}
	
	/**
	 * Remove os dados do autor por completo, através do @id mesmo.
	 */

	public void remove(int id) {
		entityManager.getTransaction().begin();		
		entityManager.remove(entityManager.getReference(Autor.class, id));
		entityManager.getTransaction().commit();
		entityManager.close();		
	}

	/**
	 * Lista todos os autores cadastrados no Banco de Dados.
	 */
	public List<Autor> findAll() {
		String jpql = "SELECT e FROM Autor e";
		TypedQuery<Autor> query = entityManager.createQuery(jpql, Autor.class);
		return query.getResultList();
	}

	/**
	 * Lista um autor, através do @id
	 */

	public Autor getById(int id) {
		return entityManager.find(Autor.class, id);
	}

}
