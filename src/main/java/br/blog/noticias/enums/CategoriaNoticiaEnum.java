package br.blog.noticias.enums;

/**
 * Enum referente aos tipos de not�cia do blog, o intuito do blog � que ele
 * seja flex�vel � altera��es e possa ser facilmente designado para outros tipos
 * de segmento. Neste caso, s� utilizarei esse Enum de refer�ncias �s
 * tecnologias, sendo um blog de noticias.
 * 
 * @author Lucas Tiago
 *
 */
public enum CategoriaNoticiaEnum {
	FRONTEND("Desenvolvimento Frontend"), BACKEND("Desenvolvimento Backend"), TESTS("Testes de Software"),
	DATA_SCIENCE("Ci�ncias de Dados"), MACHINE_LEARNING("Machine Learning"), DEEP_LEARNING("Deep Learning"),
	GERENCIAMENTO("Gerenciamento de Projetos de Software");

	public String valorCategoria;

	CategoriaNoticiaEnum(String valor) {
		this.valorCategoria = valor;
	}
}
