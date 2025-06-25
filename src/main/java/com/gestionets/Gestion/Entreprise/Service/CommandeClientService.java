package com.gestionets.Gestion.Entreprise.Service;

import com.gestionets.Gestion.Entreprise.entity.CommandeClient;

import java.util.List;
import java.util.Optional;

public interface CommandeClientService {

    List<CommandeClient> listerCommandeClient();

    CommandeClient creationCommandeClient(CommandeClient commandeclient);

    void  modifierCommandeClient(CommandeClient commandeclient);

    void supprimmerCommandeClient(Integer id);

    Optional<CommandeClient> chercherCommandeClientparID (Integer id);
}
