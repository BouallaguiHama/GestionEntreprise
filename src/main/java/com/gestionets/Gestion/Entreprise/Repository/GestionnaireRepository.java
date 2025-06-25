package com.gestionets.Gestion.Entreprise.Repository;

import com.gestionets.Gestion.Entreprise.entity.Gestionnaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GestionnaireRepository extends JpaRepository<Gestionnaire,Integer>{
}
