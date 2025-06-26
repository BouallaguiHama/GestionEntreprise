package com.gestionets.Gestion.Entreprise.entity;

import jakarta.persistence.*;
import lombok.*;
<<<<<<< add_Services
import lombok.experimental.SuperBuilder;
=======
>>>>>>> intialisation_du_projet

@Entity
@Table(name = "admin")
@Data
@NoArgsConstructor
@AllArgsConstructor
<<<<<<< add_Services
@SuperBuilder
=======
@Builder
>>>>>>> intialisation_du_projet
@PrimaryKeyJoinColumn(name = "id_admin")
public class Admin extends Gestionnaire {


    @OneToOne(mappedBy = "admin", fetch = FetchType.LAZY)
    private Entreprise entreprise;


}
