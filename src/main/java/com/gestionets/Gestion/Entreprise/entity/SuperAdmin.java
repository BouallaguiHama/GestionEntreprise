package com.gestionets.Gestion.Entreprise.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "super_admin")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@PrimaryKeyJoinColumn(name = "id_super_admin") // clé primaire héritée d'Admin
public class SuperAdmin extends Admin {

    @Id
    @Column(name = "super_admin", length = 50, nullable = false)
    private String idSuperAdmin;

}
