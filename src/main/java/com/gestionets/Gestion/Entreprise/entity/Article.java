package com.gestionets.Gestion.Entreprise.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "article")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Article {

    @Id
    @Column(name = "id_article")
    @NotNull(message = "L'identifiant est obligatoire")
    private Long idArticle;

    @Column(name = "nom_article", nullable = false)
    @NotNull(message = "Le nom est obligatoire")
    @Size(min = 2, max = 100, message = "Le nom doit contenir entre 2 et 100 caractères")
    private String nomArticle;

    @Column(name = "prix_unitaire", nullable = false)
    @NotNull(message = "Le prix est obligatoire")
    private Float prixUnitaire;

    @Column(name = "ref", nullable = false)
    @NotNull(message = "La référence est obligatoire")
    private String ref;

    @Column(name = "obs")
    private String obs;

    @Column(name = "vh")
    private Float vh;

    @Column(name = "date_article")
    private java.time.LocalDate dateArticle;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_depot")
    private Depot depot;


    @ManyToMany(mappedBy = "articles", fetch = FetchType.LAZY)
    private List<CommandeClient> commandesClient;

    @ManyToMany(mappedBy = "articles", fetch = FetchType.LAZY)
    private List<CommandeFournisseur> commandesFournisseur;

    @ManyToMany(mappedBy = "articles", fetch = FetchType.LAZY)
    private List<BonEntree> bonsEntree;

    @ManyToMany(mappedBy = "articles", fetch = FetchType.LAZY)
    private List<BonSortie> bonsSortie;
}
