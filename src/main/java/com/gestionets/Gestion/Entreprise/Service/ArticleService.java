package com.gestionets.Gestion.Entreprise.Service;

import com.gestionets.Gestion.Entreprise.entity.Article;

import java.util.List;
import java.util.Optional;

public interface ArticleService {

    List<Article> listerArticle();

    Article CreationArticle(Article article);

    void ModifierArticle(Article article);

    void SupprimerArticle(Long ID);

    Optional<Article> RechercheArticleparID(Long ID);
}
