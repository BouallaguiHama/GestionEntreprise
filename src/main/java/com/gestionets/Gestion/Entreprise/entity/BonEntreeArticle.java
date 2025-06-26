package com.gestionets.Gestion.Entreprise.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "bon_entree_article")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BonEntreeArticle {

    @EmbeddedId
    private BonEntreeArticleId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("numBe")
    @JoinColumn(name = "num_be")
    private BonEntree bonEntree;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idArticle")
    @JoinColumn(name = "id_article")
    private Article article;

    @Column(name = "qte_recus")
    private Integer qteRecus;
}

