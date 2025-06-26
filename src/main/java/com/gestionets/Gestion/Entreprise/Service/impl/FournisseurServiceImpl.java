package com.gestionets.Gestion.Entreprise.Service.impl;

import com.gestionets.Gestion.Entreprise.Repository.FournisseurRepository;
import com.gestionets.Gestion.Entreprise.Service.FournisseurService;
import com.gestionets.Gestion.Entreprise.entity.Fournisseur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FournisseurServiceImpl implements FournisseurService {

    @Autowired
    private FournisseurRepository fournisseurRepository;

    @Override
    public List<Fournisseur> listerFournisseur() {
        return fournisseurRepository.findAll();
    }

    @Override
    public Fournisseur creationFournisseur(Fournisseur fournisseur) {
        return fournisseurRepository.save(fournisseur);
    }

    @Override
    public void modifierFournisseur(Fournisseur fournisseur) {
        fournisseurRepository.save(fournisseur);
    }

    @Override
    public void supprimmerFournisseur(Integer id) {
        fournisseurRepository.deleteById(id);
    }

    @Override
    public Optional<Fournisseur> chercherFournisseurparID(Integer id) {
        return fournisseurRepository.findById(id);
    }
}
