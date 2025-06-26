package com.gestionets.Gestion.Entreprise;

import com.gestionets.Gestion.Entreprise.Service.ArticleService;
import com.gestionets.Gestion.Entreprise.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class GestionEntrepriseApplication implements ApplicationRunner {

	@Autowired
	private ArticleService articleService;


	public static void main(String[] args) {
		SpringApplication.run(GestionEntrepriseApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {

		List<Article> articles = articleService.listerArticle();

		if(articles != null && articles.isEmpty()) {

			Article article1 = Article.builder().nomArticle("Sandale").ref("sandale noire").obs("ezez").prixUnitaire(50F).build();
			Article article2 = Article.builder().nomArticle("Lunette").ref("lun noire").obs("lun").prixUnitaire(55F).build();
			Article article3 = Article.builder().nomArticle("sous").ref("dentelle").obs("456").prixUnitaire(5000F).build();

			Arrays.asList(article1, article2, article3).forEach(art -> articleService.CreationArticle(art));

			System.out.println("Elements ajouté");
		}
	}
}
