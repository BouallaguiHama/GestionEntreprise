package com.gestionets.Gestion.Entreprise.Service.impl;


import com.gestionets.Gestion.Entreprise.Repository.CommandeClientRepository;
import com.gestionets.Gestion.Entreprise.Service.CommandeClientService;
import com.gestionets.Gestion.Entreprise.entity.CommandeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommandeClientServiceImpl implements CommandeClientService {

    @Autowired
    private CommandeClientRepository commandeClientRepository;

    @Override
    public List<CommandeClient> listerCommandeClient() {
        return commandeClientRepository.findAll();
    }

    @Override
    public CommandeClient creationCommandeClient(CommandeClient commandeclient) {
        return commandeClientRepository.save(commandeclient);
    }

    @Override
    public void modifierCommandeClient(CommandeClient commandeclient) {
        commandeClientRepository.save(commandeclient);
    }

    @Override
    public void supprimmerCommandeClient(Integer id) {
        commandeClientRepository.deleteById(id);
    }

    @Override
    public Optional<CommandeClient> chercherCommandeClientparID(Integer id) {
        return commandeClientRepository.findById(id);
    }
}
