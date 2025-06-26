package com.gestionets.Gestion.Entreprise.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "admin")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@PrimaryKeyJoinColumn(name = "id_admin")
public class Admin extends Gestionnaire {


    @OneToOne(mappedBy = "admin", fetch = FetchType.LAZY)
    private Entreprise entreprise;


}
