package com.gestionets.Gestion.Entreprise.Repository;

import com.gestionets.Gestion.Entreprise.entity.BonEntree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BonEntreeRepository extends JpaRepository<BonEntree,Integer> {
}
