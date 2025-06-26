package com.gestionets.Gestion.Entreprise.Service.impl;

import com.gestionets.Gestion.Entreprise.Repository.EntrepriseRepository;
import com.gestionets.Gestion.Entreprise.Service.EntrepriseService;
import com.gestionets.Gestion.Entreprise.entity.Entreprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntrepriseServiceImpl implements EntrepriseService {

    @Autowired
    private EntrepriseRepository entrepriseRepository;

    @Override
    public List<Entreprise> listerEntreprise() {
        return entrepriseRepository.findAll();
    }

    @Override
    public Entreprise creationEntreprise(Entreprise entreprise) {
        return entrepriseRepository.save(entreprise);
    }

    @Override
    public void modifierEntreprise(Entreprise entreprise) {
        entrepriseRepository.save(entreprise);
    }

    @Override
    public void supprimmerEntreprise(Integer id) {
        entrepriseRepository.deleteById(id);
    }

    @Override
    public Optional<Entreprise> chercherEntrepriseparID(Integer id) {
        return entrepriseRepository.findById(id);
    }
}
