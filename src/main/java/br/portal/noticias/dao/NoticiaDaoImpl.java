package br.portal.noticias.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.portal.noticias.connection.ConnectionFactory;
import br.portal.noticias.entity.Noticia;

public class NoticiaDaoImpl implements GenericDAO<Noticia> {

	private EntityManager entityManager = ConnectionFactory.getEntityManager();

	/**
	 * Persiste os dados no Banco estabelecido no arquivo persistence.xml
	 */
	public void persist(Noticia obj) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(obj);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	/**
	 * Edita os dados, utilizando uma referencia @id.
	 * 
	 * @param Noticia que será atualizada.
	 */
	public void merge(Noticia noticia) {

		if (noticia != null) {
			try {
				entityManager.getTransaction().begin();
				entityManager.merge(noticia);
				entityManager.getTransaction().commit();
			} catch (Exception ex) {
				ex.printStackTrace();
				entityManager.getTransaction().rollback();

			}
		}
	}

	/**
	 * Remove um item anteriormente persistido, através de um ponto de
	 * referência @id
	 */
	public void remove(int id) {
		entityManager.getTransaction().begin();
		entityManager.remove(entityManager.getReference(Noticia.class, id));
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	/**
	 * Lista todas as notícias.
	 */
	public List<Noticia> findAll() {
		String jpql = "SELECT e FROM Noticia e";
		TypedQuery<Noticia> query = entityManager.createQuery(jpql, Noticia.class);
		return query.getResultList();
	}

	/**
	 * Lista uma notícia por @id
	 */
	public Noticia getById(int id) {
		return entityManager.find(Noticia.class, id);
	}

}
