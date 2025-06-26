package com.gestionets.Gestion.Entreprise.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "super_admin")
@Data
@AllArgsConstructor
@SuperBuilder
@PrimaryKeyJoinColumn(name = "id_super_admin") // clé primaire héritée d'Admin
public class SuperAdmin extends Admin {

}
