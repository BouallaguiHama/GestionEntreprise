package com.gestionets.Gestion.Entreprise.Service;

import com.gestionets.Gestion.Entreprise.entity.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    List<Client> listerClient();

    Client creationClient(Client client);

    void  modifierClient(Client client);

    void supprimmerClient(Integer id);

    Optional<Client> chercherClientparID (Integer id);

}
