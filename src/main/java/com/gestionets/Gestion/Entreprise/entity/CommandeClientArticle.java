package com.gestionets.Gestion.Entreprise.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Table(name = "commande_client_article")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommandeClientArticle {

    @EmbeddedId
    private CommandeClientArticleId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idCommandeC")
    @JoinColumn(name = "id_commandeC")
    private CommandeClient commandeClient;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idArticle")
    @JoinColumn(name = "id_article")
    private Article article;

    @Column(name = "qte_commander")
    private Integer qteCommander;

    @Column(name = "prix_vente")
    private Float prixVente;
}

