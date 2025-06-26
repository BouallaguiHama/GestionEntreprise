package com.gestionets.Gestion.Entreprise.Service;

import com.gestionets.Gestion.Entreprise.entity.Entreprise;

import java.util.List;
import java.util.Optional;

public interface EntrepriseService {

    List<Entreprise> listerEntreprise();

    Entreprise creationEntreprise(Entreprise entreprise);

    void modifierEntreprise(Entreprise entreprise);

    void supprimmerEntreprise(Integer id);

    Optional<Entreprise> chercherEntrepriseparID (Integer id);
}
