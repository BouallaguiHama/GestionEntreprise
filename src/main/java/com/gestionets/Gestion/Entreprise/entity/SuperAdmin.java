package com.gestionets.Gestion.Entreprise.entity;

import jakarta.persistence.*;
import lombok.*;
<<<<<<< add_Services
import lombok.experimental.SuperBuilder;
=======
>>>>>>> intialisation_du_projet

@Entity
@Table(name = "super_admin")
@Data
<<<<<<< add_Services
@AllArgsConstructor
@SuperBuilder
=======
@NoArgsConstructor
@AllArgsConstructor
@Builder
>>>>>>> intialisation_du_projet
@PrimaryKeyJoinColumn(name = "id_super_admin") // clé primaire héritée d'Admin
public class SuperAdmin extends Admin {

}
