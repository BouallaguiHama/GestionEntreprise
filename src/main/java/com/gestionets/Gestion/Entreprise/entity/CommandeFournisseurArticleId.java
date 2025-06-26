package com.gestionets.Gestion.Entreprise.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommandeFournisseurArticleId implements Serializable {

    private String idCommandeF;
    private Long idArticle;
}
