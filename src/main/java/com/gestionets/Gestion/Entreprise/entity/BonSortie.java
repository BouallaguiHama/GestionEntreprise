package com.gestionets.Gestion.Entreprise.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "bon_sortie")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BonSortie {

    @Id
    @Column(name = "num_bs")
    @NotNull(message = "Le numéro de bon de sortie est obligatoire")
    private Integer numBs;

    @Column(name = "date_bs", nullable = false)
    @NotNull(message = "La date du bon de sortie est obligatoire")
    private LocalDate dateBs;


    @ManyToMany
    @JoinTable(
            name = "bon_sortie_article",
            joinColumns = @JoinColumn(name = "num_bs"),
            inverseJoinColumns = @JoinColumn(name = "id_article")
    )
    private List<Article> articles = new ArrayList<>();


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_gestionnaire_stock")
    private GestionnaireStock gestionnaireStock;
}
