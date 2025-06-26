package com.gestionets.Gestion.Entreprise.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "commande_fournisseur")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class CommandeFournisseur {

    @Id
    @Column(name = "id_commandeF", length = 50, nullable = false)
    @NotNull(message = "Le champ id ne doit pas etre null")
    private String idCommandeF;


    @Column(name = "date_cmd")
    @NotNull(message = "Le champ date ne doit pas être null")
    private LocalDate dateCmd;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_fournisseur")
    private Fournisseur fournisseur;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_gestionnaire_achat")
    private GestionnaireAchat gestionnaireAchat;

}
