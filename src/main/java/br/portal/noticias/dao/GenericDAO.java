package br.portal.noticias.dao;

import java.util.List;

/**
 * Interface generica, utilizada para flexibilizar a aplica��o, onde, as querys
 * b�sicos (CRUD) j� est�o estabelecidas, para que as interfaces que
 * implementarem-a, j� tenha uma lista de querys para implementar. Caso alguma
 * camada de persist�ncias precise de querys espec�ficas, basta implementa-las
 * na classe, ou ent�o criar uma interface espec�fica para ela.
 * 
 * @author Lucas Tiago
 *
 * Parametro Generico capaz de agregar qualquer entidade da aplica��o.
 * @param <T>
 */

public interface GenericDAO<T> {
	void persist(T obj);

	void merge(T obj);

	void remove(int id);

	List<T> findAll();

	T getById(int id);

}
