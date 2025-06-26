package com.gestionets.Gestion.Entreprise.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BonEntreeArticleId implements Serializable {
    private Integer numBe;
    private Long idArticle;
}

