package br.portal.noticias.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "autores")
public class Autor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_autor")
	private int id_autor;

	@Column(name = "nome", length = 100)
	private String nome;

	@Column(name = "especializacao", length = 100)
	private String especializacao;

	@OneToMany(mappedBy = "autor")
	private List<Noticia> noticias;

	public List<Noticia> getNoticias() {
		return noticias;
	}

	public Autor() {
		super();
	}

	public Autor(String nome, String especializacao, List<Noticia> noticias) {
		super();
		this.nome = nome;
		this.especializacao = especializacao;
		this.noticias = noticias;
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

	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}

}
