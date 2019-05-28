package br.portal.noticias.enums;

/**
 * Enum referente aos tipos de notícia do portal, o intuito do portal é que ele
 * seja flexível à alterações e possa ser facilmente designado para outros tipos
 * de segmento. Neste caso, só utilizarei esse Enum de tecnologia, pois defini o
 * meu portal sendo um portal de noticias.
 * 
 * @author Lucas Tiago
 *
 */
public enum CategoriaNoticiaTIEnum {
	FRONTEND("Desenvolvimento Frontend"), BACKEND("Desenvolvimento Backend"), TESTS("Testes de Software"),
	DATA_SCIENCE("Ciências de Dados"), MACHINE_LEARNING("Machine Learning"), DEEP_LEARNING("Deep Learning"),
	GERENCIAMENTO("Gerenciamento de Projetos de Software");

	public String valorCategoria;

	CategoriaNoticiaTIEnum(String valor) {
		this.valorCategoria = valor;
	}
}
