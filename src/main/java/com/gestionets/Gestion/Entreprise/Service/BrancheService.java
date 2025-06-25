package com.gestionets.Gestion.Entreprise.Service;

import com.gestionets.Gestion.Entreprise.entity.Branche;

import java.util.List;
import java.util.Optional;

public interface BrancheService {

    List<Branche> listerBranche();

    Branche creationBranche(Branche branche);

    void  modifierBranche(Branche branche);

    void supprimmerBranche(Integer id);

    Optional<Branche> chercherBrancheparID (Integer id);
}
