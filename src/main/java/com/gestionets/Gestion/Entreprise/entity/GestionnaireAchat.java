package com.gestionets.Gestion.Entreprise.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "gestionnaire_achat")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
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
