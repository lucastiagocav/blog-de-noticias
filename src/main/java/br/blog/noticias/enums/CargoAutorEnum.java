package br.blog.noticias.enums;

/**
 * Enum referente aos cargos de casa autor, dentro do blog, o intuito do blog �
 * ser flex�vel � altera��es e possa ser facilmente designado para outros tipos
 * de segmento.
 * 
 * @author Lucas Tiago
 *
 */
public enum CargoAutorEnum {
	PROFESSOR("Professor Univesit�rio"), COORDENADOR("Coordenador do curso de Computa��o"), OUVINTE("Entusiasta"),
	ALUNO("Estudante de Computa��o");

	public String cargo;

	CargoAutorEnum(String valor) {
		this.cargo = valor;
	}
	
	
}
