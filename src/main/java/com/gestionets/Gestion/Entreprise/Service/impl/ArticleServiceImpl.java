package com.gestionets.Gestion.Entreprise.Service.impl;

import com.gestionets.Gestion.Entreprise.Repository.ArticleRepository;
import com.gestionets.Gestion.Entreprise.Service.ArticleService;
import com.gestionets.Gestion.Entreprise.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleServiceImpl implements ArticleService {


    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public List<Article> listerArticle() {
        return articleRepository.findAll();
    }

    @Override
    public Article CreationArticle(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public void ModifierArticle(Article article) {
        articleRepository.save(article);
    }

    @Override
    public void SupprimerArticle(Integer id) {
        articleRepository.deleteById(id);
    }

    @Override
    public Optional<Article> RechercheArticleparID(Integer id) {
        return articleRepository.findById(id);
    }
}
