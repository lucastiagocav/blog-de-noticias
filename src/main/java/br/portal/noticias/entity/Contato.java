package br.portal.noticias.entity;

import javax.persistence.Embeddable;

/**
 * Esta classe cont�m os contatos do autor, por�m, ela ir� persistir em
 * segundo-plano, por conta da utiliza��o das anota��es @Embedded e @Embeddable,
 * diminuindo as consultas no banco, por�m, a tabela perde a normaliza��o.
 * 
 * @author Lucas Tiago
 *
 */
@Embeddable
public class Contato {
	private String linkedin;
	private String github;
	private String email;
	private String telefone;

	public Contato() {
		super();
	}

	public Contato(String linkedin, String github, String email, String telefone) {
		super();
		this.linkedin = linkedin;
		this.github = github;
		this.email = email;
		this.telefone = telefone;
	}

	public String getLinkedin() {
		return linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}

	public String getGithub() {
		return github;
	}

	public void setGithub(String github) {
		this.github = github;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Linkedin: " + linkedin + " - Github: " + github + " - Email: " + email + " - Telefone=" + telefone;
	}
}
