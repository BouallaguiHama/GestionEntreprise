package com.gestionets.Gestion.Entreprise.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<CommandeFournisseur,Integer>  {
}
