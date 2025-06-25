package com.gestionets.Gestion.Entreprise.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "bon_entree")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BonEntree {

    @Id
    @Column(name = "num_be")
    @NotNull(message = "Le numéro de bon d'entrée est obligatoire")
    private Integer numBe;

    @Column(name = "date_be", nullable = false)
    @NotNull(message = "La date du bon d'entrée est obligatoire")
    private LocalDate dateBe;


    @ManyToMany
    @JoinTable(
            name = "bon_entree_article",
            joinColumns = @JoinColumn(name = "num_be"),
            inverseJoinColumns = @JoinColumn(name = "id_article")
    )
    private List<Article> articles = new ArrayList<>();


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_gestionnaire_stock")
    private GestionnaireStock gestionnaireStock;
}
