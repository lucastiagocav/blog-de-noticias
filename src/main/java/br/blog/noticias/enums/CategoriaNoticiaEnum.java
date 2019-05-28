package br.blog.noticias.enums;

/**
 * Enum referente aos tipos de notícia do blog, o intuito do blog é que ele
 * seja flexível à alterações e possa ser facilmente designado para outros tipos
 * de segmento. Neste caso, só utilizarei esse Enum de referências às
 * tecnologias, sendo um blog de noticias.
 * 
 * @author Lucas Tiago
 *
 */
public enum CategoriaNoticiaEnum {
	FRONTEND("Desenvolvimento Frontend"), BACKEND("Desenvolvimento Backend"), TESTS("Testes de Software"),
	DATA_SCIENCE("Ciências de Dados"), MACHINE_LEARNING("Machine Learning"), DEEP_LEARNING("Deep Learning"),
	GERENCIAMENTO("Gerenciamento de Projetos de Software");

	public String valorCategoria;

	CategoriaNoticiaEnum(String valor) {
		this.valorCategoria = valor;
	}
}
