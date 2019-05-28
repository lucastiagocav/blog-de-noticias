package br.blog.noticias;

import java.util.List;

import br.blog.noticias.dao.AutorDaoImpl;
import br.blog.noticias.dao.NoticiaDaoImpl;
import br.blog.noticias.entity.Autor;
import br.blog.noticias.entity.Contato;
import br.blog.noticias.entity.Noticia;
import br.blog.noticias.enums.CargoAutorEnum;
import br.blog.noticias.enums.CategoriaNoticiaEnum;

public class App {

	public static void main(String[] args) {
		// VARIÁVEIS PARA INSERÇÃO, CONSULTA, DELEÇÃO E EDIÇÃO.
		final AutorDaoImpl autordao = new AutorDaoImpl();
		final NoticiaDaoImpl noticiadao = new NoticiaDaoImpl();

		// INSERÇÕES DOS AUTORES NO BANCO DE DADOS.
		Contato contatoLucas = new Contato("http://www.linkedin.com/in/lucastiagocav",
				"http://www.github.com/lucastiagocav", "lucastiagocav@gmail.com", "83 9 91750154");
		Autor lucas = new Autor("Lucas Tiago", CargoAutorEnum.ALUNO, contatoLucas);
		autordao.persist(lucas);

		Contato contatoAdriano = new Contato("http://www.linkedin.com/in/adrianosantospb",
				"http://www.github.com/adrianosantospb", "adrianosantospb@gmail.com", "83 9 9173334");
		Autor adriano = new Autor("Adriano Santos", CargoAutorEnum.PROFESSOR, contatoAdriano);
		autordao.persist(adriano);

		Contato contatoClaudio = new Contato("http://www.linkedin.com/in/claudiotessaro",
				"http://www.github.com/claudiotessaro", "claudiotessaro@gmail.com", "83 9 91873121");
		Autor claudio = new Autor("Claudio Tessaro", CargoAutorEnum.OUVINTE, contatoClaudio);
		autordao.persist(claudio);

		Contato contatoHamurabi = new Contato("http://www.linkedin.com/in/hamurabimedeiros",
				"http://www.github.com/hamurabimedeiros", "hamurabimedeiros@gmail.com", "83 9 88173121");
		Autor hamurabi = new Autor("Hamurabi Medeiros", CargoAutorEnum.COORDENADOR, contatoHamurabi);
		autordao.persist(hamurabi);

		// INSERÇÕES DAS NOTÍCIAS NO BANCO DE DADOS.

		Noticia noticiaAdriano = new Noticia("Noticias Sobre Ciências de Dados", CategoriaNoticiaEnum.DATA_SCIENCE,
				"25/05/2019",
				"At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga. Et harum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum soluta nobis est eligendi optio cumque nihil impedit quo minus id quod maxime placeat facere possimus, omnis voluptas assumenda est, omnis dolor repellendus. Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus saepe eveniet ut et voluptates repudiandae sint et molestiae non recusandae. Itaque earum rerum hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus maiores alias consequatur aut perferendis doloribus asperiores repellat.",
				adriano);
		noticiadao.persist(noticiaAdriano);
		
		Noticia noticia2Adriano = new Noticia("Tudo Sobre Aprendizado Computacional", CategoriaNoticiaEnum.MACHINE_LEARNING,
				"31/12/2018",
				"At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga. Et harum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum soluta nobis est eligendi optio cumque nihil impedit quo minus id quod maxime placeat facere possimus, omnis voluptas assumenda est, omnis dolor repellendus. Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus saepe eveniet ut et voluptates repudiandae sint et molestiae non recusandae. Itaque earum rerum hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus maiores alias consequatur aut perferendis doloribus asperiores repellat.",
				adriano);
		noticiadao.persist(noticia2Adriano);

		Noticia noticiaLucas = new Noticia("Todas as novidades sobre o novo Angular", CategoriaNoticiaEnum.FRONTEND,
				"23/04/2018",
				"On the other hand, we denounce with righteous indignation and dislike men who are so beguiled and demoralized by the charms of pleasure of the moment, so blinded by desire, that they cannot foresee the pain and trouble that are bound to ensue; and equal blame belongs to those who fail in their duty through weakness of will, which is the same as saying through shrinking from toil and pain. These cases are perfectly simple and easy to distinguish. In a free hour, when our power of choice is untrammelled and when nothing prevents our being able to do what we like best, every pleasure is to be welcomed and every pain avoided. But in certain circumstances and owing to the claims of duty or the obligations of business it will frequently occur that pleasures have to be repudiated and annoyances accepted. The wise man therefore always holds in these matters to this principle of selection: he rejects pleasures to secure other greater pleasures, or else he endures pains to avoid worse pains.",
				lucas);
		noticiadao.persist(noticiaLucas);

		Noticia noticiaClaudio = new Noticia("O mundo dos Devs", CategoriaNoticiaEnum.BACKEND, "28/05/2019",
				"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
				claudio);
		noticiadao.persist(noticiaClaudio);

		Noticia noticiaHamurabi = new Noticia("Gerenciando Sistemas ERP", CategoriaNoticiaEnum.GERENCIAMENTO,
				"23/04/2018",
				"On the other hand, we denounce with righteous indignation and dislike men who are so beguiled and demoralized by the charms of pleasure of the moment, so blinded by desire, that they cannot foresee the pain and trouble that are bound to ensue; and equal blame belongs to those who fail in their duty through weakness of will, which is the same as saying through shrinking from toil and pain. These cases are perfectly simple and easy to distinguish. In a free hour, when our power of choice is untrammelled and when nothing prevents our being able to do what we like best, every pleasure is to be welcomed and every pain avoided. But in certain circumstances and owing to the claims of duty or the obligations of business it will frequently occur that pleasures have to be repudiated and annoyances accepted. The wise man therefore always holds in these matters to this principle of selection: he rejects pleasures to secure other greater pleasures, or else he endures pains to avoid worse pains.",
				hamurabi);
		noticiadao.persist(noticiaHamurabi);

		// LISTAR TODOS OS AUTORES
		List<Autor> autores = autordao.findAll();
		for (Autor autor : autores) {
			System.out.println(autor);
		}

		// LISTAR TODAS AS NOTICIAS
		List<Noticia> noticias = noticiadao.findAll();
		for (Noticia noticia : noticias) {
			System.out.println(noticia);
		}

	}

}
