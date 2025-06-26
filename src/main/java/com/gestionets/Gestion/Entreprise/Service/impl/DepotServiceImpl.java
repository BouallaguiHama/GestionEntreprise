package com.gestionets.Gestion.Entreprise.Service.impl;

import com.gestionets.Gestion.Entreprise.Repository.DepotRepository;
import com.gestionets.Gestion.Entreprise.Service.DepotService;
import com.gestionets.Gestion.Entreprise.entity.Depot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepotServiceImpl implements DepotService {

    @Autowired
    private DepotRepository depotRepository;

    @Override
    public List<Depot> listerDepot() {
        return depotRepository.findAll();
    }

    @Override
    public Depot creationDepot(Depot depot) {
        return depotRepository.save(depot);
    }

    @Override
    public void modifierDepot(Depot depot) {
        depotRepository.save(depot);
    }

    @Override
    public void supprimmerDepot(Integer id) {
        depotRepository.deleteById(id);
    }

    @Override
    public Optional<Depot> chercherDepotparID(Integer id) {
        return depotRepository.findById(id);
    }
}
