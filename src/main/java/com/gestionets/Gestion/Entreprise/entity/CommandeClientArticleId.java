package com.gestionets.Gestion.Entreprise.entity;

import jakarta.persistence.*;

import lombok.*;
import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommandeClientArticleId implements Serializable {
    private String idCommandeC;
    private Long idArticle;
}

