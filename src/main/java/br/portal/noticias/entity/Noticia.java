package br.portal.noticias.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "noticias")
public class Noticia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_noticia")
	private int id_noticia;

	@Column(name = "titulo", length = 50)
	private String titulo;

	@Column(name = "data", length = 10, nullable = true)
	private String data;

	@Column(name = "descricao", length = 32767)
	private String descricao;

	@ManyToOne
	@JoinColumn(name = "id_autor")
	private Autor autor;

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Noticia() {
		super();
	}

	public Noticia(String titulo, String data, String descricao, Autor autor) {
		super();
		this.titulo = titulo;
		this.data = data;
		this.descricao = descricao;
		this.autor = autor;
	}

	public int getId_noticia() {
		return id_noticia;
	}

	public void setId_noticia(int id_noticia) {
		this.id_noticia = id_noticia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "| ID DA NOTÍCIA: " + id_noticia + "|\n| TÍTULO: " + titulo + " |\n| DATA: " + data + " |\n| DESCRIÇÃO: "
				+ descricao + " |\n" + autor;
	}
}
