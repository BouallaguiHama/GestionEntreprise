package com.gestionets.Gestion.Entreprise.Service;

import com.gestionets.Gestion.Entreprise.entity.Depot;

import java.util.List;
import java.util.Optional;

public interface DepotService {

    List<Depot> listerDepot();

    Depot creationDepot(Depot depot);

    void modifierDepot(Depot Depot);

    void supprimmerDepot(Integer id);

    Optional<Depot> chercherDepotparID (Integer id);
}
