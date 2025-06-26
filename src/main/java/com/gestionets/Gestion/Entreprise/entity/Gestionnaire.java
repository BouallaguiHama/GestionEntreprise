package com.gestionets.Gestion.Entreprise.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Entity
@Table(name = "gestionnaire")
@Inheritance(strategy = InheritanceType.JOINED) // Pour gérer l'héritage
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Gestionnaire {

    @Id
    @Column(name = "id_gestionnaire", length = 50, nullable = false)
    @NotNull(message = "L'ID est obligatoire")
    private String id;

    @Column(name = "nom", nullable = false)
    @NotNull(message = "Le nom est obligatoire")
    @Size(min = 2, max = 50, message = "Le nom doit contenir entre 2 et 50 caractères")
    private String nom;

    @Column(name = "prenom", nullable = false)
    @NotNull(message = "Le prénom est obligatoire")
    @Size(min = 2, max = 50, message = "Le prénom doit contenir entre 2 et 50 caractères")
    private String prenom;

    @Column(name = "date_inscription", nullable = false)
    @NotNull(message = "La date d'inscription est obligatoire")
    private LocalDate dateInscription;

    @Column(name = "num_tel", nullable = false)
    private Integer numTel;

    @Column(name = "email")
    @Email(message = "Format d'email invalide")
    private String email;

    @Column(name = "login", nullable = false)
    @NotNull(message = "Le login est obligatoire")
    private String login;

    @Column(name = "password", nullable = false)
    @NotNull(message = "Le mot de passe est obligatoire")
    private String password;
}
