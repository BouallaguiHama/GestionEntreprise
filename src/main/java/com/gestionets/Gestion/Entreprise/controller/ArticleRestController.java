package com.gestionets.Gestion.Entreprise.controller;

import com.gestionets.Gestion.Entreprise.Service.ArticleService;
import com.gestionets.Gestion.Entreprise.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/article")
public class ArticleRestController {


    @Autowired
    private ArticleService articleService;


    @GetMapping("/all")
    public ResponseEntity<List<Article>> getAllArticle(){
        List<Article> articles = articleService.listerArticle();
        return new ResponseEntity<>(articles, HttpStatus.OK);
    }


    @PostMapping("/ajouter")
    public ResponseEntity<Long> ajouterArticle(@RequestBody Article article){
        Article nouveauArticle = articleService.CreationArticle(article);

        if (nouveauArticle == null){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(nouveauArticle.getIdArticle(),HttpStatus.OK);
    }

    @PostMapping("/modifier")
    public ResponseEntity modifierArticle(@RequestBody Article article){
        articleService.ModifierArticle(article);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/supprimer/{id}")
    public ResponseEntity supprimerArticle(@PathVariable("id") Long id){
        articleService.SupprimerArticle(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
