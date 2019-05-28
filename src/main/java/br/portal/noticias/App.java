package br.portal.noticias;

import java.util.List;

import br.portal.noticias.dao.AutorDaoImpl;
import br.portal.noticias.dao.NoticiaDaoImpl;
import br.portal.noticias.entity.Autor;
import br.portal.noticias.entity.Contato;
import br.portal.noticias.entity.Noticia;

public class App {

	public static void main(String[] args) {

		// INSERÇÕES NO BANCO DE DADOS.
//		Autor lucas = new Autor("Lucas Tiago", "Estudante de Computação");
//		Autor adriano = new Autor("Adriano Santos", "Doutor em Ciências de Dados");
//		AutorDaoImpl autordao = new AutorDaoImpl();
//		autordao.persist(lucas);
//		autordao.persist(adriano);
//
//		Noticia noticia = new Noticia("Noticias Sobre Ciências de Dados", "25/05/2019",
//				"At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga. Et harum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum soluta nobis est eligendi optio cumque nihil impedit quo minus id quod maxime placeat facere possimus, omnis voluptas assumenda est, omnis dolor repellendus. Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus saepe eveniet ut et voluptates repudiandae sint et molestiae non recusandae. Itaque earum rerum hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus maiores alias consequatur aut perferendis doloribus asperiores repellat.",
//				adriano);
//		Noticia noticia2 = new Noticia("Atualizações do Hibernate", "23/04/2018",
//				"On the other hand, we denounce with righteous indignation and dislike men who are so beguiled and demoralized by the charms of pleasure of the moment, so blinded by desire, that they cannot foresee the pain and trouble that are bound to ensue; and equal blame belongs to those who fail in their duty through weakness of will, which is the same as saying through shrinking from toil and pain. These cases are perfectly simple and easy to distinguish. In a free hour, when our power of choice is untrammelled and when nothing prevents our being able to do what we like best, every pleasure is to be welcomed and every pain avoided. But in certain circumstances and owing to the claims of duty or the obligations of business it will frequently occur that pleasures have to be repudiated and annoyances accepted. The wise man therefore always holds in these matters to this principle of selection: he rejects pleasures to secure other greater pleasures, or else he endures pains to avoid worse pains.",
//				lucas);
//		NoticiaDaoImpl noticiadao = new NoticiaDaoImpl();
//		noticiadao.persist(noticia);
//		noticiadao.persist(noticia2);

//		Contato contato = new Contato("linkedin.com/in/claudiotessaro", "github.com/claudiotessaro", "claudiotessaro@gmail.com", "83 9 91873121");
//		Autor claudio = new Autor("Claudio Tessaro", "Especialista em Java EE", contato);
//		AutorDaoImpl autordao = new AutorDaoImpl();
//		autordao.persist(claudio);
//		Noticia noticia3 = new Noticia("Novo Java", "17/06/2018", "Bla-bla-bla-bla-bla-bla", claudio);
		NoticiaDaoImpl noticiadao = new NoticiaDaoImpl();
//		noticiadao.persist(noticia3);
		
		List<Noticia> noticias = noticiadao.findAll();
		for (Noticia noticia : noticias) {
			System.out.println(noticia);
		}
	
	}

}
