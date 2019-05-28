package br.blog.noticias.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.blog.noticias.enums.CargoAutorEnum;

/**
 * Entidade para identificar os autores de cada notícia, possuindo uma relação
 * com a classe Contatos, e ligação um para muitos (implicitamente) com a
 * entidade Noticia.
 * 
 * @author Lucas Tiago
 * @version 1.05
 */
@Entity
@Table(name = "autores")
public class Autor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_autor")
	private int id_autor;

	@Column(name = "nome", length = 100)
	private String nome;

	@Enumerated(EnumType.STRING)
	@Column(name = "cargo", length = 100)
	private CargoAutorEnum cargoAutorEnum;

	@Embedded
	private Contato contato;

	public Autor() {
		super();
	}

	public Autor(String nome, CargoAutorEnum cargo, Contato contato) {
		super();
		this.nome = nome;
		this.cargoAutorEnum = cargo;
		this.contato = contato;
	}

	public int getId_autor() {
		return id_autor;
	}

	public void setId_autor(int id_autor) {
		this.id_autor = id_autor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "| ID DO AUTOR: " + id_autor + " |\n| NOME DO AUTOR: " + nome + " |\n| CARGO: " + cargoAutorEnum
				+ " |\n| Contatos: " + contato;
	}

	public CargoAutorEnum getCargoAutorEnum() {
		return cargoAutorEnum;
	}

	public void setCargoAutorEnum(CargoAutorEnum cargoAutorEnum) {
		this.cargoAutorEnum = cargoAutorEnum;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

}
