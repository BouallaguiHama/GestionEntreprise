package com.gestionets.Gestion.Entreprise.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "bon_sortie_article")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BonSortieArticle {

    @EmbeddedId
    private BonSortieArticleId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("numBs")
    @JoinColumn(name = "num_bs")
    private BonSortie bonSortie;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idArticle")
    @JoinColumn(name = "id_article")
    private Article article;

    @Column(name = "qte_sortie")
    private Integer qteSortie;
}

