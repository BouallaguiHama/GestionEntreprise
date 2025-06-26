package com.gestionets.Gestion.Entreprise.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "gestionnaire_stock")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@PrimaryKeyJoinColumn(name = "id_gestionnaire_stock")
public class GestionnaireStock extends Gestionnaire {


    @ManyToMany(mappedBy = "gestionnairesStock", fetch = FetchType.LAZY)
    private List<Depot> depots = new ArrayList<>();


    @OneToMany(
            mappedBy = "gestionnaireStock",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    private List<BonEntree> bonsEntree = new ArrayList<>();


    @OneToMany(
            mappedBy = "gestionnaireStock",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    private List<BonSortie> bonsSortie = new ArrayList<>();
}
