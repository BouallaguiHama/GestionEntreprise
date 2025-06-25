package com.gestionets.Gestion.Entreprise.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "depot")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Depot {

    @Id
    @Column(name = "id_depot")
    @NotNull(message = "L'identifiant est obligatoire")
    private Long idDepot;

    @Column(name = "adresse", nullable = false)
    @NotNull(message = "L'adresse est obligatoire")
    private String adresse;


    @OneToMany(
            mappedBy = "depot",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    private List<Article> articles = new ArrayList<>();


    @ManyToMany
    @JoinTable(
            name = "depot_gestionnaire_stock",
            joinColumns = @JoinColumn(name = "id_depot"),
            inverseJoinColumns = @JoinColumn(name = "id_gestionnaire_stock")
    )
    private List<GestionnaireStock> gestionnairesStock = new ArrayList<>();
}
