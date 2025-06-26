package com.gestionets.Gestion.Entreprise.Service.impl;

import com.gestionets.Gestion.Entreprise.Repository.ClientRepository;
import com.gestionets.Gestion.Entreprise.Service.ClientService;
import com.gestionets.Gestion.Entreprise.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> listerClient() {
        return clientRepository.findAll();
    }

    @Override
    public Client creationClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void modifierClient(Client client) {
        clientRepository.save(client);
    }

    @Override
    public void supprimmerClient(Integer id) {
        clientRepository.deleteById(id);
    }

    @Override
    public Optional<Client> chercherClientparID(Integer id) {
        return clientRepository.findById(id);
    }
}
