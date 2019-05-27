package br.portal.noticias.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.portal.noticias.connection.ConnectionFactory;
import br.portal.noticias.entity.Noticia;

public class NoticiaDaoImpl implements GenericDAO<Noticia> {

	private EntityManager em = ConnectionFactory.getEntityManager();

	public void salvar(Noticia obj) {
		em.getTransaction().begin();
		em.persist(obj);
		em.getTransaction().commit();
	}

	public void editar(Noticia obj) {

		if (obj != null) {

			em.getTransaction().begin();
			em.merge(obj);
			em.getTransaction().commit();
			em.close();
		}

	}

	public void excluir(int id) {
		em.getTransaction().begin();
		em.remove(em.getReference(Noticia.class, id));
		em.getTransaction().commit();
		em.close();
	}

	public List<Noticia> getTodos() {
		String jpql = "from noticias";
		TypedQuery<Noticia> query = em.createQuery(jpql, Noticia.class);
		return query.getResultList();
	}

	public Noticia encontrarPorId(int id) {
		return em.find(Noticia.class, id);
	}

}
