package com.gestionets.Gestion.Entreprise.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "facture_client")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FactureClient {

    @Id
    @Column(name = "id_facture", length = 50, nullable = false)
    @NotNull(message = "L'identifiant est obligatoire")
    private String idFacture;

    @Column(name = "date_fac", nullable = false)
    @NotNull(message = "La date est obligatoire")
    private LocalDate dateFac;

    @Column(name = "payment", nullable = false)
    @NotNull(message = "Le statut de paiement est obligatoire")
    private Boolean payment;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_client")
    private Client client;
}
