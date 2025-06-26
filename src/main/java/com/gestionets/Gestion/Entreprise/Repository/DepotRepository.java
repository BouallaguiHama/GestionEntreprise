package com.gestionets.Gestion.Entreprise.Repository;

import com.gestionets.Gestion.Entreprise.entity.Depot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepotRepository extends JpaRepository<Depot,Integer> {
}
