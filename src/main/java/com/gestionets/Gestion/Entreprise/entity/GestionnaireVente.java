package com.gestionets.Gestion.Entreprise.entity;

import jakarta.persistence.*;
import lombok.*;

>>>>>>> intialisation_du_projet

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "gestionnaire_vente")
@Data
@NoArgsConstructor
@AllArgsConstructor

=======
@Builder
>>>>>>> intialisation_du_projet
@PrimaryKeyJoinColumn(name = "id_gestionnaire_vente") // clé primaire jointe sur Gestionnaire
public class GestionnaireVente extends Gestionnaire {


    @OneToMany(
            mappedBy = "gestionnaireVente",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    private List<CommandeClient> commandesClient = new ArrayList<>();
}
