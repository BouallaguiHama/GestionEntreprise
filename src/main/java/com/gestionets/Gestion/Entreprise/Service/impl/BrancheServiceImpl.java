package com.gestionets.Gestion.Entreprise.Service.impl;

import com.gestionets.Gestion.Entreprise.Repository.BrancheRepository;
import com.gestionets.Gestion.Entreprise.Service.BrancheService;
import com.gestionets.Gestion.Entreprise.entity.Branche;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class BrancheServiceImpl implements BrancheService {

    @Autowired
    private BrancheRepository brancheRepository;

    @Override
    public List<Branche> listerBranche() {
        return brancheRepository.findAll();
    }

    @Override
    public Branche creationBranche(Branche branche) {
        return brancheRepository.save(branche);
    }

    @Override
    public void modifierBranche(Branche branche) {
        brancheRepository.save(branche);
    }

    @Override
    public void supprimmerBranche(Integer id) {
        brancheRepository.deleteById(id);
    }

    @Override
    public Optional<Branche> chercherBrancheparID(Integer id) {
        return brancheRepository.findById(id);
    }
}
