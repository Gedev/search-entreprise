package gedev.technobel.searchentreprise.repository;

import gedev.technobel.searchentreprise.entity.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrepriseRepository extends JpaRepository<Entreprise, Long> {

    public Entreprise findByName(String name);
}
