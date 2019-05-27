package br.portal.noticias;

import br.portal.noticias.dao.AutorDaoImpl;
import br.portal.noticias.dao.NoticiaDaoImpl;
import br.portal.noticias.entity.Autor;
import br.portal.noticias.entity.Noticia;

public class App {

	public static void main(String[] args) {
		/**
		 * SÓ FALTA O LISTAR TODOS
		 */
//		
//		Autor a = new Autor("Gabriel Diniz", "Cantor");
//		
//		
//		Noticia noticia = new Noticia();
//		Noticia noticia2 = new Noticia();
//		
//		noticia.setDescricao("O nome dela é Jeniffer");
//		noticia.setTitulo("Música Jeniffer");
//
//		noticia2.setDescricao("O nome dela é Jeniffer");
//		noticia2.setTitulo("Música Jeniffer");
//
//		
//		NoticiaDaoImpl dao = new NoticiaDaoImpl();
//		AutorDaoImpl daoautor= new AutorDaoImpl();
//		daoautor.salvar(a);
//		noticia.setAutor(a);
//		noticia2.setAutor(a);
//		dao.salvar(noticia);
//		dao.salvar(noticia2);
//		
//		NoticiaDaoImpl dao = new NoticiaDaoImpl();
//		dao.excluir(1);
//		

		AutorDaoImpl dao = new AutorDaoImpl();
//		Noticia n = new Noticia();
	//	n.setDescricao("Eu encontrei ela no Tinder");
		//dao.editar(n);
		
		
		NoticiaDaoImpl noticiadao = new NoticiaDaoImpl();
		Noticia noticia = noticiadao.encontrarPorId(2);
		Autor n = dao.encontrarPorId(1);
		System.out.println(n);
		System.out.println("--------");
		System.out.println(noticia);
//		List<Noticia> noticiass = dao.getTodos();
//		
//		for(Noticia noticia: noticiass) {
//			System.out.println(noticia);
//			
//		}
	}

}
