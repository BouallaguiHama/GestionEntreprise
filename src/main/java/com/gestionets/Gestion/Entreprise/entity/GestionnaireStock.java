package com.gestionets.Gestion.Entreprise.entity;

import jakarta.persistence.*;
import lombok.*;
<<<<<<< add_Services
import lombok.experimental.SuperBuilder;
=======
>>>>>>> intialisation_du_projet

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "gestionnaire_stock")
@Data
@NoArgsConstructor
@AllArgsConstructor
<<<<<<< add_Services
@SuperBuilder
=======
@Builder
>>>>>>> intialisation_du_projet
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
