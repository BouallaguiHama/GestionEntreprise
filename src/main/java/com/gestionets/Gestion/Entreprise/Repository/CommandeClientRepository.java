package com.gestionets.Gestion.Entreprise.Repository;

import com.gestionets.Gestion.Entreprise.entity.CommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeClientRepository extends JpaRepository<CommandeClient,Integer> {
}