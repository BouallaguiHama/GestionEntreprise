package com.gestionets.Gestion.Entreprise.Service;

import com.gestionets.Gestion.Entreprise.entity.CommandeFournisseur;

import java.util.List;
import java.util.Optional;

public interface CommandeFournisseurService {

    List<CommandeFournisseur> listerCommandeFournisseur();

    CommandeFournisseur creationCommandeFournisseur(CommandeFournisseur commandefournisseur);

    void modifierCommandeFournisseur(CommandeFournisseur commandefournisseur);

    void supprimmerCommandeFournisseur(Integer id);

    Optional<CommandeFournisseur> chercherCommandeFournisseurparID (Integer id);
}
