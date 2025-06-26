package com.gestionets.Gestion.Entreprise.Service.impl;

import com.gestionets.Gestion.Entreprise.Repository.CommandeFournisseurRepository;
import com.gestionets.Gestion.Entreprise.Service.CommandeFournisseurService;
import com.gestionets.Gestion.Entreprise.entity.CommandeFournisseur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommandeFournisseurServiceImpl implements CommandeFournisseurService {

    @Autowired
    private CommandeFournisseurRepository commandeFournisseurRepository;

    @Override
    public List<CommandeFournisseur> listerCommandeFournisseur() {
        return commandeFournisseurRepository.findAll();
    }

    @Override
    public CommandeFournisseur creationCommandeFournisseur(CommandeFournisseur commandefournisseur) {
        return commandeFournisseurRepository.save(commandefournisseur);
    }

    @Override
    public void modifierCommandeFournisseur(CommandeFournisseur commandefournisseur) {
        commandeFournisseurRepository.save(commandefournisseur);
    }

    @Override
    public void supprimmerCommandeFournisseur(Integer id) {
        commandeFournisseurRepository.deleteById(id);
    }

    @Override
    public Optional<CommandeFournisseur> chercherCommandeFournisseurparID(Integer id) {
        return commandeFournisseurRepository.findById(id);
    }
}
