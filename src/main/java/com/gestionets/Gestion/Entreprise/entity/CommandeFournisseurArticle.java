package com.gestionets.Gestion.Entreprise.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "commande_fournisseur_article")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommandeFournisseurArticle {

    @EmbeddedId
    private CommandeFournisseurArticleId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idCommandeF")
    @JoinColumn(name = "id_commandeF")
    private CommandeFournisseur commandeFournisseur;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idArticle")
    @JoinColumn(name = "id_article")
    private Article article;

    @Column(name = "qte_commander")
    private Integer qteCommander;

    @Column(name = "prix_achat")
    private Float prixAchat;
}

