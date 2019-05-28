package br.portal.noticias.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.portal.noticias.connection.ConnectionFactory;
import br.portal.noticias.entity.Autor;

public class AutorDaoImpl implements GenericDAO<Autor> {

	private EntityManager em = ConnectionFactory.getEntityManager();
	
	
	public void persist(Autor obj) {
		em.getTransaction().begin();
		em.persist(obj);
		em.getTransaction().commit();
		
	}

	public void merge(Autor obj) {
		em.getTransaction().begin();
		em.merge(obj);
		em.getTransaction().commit();
		em.close();
		
	}

	public void remove(int id) {
		em.getTransaction().begin();		
		em.remove(em.getReference(Autor.class, id));
		em.getTransaction().commit();
		em.close();		
	}

	public List<Autor> findAll() {
		String jpql = "Select n from Autores n";
		TypedQuery<Autor> query = em.createQuery(jpql, Autor.class);
		return query.getResultList();
	}


	public Autor getById(int id) {
		return em.find(Autor.class, id);
	}

}
