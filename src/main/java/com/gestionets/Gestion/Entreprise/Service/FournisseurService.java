package com.gestionets.Gestion.Entreprise.Service;

import com.gestionets.Gestion.Entreprise.entity.Fournisseur;

import java.util.List;
import java.util.Optional;

public interface FournisseurService {

    List<Fournisseur> listerFournisseur();

    Fournisseur creationFournisseur(Fournisseur fournisseur);

    void modifierFournisseur(Fournisseur fournisseur);

    void supprimmerFournisseur(Integer id);

    Optional<Fournisseur> chercherFournisseurparID (Integer id);
}
