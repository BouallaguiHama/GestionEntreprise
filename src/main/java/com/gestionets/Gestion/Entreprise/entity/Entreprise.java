package com.gestionets.Gestion.Entreprise.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "entreprise")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Entreprise {

    @Id
    @Column(name = "id_entreprise", length = 50, nullable = false)
    @NotNull(message = "L'identifiant est obligatoire")
    private String idEntreprise;

    @Column(name = "nom_entreprise", nullable = false)
    @NotNull(message = "Le nom de l'entreprise est obligatoire")
    @Size(min = 2, max = 100, message = "Le nom doit contenir entre 2 et 100 caractères")
    private String nomEntreprise;

    @Column(name = "date_inscription", nullable = false)
    @NotNull(message = "La date d'inscription est obligatoire")
    private LocalDate dateInscription;

    @Column(name = "contact_admin", nullable = false)
    @NotNull(message = "Le contact admin est obligatoire")
    private String contactAdmin;

    @Column(name = "num_rne", length = 50)
    private String numRne;


    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_admin")
    private Admin admin;

    @OneToMany(
            mappedBy = "entreprise",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    private List<Branche> branches = new ArrayList<>();
}

