package com.gestionets.Gestion.Entreprise.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "article")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_article")
    private Long idArticle;

    @Column(name = "nom_article", nullable = false)
    @NotNull(message = "Le nom est obligatoire")
    @Size(min = 2, max = 100, message = "Le nom doit contenir entre 2 et 100 caractères")
    private String nomArticle;

    @Column(name = "prix_Achat", nullable = false)
    @NotNull(message = "Le prix est obligatoire")
    private Float prixAchat;

    @Column(name = "prix_Vente", nullable = false)
    private Float prixVente;

    @Column(name = "description", nullable = false)
    @NotNull(message = "La Description est obligatoire")
    private String description;

    @Column(name = "minseuil")
    private Long minSeuil;

    @Column(name = "date_article")
    private java.time.LocalDate dateArticle;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_depot")
    private Depot depot;


    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL)
    private List<CommandeClientArticle> lignesCommande = new ArrayList<>();

    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL)
    private List<CommandeFournisseurArticle> lignesCommandeFournisseur = new ArrayList<>();

    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL)
    private List<BonEntreeArticle> lignesBonEntree = new ArrayList<>();

    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL)
    private List<BonSortieArticle> lignesBonSortie = new ArrayList<>();
}
