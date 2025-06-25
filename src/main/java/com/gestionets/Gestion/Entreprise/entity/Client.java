package com.gestionets.Gestion.Entreprise.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Table(name = "clients")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder



public class Client {

    @Id
    @Column(name = "id_client", length = 50, nullable = false)
    @NotNull(message = "Le champs id ne doit pas être null")
    private String idClient;

    @Column(name = "nom", nullable = false)
    @NotNull(message = "Le cham nom ne doit pas être null")
    @Size(min = 3, max = 100, message = "Le nom doit contenir au moins 3 caractères et au plus 100 caractères")
    private String nom;

    @Column(name = "adresse")
    private String adresse;

    @Column(name = "numtel")
    private int numtel;

    @Column(name = "email")
    @Email(message = "Le email doit avoir un format valid")
    private String email;

    @Column(name = "rmise")
    private float remise;

    @Column(name = "rib")
    private String rib;



    @OneToMany(
            mappedBy = "client",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    private CommandeClient commandeClient;

}
