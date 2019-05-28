package br.blog.noticias.enums;

/**
 * Enum referente aos cargos de casa autor, dentro do blog, o intuito do blog é
 * ser flexível à alterações e possa ser facilmente designado para outros tipos
 * de segmento.
 * 
 * @author Lucas Tiago
 *
 */
public enum CargoAutorEnum {
	PROFESSOR("Professor Univesitário"), COORDENADOR("Coordenador do curso de Computação"), OUVINTE("Entusiasta"),
	ALUNO("Estudante de Computação");

	public String cargo;

	CargoAutorEnum(String valor) {
		this.cargo = valor;
	}
	
	
}
