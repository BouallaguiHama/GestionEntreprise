package com.gestionets.Gestion.Entreprise.Repository;

import com.gestionets.Gestion.Entreprise.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article,Long>{
}
