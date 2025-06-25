package com.gestionets.Gestion.Entreprise.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "branche")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Branche {

    @Id
    @Column(name = "id_branche", length = 50, nullable = false)
    @NotNull(message = "L'identifiant est obligatoire")
    private String idBranche;

    @Column(name = "nom_branche", nullable = false)
    @NotNull(message = "Le nom de la branche est obligatoire")
    @Size(min = 2, max = 100, message = "Le nom doit contenir entre 2 et 100 caractères")
    private String nomBranche;

    @Column(name = "date_creation", nullable = false)
    @NotNull(message = "La date de création est obligatoire")
    private LocalDate dateCreation;

    @Column(name = "adresse", nullable = false)
    @NotNull(message = "L'adresse est obligatoire")
    private String adresse;

    @Column(name = "contact_admin", nullable = false)
    @NotNull(message = "Le contact admin est obligatoire")
    private String contactAdmin;

    @Column(name = "num_rne", length = 50)
    private String numRne;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_entreprise", nullable = false)
    private Entreprise entreprise;
}
