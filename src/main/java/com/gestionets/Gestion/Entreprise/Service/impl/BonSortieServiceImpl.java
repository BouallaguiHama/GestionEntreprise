package com.gestionets.Gestion.Entreprise.Service.impl;

import com.gestionets.Gestion.Entreprise.Repository.BonSortieRepository;
import com.gestionets.Gestion.Entreprise.Service.BonSortieService;
import com.gestionets.Gestion.Entreprise.entity.BonSortie;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class BonSortieServiceImpl implements BonSortieService {

    @Autowired
    private BonSortieRepository bonSortieRepository;

    @Override
    public List<BonSortie> listerBonSortie() {
        return bonSortieRepository.findAll();
    }

    @Override
    public BonSortie CreationBonSortie(BonSortie bonsortie) {
        return bonSortieRepository.save(bonsortie);
    }

    @Override
    public void ModifierBonSortie(BonSortie bonsortie) {
        bonSortieRepository.save(bonsortie);
    }

    @Override
    public void SupprimerBonSortie(Integer id) {
        bonSortieRepository.deleteById(id);
    }

    @Override
    public Optional<BonSortie> RechercheBonSortieID(Integer id) {
        return bonSortieRepository.findById(id);
    }
}
