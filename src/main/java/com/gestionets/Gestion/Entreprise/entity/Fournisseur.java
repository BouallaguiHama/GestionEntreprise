package com.gestionets.Gestion.Entreprise.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "fournisseur")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Fournisseur {
    @Id
    @Column(name = "id_fournisseur", length = 50, nullable = false)
    @NotNull(message = "Le champ id ne doit pas etre null")
    private String IdFournisseur;

    @Column(name = "nom")
    @NotNull(message = "Le cham nom ne doit pas être null")
    @Size(min = 3, max = 50, message = "Ce champ doit contenir entre 3 et 50 caractères")
    private String nom;

    @Column(name = "adrresse")
    private String adresse;

    @Column(name = "numtel")
    private int numtel;

    @Column(name = "email")
    @Email(message = "Le email doit avoir un format valid")
    private String email;

    @Column(name = "remise")
    private float remise;

    @Column(name = "rib")
    private String rib;

    @OneToMany(
            mappedBy = "fournisseur",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    private List<CommandeFournisseur> commandesFournisseur = new ArrayList<>();



}
