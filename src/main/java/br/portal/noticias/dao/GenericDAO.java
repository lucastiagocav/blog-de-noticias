package br.portal.noticias.dao;

import java.util.List;

public interface GenericDAO<T> {
	 void salvar(T obj);
	 void editar(T obj);
	 void excluir(int id);
	 List<T> getTodos();
	 T encontrarPorId(int id);

	
}
