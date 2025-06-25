package com.gestionets.Gestion.Entreprise.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.logging.log4j.util.Lazy;


import java.time.LocalDate;

@Entity
@Table(name = "commande_client")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class CommandeClient {


    @Id
    @Column(name = "id_commandeC", length = 50, nullable = false)
    @NotNull(message = "Le champ id ne doit pas etre null")
    private String idCommandeC;


    @Column(name = "date_cmd")
    @NotNull(message = "Le champ date ne doit pas être null")
    private LocalDate dateCmd;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_gestionnaire_vente")
    private GestionnaireVente gestionnaireVente;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_client")
    private Client client;
}
