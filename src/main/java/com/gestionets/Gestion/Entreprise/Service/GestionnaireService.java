package com.gestionets.Gestion.Entreprise.Service;

import com.gestionets.Gestion.Entreprise.entity.Gestionnaire;

import java.util.List;
import java.util.Optional;

public interface GestionnaireService {

    List<Gestionnaire> listerGestionnaire();

    Gestionnaire creationGestionnaire(Gestionnaire gestionnaire);

    void modifierGestionnaire(Gestionnaire gestionnaire);

    void supprimmerGestionnaire(Integer id);

    Optional<Gestionnaire> chercherGestionnaireparID (Integer id);
}
