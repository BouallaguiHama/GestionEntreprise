package com.gestionets.Gestion.Entreprise.Service.impl;

import com.gestionets.Gestion.Entreprise.Repository.BonEntreeRepository;
import com.gestionets.Gestion.Entreprise.Service.BonEntreeService;
import com.gestionets.Gestion.Entreprise.entity.BonEntree;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class BonEntreeServiceImpl implements BonEntreeService {

    @Autowired
    private BonEntreeRepository bonentreeRipository;

    @Override
    public List<BonEntree> listerBonEntree() {
        return bonentreeRipository.findAll();
    }

    @Override
    public BonEntree CreationBonEntree(BonEntree bonentree) {
        return bonentreeRipository.save(bonentree);
    }

    @Override
    public void ModifierBonEntree(BonEntree bonentree) {
        bonentreeRipository.save(bonentree);
    }

    @Override
    public void SupprimerBonEntree(Integer id) {
        bonentreeRipository.deleteById(id);
    }

    @Override
    public Optional<BonEntree> RechercheBonEntreeparID(Integer id) {
        return bonentreeRipository.findById(id);
    }
}
