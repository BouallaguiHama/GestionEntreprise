package com.gestionets.Gestion.Entreprise.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "admin")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@PrimaryKeyJoinColumn(name = "id_admin")
public class Admin extends Gestionnaire {


    @OneToOne(mappedBy = "admin", fetch = FetchType.LAZY)
    private Entreprise entreprise;


}
