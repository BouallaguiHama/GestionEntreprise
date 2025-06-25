package com.gestionets.Gestion.Entreprise.Service;

import com.gestionets.Gestion.Entreprise.entity.BonSortie;

import java.util.List;
import java.util.Optional;

public interface BonSortieService {

    List<BonSortie> listerBonSortie();

    BonSortie CreationBonSortie(BonSortie bonsortie);

    void ModifierBonSortie(BonSortie bonsortie);

    void SupprimerBonSortie(Integer id);

    Optional<BonSortie> RechercheBonSortieID(Integer id);
}
