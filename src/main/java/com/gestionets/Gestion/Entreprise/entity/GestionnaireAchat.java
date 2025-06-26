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
@Table(name = "gestionnaire_achat")
@Data
@NoArgsConstructor
@AllArgsConstructor
<<<<<<< add_Services
@SuperBuilder
=======
@Builder
>>>>>>> intialisation_du_projet
@PrimaryKeyJoinColumn(name = "id_gestionnaire_achat") // clé primaire héritée de Gestionnaire
public class GestionnaireAchat extends Gestionnaire {


    @OneToMany(
            mappedBy = "gestionnaireAchat",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    private List<CommandeFournisseur> commandesFournisseur = new ArrayList<>();
}
