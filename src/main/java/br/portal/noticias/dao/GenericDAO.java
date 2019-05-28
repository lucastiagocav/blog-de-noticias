package br.portal.noticias.dao;

import java.util.List;

/**
 * Interface generica, utilizada para flexibilizar a aplicação, onde, as querys
 * básicos (CRUD) já estão estabelecidas, para que as interfaces que
 * implementarem-a, já tenha uma lista de querys para implementar. Caso alguma
 * camada de persistências precise de querys específicas, basta implementa-las
 * na classe, ou então criar uma interface específica para ela.
 * 
 * @author Lucas Tiago
 *
 * Parametro Generico capaz de agregar qualquer entidade da aplicação.
 * @param <T>
 */

public interface GenericDAO<T> {
	void persist(T obj);

	void merge(T obj);

	void remove(int id);

	List<T> findAll();

	T getById(int id);

}
