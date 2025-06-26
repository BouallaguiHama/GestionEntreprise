package com.gestionets.Gestion.Entreprise.Service.impl;

import com.gestionets.Gestion.Entreprise.Repository.GestionnaireRepository;
import com.gestionets.Gestion.Entreprise.Service.GestionnaireService;
import com.gestionets.Gestion.Entreprise.entity.Gestionnaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GestionnaireServiceImpl implements GestionnaireService {

    @Autowired
    private GestionnaireRepository gestionnaireRepository;

    @Override
    public List<Gestionnaire> listerGestionnaire(){
        return gestionnaireRepository.findAll();
    }

    @Override
    public Gestionnaire creationGestionnaire(Gestionnaire gestionnaire) {
        return gestionnaireRepository.save(gestionnaire);
    }

    @Override
    public void modifierGestionnaire(Gestionnaire gestionnaire) {
        gestionnaireRepository.save(gestionnaire);
    }

    @Override
    public void supprimmerGestionnaire(Integer id) {
        gestionnaireRepository.deleteById(id);
    }

    @Override
    public Optional<Gestionnaire> chercherGestionnaireparID(Integer id) {
        return gestionnaireRepository.findById(id);
    }
}
