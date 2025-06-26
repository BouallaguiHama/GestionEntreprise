package com.gestionets.Gestion.Entreprise.Service;

import com.gestionets.Gestion.Entreprise.entity.BonEntree;

import java.util.List;
import java.util.Optional;

public interface BonEntreeService {

    List<BonEntree> listerBonEntree();

    BonEntree CreationBonEntree(BonEntree bonentree);

    void ModifierBonEntree(BonEntree bonentree);

    void SupprimerBonEntree(Integer id);

    Optional<BonEntree> RechercheBonEntreeparID(Integer id);
}
