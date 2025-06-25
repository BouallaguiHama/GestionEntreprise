package com.gestionets.Gestion.Entreprise.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "super_admin")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@PrimaryKeyJoinColumn(name = "id_super_admin") // clé primaire héritée d'Admin
public class SuperAdmin extends Admin {

}
